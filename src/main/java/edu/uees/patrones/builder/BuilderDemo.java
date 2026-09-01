package edu.uees.patrones.builder;

import java.time.LocalDateTime;

public class BuilderDemo {
    public static void main(String[] args) {
        Reserva reservaSimple = new ReservaBuilder(
                "Jordy Fajardo",
                "Ing. Carlos Pérez",
                LocalDateTime.of(2026, 9, 3, 10, 0)
        ).build();

        Reserva reservaCompleta = new ReservaBuilder(
                "Ana López",
                "Dra. María Gómez",
                LocalDateTime.of(2026, 9, 4, 15, 30)
        )
                .modalidad("Virtual")
                .tema("Programación orientada a objetos")
                .observaciones("Revisar patrones de diseño")
                .recordatorio(false)
                .build();

        System.out.println(reservaSimple);
        System.out.println(reservaCompleta);
    }
}
