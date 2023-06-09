import java.util.Scanner;

public class CalcularPromedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int primerNumero = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int segundoNumero = scanner.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int tercerNumero = scanner.nextInt();

        //calcular promedio
        float promedio = (primerNumero + segundoNumero + tercerNumero)/3;

        System.out.println("El promedio es: " + promedio);
    }
}
