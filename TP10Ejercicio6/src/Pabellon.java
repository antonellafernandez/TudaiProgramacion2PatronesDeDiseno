package com.mycompany.tp10ejercicio6;

import java.util.ArrayList;

public class Pabellon extends Elemento {
    private ArrayList<Habitacion> habitaciones;

    public Pabellon() {
        this.habitaciones = new ArrayList<>();
    }
    
    public Pabellon(int idElemento) {
        super(idElemento);
        this.habitaciones = new ArrayList<>();
    }

    public ArrayList<Habitacion> getHabitaciones() {
        return new ArrayList<Habitacion>(habitaciones);
    }

    public void addHabitacion(Habitacion h) {
        habitaciones.add(h);
    }
    
    @Override
    public int getmCuadradosTotales() {
        int mCuadradosTotales = 0;
        
        for (Habitacion habitacion : habitaciones) {
            mCuadradosTotales += habitacion.getmCuadradosTotales();
        }
        
        return mCuadradosTotales;
    }
    
    @Override
    public ArrayList<Habitacion> buscar(Buscador bb) {
        ArrayList<Habitacion> habitacionesCumplen = new ArrayList<>();
        
        for (Habitacion habitacion : habitaciones) {
            if (bb.cumple(habitacion)) {
            habitacionesCumplen.add(habitacion);
            }
        }

        return habitacionesCumplen;
    }
}