package com.senai.figurageometricaliskov;

public class FiguraGeometricaLiskov {

    public static void main(String[] args) {
                CalculadoraDeArea calculadora = new CalculadoraDeArea();

		FiguraGeometrica circulo = new Circulo(5);
		FiguraGeometrica retangulo = new Retangulo(4, 6);

		calculadora.adicionarFigura(circulo);
		calculadora.adicionarFigura(retangulo);

		calculadora.calcularAreas();
    }
}
