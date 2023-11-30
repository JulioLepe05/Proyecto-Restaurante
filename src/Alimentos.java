
import java.io.InputStream;
import java.sql.PreparedStatement;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author julio
 */
public class Alimentos {
    
    String menuid, nombre, precio, tipo, cantidad;
    ImageIcon foto;

    public Alimentos(String menuid) {
        this.menuid = menuid;
    }

    

    public Alimentos(String menuid, String nombre, String precio, String cantidad) {
        this.menuid = menuid;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    
    public Alimentos(String menuid, String nombre, String precio, ImageIcon foto, String tipo, String cantidad) {
        this.menuid = menuid;
        this.nombre = nombre;
        this.precio = precio;
        this.foto = foto;
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

       public int insertar(Conexion cnx){
        try {
            String sql = "INSERT INTO alimentos (menuid, nombre, precio, foto, tipo,cantidad) VALUES(?,?,?,?,?,?)";
            PreparedStatement ps = cnx.con.prepareStatement(sql);
            ps.setString(1,menuid);
            ps.setString(2, nombre);
            ps.setString(3, precio);
            ps.setBinaryStream(4, cnx.ImagenBytes(foto));
            ps.setString(5, tipo);
            ps.setString(6, cantidad);

            return ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al insertar: "+e.getMessage());
            return 0;
        }
    }
       
    
           public boolean actualizar(Conexion cnx) {
        try {
            String sql = "UPDATE alimentos  SET nombre = ?, precio = ?, cantidad = ? WHERE menuid = ?";
            PreparedStatement ps = cnx.con.prepareStatement(sql);
            
            ps.setString(1, nombre);
            ps.setString(2, precio);
            ps.setString(3, cantidad);
            ps.setString(4, menuid);
            return ps.execute();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }

    public boolean borrar(Conexion cnx) {
        try {
            String sql = "DELETE FROM alimentos WHERE menuid = ?";
            PreparedStatement ps = cnx.con.prepareStatement(sql);
            ps.setString(1, menuid);
            return ps.execute();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }

    }
    
    public ImageIcon getFoto (Conexion cnx, int id)
    {
        String sql = "SELECT foto FROM alimentos WHERE menuid = "+id;
        ImageIcon li = null;
        InputStream ls = null;
        return null;
        
    }

    
}
