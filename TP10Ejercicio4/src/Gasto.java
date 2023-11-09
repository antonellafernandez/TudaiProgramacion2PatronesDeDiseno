package com.mycompany.tp10ejercicio4;

import java.util.ArrayList;

public class Gasto extends Elemento {
    private ArrayList<Caracteristica> caracteristicas;

    public Gasto() {
        this.caracteristicas = new ArrayList<>();
    }

    public ArrayList<Caracteristica> getCaracteristicas() {
        return new ArrayList<Caracteristica>(caracteristicas);
    }
    
    public void addCaracteristica (Caracteristica cc) {
        if (!caracteristicas.contains(cc)) {
            caracteristicas.add(cc);
        }
    }
    
    @Override
    public double getMonto() {
        double monto = 0;
        int i = 0;
        boolean existe = false;
        
        while (!existe && i < caracteristicas.size()) {
            if (caracteristicas.get(i) instanceof CaracteristicaMonto) {
                monto = ((CaracteristicaMonto) caracteristicas.get(i)).obtenerValor();
                existe = true;
            }
        }
        
        return monto;
    }
    
    @Override
    public ArrayList<Elemento> buscar(Buscador bb) {
        ArrayList<Elemento> salida = new ArrayList<>();
        
        if (bb.cumple(this)) {
            salida.add(this);
        }
        
        return salida;
    }
}