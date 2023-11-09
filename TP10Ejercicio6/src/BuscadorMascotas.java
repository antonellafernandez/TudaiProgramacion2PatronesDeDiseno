package com.mycompany.tp10ejercicio6;

public class BuscadorMascotas implements Buscador {
    @Override
    public boolean cumple(Habitacion hh) {
        return hh.isMascotas();
    }
}