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
public class FuncionarioMensalista extends Funcionario {
    private double salMin;
    private int numSalMin;

    public FuncionarioMensalista(int registro, String nome, String dtAdmissao, String cargo, double salMin) {
        super(registro, nome, dtAdmissao, cargo);
        this.salMin = salMin;
    }

    public void NumSalMin(int numSalMin) {
        this.numSalMin = numSalMin;
    }
    
    public double calcSalBruto() {
        return(salMin*numSalMin);
    }
}
