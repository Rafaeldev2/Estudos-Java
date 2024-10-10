package com.senai.testeecommerce;

import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private String cpf;
    private double contaBanco;
    private LocalDate dataNasc;
    
    public Pessoa(String nome, String cpf, double contaBanco, int dia, int mes, int ano){
        this.nome = nome;
        this.cpf = cpf;
        this.contaBanco = contaBanco;
        this.dataNasc = LocalDate.of(ano, mes, dia);
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
    
    
}
