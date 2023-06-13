import java.util.Scanner;

public class CalcularAreaTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float area = getArea(scanner);
        System.out.println("El área del trinagulo es: " +  area);
    }

    private static float getArea(Scanner scanner) {
        System.out.print("Ingrese base: ");
        float base = scanner.nextFloat();
        System.out.print("Ingrese base: ");
        float altura = scanner.nextFloat();
        float area = calcularAreaTriangulo(base ,altura);
        return area;
    }

    public static float calcularAreaTriangulo(float base, float altura){
        return (base*altura)/2;
    }
}
