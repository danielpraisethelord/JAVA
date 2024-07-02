package com;

public class Main {
    private static double atributo1;
    private double atributo2;

    public static double probarLocalVariable() {

        final double n3 = 3;
        /*Operacion op = new Operacion() {
            @Override
            public double calcular(double n1, double n2) {
                return n3 + n1 + n2;
            }
        };*/

        Operacion operacion = (x,y) -> {
            return x+y+n3;
        };
        
        return operacion.calcular(1, 1);
    }

    public double probarAtributosStaticVariables() {
        Operacion operacion = (x,y) -> {
            atributo1 = x+y;
            atributo2 = atributo1;
            return atributo2;
        };
        return operacion.calcular(1, 3);
    }
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.probarAtributosStaticVariables());
    }
}