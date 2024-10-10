package com.senai.testeecommerce;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    private String nome;
    private String cpf;
    private double saldoBanco;
    private LocalDate dataNasc;
    
    public Pessoa(String nome, String cpf, double saldoBanco, int dia, int mes, int ano){
        this.nome = nome;
        this.cpf = cpf;
        this.saldoBanco = saldoBanco;
        this.dataNasc = LocalDate.of(ano, mes, dia);
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSaldoBanco() {
        return saldoBanco;
    }
    
    public int getIdade(){
        Period periodo = Period.between(dataNasc, LocalDate.now());
        return periodo.getYears();
    }
}
