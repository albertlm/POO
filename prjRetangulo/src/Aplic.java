
import fatec.poo.model.Retangulo;
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
        double medAlt, medBase;
        
        //Instanciação dos objetos
        Scanner entrada = new Scanner(System.in);
        Retangulo objRet = new Retangulo();
        
        System.out.print("Digite a medida da altura: ");
        medAlt = entrada.nextDouble();
        
        System.out.print("Digite a medida da base: ");
        medBase = entrada.nextDouble();
        
        //Passagem de mensagens com o objeto da classe Retangulo
        objRet.setAltura(medAlt);
        objRet.setBase(medBase);
        
        System.out.println("\nMedida da altura: " + objRet.getAltura());
        System.out.println("Medida da base: " + objRet.getBase());
        System.out.println("Medida do perímetro: " + objRet.calcPerimetro());
        System.out.println("Medida da área: " + objRet.calcArea());
        System.out.println("Medida da diagonal: "+ objRet.calcDiagonal());
    }
}
