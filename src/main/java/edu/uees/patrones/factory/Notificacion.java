package edu.uees.patrones.factory;

/**
 * Product: contrato comun para los mecanismos de notificacion.
 */
public interface Notificacion {
    void enviar(String destinatario, String mensaje);
}
