package com;

public class Contador {
    private static int valor = 0;

    public void contador() {
        valor++;
    }

    public static int getValor() {
        return valor;
    } 

    public static int suma (int a, int b) {
        return a + b;
    }
}
