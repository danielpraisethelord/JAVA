package com;

import java.time.LocalDate;
import java.util.Objects;

public record PersonaDto(
    String nombre,
    LocalDate fechaNacimiento,
    String calle
) {
    public PersonaDto {
        Objects.requireNonNull(nombre);
    }
}   
