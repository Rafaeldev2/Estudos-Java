package com.senai.frotaveiculo;

public class Bicicleta implements Veiculo, VeiculoComManutencao{

    @Override
    public void dirigir() {
        System.out.println("Dirigindo a bicilceta.");
    }

    @Override
    public void manutencao() {
        System.out.println("Realizando manutenção na bicilceta.");
    }
    
}
