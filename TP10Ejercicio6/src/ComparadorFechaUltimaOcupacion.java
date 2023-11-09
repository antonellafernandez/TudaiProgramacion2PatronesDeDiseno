package com.mycompany.tp10ejercicio6;

import java.time.LocalDate;
import java.util.Comparator;

public class ComparadorFechaUltimaOcupacion implements Comparator<Habitacion> {
    @Override
    public int compare(Habitacion h1, Habitacion h2) {
        LocalDate d1 = h1.getFechaUltimaOcupacion();
        LocalDate d2 = h2.getFechaUltimaOcupacion();

        if (d1.isBefore(d2)) {
            return -1;
        } else if (d1.isAfter(d2)) {
            return 1;
        } else {
            return 0;
        }
    }
}