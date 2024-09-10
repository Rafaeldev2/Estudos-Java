package com.senai.automovel;

import java.util.Scanner;

public class Carro{

    public String marca;
    public String modelo;
    public int anoFabric;
    public int numeroPortas;

    public Carro criaCarro(Carro carro){

        if(carro.numeroPortas > 5){
            System.out.println("Não é um carro!! ");
        }else{
            System.out.println("Digite os seguintes dados do carro: marca, modelo, ano e o numero de portas, respectivamente. ");
            Scanner sc = new Scanner(System.in);
            carro.marca = sc.nextLine();
            carro.modelo = sc.nextLine();
            carro.anoFabric = sc.nextInt();
            carro.numeroPortas = sc.nextInt();            
        }
        return carro;
    }
}
