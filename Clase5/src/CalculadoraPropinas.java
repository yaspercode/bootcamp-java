import java.util.Scanner;

public class CalculadoraPropinas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el total de la cuenta en un restaurante: ");
        double totalCuenta = scanner.nextDouble();
        System.out.print("Ingrese el porcentaje de propina que desea dejar: ");
        double porcentajePropina = scanner.nextDouble();

        if(totalCuenta > 0 && porcentajePropina >= 0){
            double propina = totalCuenta * (porcentajePropina / 100);
            System.out.println("El monto de la cuenta es: " + totalCuenta);
            System.out.println("El monto de la propina es: " + propina);
            System.out.println("El monto total es: " + (totalCuenta + propina));
        }else{
            System.out.println("El total de la cuenta no puede ser 0");
        }
    }
}
