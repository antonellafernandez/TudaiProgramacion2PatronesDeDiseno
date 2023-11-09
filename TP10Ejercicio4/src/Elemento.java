package com.mycompany.tp10ejercicio4;

import java.util.ArrayList;

public abstract class Elemento {
    public abstract double getMonto();
    public abstract ArrayList<Elemento> buscar(Buscador bb);
}