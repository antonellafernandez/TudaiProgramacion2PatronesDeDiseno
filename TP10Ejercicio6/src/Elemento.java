package com.mycompany.tp10ejercicio6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public abstract class Elemento implements Comparable<Elemento> {
    private int idElemento;

    public Elemento() {
    }

    public Elemento(int idElemento) {
        this.idElemento = idElemento;
    }

    public int getIdElemento() {
        return idElemento;
    }

    public void setIdElemento(int idElemento) {
        this.idElemento = idElemento;
    }
    
    @Override
    public int compareTo(Elemento e) {
        if (this.getIdElemento() < (e.getIdElemento())) {
            return -1;
        } else if (this.getIdElemento() > (e.getIdElemento())) {
            return 1;
        } else
            return 0;
    }
    
    public ArrayList<Habitacion> buscarOrdenados(Buscador bb, Comparator cc) {
        ArrayList<Habitacion> habitaciones = this.buscar(bb);
        Collections.sort(habitaciones, cc);
        return habitaciones;
    }
    
    public abstract int getmCuadradosTotales();
    public abstract ArrayList<Habitacion> buscar(Buscador bb);
}