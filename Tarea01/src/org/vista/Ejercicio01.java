package org.vista;
import org.modelo.Notas;
import org.controlador.funciones;

public class Ejercicio01 {
    public static void main(String[] args) {
        Notas objNotas1 = new Notas(12, 16, 18);
        funciones objFunciones01 = new funciones();
        double promedioExamenes = objNotas1.CalculadoraPromedioNotas();
        objFunciones01.mensaje("El promedio de calificaciones es: " + promedioExamenes);
    }
}
