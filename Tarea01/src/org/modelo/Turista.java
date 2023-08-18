package org.modelo;

public class Turista {

    public Turista(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    private double precioVenta;

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    @Override
    public String toString() {
        return "Turista{" +
                "precioVenta=" + precioVenta +
                '}';
    }

    public double calcularPrecioFinal(){
        double impuesto;
        if (this.precioVenta <= 2000){
            impuesto = this.precioVenta * 0.18;
        }else{
            impuesto = this.precioVenta * 0.21;
        }
        double precioFinal = this.precioVenta + impuesto;
        return precioFinal;
    }



}
