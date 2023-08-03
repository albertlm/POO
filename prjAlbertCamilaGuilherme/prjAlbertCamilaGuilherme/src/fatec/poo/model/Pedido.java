/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author Albert Leme de Brito, Camila Caroline Gonçalves de Pontes e Guilherme Cerqueira Lima
 */
public class Pedido {
    private String numero;
    private String dataEmissao;
    private String dataPagto;
    private boolean formaPagto;
    private boolean situacao;
    private Cliente cliente; //multiplicidade 1
    private Vendedor vendedor; //multiplicidade 1
    private ArrayList<ItemPedido> itensPedidos; //multiplicidade 1..*

    public Pedido(String numero, String dataEmissao) {
        this.numero = numero;
        this.dataEmissao = dataEmissao;
        itensPedidos = new ArrayList <ItemPedido>();  
    }
    
    public void setDataPagto(String dataPagto) {
        this.dataPagto = dataPagto;
    }

    public void setFormaPagto(boolean formaPagto) {
        this.formaPagto = formaPagto;
    }

    public void setSitucao(boolean situcao) {
        this.situacao = situacao;
    }

    public String getNumero() {
        return numero;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public String getDataPagto() {
        return dataPagto;
    }

    public boolean isFormaPagto() {
        return formaPagto;
    }

    public boolean isSituacao() {
        return situacao;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public Cliente getCliente() {
        return cliente;
    }
    
    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }
    
    public void addItens (ItemPedido i){
        itensPedidos.add(i); // Cliente --> pedido
        i.setPedido(this); // Pedido --> cliente
    }
    
    public void listarItensPedido(){
        System.out.println("\n> Número do Pedido: " + numero);
        System.out.println("> Nome do Cliente: " + getCliente().getNome());
        System.out.println("> Limite de Crédito: " + getCliente().getLimiteCredt());
        System.out.println("> Nome do Vendedor: " + getVendedor().getNome());
        System.out.println("> Data Emissão: " + dataEmissao);
        System.out.println("> Data de Pagamento: " + dataPagto);
        System.out.println("> Forma de Pagamento: " + formaPagto);
        System.out.println("> Situação: " + situacao);
        System.out.println("\nSequência\tProduto\t\t\tQuantidade");
        for (int x = 0; x < itensPedidos.size(); x++){
            System.out.print(itensPedidos.get(x).getSequencia() + "\t\t");
            System.out.print(itensPedidos.get(x).getProduto().getDescricao() + "\t\t");
            System.out.println(itensPedidos.get(x).getQtdeVendida());
        }
        
        System.out.println("> Limite atualizado: " + getCliente().getLimiteDisp());
    }
}
