package com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<String> streamDeStrings = Stream.of("Antonio", "Maria", "Juan", "Pedro");
        List<String> lista = Arrays.asList("Antonio", "Maria", "Juan", "Pedro");
        Stream<String> streamDeLista = lista.stream();

        //TRANSFORMAR STREAM A UNA COLECCIÓN
        List<String> lista2 = streamDeStrings.collect(Collectors.toList());
        System.out.println(lista2);

        //FILTRADO
        Stream<String> streamDeStrings2 = Stream.of("Antonio", "Maria", "Juan", "Pedro")
            .filter(s -> s.contains("a"));
        List<String> lista3 = streamDeStrings2.collect(Collectors.toList());
        System.out.println(lista3);

        //MAP, TRANSFORMAR STREAM CON VALORES DESEADOS
        Stream<String> streamDeStrings3 = Stream.of("Antonio", "Maria", "Juan", "Pedro")
            .map(s -> s.toUpperCase());
        List<String> lista4 = streamDeStrings3.collect(Collectors.toList());
        System.out.println(lista4); 

        //CONTEO
        long streamDeStrings4 = Stream.of("Antonio", "Maria", "Juan", "Pedro")
            .count();
        System.out.println(streamDeStrings4); 

        //TRUE / FALSE
        boolean streamDeStrings5 = Stream.of("Antonio", "Maria", "Juan", "Pedro")
            .anyMatch(s -> s.contains("M"));
        System.out.println(streamDeStrings5);
        
        //COMBINACION
        Stream<String> streamDeStrings6 = Stream.of("Antonio", "Maria", "Juan", "Pedro")
            .filter(s -> s.contains("a"))
            .filter(s -> s.contains("M"));
        List<String> lista5 = streamDeStrings6.collect(Collectors.toList());
        System.out.println(lista5); 



    }
}