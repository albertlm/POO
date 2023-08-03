
import fatec.poo.model.FuncionarioComissionado;
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
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
        DecimalFormat df = new DecimalFormat("#,##0.00");
        FuncionarioHorista funcHor = new FuncionarioHorista(1010,"Pedro Minhoca","11/09/2001","Matador de aluguel",15.08);
        
        funcHor.setQtdeHorTrab(90);
        
        System.out.println("HORISTA");
        System.out.println("> Registro: " + funcHor.getRegistro());
        System.out.println("> Nome: " + funcHor.getNome());
        System.out.println("> Data Admissão: " + funcHor.getDtAdmissao());
        System.out.println("> Cargo: " + funcHor.getCargo());
        System.out.println("> Salário Bruto: " + df.format(funcHor.calcSalBruto()));
        System.out.println("> Desconto: " + df.format(funcHor.calcDesconto()));
        System.out.println("> Gratificação: " + df.format(funcHor.calcGratificacao()));
        System.out.println("> Salário Líquido: " + df.format(funcHor.calcSalLiquido()));
        
        System.out.println("");
        
        FuncionarioMensalista funcMens = new FuncionarioMensalista(1010,"Pedro Crack","06/06/2006","Operador de empilhadeira",1200);
        
        funcMens.NumSalMin(4);
        
        System.out.println("MENSALISTAS");
        System.out.println("> Registro: " + funcMens.getRegistro());
        System.out.println("> Nome: " + funcMens.getNome());
        System.out.println("> Data Admissão: " + funcMens.getDtAdmissao());
        System.out.println("> Cargo: " + funcMens.getCargo());
        System.out.println("> Salário Bruto: " + df.format(funcMens.calcSalBruto()));
        System.out.println("> Desconto: " + df.format(funcMens.calcDesconto()));
        System.out.println("> Salário Líquido: " + df.format(funcMens.calcSalLiquido()));
        
        System.out.println("");
        
        FuncionarioComissionado funcComiss = new FuncionarioComissionado(3030,"Pedro Morsa","12/06/1906","Operador de Robô guerreiro",1200);
        
        funcMens.NumSalMin(4);
        
        System.out.println("COMISSIONADOS");
        System.out.println("> Registro: " + funcComiss.getRegistro());
        System.out.println("> Nome: " + funcComiss.getNome());
        System.out.println("> Data Admissão: " + funcComiss.getDtAdmissao());
        System.out.println("> Cargo: " + funcComiss.getCargo());
        System.out.println("> Total vendas: R$ " + df.format(funcComiss.getTotalVendas()));
        System.out.println("> Salário Bruto: R$ " + df.format(funcComiss.calcSalBruto()));
        System.out.println("> Desconto: R$ " + df.format(funcComiss.calcDesconto()));
        System.out.println("> Salário Líquido: R$ " + df.format(funcComiss.calcSalLiquido()));
    }
}
