package com.mycompany.tp10ejercicio5;

public class FiltroNOT extends Filtro {
    private Filtro ff;

    public FiltroNOT(Filtro ff) {
        this.ff = ff;
    }
    
    @Override
    public boolean cumple(Elemento ee) {
        return !ff.cumple(ee);
    }
}