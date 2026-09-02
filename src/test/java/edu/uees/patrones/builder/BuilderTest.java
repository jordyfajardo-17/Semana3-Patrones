package edu.uees.patrones.builder;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BuilderTest {

    @Test
    void debeConstruirUnaReservaConDatosObligatorios() {
        Reserva reserva = assertDoesNotThrow(() -> new ReservaBuilder(
                "Jordy Fajardo",
                "Ing. Carlos Pérez",
                LocalDateTime.of(2026, 9, 3, 10, 0)
        ).build());

        assertTrue(reserva.toString().contains("Jordy Fajardo"));
        assertTrue(reserva.toString().contains("Ing. Carlos Pérez"));
        assertTrue(reserva.toString().contains("Presencial"));
        assertTrue(reserva.toString().contains("Tutoría general"));
    }

    @Test
    void debeConstruirUnaReservaConOpcionales() {
        Reserva reserva = new ReservaBuilder(
                "Ana López",
                "Dra. María Gómez",
                LocalDateTime.of(2026, 9, 4, 15, 30)
        )
                .modalidad("Virtual")
                .tema("Programación orientada a objetos")
                .observaciones("Revisar patrones de diseño")
                .recordatorio(false)
                .build();

        String resultado = reserva.toString();
        assertTrue(resultado.contains("Virtual"));
        assertTrue(resultado.contains("Programación orientada a objetos"));
        assertTrue(resultado.contains("Revisar patrones de diseño"));
        assertTrue(resultado.contains("recordatorio=false"));
    }

    @Test
    void noDebePermitirEstudianteVacio() {
        assertThrows(IllegalArgumentException.class, () -> new ReservaBuilder(
                "",
                "Ing. Carlos Pérez",
                LocalDateTime.of(2026, 9, 3, 10, 0)
        ).build());
    }

    @Test
    void noDebePermitirDocenteNulo() {
        assertThrows(IllegalArgumentException.class, () -> new ReservaBuilder(
                "Jordy Fajardo",
                null,
                LocalDateTime.of(2026, 9, 3, 10, 0)
        ).build());
    }

    @Test
    void noDebePermitirFechaNula() {
        assertThrows(IllegalArgumentException.class, () -> new ReservaBuilder(
                "Jordy Fajardo",
                "Ing. Carlos Pérez",
                null
        ).build());
    }
}
