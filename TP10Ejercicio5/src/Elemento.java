package com.mycompany.tp10ejercicio5;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Elemento {
    private long id;
    private String destino;
    private LocalDate fechaPartida;

    public Elemento(long id, String destino, LocalDate fechaPartida) {
        this.id = id;
        this.destino = destino;
        this.fechaPartida = fechaPartida;
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDate getFechaPartida() {
        return fechaPartida;
    }

    public void setFechaPartida(LocalDate fechaPartida) {
        this.fechaPartida = fechaPartida;
    }
    
    public abstract int getPrecio();
    public abstract int getValorAsegurado();
    public abstract int getCantPaquetes();
    public abstract Paquete obtenerPaqueteMayorValorAsegurado();
    public abstract Elemento copiaRestringida(Filtro ff);
    public abstract ArrayList<Elemento> buscar(Filtro ff);
}