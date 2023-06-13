import java.util.Scanner;

public class CalcularAreaCuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float area = getArea(scanner);
        System.out.println("El área del trinagulo es: " +  area);
    }
    private static float getArea(Scanner scanner) {
        System.out.print("Ingrese lado: ");
        float lado = scanner.nextFloat();
        float area = calcularAreaCuadrado(lado);
        return area;
    }

    public static float calcularAreaCuadrado(float lado){
        return lado*lado;
    }
}
