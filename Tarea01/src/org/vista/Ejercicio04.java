package org.vista;
import org.modelo.MCD;
import org.controlador.funciones;

public class Ejercicio04 {
    public static void main(String[] args) {
        MCD objMCD1 = new MCD(8, 12);
        funciones objFunciones01 = new funciones();
        int mcd = objMCD1.calcularMCD();
        objFunciones01.mensaje("El MCD de 8 y 12 es: " + mcd);
    }
}
