package fatec.poo.control;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;

import fatec.poo.model.Pedido;

public class DaoPedido {

    private Connection conn;
    
    public DaoPedido(Connection conn) {
         this.conn = conn;
    }
    
    public void inserir(Pedido pedido) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO tbPedido (Numero, CPFCliente, CPFVendedor, Status, DataPedido, DataPagto) "
                    + "VALUES(?,?,?,?,?,?)");
            
            ps.setString(1, pedido.getNumero());
            ps.setString(2, pedido.getCliente().getCpf());
            ps.setString(3, pedido.getVendedor().getCpf());
            ps.setBoolean(4, pedido.isSituacao());
            ps.setString(5, pedido.getDataEmissao());
            ps.setString(6, pedido.getDataPagto());
            
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public void alterar(Pedido pedido) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE tbPedido "
                                        + "set CPFCliente = ?, CPFVendedor = ?, Status = ?, DataPedido = ?, DataPagto = ?"
                                        + "where Numero = ?");
            
            ps.setString(1, pedido.getNumero());
            ps.setString(2, pedido.getCliente().getCpf());
            ps.setString(3, pedido.getVendedor().getCpf());
            ps.setBoolean(4, pedido.isSituacao());
            ps.setString(5, pedido.getDataEmissao());
            ps.setString(6, pedido.getDataPagto());
           
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
        
     public  Pedido consultar (String numero) {
        Pedido p = null;
       
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * from tbPedido where "+
                                                 "Numero = ?");
            
            ps.setString(1, numero);
            ResultSet rs = ps.executeQuery();
           
            if (rs.next()) {
                p = new Pedido (numero, rs.getString("DataPedido"));
                p.setCliente(new DaoCliente(conn).consultar(rs.getString("CPFCLIENTE")));
                p.setVendedor(new DaoVendedor(conn).consultar(rs.getString("CPFVENDEDOR")));
                p.setItensPedidos(new DaoItemPedido(conn).consultar(rs.getString("NUMEROPEDIDO")));
                p.setSitucao (rs.getBoolean("Status"));
                p.setDataPagto (rs.getString("DataPagto"));  
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        return (p);
    }    
     
     public void excluir(Pedido pedido) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM tbPedido where Numero = ?");
            
            ps.setString(1, pedido.getNumero());
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
}





