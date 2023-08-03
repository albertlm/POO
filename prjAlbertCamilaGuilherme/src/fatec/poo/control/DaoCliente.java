package fatec.poo.control;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;

import fatec.poo.model.Cliente;
import fatec.poo.model.Pessoa;

public class DaoCliente {

    private Connection conn;
    
    public DaoCliente(Connection conn) {
         this.conn = conn;
    }
    
    public void inserir(Cliente cliente) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO tbCliente (Cpf, Nome, Endereco, Cidade, Cep, Uf, Telefoneddd, Telefonenumero, Limitecredito, Limitedisponivel ) "
                    + "VALUES(?,?,?,?,?,?,?,?,?,?)");
            
            ps.setString(1, cliente.getCpf());
            ps.setString(2, cliente.getNome());
            ps.setString(3, cliente.getEndereco());
            ps.setString(4, cliente.getCidade());
            ps.setString(5, cliente.getCep());
            ps.setString(6, cliente.getUf());
            ps.setString(7, cliente.getDdd());
            ps.setString(8, cliente.getTelefone());
            ps.setDouble(9, cliente.getLimiteCred());
            ps.setDouble(10, cliente.getLimiteDisp());
            
                      
            ps.execute();
        } catch (SQLException ex) {
            System.out.println("Teste Inserção");
            System.out.println(ex.toString());   
        }
    }
    
    public void alterar(Cliente cliente) {
        PreparedStatement ps = null;
        
        try {
            ps = conn.prepareStatement("UPDATE TBCLIENTE "
                    + "SET NOME = ?, ENDERECO = ?, CIDADE = ?, CEP = ?, UF = ?, TELEFONEDDD = ?, TELEFONENUMERO = ?, LIMITECREDITO = ?, LIMITEDISPONIVEL = ? "
                    + "WHERE CPF = ?");
            
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getEndereco());
            ps.setString(3, cliente.getCidade());
            ps.setString(4, cliente.getCep());
            ps.setString(5, cliente.getUf());
            ps.setString(6, cliente.getDdd());
            ps.setString(7, cliente.getTelefone());
            ps.setDouble(8, cliente.getLimiteCred());
            ps.setDouble(9, cliente.getLimiteDisp());
            ps.setString(10, cliente.getCpf());
           
            ps.execute();
        } catch (SQLException ex) {
            System.out.println("Teste Alteração");
            System.out.println("Erro de Alteração " + ex.toString() + " --- " + ex.getMessage());   
        }
    }
        
     public  Cliente consultar (String cpf) {
        Cliente c = null;
       
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * from tbCliente where "+
                                                 "Cpf = ?");
            
            ps.setString(1, cpf);
            ResultSet rs = ps.executeQuery();
           
            if (rs.next()) {
                c = new Cliente (cpf, rs.getString("Nome"), rs.getDouble("Limitecredito"));
                c.setEndereco (rs.getString("ENDERECO"));
                c.setCidade (rs.getString("CIDADE"));
                c.setCep (rs.getString("CEP"));
                c.setUf (rs.getString("UF"));
                c.setDdd (rs.getString("TELEFONEDDD"));  
                c.setTelefone (rs.getString("TELEFONENUMERO"));  
                c.setLimiteDisp (rs.getDouble("LIMITEDISPONIVEL"));   
            }
        }
        catch (SQLException ex) {
            System.out.println("Teste Consulta");
            System.out.println(ex.toString());   
        }
        return (c);
    }    
     
     public void excluir(Cliente cliente) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM tbCliente where Cpf = ?");
            
            ps.setString(1, cliente.getCpf());
                      
            ps.execute();
        } catch (SQLException ex) {
            System.out.println("Teste");
            System.out.println(ex.toString());   
        }
    }
}





