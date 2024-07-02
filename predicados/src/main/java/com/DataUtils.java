package com;

import java.util.Arrays;
import java.util.List;

public class DataUtils {
    public static List<Empleado> cargarEmpleados() {
        List<Empleado> listaEmpleados = Arrays.asList(
        new Empleado(1, "Juan", "Perez", "LATAM", 3000, "Mexico"),
        new Empleado(2, "Pedro", "Infante", "APAC", 2000, "Israel"),
        new Empleado(3, "Roberto", "Bolaños", "NORTH AMERICA", 1000, "EE.UU"),
        new Empleado(4, "Juan", "Gabriel", "AFRICA", 9000, "Nigeria"),
        new Empleado(5, "Daniel", "Santiago", "LATAM", 7000, "Mexico")
        );
        
        return listaEmpleados;
    }
}
