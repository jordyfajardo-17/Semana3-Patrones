package edu.uees.patrones.factory;

public class PushCreator extends NotificacionCreator {
    @Override
    public Notificacion crearNotificacion() {
        return new PushNotificacion();
    }
}
