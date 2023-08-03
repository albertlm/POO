
import fatec.poo.model.ContaCorrente;
import java.text.DecimalFormat;
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
        int opcao=0, numero, i, contaSelec, cont;
        double saque, deposito, saldo;
        Scanner entrada = new Scanner(System.in);
        
        ContaCorrente[] matBanco = new ContaCorrente[3];
        
        //Instanciação dos objetos cnota corrente dentro da matriz de contas
        for (i=0; i < matBanco.length; i++){
            System.out.print("Digite o número da conta: ");
            numero = entrada.nextInt();
       
            System.out.print("Digite o saldo inicial: ");
            saldo = entrada.nextDouble();
            
            System.out.println("");
                        
            matBanco[i] = new ContaCorrente(numero, saldo);
        }
                
        do{
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar Saldo");
            System.out.println("4 - Listar contas");
            System.out.println("5 - Sair");
            
            System.out.print("\nDigite a opção desejada: ");
            opcao = entrada.nextInt();
            
            switch(opcao){
                case 1:
                    //Pesquisa
                    System.out.print("\nEscolha a Conta: ");
                    contaSelec = entrada.nextInt();
                    for(cont=0;cont<matBanco.length;cont++){
                        if(contaSelec==matBanco[cont].getNumero()){;
                            break;
                        }
                    }
                    if(cont==matBanco.length){
                        System.out.println("\nConta não cadastrada");
                        System.out.println("");
                        break;
                    }else{
                            System.out.print("\nConta selecionada: "+matBanco[cont].getNumero());
                            System.out.print("\nEntre com o valor do depósito: ");
                            deposito = entrada.nextDouble();
                            matBanco[cont].depositar(deposito);
                            System.out.println("");
                            break;
                    }
                case 2:
                    //Pesquisa
                    System.out.print("\nEscolha a Conta: ");
                    contaSelec = entrada.nextInt();
                    for(cont=0;cont<matBanco.length;cont++){
                        if(contaSelec==matBanco[cont].getNumero()){
                            System.out.println("");
                            break;
                        }
                    }
                    if(cont==matBanco.length){
                        System.out.println("Conta não cadastrada");
                        System.out.println("");
                        break;
                    }else{
                        System.out.print("Entre com o valor do saque: ");
                        saque = entrada.nextDouble();
                        if(saque>matBanco[cont].getSaldo()){
                            System.out.print("\nSaldo insuficiente: ");
                        }else{
                            matBanco[cont].sacar(saque);
                        }
                        System.out.println("");
                        break;
                    }
                    
                case 3:
                    //Pesquisa
                    System.out.print("Escolha a Conta: ");
                    contaSelec = entrada.nextInt();
                    for(cont=0;cont<matBanco.length;cont++){
                        if(contaSelec==matBanco[cont].getNumero()){
                            System.out.println("");
                            break;
                        }
                    }
                    if(cont==matBanco.length){
                        System.out.println("Conta não cadastrada");
                        break;
                    }else{
                        System.out.print("\nSaldo: " + matBanco[cont].getSaldo());
                        System.out.println("");
                        break;
                    }
                    
                case 4:
                    for(cont=0;cont<matBanco.length;cont++){
                        System.out.println("\nNúmero da Conta: "+matBanco[cont].getNumero());
                        System.out.println("Saldo: "+matBanco[cont].getSaldo());
                    }
                    System.out.println("");
                    break;

                case 5:
                    System.out.println("\nSAINDO ...");
                    break;
            }
        }while(opcao<5);
    }
}
