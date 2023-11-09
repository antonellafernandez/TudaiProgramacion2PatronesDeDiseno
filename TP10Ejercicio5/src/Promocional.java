package com.mycompany.tp10ejercicio5;

import java.time.LocalDate;

public class Promocional extends Combo {
    public Promocional(long id, String destino, LocalDate fechaPartida) {
        super(id, destino, fechaPartida);
    }
    
    @Override
    public int getPrecio() {
        int suma = 0;
        
        for (Elemento ee : this.getElementos()) {
            suma += ee.getPrecio();
        }
        
        int promedio = suma / this.getCantPaquetes();
        
        return promedio;
    }
}