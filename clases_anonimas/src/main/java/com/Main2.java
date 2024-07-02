package com;

public class Main2 {
    public static void main(String[] args) {
        Animmal perro = new Animmal(){
            void hacerSonido() {
                System.out.println("Guau");
            }
        };
    
        perro.hacerSonido();    
    }
}
