import java.util.Scanner;

public class CalculadoraDescuento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el precio original de un producto: ");
        double precioOriginal = scanner.nextDouble();
        System.out.print("Ingrese el porcentaje de descuento: ");
        double descuento = scanner.nextDouble();

        //Calcular el precio final
        if(precioOriginal > 0 && descuento >=0){
            double precioFinal = precioOriginal - (precioOriginal * descuento / 100);
            System.out.println("El precio final es: " + precioFinal);
        }else{
            System.out.println("Precio invalido");
        }

    }
}
