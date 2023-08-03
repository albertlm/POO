import fatec.poo.model.Departamento;
import fatec.poo.model.FuncionarioComissionado;
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import fatec.poo.model.Projeto;

/**
 *
 * @author Dimas
 */
public class Aplic {
    public static void main(String[] args) {
        FuncionarioHorista funcHor  = new FuncionarioHorista(1010,
                                                             "Pedro Silveira",
                                                             "14/05/78",
                                                             15.80);
        
        funcHor.setCargo("Programador");
        
        FuncionarioMensalista funcMen  = new FuncionarioMensalista(2020,
                                                                   "Ana Beatriz",
                                                                   "22/07/88",
                                                                   600);
        
        funcMen.setCargo("Aux. Administrativo");
        
        FuncionarioComissionado funcCom = new FuncionarioComissionado(3030, 
                                                                     "Joao Mendes",
                                                                     "10/12/1975",
                                                                     10);
        funcCom.setCargo("Vendedor");
       
        //Instanciação de objetos da 
        //classe Departamento    
        Departamento objDep1 = new Departamento("RH", "Recursos Humanos");
        Departamento objDep2 = new Departamento("VD", "Vendas");
      
	  
        //Estabelecendo a associação binária entre 1
        //objeto da classe FuncionarioHorista com
        //1 objeto da classe Departamento
        funcHor.setDepartamento(objDep1);
        System.out.println("O funcionário horista "+funcHor.getNome()+" pertence ao departamento de "+funcHor.getDepartamento().getNome());

        //Estabelecendo a associação binária entre 1
        //objeto da classe FuncionarioMensalista com
        //1 objeto da classe Departamento
        funcMen.setDepartamento(objDep1);
        System.out.println("O funcionário mensalista "+funcMen.getNome()+" pertence ao departamento de "+funcMen.getDepartamento().getNome());

        //Estabelecendo a associação binária entre 1
        //objeto da classe FuncionarioComissionado com
        //1 objeto da classe Departamento   
        funcCom.setDepartamento(objDep2);
        System.out.println("O funcionário comissionado "+funcCom.getNome()+" pertence ao departamento de "+funcCom.getDepartamento().getNome());

        //Estabelecendo a associação binária entre um
        //objeto da classe Departamento com 1 ou mais (1..*)
        //objetos da classe FuncionarioHorista, FuncionarioMensalista
        //e FuncionarioComissionado  
        objDep1.addFuncionario(funcHor);
        objDep1.addFuncionario(funcMen);
        objDep2.addFuncionario(funcCom);
        
        objDep1.listarFuncionarios();
        objDep2.listarFuncionarios();
        
        //Instanciação de objetos da 
        //classe projeto 
        Projeto objProj1 = new Projeto(123, "Projeto de Estruturação da folha de pagamento");
        Projeto objProj2 = new Projeto(456, "Projeto de aplicativo de vendas");
        
        objProj1.setDtInicio("11/09/2001");
        objProj1.setDtTermino("01/05/2011");
        
        objProj2.setDtInicio("01/09/1939");
        objProj2.setDtTermino("08/05/1945");
        
        //Estabelecendo a associação binária entre um
        //objeto da classe Projeto com 1 ou mais (1..*)
        //objetos da classe FuncionarioHorista, FuncionarioMensalista
        //e FuncionarioComissionado
        objProj1.addFuncionario(funcHor);
        objProj1.addFuncionario(funcMen);
        objProj2.addFuncionario(funcCom);
        
        objProj1.listarFuncionarios();
        objProj2.listarFuncionarios();
    }    
}
