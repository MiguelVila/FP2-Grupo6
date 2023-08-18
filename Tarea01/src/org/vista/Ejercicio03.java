package org.vista;
import org.modelo.Turista;
import org.controlador.funciones;

public class Ejercicio03 {
    public static void main(String[] args) {
        Turista objTurista01 = new Turista(2500);
        funciones objFunciones = new funciones();
        double precioFinal = objTurista01.calcularPrecioFinal();
        objFunciones.mensaje("EL precio final es: " + precioFinal);

    }
}
