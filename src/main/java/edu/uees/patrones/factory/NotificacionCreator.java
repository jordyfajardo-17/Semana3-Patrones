package edu.uees.patrones.factory;

/**
 * Creator del patron Factory Method.
 */
public abstract class NotificacionCreator {
    public abstract Notificacion crearNotificacion();

    public void notificar(String destinatario, String mensaje) {
        Notificacion notificacion = crearNotificacion();
        notificacion.enviar(destinatario, mensaje);
    }
}
