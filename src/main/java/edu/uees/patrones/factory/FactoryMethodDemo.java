package edu.uees.patrones.factory;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        NotificacionCreator email = new EmailCreator();
        NotificacionCreator sms = new SmsCreator();
        NotificacionCreator push = new PushCreator();
        NotificacionCreator whatsapp = new WhatsAppCreator();

        email.notificar("estudiante@uees.edu.ec", "Recordatorio de tutoría");
        sms.notificar("0999999999", "Tu tutoría está confirmada");
        push.notificar("app-estudiante", "Tienes una nueva notificación");
        whatsapp.notificar("0999999999", "Tu docente ha actualizado la reserva");
    }
}
