package Ejercicio2;

import java.util.Scanner;

public class Guerrero extends Personaje{
    protected int fuerzaAtaque;
    public Guerrero(){

    }

    public Guerrero(int fuerzaAtaque) {
        this.fuerzaAtaque = fuerzaAtaque;
    }

    public int getFuerzaAtaque() {
        return fuerzaAtaque;
    }
    public void setFuerzaAtaque(int fuerzaAtaque) {
        this.fuerzaAtaque = fuerzaAtaque;
    }
    @Override
    public int ataque(){
        return fuerzaAtaque;
    }
    @Override
    public void ingresarEstadisticasPersonajes(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa los datos de tu guerrero: ");
        System.out.print("Ingrese un fuerzaAtaque: ");
        fuerzaAtaque = teclado.nextInt();
    }
}
