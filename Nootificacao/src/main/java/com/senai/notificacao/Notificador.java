package com.senai.notificacao;

public class Notificador {
    private Notificacao notificacao;

    public Notificador(Notificacao notificacao) {
        this.notificacao = notificacao;
    }
    
    public void notificar(String mensagem){
        notificacao.enviarMensagem(mensagem);
    }
}
