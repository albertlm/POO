/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author Albert Leme de Brito
 */
public class Professor extends Pessoa{
    private int regFuncional;
    private double salario;

    public Professor(int regFuncional, String nome, String DataNascimento) {
        super(nome, DataNascimento);
        this.regFuncional = regFuncional;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getRegFuncional() {
        return regFuncional;
    }

    public double getSalario() {
        return salario;
    }
    
}
