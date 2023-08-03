
import fatec.poo.model.Aluno;
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
        int RA;
        int opcao=0;
        double p1, p2, t1, t2;
        
        Scanner entrada = new Scanner(System.in);
        Aluno objAluno = new Aluno();
        
        System.out.print("Digite o RA do aluno: ");
        RA = entrada.nextInt();
        System.out.print("Digite a nota da Prova 1: ");
        p1 = entrada.nextDouble();
        System.out.print("Digite a notada Prova 2: ");
        p2 = entrada.nextDouble();
        System.out.print("Digite a nota do Trabalho 1: ");
        t1 = entrada.nextDouble();
        System.out.print("Digite a nota do trabalho 2: ");
        t2 = entrada.nextDouble();
        
        objAluno.setRA(RA);
        objAluno.setNtPrv1(p1);
        objAluno.setNtPrv2(p2);
        objAluno.setNtTrab1(t1);
        objAluno.setNtTrab2(t2);
            
        System.out.println("\n\n1 - Exibir notas das provas e trabalhos");
        System.out.println("2 - Exibir média dos trabalhos e provas");
        System.out.println("3 - Exibir média final");
        System.out.println("4 - Sair");
        
        do{
            
            System.out.print("\nDigite a opção desejada: ");
            opcao = entrada.nextInt();
            
            switch(opcao){
                case 1:
                    System.out.println("\n\nNota da P1: " + objAluno.getNtPrv1());
                    System.out.println("Nota da P2: " + objAluno.getNtPrv2());
                    System.out.println("Nota do T1: " + objAluno.getNtTrab1());
                    System.out.println("Nota do T2: " + objAluno.getNtTrab2());
                    break;
                case 2:
                    System.out.println("\n\nMéida da P1: " + objAluno.calcMediaProva());
                    System.out.println("Média do T1: " + objAluno.calcMediaTrab());
                    break;
                case 3:
                    System.out.println("\n\nMédia Final: " + objAluno.calcMediaFinal());
                    if(objAluno.calcMediaFinal()>=6){
                        System.out.println("\nAprovado");
                    }else{
                        System.out.println("\nReprovado");
                    }
                    break;
                case 4:
                    System.out.println("\n\n\nTchau garaio kkkkkkj");
                    break;
            }
    }while(opcao<4);   
    }
    
}
