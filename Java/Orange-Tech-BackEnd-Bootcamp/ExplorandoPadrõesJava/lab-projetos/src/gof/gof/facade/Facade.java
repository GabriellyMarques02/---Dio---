package gof.facade;

import gof.subsistema1.*;
import gof.subsistema2.*;
//consumindo ceps para clientes
public class Facade {
    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.gravarClient(nome, cep, cidade, estado);
    }
    
}
