package com.senai.notificacao;


public class NotificacaoPorSMS implements Notificacao{

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("SMS enviado para o numero (48)91234-5678: " + mensagem);
    }
    
}
