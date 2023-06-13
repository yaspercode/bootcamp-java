import java.util.Scanner;

public class MejorarJuego {
    private static int intento = 0;
    private static int contadorHumano = 0;
    private  static int contadorMaquina = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] eleccion = {"Piedra", "Papel", "Tijera"};

        System.out.print("Bienvenido al juego de papel, piedra o tijera");

        while (intento < 3) {
            int opcion = obtenerOpcionUsuario(scanner);
            int numeroAleatorio = (int)(Math.random()*3);
            compararEleccionesJuego(eleccion, opcion, numeroAleatorio);
        }
        mostrarGanadorDelJuego();
    }

    private static void mostrarGanadorDelJuego() {
        if(contadorHumano > contadorMaquina){
            System.out.println("El juego lo gana el humano");
        }else{
            System.out.println("El juego lo gana la máquina");
        }
    }
    private static int obtenerOpcionUsuario(Scanner scanner) {
        System.out.print("\nIngrese su elección:" +
                "\n1. Piedra." +
                "\n2. Papel." +
                "\n3. Tijera." +
                "\nOpción: ");
        return scanner.nextInt();
    }

    private static void compararEleccionesJuego(String[] eleccion, int opcion, int numeroAleatorio) {
        System.out.println("Elección máquina: " + eleccion[numeroAleatorio] + " Elección Humano: " + eleccion[opcion -1]);

        if(eleccion[numeroAleatorio].equals(eleccion[opcion-1])){
            System.out.print("Empate");
        }else if ((eleccion[numeroAleatorio].equals("Piedra") && eleccion[opcion - 1].equals("Tijera"))
                || (eleccion[numeroAleatorio].equals("Tijera") && eleccion[opcion - 1].equals("Papel"))
                || (eleccion[numeroAleatorio].equals("Papel") && eleccion[opcion - 1].equals("Piedra")))
        {
            mostrarVictoriaMaquina(eleccion, opcion, numeroAleatorio);
        } else {
            mostrarVictoriaHumano(eleccion, opcion, numeroAleatorio);
        }
    }

    private static void mostrarVictoriaHumano(String[] eleccion, int opcion, int numeroAleatorio) {
        System.out.println("Gana humano");
        contadorHumano++;
        intento++;
    }

    private static void mostrarVictoriaMaquina(String[] eleccion, int opcion, int numeroAleatorio) {
        System.out.println("Gana máquina");
        contadorMaquina++;
        intento++;
    }
}
