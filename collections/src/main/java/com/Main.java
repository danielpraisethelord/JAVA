package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<Integer> lista = new ArrayList<>();
        lista.add(25);
        lista.add(10000);
        lista.add(1);

        System.out.println(lista);
        
        Collections.reverse(lista);
        System.out.println(lista);

        Collections.sort(lista);
        System.out.println(lista);
    
        List<String> lista2 = new ArrayList<>();
        lista2.add("Daniel Santiago");
        lista2.add("Daniel Garcia");
        lista2.add("ArrayList");
        
        Collections.sort(lista2);
        System.out.println(lista2);
    }
}