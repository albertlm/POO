/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author 0030482123001
 */
public class FuncionarioHorista extends Funcionario {
    private double valHorTrab;
    private int qtdeHorTrab;

    public FuncionarioHorista(int registro, String nome, String dtAdmissao, String cargo, double valHorTrab) {
        super(registro, nome, dtAdmissao, cargo);
        this.valHorTrab = valHorTrab;
    }

    public void setQtdeHorTrab(int qtdeHorTrab) {
        this.qtdeHorTrab = qtdeHorTrab;
    }
    
    public double calcSalBruto(){
        return(valHorTrab * qtdeHorTrab);
    }
    
    public double calcGratificacao(){
        return(0.075*calcSalBruto());
    }
    
    public double calcSalLiquido(){
        return(calcSalBruto() - calcDesconto() + calcGratificacao());
    }

}
