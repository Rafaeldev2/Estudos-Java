package com.senai.figuranaoliskov;

public class FiguraNaoLiskov {

    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(5, 10);
        System.out.println("Área do Retângulo: " + retangulo.calcularArea());

        // Usando Quadrado como Retângulo
        Retangulo quadrado = new Quadrado(5);
        System.out.println("Área do Quadrado: " + quadrado.calcularArea());

        // Alterando a largura do quadrado
        quadrado.setLargura(10);
        System.out.println("Área após alterar largura do Quadrado: " + quadrado.calcularArea());
        
        // Comportamento inesperado
        quadrado.setAltura(5); // Isso também altera a largura
        System.out.println("Área após alterar altura do Quadrado: " + quadrado.calcularArea());
        }
    }
