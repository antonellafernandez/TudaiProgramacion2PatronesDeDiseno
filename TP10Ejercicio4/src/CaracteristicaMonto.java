package com.mycompany.tp10ejercicio4;

public class CaracteristicaMonto implements Caracteristica {
    private int monto;

    public CaracteristicaMonto(int monto) {
        this.monto = monto;
    }

    @Override
    public Integer obtenerValor() {
        return this.monto;
    }
}