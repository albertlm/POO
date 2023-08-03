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
public class QuartoHotel {
    private int numQuarto;
    private double valorDiaria;
    private int numRg;
    private boolean situacao;
    private double totalFaturado;

    public QuartoHotel(int numQuarto, double valorDiaria) {
        this.numQuarto = numQuarto;
        this.valorDiaria = valorDiaria;
        situacao = false;
    }
    
    public void Reservar(int numRg){
        situacao = false;
    }
    
    public double Liberar(int numDias){
        totalFaturado = totalFaturado + (numDias*valorDiaria);
        return(numDias*valorDiaria);
    }

    public boolean getSituacao() {
        return situacao;
    }

    public double getTotalFaturado() {
        return totalFaturado;
    }
    
    public int getNumQuarto(){
        return(numQuarto);
    }
}
