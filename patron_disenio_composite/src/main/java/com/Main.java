package com;

public class Main {
    public static void main(String[] args) {
        ElementoBoton boton = new Buton();
        ElementoGrafico campoDeTexto = new CampoDeTexto();
        ElementoGrafico contenedor = new Contenedor();
        contenedor.dibujar();
        boton.dibujar();
        boton.click(o -> System.out.println("El boton se ha clickeado"));
        boton.getColor();
        campoDeTexto.dibujar();
    }
}