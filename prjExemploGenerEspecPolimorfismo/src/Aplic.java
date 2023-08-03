
import fatec.poo.model.Aluno;
import fatec.poo.model.Professor;
import java.text.DecimalFormat;

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
        Aluno objAluno = new Aluno(1010,"Carlos Porco","06/06/06");
        Professor objProfessor = new Professor(2020,"João da Nica","11/09/2001");
        
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        objAluno.setMensalidade(1500);
        objProfessor.setSalario(26000);
        
        System.out.println("Registro escolar: " + objAluno.getRegEscolar());
        System.out.println("Nome: " + objAluno.getNome());
        System.out.println("Data de Nascimento: " + objAluno.getDataNascimento());
        System.out.println("Mensalidade: R$ " + df.format(objAluno.getMensalidade()));
        
        System.out.println("");
        
        System.out.println("Registro funcional: " + objProfessor.getRegFuncional());
        System.out.println("Nome: " + objProfessor.getNome());
        System.out.println("Data de Nascimento: " + objProfessor.getDataNascimento());
        System.out.println("Salário: R$ " + df.format(objProfessor.getSalario()));
    }
    
}
