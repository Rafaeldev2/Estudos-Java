/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senai.notificacao;

/**
 *
 * @author rafael_t_moraes
 */
public class NotificacaoPorEmail implements Notificacao{

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando email: " + mensagem);
    }
    
}
