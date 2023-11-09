package com.mycompany.tp10ejercicio6;

import java.util.Comparator;

public class ComparadorMayorSuperficie implements Comparator<Habitacion> {
    @Override
    public int compare(Habitacion h1, Habitacion h2) {
        return h2.getmCuadradosTotales() - h2.getmCuadradosTotales();
    }
}
