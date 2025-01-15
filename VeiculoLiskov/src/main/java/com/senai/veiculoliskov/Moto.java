package com.senai.veiculoliskov;

public class Moto extends Veiculo{
    private double taxaMoto;

    public Moto(String modelo, String placa, double taxaMoto){
        super(modelo, placa);
        this.taxaMoto = taxaMoto;
    }

    @Override
    public double calcularTaxaAluguel() {
        return taxaMoto;
    }
}
