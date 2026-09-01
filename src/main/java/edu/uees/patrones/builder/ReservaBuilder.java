package edu.uees.patrones.builder;

import java.time.LocalDateTime;

public class ReservaBuilder {
    private final String estudiante;
    private final String docente;
    private final LocalDateTime fechaHora;

    private String modalidad = "Presencial";
    private String tema = "Tutoría general";
    private String observaciones = "";
    private boolean recordatorio = true;

    public ReservaBuilder(String estudiante, String docente, LocalDateTime fechaHora) {
        this.estudiante = estudiante;
        this.docente = docente;
        this.fechaHora = fechaHora;
    }

    public ReservaBuilder modalidad(String modalidad) {
        this.modalidad = modalidad;
        return this;
    }

    public ReservaBuilder tema(String tema) {
        this.tema = tema;
        return this;
    }

    public ReservaBuilder observaciones(String observaciones) {
        this.observaciones = observaciones;
        return this;
    }

    public ReservaBuilder recordatorio(boolean recordatorio) {
        this.recordatorio = recordatorio;
        return this;
    }

    public Reserva build() {
        if (estudiante == null || estudiante.isBlank()) {
            throw new IllegalArgumentException("El estudiante es obligatorio");
        }
        if (docente == null || docente.isBlank()) {
            throw new IllegalArgumentException("El docente es obligatorio");
        }
        if (fechaHora == null) {
            throw new IllegalArgumentException("La fecha y hora son obligatorias");
        }
        return new Reserva(this);
    }

    String getEstudiante() { return estudiante; }
    String getDocente() { return docente; }
    LocalDateTime getFechaHora() { return fechaHora; }
    String getModalidad() { return modalidad; }
    String getTema() { return tema; }
    String getObservaciones() { return observaciones; }
    boolean isRecordatorio() { return recordatorio; }
}
