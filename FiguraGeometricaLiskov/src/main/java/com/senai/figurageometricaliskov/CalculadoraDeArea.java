package com.senai.figurageometricaliskov;

import java.util.ArrayList;

public class CalculadoraDeArea {
    private ArrayList<FiguraGeometrica> figuras = new ArrayList<>();

    public void adicionarFigura(FiguraGeometrica figura) {
        figuras.add(figura);
    }

    public void calcularAreas() {
        for (FiguraGeometrica figura : figuras) {
            System.out.println("Área: " + figura.calcularArea());
        }
    }


}
