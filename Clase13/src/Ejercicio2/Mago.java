package Ejercicio2;

import java.util.Scanner;

public class Mago extends Personaje{
    protected int inteligencia;

    public Mago(){

    }
    public Mago(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    @Override
    public int ataque(){
        return inteligencia;
    }

    @Override
    public void ingresarEstadisticasPersonajes() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa los datos de tu mago: ");
        System.out.print("Ingrese su inteligencia: ");
        inteligencia = teclado.nextInt();
    }
}
