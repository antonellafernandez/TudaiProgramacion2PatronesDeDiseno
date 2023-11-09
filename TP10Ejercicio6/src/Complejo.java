package com.mycompany.tp10ejercicio6;

import java.util.ArrayList;

public class Complejo extends Elemento {
    private ArrayList<Hotel> hoteles;

    public Complejo() {
        this.hoteles = new ArrayList<>();
    }

    public Complejo(int idElemento) {
        super(idElemento);
        this.hoteles = new ArrayList<>();
    }

    public ArrayList<Hotel> getHoteles() {
        return new ArrayList<Hotel>(hoteles);
    }

    public void addHotel(Hotel h) {
        hoteles.add(h);
    }
    
    @Override
    public int getmCuadradosTotales() {
        int mCuadradosTotales = 0;
        
        for (Hotel hotel : hoteles) {
            mCuadradosTotales += hotel.getmCuadradosTotales();
        }
        
        return mCuadradosTotales;
    }
    
    @Override
    public ArrayList<Habitacion> buscar(Buscador bb) {
        ArrayList<Habitacion> habitacionesCumplen = new ArrayList<>();
        
        for (Hotel hotel : hoteles) {
            for (Pabellon pabellon : hotel.getPabellones()) {
                for (Habitacion habitacion : pabellon.getHabitaciones()) {
                    if (bb.cumple(habitacion)) {
                        habitacionesCumplen.add(habitacion);
                    }
                }
            }
        }

        return habitacionesCumplen;
    }
}