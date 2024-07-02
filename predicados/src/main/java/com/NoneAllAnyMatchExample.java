package com;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class NoneAllAnyMatchExample {
    public static void main(String[] args) {
        List<Empleado> empleados = DataUtils.cargarEmpleados();
        Predicate<Empleado> predicatePais = emp -> emp.getPais().equals("Mexico");
        Predicate<Empleado> predicateVentasAltas = emp -> emp.getVentas() > 4000;

        List<Empleado> empleadosLista = empleados.stream().filter(predicatePais.negate().and(predicateVentasAltas)).collect(Collectors.toList()); 
        
        empleadosLista.forEach(emp -> {
            System.out.println(emp.getNombre() + ", " + emp.getApellido());
        });

        System.out.println("");

        boolean isNotFromMexico = empleados.stream().noneMatch(predicatePais);
        boolean isAllFromMexico = empleados.stream().allMatch(predicatePais);
        boolean isAnyFromMexico = empleados.stream().anyMatch(predicatePais);

        System.out.println(isNotFromMexico + " ," + isAllFromMexico + " ," + isAnyFromMexico);

    }
}
