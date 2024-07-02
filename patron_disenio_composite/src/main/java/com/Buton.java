package com;

import java.util.function.Consumer;

public class Buton implements ElementoBoton {
    @Override
    public void dibujar() {
        System.out.println("Dibujando");
    }

    @Override
    public <T> void click(Consumer<T> consumer) {
        consumer.accept(null);
    }

    @Override
    public int getColor() {
        return 0;
    }
}
