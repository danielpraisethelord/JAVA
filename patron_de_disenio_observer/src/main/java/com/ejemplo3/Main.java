package com.ejemplo3;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new SolObservador(subject);
        new PesoArgObservador(subject);
        new PesoMxObservador(subject);

        System.out.println("Si desea cambiar 10 dolares obtendrá: ");
        subject.setEstado(10);
        System.out.println("----------");
        System.out.println("Si desea cambiar 120 dolares obtendrá: ");
        subject.setEstado(120);
    }
}
