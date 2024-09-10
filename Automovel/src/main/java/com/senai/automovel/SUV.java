package com.senai.automovel;

import java.util.Scanner;

public class SUV{

    public String marca;
    public String modelo;
    public int anoFabric;
    public int numeroAssentos;


    public SUV criaSUV(SUV suv){
        
            if(suv.numeroAssentos > 7){
                System.out.println("Não é um SUV!! ");
            }else{
                System.out.println("Digite os seguintes dados do SUV: marca, modelo, ano e o numero de assentos, respectivamente. ");
                Scanner sc = new Scanner(System.in);
                suv.marca = sc.nextLine();
                suv.modelo = sc.nextLine();
                suv.anoFabric = sc.nextInt();
                suv.numeroAssentos = sc.nextInt();            
            }
        return suv;
    }
    public String getInfo() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + anoFabric + ", Quantidade de assentos: " + numeroAssentos;
    }
}
