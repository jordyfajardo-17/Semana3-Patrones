package edu.uees.patrones.builder;

import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) {
        System.out.println("=== BUILDER | UEES ===");

        Reserva reservaVirtual = new ReservaBuilder()
                .estudiante("Ana Torres")
                .docente("Carlos Perez")
                .fechaHora(LocalDateTime.of(2026, 8, 29, 18, 0))
                .modalidad(Modalidad.VIRTUAL)
                .motivo("Revision del proyecto")
                .observacion("Analizar diagrama UML")
                .prioridad(Prioridad.ALTA)
                .recordatorio(true)
                .enlace("https://meet.example/tutoria")
                .duracionMinutos(45)
                .build();

        System.out.println("Reserva 1:");
        System.out.println(reservaVirtual);

        System.out.println();

        Reserva reservaPresencial = new ReservaBuilder()
                .estudiante("Maria Lopez")
                .docente("Juan Garcia")
                .fechaHora(LocalDateTime.of(2026, 8, 30, 10, 0))
                .modalidad(Modalidad.PRESENCIAL)
                .build();

        System.out.println("Reserva 2 con valores por defecto:");
        System.out.println(reservaPresencial);
    }
}
