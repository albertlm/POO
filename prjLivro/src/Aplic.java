
import fatec.poo.model.Livro;
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
        int identificacao, opcao, qtdDias;
        double valMultaDiaria;
        
        Scanner entrada = new Scanner(System.in);
        Livro objLivro = new Livro();
        
        System.out.print("Identificação do Livro: ");
        identificacao = entrada.nextInt();
        System.out.print("Valor da multa diária: ");
        valMultaDiaria = entrada.nextDouble();
        
        objLivro.setIdentificacao(identificacao);
        objLivro.setValMultaDiaria(valMultaDiaria);
        
        
        System.out.println("\n1 - Consultar Livro");
        System.out.println("2 - Emprestar Livro");
        System.out.println("3 - Devolver Livro");
        System.out.println("4 - Sair");
        
        do{
            
            System.out.print("\nDigite a opção desejada: ");
            opcao = entrada.nextInt();
            
            switch(opcao){
                case 1://Consulta da situação
                    System.out.println("\n1 - Consultar Livro");
                    if(objLivro.getSituacao() == true){
                        System.out.println("\n--| Emprestado");
                    }else{
                        System.out.println("\n--| Disponível");
                    }
                    break;
                case 2://Emprestar livro
                    System.out.println("\n2 - Emprestar Livro");
                    if(objLivro.getSituacao() == true){
                        System.out.println("\n-| O livro está emprestado”");
                    }else{
                        objLivro.emprestar();
                        System.out.println("\n-| Empréstimo realizado com sucesso");
                    }
                    break;
                case 3://Devolver livro
                    System.out.println("\n3 - Devolver Livro");
                    if(objLivro.getSituacao() == true){
                        System.out.print("\nQuantidade de dias em atraso: ");
                        qtdDias = entrada.nextInt();
                        objLivro.devolver(qtdDias);
                        System.out.print("Valor da multa: "+objLivro.valTotalMulta());
                    }else{
                        System.out.print("\nO livro já está disponível");
                    }
                    break;
                case 4://Sair
                    System.out.println("\nSaindo do programa ...");
                    break;
            }
    }while(opcao<4);
    }
    
}
