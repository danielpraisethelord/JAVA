package com;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.Value;
import lombok.extern.java.Log;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
//@RequiredArgsConstructor
@AllArgsConstructor
@Data //Genera ToString, Equals and HashCode, Getters y Setters, RequiredArgsConstructor
//@Value //INDICA QUE LA CLASE ES INMUTABLE (Parecido a usar RECORD)
@Builder
@Log
public class Persona {
    private int edad;
    private String nombre;
}
