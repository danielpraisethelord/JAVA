package com;

public class Main {
    public static void main(String[] args) {
        FiguraGeometrica triangulo = new TrianguloEquilatero();
        comprobar(triangulo);
        Persona persona = new Persona();
        comprobar(persona);
        comprobarTriangulo(triangulo);
    }

    public static void comprobar (Object object) {
        if (object instanceof FiguraGeometrica) {
            System.out.println("Es una forma geometrica");
        } else {
            System.out.println("No es una figura geométrcia");
        }
    }

    public static void comprobarTriangulo (Object object) {
        if (object instanceof Triangulo triangulo2) {
            System.out.println(((Triangulo)object).getLados());
            Triangulo triangulo = (Triangulo) object;
            System.out.println(triangulo.getLados());
            System.out.println(triangulo2.getLados());
        }
    }
}