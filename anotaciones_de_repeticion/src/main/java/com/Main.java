package com;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class Main {
    
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Lenguajes{
        Lenguaje[] value() default {};
    }

    @Repeatable(value = Lenguajes.class)
    public @interface Lenguaje{
        String value();
    }

    @Lenguaje("Java")
    @Lenguaje("Python")
    public interface LenguajeProgramacion {
        
    }

    public static void main(String[] args) {
        Lenguaje[] lenguajeArray = LenguajeProgramacion.class.getAnnotationsByType(Lenguaje.class);
        System.out.println("Se tiene: " +lenguajeArray.length + " anotaciones en lenguaje");

        Lenguajes len = LenguajeProgramacion.class.getAnnotation(Lenguajes.class);
        for (Lenguaje eLenguaje : len.value()) {
            System.out.println(eLenguaje.value());
        }
    }
}