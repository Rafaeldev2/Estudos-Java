package com.senai.metodospagamentosolid;

public class Pedido {
    private double total;
    private Pagamento metodoPagamento;

    public Pedido(double total, Pagamento metodoPagamento) {
        this.total = total;
        this.metodoPagamento = metodoPagamento;
    }
    
    public void processarPagamento(){
        metodoPagamento.pagar(total);
    }
}
