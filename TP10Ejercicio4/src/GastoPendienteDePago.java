package com.mycompany.tp10ejercicio4;

public class GastoPendienteDePago extends Gasto {
    private int porcentaje;
    private int diasPendientes;
    private boolean pendiente;
    private double montoPagado;

    public GastoPendienteDePago(int porcentaje, int diasPendientes) {
        this.porcentaje = porcentaje;
        this.diasPendientes = diasPendientes;
        this.pendiente = true;
        this.montoPagado = 0.0;
    }
    
    public void informarPago(double montoPagado) {
        this.pendiente = false;
        this.montoPagado = montoPagado;
    }
    
    @Override
    public double getMonto() {
        if (pendiente) {
            double monto = super.getMonto();
            monto += (monto * porcentaje / 100) * diasPendientes;
            return monto;
        }
        
        return montoPagado;
    }
}