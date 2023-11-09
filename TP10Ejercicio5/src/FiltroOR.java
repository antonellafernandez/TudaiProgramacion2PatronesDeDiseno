package com.mycompany.tp10ejercicio5;

public class FiltroOR extends Filtro {
    private Filtro f1, f2;

    public FiltroOR(Filtro f1, Filtro f2) {
        this.f1 = f1;
        this.f2 = f2;
    }
    
    @Override
    public boolean cumple(Elemento ee) {
        return f1.cumple(ee) || f2.cumple(ee);
    }
}