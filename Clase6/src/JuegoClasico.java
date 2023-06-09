import java.util.Scanner;

public class JuegoClasico {
    public static void main(String[] args) {
        /*
        Escribe un programa que permita al usuario jugar el juego clásico de "piedra, papel,
        tijeras" contra la computadora. El programa debe solicitar al usuario que ingrese
        su elección (piedra, papel o tijeras) y luego generar una elección aleatoria para
        la computadora. Después de eso, el programa debe determinar el ganador según las
        reglas del juego y mostrar el resultado.
        */
        Scanner scanner = new Scanner(System.in);
        int opcion;
        int intento = 0;
        int contadorHumano = 0;
        int contadorMaquina = 0;
        int numeroAleatorio = 0;
        System.out.print("Bienvenido al juego de papel o tijera");

        //Al mejor de 3
        while (intento < 3) {
            //Acción aleatorio de la máquina
            numeroAleatorio = (int)(Math.random()*3)+1;

            //Acción del usuario
            System.out.print("\nIngrese su elección:" +
                    "\n1. Piedra." +
                    "\n2. Papel." +
                    "\n3. Tijera." +
                    "\nOpción: ");
            opcion = scanner.nextInt();

            //Comparando
            //Piedra aplasta a la tijera
            if(numeroAleatorio == 1 && opcion == 3){
                System.out.println("Elección Máquina: Piedra -- Elección Humano: Tijera");
                System.out.println("Gana máquina: Piedra aplasta a la tijera");
                contadorMaquina++;
                intento++;
            }
            else if(opcion == 1 && numeroAleatorio == 3){
                System.out.println("Elección Humano: Piedra -- Elección Máquina: Tijera");
                System.out.println("Gana humano: Piedra aplasta a la tijera");
                contadorHumano++;
                intento++;
            }

            //Tijera corta papel
            if(numeroAleatorio == 3 && opcion == 2){
                System.out.println("Elección Máquina: Tijera -- Elección Humano: Papel");
                System.out.println("Gana máquina: Tijera corta papel");
                contadorMaquina++;
                intento++;
            }
            else if(opcion == 3 && numeroAleatorio == 2){
                System.out.println("Elección Humano: Tijera -- Elección Máquina: Papel");
                System.out.println("Gana humano: Tijera corta papel");
                contadorHumano++;
                intento++;
            }

            //Papel envuelve a la piedra
            if(numeroAleatorio == 2 && opcion == 1){
                System.out.println("Elección Máquina: Papel -- Elección Humano: Piedra");
                System.out.println("Gana máquina: Papel envuelve a la piedra");
                contadorMaquina++;
                intento++;
            }
            else if(opcion == 2 && numeroAleatorio == 1){
                System.out.println("Elección Humano: Papel -- Elección Máquina: Piedra");
                System.out.println("Gana humano: Papel envuelve a la tijera");
                contadorHumano++;
                intento++;
            }

            //Empate
            if(numeroAleatorio == opcion){
                System.out.print("Empate");
            }
        }

        if(contadorHumano > contadorMaquina){
            System.out.println("El juego lo gana el humano");
        }else{
            System.out.println("El juego lo gana la máquina");
        }
    }
}
