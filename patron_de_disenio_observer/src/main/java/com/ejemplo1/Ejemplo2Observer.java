package com.ejemplo1;

public class Ejemplo2Observer implements Observer {
    @Override
    public void update() {
        System.out.println("Se ha llamado a Ejemplo 2");
    }
}
