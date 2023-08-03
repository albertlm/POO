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
public class Aluno extends Pessoa{
    private int regEscolar;
    private double mensalidade;

    //Método construtor de herança
    public Aluno(int regEscolar, String nome, String DataNascimento) {
        super(nome, DataNascimento);//Chamada do método construtor da Super Classe
        this.regEscolar = regEscolar;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }

    public int getRegEscolar() {
        return regEscolar;
    }

    public double getMensalidade() {
        return mensalidade;
    }
    
}
