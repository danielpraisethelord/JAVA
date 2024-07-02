package com;

import java.util.Comparator;

public class NombreComparator implements Comparator <Persona> {
    
    /**
     * @return -1
     * Si se retorna negativo, Objeto1.x < Objeto2.x
     * @return 0
     * Si se retorna 0, Objeto1.x = Objeto2.x
     * @return 1
     * Si se retorna positivo, Objeto1.x > Objeto2.x
     */
    @Override
    public int compare(Persona obj1, Persona obj2) {
        return obj1.getNombre().compareTo(obj2.getNombre());
    }
    
}
