package org.modelo;

public class Triangulo {

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    @Override
    public String toString() {
        return "Triangulo{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }
    public double CalculadoraAreaTriangulo(){
        double area = (this.base * this.altura)/2;
        return area;
    }
    private double base;
    private double altura;
}
