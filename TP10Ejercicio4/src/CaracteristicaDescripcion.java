package com.mycompany.tp10ejercicio4;

public class CaracteristicaDescripcion implements Caracteristica {
    private String descripcion;

    public CaracteristicaDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    @Override
    public String obtenerValor() {
        return this.descripcion;
    }
}