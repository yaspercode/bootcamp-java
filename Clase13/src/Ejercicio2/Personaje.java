package Ejercicio2;

import java.util.Scanner;

public abstract class Personaje {
    protected String nombre;
    protected int nivel;
    protected int puntosDeVida;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    public void setPuntosDeVida(int puntosDeVida) {
        this.puntosDeVida = puntosDeVida;
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                ", puntosDeVida=" + puntosDeVida +
                '}';
    }

    public void ingresarDatos(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Haz selecionado la clase Guerrero: ");
        System.out.print("Ingrese un nombre: ");
        nombre = teclado.nextLine();
        System.out.print("Ingrese un nivel: ");
        nivel = teclado.nextInt();
        System.out.print("Ingrese puntos de vida: ");
        puntosDeVida = teclado.nextInt();
    }

    abstract public int ataque();
    abstract public void ingresarEstadisticasPersonajes();
}
