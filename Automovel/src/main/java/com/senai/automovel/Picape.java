package com.senai.automovel;

import java.util.Scanner;

public class Picape{

    public String marca;
    public String modelo;
    public int anoFabric;
    public Double capacidadeCarga;

    
    public Picape criaPicape(Picape picape){

        System.out.println("Digite os seguintes dados da picape: marca, modelo, ano e a capacidade de carga, respectivamente. ");
        Scanner sc = new Scanner(System.in);
        picape.marca = sc.nextLine();
        picape.modelo = sc.nextLine();
        picape.anoFabric = sc.nextInt();
        picape.capacidadeCarga = sc.nextDouble();            
        
        return null;
    }
    
}
