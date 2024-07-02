package com;

public class Main {

    static {
        System.out.println("Hola Mundo, esto se ejecuta primero, antes del main porque es un: \n" +
                            "static {" + "\n" +
                        
                            "}");
    }
    public static void main(String[] args) {
        Contador contador1 = new Contador();
        Contador contador2 = new Contador();
        Contador contador3 = new Contador();

        contador1.contador();
        contador2.contador();
        contador3.contador();

        System.out.println(Contador.getValor());

        System.out.println(Contador.suma(2, 1));
    }
}