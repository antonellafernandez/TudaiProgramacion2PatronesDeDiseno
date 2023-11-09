package com.mycompany.tp10ejercicio4;

import java.time.LocalDate;

public class CaracteristicaFecha implements Caracteristica {
    private LocalDate fecha;

    public CaracteristicaFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
    @Override
    public LocalDate obtenerValor() {
        return this.fecha;
    }
}