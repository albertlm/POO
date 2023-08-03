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
public class Vendedor extends Pessoa{
    private double salarioBase;
    private double taxaComissao;
    private ArrayList<Pedido> pedidos; //multiplicidade 0..*

    public Vendedor(String cpf, String nome, double salarioBase) {
        super(cpf, nome);
        this.salarioBase = salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setTaxaComissao(double taxaComissao) {
        this.taxaComissao = taxaComissao;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }
    public void addPedido (Pedido p){
        pedidos.add(p); // Vendedor --> pedido
        p.setVendedor(this); // Pedido --> vendedor
    }
    
}
