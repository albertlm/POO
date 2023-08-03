
import java.util.Scanner;

/*@author 0030482123001*/

public class Exemplo1 {
    public static void main(String[] args) {
        Scanner entrada/*Ponteiro - Antecedido por uma classe*/ = new Scanner(System.in);
        int codProd, qtdVend;
        String descProd;
        double precUnit, valCompra;//Double armazena mais informação
        
        System.out.print("Digite o código do produto: ");
        codProd = entrada.nextInt();//método (/scanf("%d",&codProd))
        System.out.print("Digite a descrição: ");
        descProd = entrada.next();//método (/scanf("%s",&descProd))
        System.out.print("Digite o preço unitário: ");
        precUnit = entrada.nextDouble();//método (/scanf("%lf",&precUnit))
        System.out.print("Digite a quantidade vendida: ");
        qtdVend = entrada.nextInt();//método (/scanf("%d",&qtdVend))
        
        valCompra = precUnit * qtdVend;
        
        System.out.println("\nValor da compra: " + valCompra);
    }
}
