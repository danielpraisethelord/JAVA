package com;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public void verificar(int version) {
        if (version == 7) {
            Calendar fecha1 = Calendar.getInstance();
            Calendar fecha2 = Calendar.getInstance();
            fecha1.set(1991, 0, 21);
            System.out.println(fecha1.after(fecha2));
        } else if (version == 8) {
            LocalDate fecha1 = LocalDate.of(1991, 01, 21);
            LocalDate fecha2 = LocalDate.now();

            System.out.println(fecha1.isAfter(fecha2));

            LocalTime tiempo1 = LocalTime.of(22, 30, 50);
            LocalTime tiempo2 = LocalTime.now();

            System.out.println(tiempo1.isAfter(tiempo2));

            LocalDateTime fechaTiempo1 = LocalDateTime.of(1991, 01, 21, 22, 30, 50);
            LocalDateTime fechaTiempo2 = LocalDateTime.now();

            System.out.println(fechaTiempo1.isAfter(fechaTiempo2));
        }
    }

    public void medirTiempo(int version) throws InterruptedException {
        if (version == 7) {
            long ini = System.currentTimeMillis();
            Thread.sleep(1000);
            long fin = System.currentTimeMillis();
            System.out.println(fin - ini);
        } else if (version == 8) {
            Instant ini = Instant.now();
            Thread.sleep(1000);
            Instant fin = Instant.now();
            System.out.println(Duration.between(ini, fin).toMillis());
        }
    }

    public void periodoEntreFechas (int version) {
        if (version == 7) {
            Calendar nacimiento = Calendar.getInstance();
            Calendar actual = Calendar.getInstance();

            nacimiento.set(1991, 0, 21);
            actual.set(2017, 1, 04);
        
            int anios = 0;

            while(nacimiento.before(actual)) {
                nacimiento.add(Calendar.YEAR, 1);
                if (nacimiento.before(actual)) {
                    anios++;
                }
            }
            System.out.println(anios);
        } else if (version == 8) {
            LocalDate nacimiento = LocalDate.of(1992, 1, 21);
            LocalDate actual = LocalDate.now();

            Period period = Period.between(nacimiento, actual);
            System.out.println("Han transcurrido " + period.getYears() + " años y " + period.getMonths() + " meses y " +
                period.getDays() + " dias, desde " + nacimiento + " hasta " + actual);
            
        }
    }

    public void covertir (int version) {
        if (version == 7) {
            try {
                String fecha = "21/01/1991";
                DateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");
                Date fechaConvertida = formateador.parse(fecha);
                System.out.println(fechaConvertida);
                
                Date fechaActual = Calendar.getInstance().getTime();
                formateador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss a");
                String fechaCadena = formateador.format(fechaActual);
                System.out.println(fechaCadena);
            } catch (ParseException e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        } else if (version == 8) {
            String fecha = "21/01/1991";
            DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate fechaLocal = LocalDate.parse(fecha, formateador);
            System.out.println(fechaLocal);
            System.out.println(formateador.format(fechaLocal));
        }
    }

    public static void main(String[] args) {
        Main app = new Main();
        //app.verificar(8);
        try {
            app.covertir(8);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}