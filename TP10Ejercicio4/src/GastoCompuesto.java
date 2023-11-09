package com.mycompany.tp10ejercicio4;

import java.util.ArrayList;

public class GastoCompuesto extends Elemento {
    private ArrayList<Gasto> gastos;
    
    @Override
    public double getMonto() {
        double suma = 0;
        
        for (Elemento ee : gastos) {
            suma += ee.getMonto();
        }
        
        return suma;
    }
    
    @Override
    public ArrayList<Elemento> buscar(Buscador bb) {
        ArrayList<Elemento> salida = new ArrayList<>();
        
        if (bb.cumple(this)) {
            salida.add(this);
        } else {
            for (Elemento ee : gastos) {
                salida.addAll(ee.buscar(bb));
            }
        }
        
        return salida;
    }
}