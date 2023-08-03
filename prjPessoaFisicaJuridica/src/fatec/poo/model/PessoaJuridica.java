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
public class PessoaJuridica extends Pessoa {
    private String cgc;
    private double taxaIncentivo;

    public PessoaJuridica(String nome, int anoInscricao, String cgc) {
        super(nome, anoInscricao);
        this.cgc = cgc;
    }
    
    public double calcBonus(int anoAtual){
        return(((getTaxaIncentivo()/100)*getTotalCompras())*(anoAtual - getAnoInscricao()));
    }
    
    public void setTaxaIncentivo(double taxaIncentivo) {
        this.taxaIncentivo = taxaIncentivo;
    }

    public String getCgc() {
        return cgc;
    }

    public double getTaxaIncentivo() {
        return taxaIncentivo;
    }
    
}
