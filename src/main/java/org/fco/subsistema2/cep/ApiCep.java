package org.fco.subsistema2.cep;

public class ApiCep {

    private static ApiCep instanciaCep = new ApiCep();

    private ApiCep() {
        super();
    }

    public static ApiCep getInstance() {
        return instanciaCep;
    }

    public String buscaCidade(String cep) {
        return "Araraquara";
    }

    public String buscaEstado(String cep) {
        return "SP";
    }
}
