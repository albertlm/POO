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
public class Pessoa {
    private String nome;
    private String DataNascimento;

    public Pessoa(String nome, String DataNascimento) {
        this.nome = nome;
        this.DataNascimento = DataNascimento;
    }
    
    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return DataNascimento;
    }

    
    
}
