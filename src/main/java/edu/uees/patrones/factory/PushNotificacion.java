package edu.uees.patrones.factory;

public class PushNotificacion implements Notificacion {
    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println("Enviando notificacion push a " + destinatario + ": " + mensaje);
    }
}
