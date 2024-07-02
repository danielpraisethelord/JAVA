package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {

    private List<String> lista;
    
    public void llenarLista() {
        lista = new ArrayList<>();
        lista.add("Daniel");
        lista.add("Yosef");
        lista.add("Santiago");
        lista.add("Garcia");
    }

    public void usarForEach() {
        /*for (String elemento: lista){
            System.out.println(elemento);
        }*/

        //lista.forEach(x -> System.out.println(x));
        lista.forEach(System.out::println);
    }

    public void removeIf() {
        /*Iterator<String> it = lista.iterator();
        while(it.hasNext()) {
            if (it.next().equalsIgnoreCase("Yosef")){
                it.remove();
            }
        }*/
        lista.removeIf(x -> x.equalsIgnoreCase("Yosef"));
    }

    public void usarSort() {
        //Collections.sort(lista);
        lista.sort((x,y) -> x.compareTo(y));
    }
    public static void main(String[] args) {
        Main app = new Main();
        app.llenarLista();
        app.usarForEach();
        System.out.println("");
        app.removeIf();
        app.usarForEach();
        app.usarSort();
        System.out.println("");
        app.usarForEach();
    }
}