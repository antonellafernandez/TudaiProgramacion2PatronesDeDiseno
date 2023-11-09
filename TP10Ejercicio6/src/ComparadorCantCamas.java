package com.mycompany.tp10ejercicio6;

import java.util.Comparator;

public class ComparadorCantCamas implements Comparator<Habitacion> {
    @Override
    public int compare(Habitacion h1, Habitacion h2) {
        return h1.getCantCamas() - h2.getCantCamas();
    }
}