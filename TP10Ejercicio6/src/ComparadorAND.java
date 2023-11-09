package com.mycompany.tp10ejercicio6;

import java.util.Comparator;

public class ComparadorAND implements Comparator<Habitacion> {
    private Comparator c1, c2;

    public ComparadorAND(Comparator c1, Comparator c2) {
        this.c1 = c1;
        this.c2 = c2;
    }
    
    @Override
    public int compare(Habitacion h1, Habitacion h2) {
        int resultado = this.c1.compare(h1, h2);
        
        if (resultado == 0) {
            resultado = this.c2.compare(h1, h2);
        }
        
        return resultado;
    }
}