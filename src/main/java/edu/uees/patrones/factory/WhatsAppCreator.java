package edu.uees.patrones.factory;

public class WhatsAppCreator extends NotificacionCreator {
    @Override
    public Notificacion crearNotificacion() {
        return new WhatsAppNotificacion();
    }
}
