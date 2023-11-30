
import java.io.Serializable;
import java.sql.PreparedStatement;

public class Recepcion  implements Serializable {
    
    private String clienteid, nombre, telefono;
    
        
        public Recepcion(String clienteid, String nombre, String telefono){
            this.clienteid = clienteid;
            this.nombre = nombre;
            this.telefono = telefono;
        }
    
        
        
        
        
    public int insertar(Conexion cnx){
        try {
            String sql = "INSERT INTO clientes VALUES (?,?,?)";
            PreparedStatement ps = cnx.con.prepareStatement(sql);
            ps.setString(1,clienteid);
            ps.setString(2, nombre);
            ps.setString(3, telefono);
            return ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("Error al insertar: "+e.getMessage());
            return 0;
        }
    
    }
    
}
