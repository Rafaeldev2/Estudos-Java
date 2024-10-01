package com.senai.sistemaavaliacaoalunos;

import java.util.List;

public class UnidadeCurricular {
    private String nomeUC;
    private List avaliacao;
    
    public UnidadeCurricular(String nomeUC) {
        this.nomeUC = nomeUC;
    }

    public String getNomeUC() {
        return nomeUC;
    }

    public void setNomeUC(String nomeUC) {
        this.nomeUC = nomeUC;
    }
    
    public double[] ListaMedia(){
        return null;
    }
    
}
