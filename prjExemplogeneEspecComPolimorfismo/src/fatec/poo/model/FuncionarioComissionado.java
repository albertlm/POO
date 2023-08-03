/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author 0030482123001
 */
public class FuncionarioComissionado extends Funcionario {
    private double salBase;
    private double taxaComissao;
    private double totalVendas;

    public FuncionarioComissionado(int registro, String nome, String dtAdmissao, String cargo, double taxaComissao) {
        super(registro, nome, dtAdmissao, cargo);
        this.taxaComissao = taxaComissao;
    }

    public void setSalBase(double salBase) {
        this.salBase = salBase;
    }

    public double getSalBase() {
        return salBase;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void addvendas(double vendas){
        totalVendas += vendas;
    }
    
    public double calcSalBruto(){
        return(getSalBase() + getTaxaComissao() * getTotalVendas());
    }
    
    public double calcGratificacao(){
        if(getTotalVendas()<5000){
            return(0);
        }else{
            if(getTotalVendas()<=10000){
                return(0.03*calcSalBruto());
            }else{
                return(0.05*calcSalBruto());
            }
        }
    }
    
    public double calcSalLiquido(){
        return(calcSalBruto() - calcDesconto() + calcGratificacao());
    }
    
}
