package edu.uees.patrones.factory;

public class SmsCreator extends NotificacionCreator {
    @Override
    public Notificacion crearNotificacion() {
        return new SmsNotificacion();
    }
}
