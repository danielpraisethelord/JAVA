package com.ejemplo1;

public class Main {
    public static void main(String[] args) {
        EjemploObservable ejemploObservable = new EjemploObservable();
        ejemploObservable.addObserver(new Ejemplo1Observer());
        ejemploObservable.addObserver(new Ejemplo2Observer());

        ejemploObservable.notifyObserver();

        ejemploObservable.addObserver(new Ejemplo3Observer());
        ejemploObservable.notifyObserver();
    }
}