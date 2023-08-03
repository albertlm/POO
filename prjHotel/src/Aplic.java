
import java.util.Scanner;
import fatec.poo.model.QuartoHotel;

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
        int numDias, i, numQuarto, opcao, quartoSelec, numRg;
        double valorDiaria;
        Scanner entrada = new Scanner(System.in);
        
        QuartoHotel[] matHotel = new QuartoHotel[3];
        
        for(i=0;i<matHotel.length;i++){
            System.out.print("> Digite o número do quarto: ");
            numQuarto = entrada.nextInt();
            System.out.print("> Digite o valor da diária: ");
            valorDiaria = entrada.nextDouble();
            matHotel[i] = new QuartoHotel(numQuarto, valorDiaria);
        }
        
        for (i=0;i<matHotel.length;i++){
            do{
                System.out.print("Escolha o quarto: ");
                quartoSelec = entrada.nextInt();
                for(i=0;i<matHotel.length;i++){
                    if(quartoSelec==matHotel[i].getNumQuarto()){
                        break;
                    }else{
                        System.out.println("Quarto inexistente");
                    }
                }
                
                System.out.println("\n1 - Consultar Quarto");
                System.out.println("2 - Reservar Quarto");
                System.out.println("3 - Liberar Quarto");
                System.out.println("4 - Consultar Faturamento Quarto");
                System.out.println("5 - Consultar Faturamento Hotel");
                System.out.println("6 - Sair");
                
                System.out.println("> Digite a opção desejada: ");
                opcao = entrada.nextInt();
            }while(opcao<6);
            
            switch(opcao){
                case 1:
                    System.out.println("> Número do Quarto: "+matHotel[i].getNumQuarto());
                    System.out.println("> Situação do Quarto: "+matHotel[i].getSituacao());
                    break;
                case 2:
                    if(matHotel[i].getSituacao()==false){
                        System.out.print("> Digite o número do RG: ");
                        numRg = entrada.nextInt();
                        matHotel[i].Reservar(numRg);
                        System.out.print("> Reserva efetuada com sucesso");
                    }else{
                        System.out.println("O Quarto já está reservado");
                    }
                    break;
                case 3:
                    System.out.print("\nSaldo: " + matBanco[i].getSaldo());
                    break;
                case 4:
                    System.out.print("\nNúmero da Conta: "+matBanco[i].getNumero());
                    System.out.print("Saldo: "+matBanco[i].getSaldo());
                    break;
                case 5:
                    System.out.println("\n\n\nSAINDO ...");
                    break;
            }
            
        }
        
    }
    
}
