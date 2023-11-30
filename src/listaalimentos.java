
import java.sql.PreparedStatement;

public class listaalimentos {

    String listaalimentosid, orden_idorden, alimentos_menuid, cantidad, cocinero_codigo, estado;
    
    
    public listaalimentos(String orden_idorden) {
        this.orden_idorden = orden_idorden;
    }
    
    public listaalimentos(String orden_idorden, String estado) {
        this.orden_idorden = orden_idorden;
        this.estado = estado;
    }
    
    public listaalimentos(String listaalimentosid, String orden_idorden, String alimentos_menuid, String cantidad, String cocinero_codigo, String estado) {
        this.listaalimentosid = listaalimentosid;
        this.orden_idorden = orden_idorden;
        this.alimentos_menuid = alimentos_menuid;
        this.cantidad = cantidad;
        this.cocinero_codigo = cocinero_codigo;
        this.estado = estado;
    }

    public int insertar(Conexion cnx) {
        try {
            String sql = "INSERT INTO listaalimentos (orden_idorden, alimentos_menuid, cantidad, cocinero_codigo, estado) VALUES(?,?,?,?,?)";
            PreparedStatement ps = cnx.con.prepareStatement(sql);
            ps.setString(1, orden_idorden);
            ps.setString(2, alimentos_menuid);
            ps.setString(3, cantidad);
            ps.setString(4, cocinero_codigo);
            ps.setString(5, estado);

            return ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al insertar: " + e.getMessage());
            return 0;
        }
    }

    public boolean actualizar(Conexion cnx) {
        try {
            String sql = "UPDATE listaalimentos SET estado = ? WHERE orden_idorden = ?";
            PreparedStatement ps = cnx.con.prepareStatement(sql);
            ps.setString(1, estado);
            ps.setString(2, orden_idorden);
            return ps.execute();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }

    public boolean borrar(Conexion cnx) {
        try {
            String sql = "DELETE FROM listaalimentos WHERE orden_idorden = ?";
            PreparedStatement ps = cnx.con.prepareStatement(sql);
            ps.setString(1, orden_idorden);
            return ps.execute();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }
}
