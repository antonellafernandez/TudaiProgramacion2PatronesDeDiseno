package com.mycompany.tp10ejercicio6;

public class BuscadorComodidad implements Buscador {
    private String comodidadBuscada;

    public BuscadorComodidad(String comodidadBuscada) {
        this.comodidadBuscada = comodidadBuscada;
    }
    
    @Override
    public boolean cumple(Habitacion hh) {
        boolean contiene = false;
        int i = 0;
        
        while (!contiene && i < hh.getComodidades().size()) {
            if (hh.getComodidades().get(i).equals(comodidadBuscada)) {
                contiene = true;
            }
        }
        
        return contiene;
    }
}