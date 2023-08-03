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
public class Circulo {
    private double raio;

    public double getRaio() {
        return raio;
    }
    public void setRaio(double raio) {
        this.raio/*Atributo*/ = raio;//Evitar erro diferenciando atributo de parâmetro
    }
    public double calcArea(){
        return(Math.PI*Math.pow(raio,2));
    }
    public double calcPerimetro(){
        return(2*Math.PI*raio);
    }
    public double calcDiametro()
    {
        return(2*raio);
    }
}


