package com.senai.estadospessoa;


public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + '}';
    }

}

//Estado de um objeto é o valor dos atributos em um instante.
//Os atributos podem assumir diversos valores, conforme a regra imposta.
//Os atributos nem sempre tem valores independentes ou seja, em certas situações um valor de um atributodepende de outro atributo dele.
//O Espaço-estado define o conjunto de valores válidos para os atributos - são as dimensões do espaço-estado.
//É necessário que sejam controlados não apenas a atribuição de valores, mas qualquer método só pode alterar atributos dentro de seu espaço-estado, de forma independentemente do tipo de processamento que serárealizado.
//Invariante é algo que controla o estado do meu objeto. Garante que o meu objeto nunca esteja num estado inválido.