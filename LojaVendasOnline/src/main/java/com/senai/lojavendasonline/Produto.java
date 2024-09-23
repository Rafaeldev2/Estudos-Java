package com.senai.lojavendasonline;

/**
     * Classe Abstrata:
     * Não pode ser instanciada;
     * Apenas é possível criar variáveis ou referências;
     * Visualização pública:
     * Todos tem acesso;
     */

public abstract class Produto {
    
    
    /**
     * Declarando as variáveis.
     * Visualização protected (acesso somente no mesmo pacote/package ou por herança);
     * String (palavras/letras);
     * nome =  Nome do produto.
     * double (Valores/números com casas decimais);
     * preco  = Preço do produto.
     */
    
    protected String nome;
    protected double preco;

    
    /**
     * Construtor da classe Produto.
     * Construtor NÃO possui retorno!
     * @param nome  Nome do produto.
     * @param preco Preço do produto.
     */
    
    public Produto(String nome, double preco) {

        this.nome = nome;
        this.preco = preco;
    }
    
    
    /**
     * Logo abaixo encontram-se os métodos acessores:
     * Set() para "setar"/definir/atribuir valores;
     * Set() tem retorno "Void" e aceita argumentos;
     * Get() para pegar/buscar valores já atribuidos;
     * Normalmente não aceitam argumentos;
     */
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    /**
     * Métodos abstratos não pode ter corpo de método;
     * Devem ser declarados em classe abstrata;
     * Devem ser sustituídos em uma subclasse;
     * Calcula o preço do produto com um desconto fornecido.
     * @param desconto Valor do desconto (0 a 1).
     * @return Preço com desconto aplicado.
     */
    
    public abstract Double calcularComDesconto(Double desconto);
    
    /**
     * Calcula o preço com um desconto padrão de 10%.
     *
     * @return Preço com o desconto padrão.
     */
    public Double calcularComDesconto (){
        
        return calcularComDesconto(0.10);
    }
    
    
    /**
     * Retorna as informações do produto.
     *
     * @return Uma string contendo o nome e o preço do produto e outros valores inseridos a partir das subclasses.
     */
    public abstract String getInformacoes();
}
