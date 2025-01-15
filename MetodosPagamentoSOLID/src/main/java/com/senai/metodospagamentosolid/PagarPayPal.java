package com.senai.metodospagamentosolid;

public class PagarPayPal implements Pagamento{
    private String emai;

    public PagarPayPal(String emai) {
        this.emai = emai;
    }

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$ " + valor + " Processado via PayPal.");
    }
}
