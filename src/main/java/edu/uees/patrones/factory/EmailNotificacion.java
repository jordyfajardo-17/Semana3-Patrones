package edu.uees.patrones.factory;

public class EmailNotificacion implements Notificacion {
    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println("Enviando correo a " + destinatario + ": " + mensaje);
    }
}
