package com.senai.lojavendasonline;


    /**
     * Classe publica Eletronicos extendendo a classe Produto;
     * Então, por meio da herança 
     */

public class Eletronicos extends Produto{
    
    /**
     * Variável Privada:
     * Ou seja pode ser vista apenas na classe atual;
     */
    
    private String marca;
    
    
    /**
     * Construtor da classe Eletronico.
     *
     * @param nome  Nome do produto.
     * @param preco Preço do produto.
     * @param marca Marca do eletrônico.
     */
    public Eletronicos(String nome, String marca, double preco) {
        
        super(nome, preco);
        this.marca = marca;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public Double calcularComDesconto(Double desconto) {
            return preco - (preco * desconto);
    }

    @Override
    public String getInformacoes() {
            return "Eletrônico: " + nome + " - Marca: " + marca + " - Preço: R$ " + preco;
    }
    
    
}
