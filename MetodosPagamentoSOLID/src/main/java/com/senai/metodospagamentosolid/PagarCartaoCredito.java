package com.senai.metodospagamentosolid;

public class PagarCartaoCredito implements Pagamento{
    private String numeroCartao;

    public PagarCartaoCredito(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }
    
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$ " + valor + " Processado via Cartão de Crédito.");
    }
}
