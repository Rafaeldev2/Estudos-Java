package com.senai.figuranaoliskov;

public class Quadrado extends Retangulo {
    public Quadrado(double lado) {
        super(lado, lado);
    }

    @Override
    public void setLargura(double largura) {
        super.setLargura(largura);
        super.setAltura(largura); // Força que largura e altura sejam iguais
    }

    @Override
    public void setAltura(double altura) {
        super.setLargura(altura);
        super.setAltura(altura); // Força que largura e altura sejam iguais
    }
}
