/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplic;

import fatec.model.poo.ContaCorrente;
import java.util.Scanner;

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
        int opcao=0, numero;
        double saque, deposito, saldo;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o número da conta: ");
        numero = entrada.nextInt();
        System.out.print("Digite o saldo inicial: ");
        saldo = entrada.nextDouble();
        
        ContaCorrente objConta = new ContaCorrente(numero, saldo);
        
        System.out.println("\n\n1 - Depositar");
        System.out.println("2 - Sacar");
        System.out.println("3 - Consultar Saldo");
        System.out.println("4 - Sair");
        
        do{
            
            System.out.print("\nDigite a opção desejada: ");
            opcao = entrada.nextInt();
            
            switch(opcao){
                //Depositar
                case 1:
                    System.out.print("\nNúmero da Conta: "+objConta.getNumero());
                    System.out.print("\nEntre com o valor do depósito: ");
                    deposito = entrada.nextDouble();
                    objConta.depositar(deposito);
                    break;
                case 2:
                    System.out.print("\nEntre com o valor do saque: ");
                    saque = entrada.nextDouble();
                    if(saque>objConta.getSaldo()){
                        System.out.print("\nSaldo insuficiente: ");
                    }else{
                        objConta.sacar(saque);
                    }
                    break;
                case 3:
                    System.out.print("\nSaldo insuficiente: " + objConta.getSaldo());
                    break;
                case 4:
                    System.out.println("\n\n\nSAINDO ...");
                    break;
            }
    }while(opcao<4);
    }
    
}
