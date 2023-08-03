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
public class Livro {
    private int identificacao, qtdDias;
    private boolean situacao = false;
    private double valMultaDiaria, valTotalMulta;

    public void setIdentificacao(int identificacao) {
        this.identificacao = identificacao;
    }

    public void setValMultaDiaria(double valMultaDiaria) {
        this.valMultaDiaria = valMultaDiaria;
    }

    public boolean getSituacao() {
        return situacao;
    }
    
    public void emprestar(){
        situacao = true;
    }
    
    public void devolver(int qtdDias){
        situacao = false;
        valTotalMulta = qtdDias * this.valMultaDiaria;
    }
    
    public double valTotalMulta(){
        return(valTotalMulta);
    }
}
