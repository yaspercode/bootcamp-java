import java.util.Scanner;

public class ConversorMillasKm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una distancia en millas: ");
        double millas = scanner.nextDouble();
        double kilometros = millas * 1.60934;
        System.out.println("La distancia en kilómetros  es: " + kilometros);
    }
}
