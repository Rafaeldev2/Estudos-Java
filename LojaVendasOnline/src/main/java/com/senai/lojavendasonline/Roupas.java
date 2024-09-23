package com.senai.lojavendasonline;

public class Roupas extends Produto{
    
    private String tamanho;

    public Roupas(String nome, String tamanho, double preco) {
        
        super(nome, preco);
        this.tamanho = tamanho;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public Double calcularComDesconto(Double desconto) {
            return preco - (preco * desconto);
    }

    @Override
    public String getInformacoes() {
            return "Roupa: " + nome + " - Preço: R$ " + preco + " - Tamanho: " + tamanho;
    }
    
    
}
