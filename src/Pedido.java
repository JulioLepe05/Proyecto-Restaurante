
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Pedido {
    String idpedido, comida, clientes_clienteid;
    int cantidad;
    float precio;

    public Pedido (String idpedido){
        this.idpedido = idpedido;
    }
    
    public Pedido( String comida, int cantidad, float precio) {
        this.comida = comida;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    
    public Pedido( String idpedido, String comida, int cantidad, float precio, String clientes_clienteid) {
        this.idpedido = idpedido;    
        this.comida = comida;
        this.cantidad = cantidad;
        this.precio = precio;
        this.clientes_clienteid = clientes_clienteid;
    }

     public int insertar(Conexion cnx){
        try {
            String sql = "INSERT INTO pedido (idpedido, comida, cantidad, precio, clientes_clienteid) VALUES(?,?,?,?,?)";
            PreparedStatement ps = cnx.con.prepareStatement(sql);
            ps.setString(1, idpedido);
            ps.setString(2,comida);
            ps.setInt(3, cantidad);
            ps.setFloat(4, precio);
            ps.setString(5,clientes_clienteid);

            return ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al insertar: "+e.getMessage());
            return 0;
        }
    }
       

    public boolean borrar(Conexion cnx) {
        try {
            String sql = "DELETE FROM pedido WHERE idpedido = ?";
            PreparedStatement ps = cnx.con.prepareStatement(sql);
            ps.setString(1, idpedido);
            return ps.execute();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }
    
    
    
}
