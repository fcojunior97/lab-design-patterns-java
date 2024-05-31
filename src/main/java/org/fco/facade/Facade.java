package org.fco.facade;

import org.fco.subsistema1.crm.CrmService;
import org.fco.subsistema2.cep.ApiCep;

public class Facade {

    private ApiCep apiCep = ApiCep.getInstance();
    public void migrarCliente(String nome, String cep) {
        String cidade = apiCep.buscaCidade(cep);
        String estado = apiCep.buscaEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);

    }
}
