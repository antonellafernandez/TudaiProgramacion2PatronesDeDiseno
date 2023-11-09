package com.mycompany.tp10ejercicio6;

public class BuscadorNOT implements Buscador {
    private Buscador bb;

    public BuscadorNOT(Buscador bb) {
        this.bb = bb;
    }
    
    @Override
    public boolean cumple(Habitacion hh) {
        return !this.bb.cumple(hh);
    }
}