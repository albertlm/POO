
import fatec.poo.model.Cliente;
import fatec.poo.model.Instrutor;
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
        Cliente objCliente = new Cliente("475.353.978-40","Carlos Porco","(16) 3223-4567");
        Instrutor objInstrutor = new Instrutor(1010,"João da Nica","(16) 3233-4587");
        
        DecimalFormat df = new DecimalFormat("#,##0.00");
        Scanner entrada = new Scanner(System.in);
        
        objCliente.setPeso(90);
        objCliente.setAltura(1.8);
        objInstrutor.setAreaAtuacao("Fisioterapia");
        
        System.out.println("CPF Aluno: " + objCliente.getCpf());
        System.out.println("Nome: " + objCliente.getNome());
        System.out.println("Telefone: " + objCliente.getTelefone());
        System.out.println("Peso: " + df.format(objCliente.getPeso()) + "kg");
        System.out.println("Altura: " + df.format(objCliente.getAltura()) + "m");
        System.out.println(("IMC: ") + df.format(objCliente.getIMC()));
        
        System.out.println("");
        
        System.out.println("Nome: " + objInstrutor.getNome());
        System.out.println("Telefone: " + objInstrutor.getTelefone());
        System.out.println("Identificação: " + objInstrutor.getIdentificacao());
        System.out.println("Área atuação: " + objInstrutor.getAreaAtuacao());
    }
    
}
