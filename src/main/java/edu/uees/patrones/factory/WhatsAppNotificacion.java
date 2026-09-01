package edu.uees.patrones.factory;

/**
 * Nueva variante para demostrar que el sistema puede extenderse
 * sin modificar el contrato Notificacion.
 */
public class WhatsAppNotificacion implements Notificacion {
    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println("Enviando WhatsApp a " + destinatario + ": " + mensaje);
    }
}
