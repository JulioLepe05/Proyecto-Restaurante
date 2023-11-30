

/**
 *
 * @author Luis Aguirre
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import javax.bluetooth.*;
import javax.microedition.io.*;


public class Servidor implements Runnable {

    Thread hilo = new Thread(this);

    UUID uuid;
    String connectionString;
    StreamConnectionNotifier streamConnNotifier;
    StreamConnection connection;
    RemoteDevice dev;
    InputStream inStream;
    OutputStream outStream;
    BufferedReader bReader;

    FAlimentos ventana;// Frame a la que se le van a pasar los codigos

    ///----------------------------------------------------------------------------------
    public static void main(String[] args) throws IOException {

    }

    ///----------------------------------------------------------------------------------
    protected void startServer(FAlimentos ventana) throws IOException {

        this.ventana = ventana;
        
        uuid = new UUID("1101", true);//Crear un UUID para el servidor
        connectionString = "btspp://localhost:" + uuid + ";name=Sample SPP Server";//Crea un url para el servicio
        streamConnNotifier = (StreamConnectionNotifier) Connector.open(connectionString);//abrir la url del servidor

        //Esperar la solicitud de conexion del cliente
        System.out.println("\nServidor BT en ejecucion. Esperando a un cliente...");
        connection = streamConnNotifier.acceptAndOpen();

        dev = RemoteDevice.getRemoteDevice(connection);
        System.out.println("Direccion del dispositivo remoto: " + dev.getBluetoothAddress());
        System.out.println("Nombre del dispositivo remoto: " + dev.getFriendlyName(true));

        //preparar flujos para leer cadenas del cliente
        inStream = connection.openInputStream();
        bReader = new BufferedReader(new InputStreamReader(inStream));

        outStream = connection.openOutputStream();
        

        hilo.start();

    }
    ///----------------------------------------------------------------------------------
    public void run() { //leer los mensajes del cel y pasarlos a la ventana
        String anterior = "";
        while (true) {
            try {
                String linea = bReader.readLine();
                
                if (linea != null && !linea.equals(anterior)) {
                    System.out.println(linea);
                    anterior = linea;
                    ventana.setMensaje(linea);
                }
                
            } catch (Exception ex) {
                System.out.println("Error QR server: "+ex.getMessage());
            }
        }
    }

    
    ///----------------------------------------------------------------------------------
    public void responder(String cadena) { //mandar mensajes al cliente
        try {
            PrintWriter pWriter = new PrintWriter(new OutputStreamWriter(outStream));
            pWriter.write(cadena);
            pWriter.flush();
            pWriter.close();
            System.out.println("Enviando: " + cadena);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                outStream.close();
            } catch (Exception ex) {
            }
        }

    }
    
    ///----------------------------------------------------------------------------------

}
