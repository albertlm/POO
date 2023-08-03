
import fatec.poo.model.Circulo;
import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Albert Leme de Brito
 */
public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DecimalFormat df = new DecimalFormat("0.0");
        Scanner entrada = new Scanner(System.in);       
        String unidade;
        double medRaio;       
        int i;
        
        //Definição da matriz Circulo com elementos da classe Círculo
        Circulo[] matCirc = new Circulo[3];
        
        //Atribuição de valores para cada Circulo instanciado
        for (i=0; i < matCirc.length; i++){
            System.out.print("Digite a unidade de medida do círculo "+(i+1)+": ");
            unidade = entrada.next();  
       
            //instanciação do objeto da classe Retangulo
            //e chamada do método construtor
            matCirc[i]= new Circulo(unidade);
            
            System.out.print("Digite a medida do raio: ");
            medRaio = entrada.nextDouble();
            System.out.println("");
            
            //passagem de mensagens
            matCirc[i].setRaio(medRaio);                 
        }
        
        //acessando matriz de objetos
        for (i=0; i < matCirc.length; i++){                         //passagem de mensagens
            System.out.println("\n* Objeto Circulo " + (i+1)); 
	    System.out.println("\n\t> Medida do raio: " + matCirc[i].getRaio() + " " + matCirc[i].getUnidadeMedida());
            System.out.println("\t> Área: "  + matCirc[i].calcArea() + " " + matCirc[i].getUnidadeMedida()); 
            System.out.println("\t> Perímetro: " + matCirc[i].calcPerimetro() + " " + matCirc[i].getUnidadeMedida());
            System.out.println("\t> Diametro: "  + matCirc[i].calcDiametro() + " " + matCirc[i].getUnidadeMedida());
        }  
    }
    
}
