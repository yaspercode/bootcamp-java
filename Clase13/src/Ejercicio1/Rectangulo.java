package Ejercicio1;

import java.util.Scanner;

public class Rectangulo extends PoligonoRegular{

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return (base*2)*(2*altura);
    }

    public void ingresarDatos(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese base:");
        base = teclado.nextDouble();
        System.out.print("Ingrese altura:");
        altura = teclado.nextDouble();
    }
}
