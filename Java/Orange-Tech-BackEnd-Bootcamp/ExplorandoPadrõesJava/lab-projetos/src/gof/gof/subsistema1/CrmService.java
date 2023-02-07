package gof.subsistema1;

public class CrmService {
    
    private CrmService(){ // evitar que a classe seja instanciada sem necessidade
        super();
    }
    public static void gravarClient(String nome, String cep, String cidade, String estado){
        System.out.println("Cliente foi salvo no sistema de CRM.");
        System.out.println(nome);
        System.out.println(cep);
        System.out.println(cidade);
        System.out.println(estado);
    }
    
}
