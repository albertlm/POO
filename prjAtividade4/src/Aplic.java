
import fatec.poo.model.PessoaFisica;
import fatec.poo.model.PessoaJuridica;
import java.text.DecimalFormat;

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
        double base=50;
        double taxaIncentivo=2.5;
        
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        PessoaFisica pFisica = new PessoaFisica("444.444.444-44", "Pedro Minhoca",2015);
        
        pFisica.addCompras(14000);
        pFisica.addCompras(1);
        
        System.out.println("PESSOA FÍSICA");
        pFisica.setBase(base);
        System.out.println("> Nome: " + pFisica.getNome());
        System.out.println("> Ano Inscrição: " + pFisica.getAnoInscricao());
        System.out.println("> CPF: " + pFisica.getCpf());
        System.out.println("> Total Compras: R$ " + df.format((pFisica.getTotalCompras())));
        System.out.println("> Cálculo Bônus: R$ " + df.format(pFisica.calcBonus(2023)));
        
        System.out.println("");
        
        PessoaJuridica pJuridica = new PessoaJuridica("123.456.789-10","Larica Lanches",2016);
        
        pJuridica.addCompras(15000);
        pJuridica.addCompras(1500);
                
        System.out.println("PESSOA JURÍDICA");
        pJuridica.setTaxaIncentivo(taxaIncentivo);
        System.out.println("> Nome: " + pJuridica.getNome());
        System.out.println("> Ano Inscrição: " + pJuridica.getAnoInscricao());
        System.out.println("> CGC: " + pJuridica.getCgc());
        System.out.println("> Taxa Incentivo: " + pJuridica.getTaxaIncentivo()+"%");
        System.out.println("> Total Compras: R$ " + df.format(pJuridica.getTotalCompras()));
        System.out.println("> Cálculo Bônus: R$ " + df.format(pJuridica.calcBonus(2023)));

    }
    
}
