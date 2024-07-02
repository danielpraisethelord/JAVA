package com;

public class Main {
    public static void main(String[] args) {
        String hola = "Hola";
        String auxString = hola + " " + "mundo" + " " + "adios";
        // EN TERMINOS DE MEMORIA Y TIEMPO ES MAS EFECTIVO ESTO
        //StringBuffer es mutable
        StringBuffer stringBuffer = new StringBuffer("hola");
        stringBuffer.append(" ");
        stringBuffer.append("mundo");
        stringBuffer.append(" ");
        stringBuffer.append("adios");
        System.out.println(auxString);
        System.out.println(stringBuffer);
        
        stringBuffer.delete(0, 5);
        System.out.println(stringBuffer);
    }
}