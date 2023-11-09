package com.mycompany.tp10ejercicio5;

import java.time.LocalDate;
import java.util.ArrayList;

public class Paquete extends Elemento {
    private int precio, valorAsegurado;

    public Paquete(int precio, int valorAsegurado, long id, String destino, LocalDate fechaPartida) {
        super(id, destino, fechaPartida);
        this.precio = precio;
        this.valorAsegurado = valorAsegurado;
    }

    @Override
    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public int getValorAsegurado() {
        return valorAsegurado;
    }

    public void setValorAsegurado(int valorAsegurado) {
        this.valorAsegurado = valorAsegurado;
    }
    
    @Override
    public int getCantPaquetes() {
        return 1;
    }
    
    @Override
    public Paquete obtenerPaqueteMayorValorAsegurado() {
        return this;
    }
    
    @Override
    public Elemento copiaRestringida(Filtro ff) {
        if (ff.cumple(this)) {
            return new Paquete(this.precio, this.valorAsegurado, this.getId(), this.getDestino(), this.getFechaPartida());
        }
        
        return null;
    }
    
    @Override
    public ArrayList<Elemento> buscar(Filtro ff) {
        ArrayList<Elemento> salida = new ArrayList<>();

        if (ff.cumple(this)) {
            salida.add(this);
        }

        return salida;
    }
}