
import fatec.poo.model.Produto;
import fatec.poo.model.ItemPedido;
import fatec.poo.model.Pedido;
import fatec.poo.model.Cliente;
import fatec.poo.model.Vendedor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Albert Leme de Brito, Camila Caroline Gonçalves de Pontes e Guilherme Cerqueira Lima
 */
public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Cadastro dos produtos
        Produto objProd1  = new Produto("1010","Furadeira Bosch");
        objProd1.setQtdeEstoque(10);
        objProd1.setUnidadeMedida("Un.");
        objProd1.setPreco(259.99);
        objProd1.setEstoqueMinimo(5);
        
        Produto objProd2  = new Produto("2020","Motossera Makit");
        objProd2.setQtdeEstoque(10);
        objProd2.setUnidadeMedida("Un.");
        objProd2.setPreco(259.99);
        objProd2.setEstoqueMinimo(5);
        
        Produto objProd3  = new Produto("3030","Parafusadeira Bosch");
        objProd3.setQtdeEstoque(10);
        objProd3.setUnidadeMedida("Un.");
        objProd3.setPreco(259.99);
        objProd3.setEstoqueMinimo(5);
        
        Produto objProd4  = new Produto("4040","Esmerilhadeira Makita");
        objProd4.setQtdeEstoque(10);
        objProd4.setUnidadeMedida("Un.");
        objProd4.setPreco(259.99);
        objProd4.setEstoqueMinimo(5);
        
        //Cadastro de Vendedores
        Vendedor objVend1  = new Vendedor("475.353.979-42","Albert Jorge",2500.52);
        objVend1.setTaxaComissao(10);
        
        Vendedor objVend2  = new Vendedor("654.984.123-14","Camila Joana",2000.68);
        objVend2.setTaxaComissao(10);
        
        Vendedor objVend3  = new Vendedor("478.654.159-32","Guilherme Joel",3125.12);
        objVend3.setTaxaComissao(10);
        
        //Cadastro de Clientes
        Cliente objCliente1  = new Cliente("251.348.154-65","Dimas Joaquim",10000.00);
        objCliente1.setLimiteDisp(objCliente1.getLimiteCred());
        
        Cliente objCliente2  = new Cliente("154.784.346-91","André Koala",5500.00);
        objCliente2.setLimiteDisp(objCliente2.getLimiteCred());
        
        Cliente objCliente3  = new Cliente("187.381.249-28","João Pedro",8000.00);
        
        Cliente objCliente4  = new Cliente("264.671.687-91","João Carlos",2000.00);
        
        Cliente objCliente5  = new Cliente("246.225.955-12","Daniel Bispo",5600.00);
        
        Cliente objCliente6  = new Cliente("354.222.444-48","Nicolas Nagato",15000.00);
        
        //Criar pedidos e definir os itens do pedido 1
        Pedido objPedido1  = new Pedido("111","14/05/2023");
        objPedido1.setCliente(objCliente1);
        objPedido1.setDataPagto("15/05/2023");
        objPedido1.setFormaPagto(true);
        objPedido1.setSituacao(true);
        objPedido1.setVendedor(objVend1);
        
        ItemPedido objItem1Ped1 = new ItemPedido(1,2.0,objProd1);
        ItemPedido objItem2Ped1 = new ItemPedido(2,3.0,objProd2);
        
        objCliente1.atualizarLimite((objItem1Ped1.getProduto().getPreco())*objItem1Ped1.getQtdeVendida());
        
        objPedido1.addItens(objItem1Ped1);
        objPedido1.addItens(objItem2Ped1);
        
        objPedido1.listarItensPedido();
        
        //Criar pedidos e definir os itens do pedido 2
        Pedido objPedido2  = new Pedido("222","13/05/2023");
        objPedido2.setCliente(objCliente2);
        objPedido2.setDataPagto("15/05/2023");
        objPedido2.setFormaPagto(true);
        objPedido2.setSituacao(true);
        objPedido2.setVendedor(objVend1);
        
        ItemPedido objItem1Ped2 = new ItemPedido(1,2.0,objProd1);
        ItemPedido objItem2Ped2 = new ItemPedido(2,3.0,objProd2);
        
        objPedido2.addItens(objItem1Ped1);
        objPedido2.addItens(objItem2Ped1);
                
        objPedido2.listarItensPedido();
        
        //Criar pedidos e definir os itens do pedido 3
        Pedido objPedido3  = new Pedido("333","13/05/2023");
        objPedido3.setCliente(objCliente3);
        objPedido3.setDataPagto("15/05/2023");
        objPedido3.setFormaPagto(true);
        objPedido3.setSituacao(true);
        objPedido3.setVendedor(objVend2);
        
        Pedido objPedido4  = new Pedido("444","12/05/2023");
        objPedido4.setCliente(objCliente4);
        objPedido4.setDataPagto("15/05/2023");
        objPedido4.setFormaPagto(true);
        objPedido4.setSituacao(true);
        objPedido4.setVendedor(objVend3);
        
        Pedido objPedido5  = new Pedido("555","13/05/2023");
        objPedido5.setCliente(objCliente5);
        objPedido5.setDataPagto("15/05/2023");
        objPedido5.setFormaPagto(true);
        objPedido5.setSituacao(true);
        objPedido5.setVendedor(objVend3);
        
        Pedido objPedido6  = new Pedido("666","10/05/2023");
        objPedido6.setCliente(objCliente6);
        objPedido6.setDataPagto("15/05/2023");
        objPedido6.setFormaPagto(true);
        objPedido6.setSituacao(true);
        objPedido6.setVendedor(objVend3);
    }
    
}
