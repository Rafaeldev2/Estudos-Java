package com.senai.notificacao;


public class NotificacoesTotais {

    public static void main(String[] args) {
        Notificacao email = new NotificacaoPorEmail();
        Notificador notificadorEmail = new Notificador(email);
        notificadorEmail.notificar("Olá, aqui está a sua mensagem por email.");
        
        Notificacao sms = new NotificacaoPorSMS();
        Notificador notificadorSMS = new Notificador(sms);
        notificadorSMS.notificar("Olá aqui está a sua mensagem por SMS.");
    }
}
