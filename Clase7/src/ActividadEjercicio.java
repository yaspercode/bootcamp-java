import java.util.Scanner;

public class ActividadEjercicio {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        int numero;
        Scanner scanner = new Scanner(System.in);

        for (int contador = 0; contador < numeros.length; contador++) {
            System.out.print("Ingrese número: ");
            numero = scanner.nextInt();
            numeros[contador] = numero;
        }

        System.out.println("Los numeros qué usted ingreso son: ");

        for (int contador = 0; contador < numeros.length; contador++) {
            System.out.print(numeros[contador] + " ");
        }
        /*Después de realizar el ejercicio anterior, agregar que muestre
        el número mayor y el número menor.*/

        int mayor = 0;
        int menor = 0;
        for (int contador = 0; contador < numeros.length; contador++) {
            int num = numeros[contador];
            if (num > mayor || contador == 0) {
                mayor = num;
            }
            if (num <= menor || contador == 0) {
                menor = num;
            }
        }
        System.out.println("\nNúmero mayor: " + mayor);
        System.out.println("Número menor: " + menor);

        /*Ahora, hay que mostrar el promedio. Para hacer esto se suman todos los números
        y se divide por 5, ya que el usuario agregó 5 números.*/
        int sumatoria = 0;
        for (int contador = 0; contador < numeros.length; contador++) {
            int num = numeros[contador];
            sumatoria += num;
        }
        System.out.println("La sumatoria es: " + sumatoria);
        float promedio = (float) sumatoria / numeros.length;
        System.out.println("El promedio es: " + promedio);
    }
}
