package com.senai.lojadedepartamento;

public class Cliente extends Pessoa{
    private String telefone;
    private Endereco endereco;

    public Cliente(String nome, int dia, int mes, int ano, String telefone, String rua, String bairro, String cidade, String estado) {
        super(nome, dia, mes, ano);
        this.telefone = telefone;
        this.endereco = new Endereco(rua, bairro, cidade, estado);
    }

    public String getTelefone() {
        return telefone;
    }
    
    public String getBairro(){
        return endereco.getBairro();
    }
    public String getEstado(){
        return endereco.getEstado();
    }
}