package edu.uees.patrones.factory;

public class SmsNotificacion implements Notificacion {
    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println("Enviando SMS a " + destinatario + ": " + mensaje);
    }
}
