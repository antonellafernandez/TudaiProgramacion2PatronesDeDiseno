package com.mycompany.tp10ejercicio6;

public class BuscadorMetrosCuadrados implements Buscador {
    private int mCuadradosBuscados;

    public BuscadorMetrosCuadrados(int mCuadradosBuscados) {
        this.mCuadradosBuscados = mCuadradosBuscados;
    }
    
    @Override
    public boolean cumple(Habitacion hh) {
        return hh.getmCuadradosTotales() > this.mCuadradosBuscados;
    }
}