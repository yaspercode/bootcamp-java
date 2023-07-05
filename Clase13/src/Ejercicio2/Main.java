package Ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner teclado = new Scanner(System.in);
    static List<Personaje> listaDePersonajes = new ArrayList<>();
    static boolean estadoDelPersonaje = true;
    static int primerCombatiente;
    static int segundoCombatiente;
    static int cantidadDePersonajes;
    public static void main(String[] args) {
        boolean estadoJuego = true;
        iniciarJuego(estadoJuego);
    }

    private static boolean iniciarJuego(boolean estadoJuego) {
        while (estadoJuego){
            int opcionSelecionada = selecionarClase();
            switch (opcionSelecionada){
                case 1:
                    cantidadDePersonajes = ingresarCantidadPersonajes();
                    for (int i = 0; i < cantidadDePersonajes;i++){
                        Personaje guerrero = new Guerrero();
                        guerrero.ingresarDatos();
                        guerrero.ingresarEstadisticasPersonajes();
                        listaDePersonajes.add(guerrero);
                    }
                    System.out.println("Simulación de combate: ");
                    mostrarDuelo();
                    mostrarListaDeCombatientes();
                    combateDePersonajes(primerCombatiente,segundoCombatiente);
                    break;
                case 2:
                    cantidadDePersonajes = ingresarCantidadPersonajes();
                    for (int i = 0; i < cantidadDePersonajes;i++){
                        Personaje mago = new Mago();
                        mago.ingresarDatos();
                        mago.ingresarEstadisticasPersonajes();
                        listaDePersonajes.add(mago);
                    }
                    System.out.println("Simulación de combate: ");
                    mostrarDuelo();
                    mostrarListaDeCombatientes();
                    combateDePersonajes(primerCombatiente,segundoCombatiente);
                    break;
                case 3:
                    cantidadDePersonajes = ingresarCantidadPersonajes();
                    for (int i = 0; i < cantidadDePersonajes;i++){
                        Personaje arquero = new Arquero();
                        arquero.ingresarDatos();
                        arquero.ingresarEstadisticasPersonajes();
                        listaDePersonajes.add(arquero);
                    }
                    System.out.println("Simulación de combate: ");
                    mostrarDuelo();
                    mostrarListaDeCombatientes();
                    combateDePersonajes(primerCombatiente,segundoCombatiente);
                    break;
                case 4:
                    System.out.println("Cerrando el juego..");
                    teclado.close();
                    return false;
                default:
                    System.out.println("Selecione una opción valida");
                    break;
            }
        }
        return true;
    }

    private static int ingresarCantidadPersonajes() {
        System.out.print("Cantidad de personajes: ");
        int cantidadDePersonajes = teclado.nextInt();
        return cantidadDePersonajes;
    }

    private static void mostrarListaDeCombatientes() {
        int contador = 0;
        for (Personaje personaje : listaDePersonajes){
            System.out.println("Combatiente "+(contador+1)+": " + listaDePersonajes.get(contador).getNombre());
            contador++;
        };
        System.out.println("Seleciona el primer competidor: ");
        primerCombatiente = teclado.nextInt()-1;
        System.out.println("Seleciono a :" + listaDePersonajes.get(primerCombatiente).getNombre());
        System.out.println("Seleciona el primer competidor: ");
        segundoCombatiente = teclado.nextInt()-1;
        System.out.println("Seleciono a :" + listaDePersonajes.get(segundoCombatiente).getNombre());
    }

    private static void combateDePersonajes(int posicion0, int posicion1) {
        while (estadoDelPersonaje){
            int reducionDeVidaPersonaje1 = listaDePersonajes.get(posicion0).getPuntosDeVida() - listaDePersonajes.get(posicion1).ataque();
            listaDePersonajes.get(posicion0).setPuntosDeVida(reducionDeVidaPersonaje1);
            int reducionDeVidaPersonaje2 = listaDePersonajes.get(posicion1).getPuntosDeVida() - listaDePersonajes.get(posicion0).ataque();
            listaDePersonajes.get(posicion1).setPuntosDeVida(reducionDeVidaPersonaje2);
            if(reducionDeVidaPersonaje1 <= 0){
                System.out.println("El ganador es : " + listaDePersonajes.get(posicion1).getNombre());
                estadoDelPersonaje = false;
                break;
            }
            if(reducionDeVidaPersonaje2 <= 0){
                System.out.println("El ganador es : " + listaDePersonajes.get(posicion0).getNombre());
                estadoDelPersonaje = false;
                break;
            }
        }
    }

    public static int selecionarClase(){
        System.out.println("╔══════════════════════╗");
        System.out.println("║  Selecione su clase  ║");
        System.out.println("╠══════════════════════╣");
        System.out.println("║ 1. Crear Guerrero    ║");
        System.out.println("║ 2. Crear Mago        ║");
        System.out.println("║ 3. Crear Arquero     ║");
        System.out.println("║ 4. Salir             ║");
        System.out.println("╚══════════════════════╝");
        System.out.print("Elige una opción: ");
        return teclado.nextInt();
    }
    public static void mostrarDuelo(){
        System.out.println("* ************************************ *");
        System.out.println("*    "+listaDePersonajes.get(0)+" ⚔️   VS   "+listaDePersonajes.get(1)+" ⚔️*");
        System.out.println("* ************************************ *");
    }
}
