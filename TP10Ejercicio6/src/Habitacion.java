package com.mycompany.tp10ejercicio6;

import java.time.LocalDate;
import java.util.ArrayList;

public class Habitacion extends Elemento {
    private ArrayList<String> comodidades;
    private int mCuadrados;
    private int cantCamas;
    private LocalDate fechaUltimaOcupacion;
    private boolean mascotas;
    private Turista turista;

    public Habitacion() {
        this.comodidades = new ArrayList<>();
        this.turista = null;
    }

    public Habitacion(int idElemento, int mCuadrados, int cantCamas, LocalDate fechaUltimaOcupacion, boolean mascotas) {
        super(idElemento);
        this.comodidades = new ArrayList<>();
        this.mCuadrados = mCuadrados;
        this.cantCamas = cantCamas;
        this.fechaUltimaOcupacion = fechaUltimaOcupacion;
        this.mascotas = mascotas;
        this.turista = null;
    }

    public ArrayList<String> getComodidades() {
        return new ArrayList<String>(comodidades);
    }

    public void addComodidad(String s) {
        if (!comodidades.contains(s)) {
            comodidades.add(s);
        }
    }

    @Override
    public int getmCuadradosTotales() {
        return mCuadrados;
    }

    public void setmCuadrados(int mCuadrados) {
        this.mCuadrados = mCuadrados;
    }

    public int getCantCamas() {
        return cantCamas;
    }

    public void setCantCamas(int cantCamas) {
        this.cantCamas = cantCamas;
    }

    public LocalDate getFechaUltimaOcupacion() {
        return fechaUltimaOcupacion;
    }

    public void setFechaUltimaOcupacion(LocalDate fechaUltimaOcupacion) {
        this.fechaUltimaOcupacion = fechaUltimaOcupacion;
    }

    public boolean isMascotas() {
        return mascotas;
    }

    public void setMascotas(boolean mascotas) {
        this.mascotas = mascotas;
    }

    public Turista getTurista() {
        return turista;
    }

    public void setTurista(Turista turista) {
        this.turista = turista;
    }
    
    @Override
    public ArrayList<Habitacion> buscar(Buscador bb) {
        ArrayList<Habitacion> habitacionesCumplen = new ArrayList<>();
        
        
        if (turista != null) {
            if (bb.cumple(this)) {
                habitacionesCumplen.add(this);
            }
        }

        return habitacionesCumplen;
    }
}