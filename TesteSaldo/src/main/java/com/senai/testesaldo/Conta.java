package com.senai.testesaldo;


public class Conta {
    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }
    
    public void depositar(double valor){
        saldo += valor;
    }
    public void sacar(double valor) throws IllegalArgumentException{
//        assert (saldo - valor) >= 0 : "Saldo ficara negativo";
        if((saldo - valor) < 0) throw new IllegalArgumentException("Valor superior ao saldo");
        saldo -= valor;
    }
    public double getSaldo(){
        return saldo;
    }
}