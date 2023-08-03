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
public class Projeto {
    private int codigo;
    private String descricao;
    private String dtInicio;
    private String dtTermino;
    private Funcionario[] funcionarios;
    private int numProj;

    public Projeto(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
        funcionarios = new Funcionario[10];
        numProj = 0;
    }
    
    public void listarFuncionarios(){
        System.out.println("\n> Código: "+codigo);
        System.out.println("> Descrição do Projeto: "+descricao);
        System.out.println("> Data Início: "+dtInicio);
        System.out.println("> Data Início: "+dtTermino);
        
        System.out.println("\nRegisto\t\tNome\t\t\tCargo: "+numProj);
        for(int x=0;x<numProj;x++){
            System.out.println(funcionarios[x].getRegistro()+"\t\t"+funcionarios[x].getNome()+"\t\t"+funcionarios[x].getCargo());
        }
    }
    
    public void addFuncionario(Funcionario f){
        funcionarios[numProj] = f;
        numProj++;
    }

    public void setDtInicio(String dtInicio) {
        this.dtInicio = dtInicio;
    }

    public void setDtTermino(String dtTermino) {
        this.dtTermino = dtTermino;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDtInicio() {
        return dtInicio;
    }

    public String getDtTermino() {
        return dtTermino;
    }
}
