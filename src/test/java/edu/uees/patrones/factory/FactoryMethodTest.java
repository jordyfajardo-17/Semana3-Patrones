package edu.uees.patrones.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

class FactoryMethodTest {

    @Test
    void debeCrearUnaNotificacionEmail() {
        NotificacionCreator creator = new EmailCreator();

        assertInstanceOf(EmailNotificacion.class, creator.crearNotificacion());
    }

    @Test
    void debeCrearUnaNotificacionSms() {
        NotificacionCreator creator = new SmsCreator();

        assertInstanceOf(SmsNotificacion.class, creator.crearNotificacion());
    }

    @Test
    void debeCrearUnaNotificacionPush() {
        NotificacionCreator creator = new PushCreator();

        assertInstanceOf(PushNotificacion.class, creator.crearNotificacion());
    }

    @Test
    void debeCrearUnaNotificacionWhatsApp() {
        NotificacionCreator creator = new WhatsAppCreator();

        assertInstanceOf(WhatsAppNotificacion.class, creator.crearNotificacion());
    }
}
