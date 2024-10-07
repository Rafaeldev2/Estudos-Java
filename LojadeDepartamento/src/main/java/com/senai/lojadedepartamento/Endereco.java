package com.senai.lojadedepartamento;


//Uma Classe é um modelo que é usado para a criação de objetos.
//Uma classe também é uma composição de estrutura de dados.
//Pode realizar operaçãoes sobre essa estrutura de dados.
//A classe também faz a abstração de uma entidade do mundo real.

public class Endereco {
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;

    public Endereco(String rua, String bairro, String cidade, String estado) {
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }
    
    public String getRua() {
        return rua;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }    
    
}
