package com;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    private Function<String, String> convertirMayusculas = x -> x.toUpperCase();
    private Function<String, String> convertirMinusculas = x -> x.toLowerCase();
    
    public Function<String, String> mostrar (String mensaje) {
        return (String x) -> mensaje + x;
    }

    public void imprimir (Function<String, String> function, String valor) {
        System.out.println(function.apply(valor));
    }

    public void filtar(List<String> lista, Consumer<String> consumidor, int longitud, String cadena) {
        lista.stream().filter(this.establecerLogicaFiltro(longitud)).filter(this.establecerLogicaFiltro2(cadena)).forEach(consumidor);
    }

    public Predicate<String> establecerLogicaFiltro(int longitud) {
        return texto -> texto.length() < longitud;
    }

    public Predicate<String> establecerLogicaFiltro2(String cadena) {
        return texto -> texto.contains(cadena);
    }

    public static void main(String[] args) {
        Main app = new Main();
        app.imprimir(app.convertirMayusculas, "hola paput");
        app.imprimir(app.convertirMinusculas, "ADIOS PAPut");

        String mensaje = app.mostrar("Hola ").apply("Papu");
        System.out.println(mensaje);

        List<String> lista = new ArrayList<>();
        lista.add("Daniel");
        lista.add("Yosef");
        lista.add("Santiago");
        

        app.filtar(lista, System.out::println, 100, "Daniel");
    }
}