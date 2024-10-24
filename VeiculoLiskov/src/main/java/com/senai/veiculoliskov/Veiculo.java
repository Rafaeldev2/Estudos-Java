package com.senai.veiculoliskov;

public abstract class Veiculo {
    protected String modelo;
    protected String placa;

    public Veiculo(String modelo, String placa) {
        this.modelo = modelo;
        this.placa = placa;
    }

    public abstract double calcularTaxaAluguel();
}
