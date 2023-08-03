/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author Albert Leme de Brito
 */
public class PessoaFisica extends Pessoa{
    private String cpf;
    private double base;

    public PessoaFisica(String cpf, String nome, int anoInscricao) {
        super(nome, anoInscricao);
        this.cpf = cpf;
    }
    
    public double calcBonus(int anoAtual){
        if(getTotalCompras()>12000){
            return((anoAtual-getAnoInscricao())*getBase());
        }else{
            return(0);
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getBase() {
        return base;
    }
}
