package com.mycompany.tp10ejercicio5;

public class FiltroValorAsegurado extends Filtro {
    private int valorAseguradoBuscado;

    public FiltroValorAsegurado(int valorAseguradoBuscado) {
        this.valorAseguradoBuscado = valorAseguradoBuscado;
    }
    
    @Override
    public boolean cumple(Elemento ee) {
        return ee.getValorAsegurado() > valorAseguradoBuscado;
    }
}