package edu.uees.patrones.builder;

import java.time.LocalDateTime;

public class Reserva {
    private final String estudiante;
    private final String docente;
    private final LocalDateTime fechaHora;
    private final String modalidad;
    private final String tema;
    private final String observaciones;
    private final boolean recordatorio;

    Reserva(ReservaBuilder builder) {
        this.estudiante = builder.getEstudiante();
        this.docente = builder.getDocente();
        this.fechaHora = builder.getFechaHora();
        this.modalidad = builder.getModalidad();
        this.tema = builder.getTema();
        this.observaciones = builder.getObservaciones();
        this.recordatorio = builder.isRecordatorio();
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "estudiante='" + estudiante + '\'' +
                ", docente='" + docente + '\'' +
                ", fechaHora=" + fechaHora +
                ", modalidad='" + modalidad + '\'' +
                ", tema='" + tema + '\'' +
                ", observaciones='" + observaciones + '\'' +
                ", recordatorio=" + recordatorio +
                '}';
    }
}
