package com.senai.serializacao;

import java.io.Serializable;

public class Cliente implements Serializable {
	private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cliente: " + nome;
    }
}
