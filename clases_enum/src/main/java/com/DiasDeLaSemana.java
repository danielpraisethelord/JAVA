package com;

public enum DiasDeLaSemana {
    LUNES(1, "Uni"), 
    MARTES(2, "Uni"), 
    MIERCOLES(3, "Uni"), 
    JUEVES(4, "Uni"), 
    VIERNES(5, "Uni"), 
    SABADO(6, "Peda"), 
    DOMINGO(7, "Descanso");

    final int ranking;
    final String evento;

    DiasDeLaSemana(int ranking, String evento) {
        this.ranking = ranking;
        this.evento = evento;
    }

}
