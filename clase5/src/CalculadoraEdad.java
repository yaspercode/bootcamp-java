import java.util.Scanner;

public class CalculadoraEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la edad de su perro: ");
        int edad = scanner.nextInt();

        if(edad > 0){
            edad *= 7;
            System.out.println("La edad del perro es: " + edad);
        }else{
            System.out.println("La edad en años de perro no puede ser 0");
        }
    }
}
