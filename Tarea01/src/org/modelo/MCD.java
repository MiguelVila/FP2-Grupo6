package org.modelo;

public class MCD {
    public int getNumero1() {
        return numero1;
    }
    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }
    public int getNumero2() {
        return numero2;
    }
    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    @Override
    public String toString() {
        return "MCD{" +
                "numero1=" + numero1 +
                ", numero2=" + numero2 +
                '}';
    }
    private int numero1;
    private int numero2;

    public MCD(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int calcularMCD(){
        while (numero2 != 0 ){
            int temp = numero2;
            numero2 = numero1 % numero2;
            numero1 = temp;
        }
        return numero1;
    }


}
