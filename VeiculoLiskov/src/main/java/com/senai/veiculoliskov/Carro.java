package com.senai.veiculoliskov;

public class Carro extends Veiculo{
    private double taxaCarro;

    public Carro(String modelo, String placa, double taxaCarro) {
        super(modelo, placa);
        this.taxaCarro = taxaCarro;
    }
    
    @Override
    public double calcularTaxaAluguel() {
        return taxaCarro;
    }
    
    
}
