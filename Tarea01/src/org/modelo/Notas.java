package org.modelo;

public class Notas {
    private double examen1;
    private double examen2;
    private double examen3;

    public Notas(double examen1, double examen2, double examen3) {
        this.examen1 = examen1;
        this.examen2 = examen2;
        this.examen3 = examen3;
    }

    @Override
    public String toString() {
        return "Notas{" +
                "examen1=" + examen1 +
                ", examen2=" + examen2 +
                ", examen3=" + examen3 +
                '}';
    }

    public double getExamen1() {
        return examen1;
    }
    public void setExamen1(double examen1) {
        this.examen1 = examen1;
    }
    public double getExamen2() {
        return examen2;
    }

    public void setExamen2(double examen2) {
        this.examen2 = examen2;
    }

    public double getExamen3() {
        return examen3;
    }

    public void setExamen3(double examen3) {
        this.examen3 = examen3;
    }

    public double CalculadoraPromedioNotas(){
        double promedio = (this.examen1 + this.examen2 + this.examen3)/3;
        return promedio;
    }

}
