package Ejercicio2;

import java.util.Scanner;

public class Arquero extends Personaje{
    protected int punteria;

    public Arquero(){

    }

    public Arquero(int punteria) {
        this.punteria = punteria;
    }

    public int getPunteria() {
        return punteria;
    }

    public void setPunteria(int punteria) {
        this.punteria = punteria;
    }

    @Override
    public int ataque(){
        return punteria;
    }

    @Override
    public void ingresarEstadisticasPersonajes() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa los datos de tu arquero: ");
        System.out.print("Ingrese la punteria: ");
        punteria = teclado.nextInt();
    }
}
