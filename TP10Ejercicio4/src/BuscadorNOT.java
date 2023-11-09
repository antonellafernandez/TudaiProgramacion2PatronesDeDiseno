package com.mycompany.tp10ejercicio4;

public class BuscadorNOT extends Buscador {
    private Buscador bb;

    public BuscadorNOT(Buscador bb) {
        this.bb = bb;
    }

    @Override
    public boolean cumple(Elemento ee) {
        return !bb.cumple(ee);
    }
}