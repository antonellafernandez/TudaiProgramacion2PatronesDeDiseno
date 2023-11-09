package com.mycompany.tp10ejercicio4;

public class BuscadorAND extends Buscador {
    private Buscador b1, b2;

    public BuscadorAND(Buscador b1, Buscador b2) {
        this.b1 = b1;
        this.b2 = b2;
    }
    
    @Override
    public boolean cumple(Elemento ee) {
        return b1.cumple(ee) && b2.cumple(ee);
    }
}