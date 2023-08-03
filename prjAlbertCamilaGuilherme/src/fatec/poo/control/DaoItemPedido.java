package fatec.poo.control;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;

import fatec.poo.model.ItemPedido;
import fatec.poo.control.DaoProduto;

import java.util.ArrayList;

public class DaoItemPedido {

    private Connection conn;
    
    public DaoItemPedido(Connection conn) {
         this.conn = conn;
    }
    
    public void inserir(ItemPedido itemPedido) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO tbItemPedido (NumeroPedido, CodigoProduto, QtdeVendida) VALUES(?,?,?)");
            ps.setString(1, itemPedido.getPedido().getNumero());
            ps.setInt(2, itemPedido.getSequencia());
            ps.setDouble(3, itemPedido.getQtdeVendida());
            
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public void alterar(ItemPedido itemPedido) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE tbItemPedido "
                                        + "set CodigoProduto = ?, QtdeVendida = ?" +
                                        "where NumeroPedido = ?");
            
            ps.setString(1, itemPedido.getPedido().getNumero());
            ps.setInt(2, itemPedido.getSequencia());
            ps.setDouble(3, itemPedido.getQtdeVendida());
           
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
        
     public ArrayList<ItemPedido> consultar (String numeroPedido) {
        
        ItemPedido i = null;
        ArrayList<ItemPedido> itens = new ArrayList<ItemPedido> ();
        int seq=1;
       
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * from tbItemPedido where " +
                                                 "NumeroPedido = ?");
            
            ps.setString(1, numeroPedido);
            ResultSet rs = ps.executeQuery();
           
            while(rs.next()) {
                i = new ItemPedido (seq, 
                                    rs.getDouble("QtdeVendida"), 
                                    new DaoProduto(conn).consultar(rs.getString("CODIGOPRODUTO")));
 
                itens.add(i);
                seq++;
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        return (itens);
    }    
     
     public void excluir(ItemPedido itemPedido) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM tbItemPedido where NumeroPedido = ?");
            
            ps.setString(1, itemPedido.getPedido().getNumero());
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
}




