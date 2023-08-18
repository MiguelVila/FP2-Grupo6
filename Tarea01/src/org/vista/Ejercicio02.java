package org.vista;
import org.modelo.Triangulo;
import org.controlador.funciones;

public class Ejercicio02 {
    public static void main(String[] args) {
        Triangulo objTriangulo01 = new Triangulo(15.00, 6.00);
        funciones objFunciones01 = new funciones();
        double areaTotal = objTriangulo01.CalculadoraAreaTriangulo();
        objFunciones01.mensaje("EL area del triangulo es: " + areaTotal);

    }

}
