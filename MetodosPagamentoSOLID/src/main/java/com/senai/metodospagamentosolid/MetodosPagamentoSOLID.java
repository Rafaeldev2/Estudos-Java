/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.senai.metodospagamentosolid;

/**
 *
 * @author rafael_t_moraes
 */
public class MetodosPagamentoSOLID {

    public static void main(String[] args) {
        Pagamento cartao = new PagarCartaoCredito("1234-5678-9876-5432");
        
        Pagamento paypal = new PagarPayPal("usuario@example.com");
        
        Pedido pedido1 = new Pedido(150.00, cartao);
        Pedido pedido2 = new Pedido(75.00, paypal);
        
        pedido1.processarPagamento();
        pedido2.processarPagamento();
    }
}
