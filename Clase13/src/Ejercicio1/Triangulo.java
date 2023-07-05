package Ejercicio1;

import java.util.Scanner;

public class Triangulo extends PoligonoRegular{
    protected double ladoA;
    protected double ladoB;
    protected double ladoC;

    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return ladoA + ladoB + ladoC;
    }

    public void ingresarDatos(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese base:");
        base = teclado.nextDouble();
        System.out.print("Ingrese altura:");
        altura = teclado.nextDouble();
        System.out.print("Ingrese lado A:");
        ladoA = teclado.nextDouble();
        System.out.print("Ingrese lado B:");
        ladoB = teclado.nextDouble();
        System.out.print("Ingrese lado C:");
        ladoC = teclado.nextDouble();
    }
}
