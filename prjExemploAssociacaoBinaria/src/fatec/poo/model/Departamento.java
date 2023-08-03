
package fatec.poo.model;

/**
 *
 * @author Dimas
 */
public class Departamento {
    private String sigla;
    private String nome;
    private Funcionario[] funcionarios;
    private int numFunc;

    public Departamento(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
        funcionarios = new Funcionario[10];
        numFunc = 0;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }
    
    //Tem como parâmetro de entrada, o endereço de um objeto das subclasses FuncionarioHorista, FuncionarioMensalista ou FuncionarioComissionado
    public void addFuncionario(Funcionario f){
        funcionarios[numFunc] = f;
        numFunc++;
    }
    
    public void listarFuncionarios(){
        System.out.println("\n> Sigla: "+sigla);
        System.out.println("> Departamento: "+nome);
        System.out.println("> Número de funcionários: "+numFunc);
        
        System.out.println("\nRegisto\t\tNome\t\t\tCargo: "+numFunc);
        for(int x=0;x<numFunc;x++){
            System.out.println(funcionarios[x].getRegistro()+"\t\t"+funcionarios[x].getNome()+"\t\t"+funcionarios[x].getCargo());
        }
    }
     
}
