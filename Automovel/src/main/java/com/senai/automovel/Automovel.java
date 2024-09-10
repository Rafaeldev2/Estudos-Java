package com.senai.automovel;


public class Automovel {

    public static void main(String[] args) {
        
        Carro carro = new Carro();
        carro.criaCarro(carro);
        System.out.println("O carro é: " + carro);
        
        Picape picape = new Picape();
        picape.criaPicape(picape);
        System.out.println("A picape é: " + picape);
        
        SUV suv = new SUV();
        suv.criaSUV(suv);
        System.out.println("O SUV é: " + suv);
    }
}