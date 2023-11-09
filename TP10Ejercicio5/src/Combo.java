package com.mycompany.tp10ejercicio5;

import java.time.LocalDate;
import java.util.ArrayList;

public class Combo extends Elemento {
    private ArrayList<Elemento> elementos;

    public Combo(long id, String destino, LocalDate fechaPartida) {
        super(id, destino, fechaPartida);
        this.elementos = new ArrayList<>();
    }
    
    public ArrayList<Elemento> getElementos() {
        return new ArrayList<Elemento>(elementos);
    }

    public void addElemento(Elemento otro, Filtro ff) {
        if (ff.cumple(otro)) {
            elementos.add(otro);
        }
    }
    
    @Override
    public int getPrecio() {
        int suma = 0;
        
        for (Elemento ee : elementos) {
            suma += ee.getPrecio();
        }
        
        return suma;
    }
    
    @Override
    public int getValorAsegurado() {
        int suma = 0;
        
        for (Elemento ee : elementos) {
            suma += ee.getValorAsegurado();
        }
        
        return suma;
    }
    
    @Override
    public int getCantPaquetes() {
        int suma = 0;
        
        for (Elemento ee : elementos) {
            suma += ee.getCantPaquetes();
        }
        
        return suma;
    }
    
    @Override
    public Paquete obtenerPaqueteMayorValorAsegurado() {
        if (elementos.size() > 0) {
            Paquete mayor = elementos.get(0).obtenerPaqueteMayorValorAsegurado();

            for (Elemento ee : elementos) {
                if (ee.obtenerPaqueteMayorValorAsegurado().getValorAsegurado() > mayor.getValorAsegurado()) {
                    mayor = ee.obtenerPaqueteMayorValorAsegurado();
                }
            }

            return mayor;
        }

        return null;
    }
    
    @Override
    public Elemento copiaRestringida(Filtro ff) {
        Combo copia = new Combo(this.getId(), this.getDestino(), this.getFechaPartida());
        
        for (Elemento ee : elementos) {
            copia.addElemento(ee, ff);
        }
        
        return copia;
    }
    
    @Override
    public ArrayList<Elemento> buscar(Filtro ff) {
        ArrayList<Elemento> salida = new ArrayList<>();

        if (ff.cumple(this)) {
            salida.add(this);
        } else {
            for (Elemento ee : elementos) {
                salida.addAll(ee.buscar(ff));
            }
        }
        return salida;
    }
}