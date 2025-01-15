package com.senai.veiculoliskov;

public class VeiculoLiskov {

    public static void main(String[] args) {
        
        Veiculo bmw = new Carro("320i", "X12AB3", 100.00);
        System.out.println(" O carro atual é: " + bmw.modelo + ", A placa é " + bmw.placa + ", e a taxa de aluguel é " + bmw.calcularTaxaAluguel());
        
        Veiculo kawasaki = new Moto("Z1000", "P58CD2", 50.00);
        System.out.println(" A moto atual é: " + kawasaki.modelo + ", A placa é " + kawasaki.placa + ", e a taxa de aluguel é " + kawasaki.calcularTaxaAluguel());
    }
}
