package com.senai.frotaveiculo;

public class Carro implements Veiculo, VeiculoAbastece, VeiculoComManutencao{

    @Override
    public void dirigir() {
        System.out.println("Dirigindo carro.");
    }

    @Override
    public void abastecer() {
        System.out.println("Abastecendo carro.");
    }

    @Override
    public void manutencao() {
        System.out.println("Realizando manutenção no carro");
    }
    
}
