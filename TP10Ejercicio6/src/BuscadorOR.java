package com.mycompany.tp10ejercicio6;

public class BuscadorOR implements Buscador {
    private Buscador b1, b2;

    public BuscadorOR(Buscador b1, Buscador b2) {
        this.b1 = b1;
        this.b2 = b2;
    }
    
    @Override
    public boolean cumple(Habitacion hh) {
        return this.b1.cumple(hh) || this.b2.cumple(hh);
    }
}