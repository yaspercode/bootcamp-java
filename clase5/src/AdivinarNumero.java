import java.util.Scanner;

public class AdivinarNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("****************************************************");
        System.out.println("*                                                  *");
        System.out.println("*   ¡Bienvenido al juego de adivinar el número!     *");
        System.out.println("*     Tienes que adivinar un número del 1 al 100.   *");
        System.out.println("*                                                  *");
        System.out.println("****************************************************");
        int numeroIngresado = 1;
        int numeroAleatorio = (int) (Math.random() * 101);

        while (numeroIngresado != numeroAleatorio){
            System.out.print("Ingrese un número: ");
            numeroIngresado = scanner.nextInt();
            if(numeroIngresado >=1 && numeroIngresado <= 100){
                if(numeroAleatorio < numeroIngresado){
                    System.out.println("El número debe ser menor");
                }else if(numeroAleatorio > numeroIngresado) {
                    System.out.println("El número debe ser mayor");
                }
                if(numeroAleatorio == numeroIngresado){
                    System.out.println("****************************************************");
                    System.out.println("*                                                  *");
                    System.out.println("*               ¡Felicidades! Has ganado            *");
                    System.out.println("*           Has acertado el número correcto         *");
                    System.out.println("*           Número aleatorio = " + numeroAleatorio + "                   *");
                    System.out.println("*                                                  *");
                    System.out.println("****************************************************");
                }
            }else{
                System.out.println("El número debe ser entre 1 al 100");
            }
        }
    }
}
