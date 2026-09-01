package edu.uees.patrones.factory;

public class EmailCreator extends NotificacionCreator {
    @Override
    public Notificacion crearNotificacion() {
        return new EmailNotificacion();
    }
}
