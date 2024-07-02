package com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();
        set.add("Hola");
        set.add("Hola"); //SET NO PERMITE DUPLICADOSd
        set.add("Juan");
        set.add("Pedro"); //SET ACTUA COMO PILA, EL ORDEN DE LOS VALORES ES COMO PILA, NO COMO COLA
        list.add("Adios");
        list.add("Adios");

        for (String s : set) 
            System.out.println(s);

        for (String l : list)
            System.out.println(l);
    }
}