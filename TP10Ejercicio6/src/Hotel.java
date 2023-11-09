package com.mycompany.tp10ejercicio6;

import java.util.ArrayList;

public class Hotel extends Elemento {
    private ArrayList<Pabellon> pabellones;

    public Hotel() {
        this.pabellones = new ArrayList<>();
    }
    
    public Hotel(int idElemento) {
        super(idElemento);
        this.pabellones = new ArrayList<>();
    }

    public ArrayList<Pabellon> getPabellones() {
        return new ArrayList<Pabellon>(pabellones);
    }

    public void addPabellones(Pabellon p) {
        pabellones.add(p);
    }
    
    @Override
    public int getmCuadradosTotales() {
        int mCuadradosTotales = 0;
        
        for (Pabellon pabellon : pabellones) {
            mCuadradosTotales += pabellon.getmCuadradosTotales();
        }
        
        return mCuadradosTotales;
    }
    
    @Override
    public ArrayList<Habitacion> buscar(Buscador bb) {
        ArrayList<Habitacion> habitacionesCumplen = new ArrayList<>();
        
        for (Pabellon pabellon : pabellones) {
            for (Habitacion habitacion : pabellon.getHabitaciones()) {
                if (bb.cumple(habitacion)) {
                    habitacionesCumplen.add(habitacion);
                }
            }
        }

        return habitacionesCumplen;
    }
}