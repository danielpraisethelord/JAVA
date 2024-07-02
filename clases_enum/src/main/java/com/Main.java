package com;

public class Main {
    public static void main(String[] args) {
        
        DiasDeLaSemana hoy = DiasDeLaSemana.LUNES;

        switch (hoy) {
            case LUNES:
                System.out.println("Hoy es lunes");
                break;
            case MARTES:
                System.out.println("Hoy es martes");
                break;
            
            case MIERCOLES:
                System.out.println("Hoy es miercoles");
                break;
            
            case JUEVES:
                System.out.println("Hoy es jueves");
                break;
            
            case VIERNES:
                System.out.println("Hoy es viernes");
                break;

            default:
                break;
        }

        for (DiasDeLaSemana value : DiasDeLaSemana.values()) {
            System.out.println("Hoy es: " + value);
        }

        int hoyInt = DiasDeLaSemana.LUNES.ranking;
        System.out.println("Ranking: " + hoyInt);

        String hoyString = DiasDeLaSemana.SABADO.evento;
        System.out.println("Evento: " + hoyString);
        
    }
}