package com;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Hello");

        // Verificar si hay un valor presente
        if (optional.isPresent()) {
            System.out.println("Value is present: " + optional.get());
        } else {
            System.out.println("Value is not present");
        }

        // Acceder al valor con una acción predeterminada
        String value = optional.orElse("Default Value");
        System.out.println("Value: " + value);

        // Acceder al valor usando una función de suministro
        value = optional.orElseGet(() -> "Default Value from Supplier");
        System.out.println("Value: " + value);

        // Lanzar una excepción si el valor no está presente
        try {
            value = optional.orElseThrow(() -> new IllegalArgumentException("No value present"));
            System.out.println("Value: " + value);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Operaciones funcionales
        optional.map(String::toUpperCase)
                .ifPresent(upper -> System.out.println("Upper case: " + upper));

        optional.flatMap(v -> Optional.of(v.toUpperCase()))
                .ifPresent(flatMapped -> System.out.println("Flat mapped upper case: " + flatMapped));

        optional.filter(v -> v.length() > 3)
                .ifPresent(filtered -> System.out.println("Filtered value: " + filtered));
    }
}