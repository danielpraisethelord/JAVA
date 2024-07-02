package com;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Genericos<String> generico = new Genericos<String>("HOLA");
        generico.mostrar();

        Generico2 generico2 = new Generico2();
        final Integer resultado = generico2.mostrar("Hola", 1);
        System.out.println(resultado);

        List<Number> lista = new ArrayList<>();
        lista.add(1);
        lista.add(3.1416);
        lista.add(10L);
        lista.add(1.1f);

        List<String> otraLista = new ArrayList<>();


        Genericos3 generico3 = new Genericos3();
        generico3.mostrar(lista);
        
    }
}