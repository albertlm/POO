
import fatec.poo.model.Circulo;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0030482123001
 */
public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double medRaio;
        
        //Instanciação dos objetos
        Scanner entrada = new Scanner(System.in);
        Circulo objCirc = new Circulo();
        
        System.out.print("Digite a medida do raio: ");
        medRaio = entrada.nextDouble();
        
        //Passagem de mensagens com o objeto da classe Retangulo
        objCirc.setRaio(medRaio);
        
        System.out.println("\nMedida do raio: " + objCirc.getRaio());
        System.out.println("Medida da área: " + objCirc.calcArea());
        System.out.println("Medida do perímetro: " + objCirc.calcPerimetro());
        System.out.println("Medida da diâmetro: "+ objCirc.calcDiametro());
    }
}
