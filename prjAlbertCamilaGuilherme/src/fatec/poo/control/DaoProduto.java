package fatec.poo.control;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;

import fatec.poo.model.Produto;

public class DaoProduto {

    private Connection conn;
    
    public DaoProduto(Connection conn) {
         this.conn = conn;
    }
    
    public void inserir(Produto produto) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO tbProduto (CodigoProduto, Descricao, QtdeDisponivel, Precounit, Estoqueminimo) VALUES(?,?,?,?,?)");
            ps.setString(1, produto.getCodigo());
            ps.setString(2, produto.getDescricao());
            ps.setDouble(3, produto.getQtdeEstoque());
            ps.setDouble(4, produto.getPreco());
            ps.setDouble(5, produto.getEstoqueMinimo());
            
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public void alterar(Produto produto) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE TBPRODUTO "
                    + "SET DESCRICAO = ?, QTDEDISPONIVEL = ?, PRECOUNIT = ?, ESTOQUEMINIMO = ? "
                    + "WHERE CODIGOPRODUTO = ?");
            
            ps.setString(1, produto.getDescricao());
            ps.setDouble(2, produto.getQtdeEstoque());
            ps.setDouble(3, produto.getPreco());
            ps.setDouble(4, produto.getEstoqueMinimo());
            ps.setString(5, produto.getCodigo());
           
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
        
     public  Produto consultar (String codigo) {
        Produto p = null;
       
        PreparedStatement ps = null;
        try {           
            ps = conn.prepareStatement("SELECT * from tbProduto where " +
                                                 "CodigoProduto = ?");
            
            ps.setString(1, codigo);
            ResultSet rs = ps.executeQuery();
           
            if (rs.next()) {
                p = new Produto (codigo, rs.getString("Descricao"));
                p.setQtdeEstoque (rs.getDouble("QTDEDISPONIVEL"));
                p.setPreco (rs.getDouble("PRECOUNIT"));
                p.setEstoqueMinimo (rs.getDouble("ESTOQUEMINIMO"));
 
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        return (p);
    }    
     
     public void excluir(Produto produto) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM tbProduto where CodigoProduto = ?");
            
            ps.setString(1, produto.getCodigo());
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
}




