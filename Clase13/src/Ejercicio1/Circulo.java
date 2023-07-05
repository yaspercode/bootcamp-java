package Ejercicio1;

import java.util.Scanner;

public class Circulo extends Figura{
    protected double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    public void ingresarDatos(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese radio:");
        radio = teclado.nextDouble();
    }
}
