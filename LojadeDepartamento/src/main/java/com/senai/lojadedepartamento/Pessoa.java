package com.senai.lojadedepartamento;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Pessoa {
    private String nome;
    private LocalDate dataNasc;

    public Pessoa(String nome, int dia, int mes, int ano) {
        this.nome = nome;
        this.dataNasc = LocalDate.of(ano, mes, dia);
    }

    public String getNome() {
        return nome;
    }
    
    public int getIdade(){
    
        Period periodo = Period.between(dataNasc, LocalDate.now());
        return periodo.getYears();
    }
    
}
