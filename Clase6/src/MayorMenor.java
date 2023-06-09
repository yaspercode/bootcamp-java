import java.util.Scanner;

public class MayorMenor {
    public static void main(String[] args) {
        // Armar un programa que permita cargar 3 números y mostrar cual es el mayor y cual es el menor.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int primerNumero = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int segundoNumero = scanner.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int tercerNumero = scanner.nextInt();

        if((primerNumero >= segundoNumero) && (primerNumero >= tercerNumero) ){
            System.out.println("El número mayor es: " + primerNumero);
            if(segundoNumero > tercerNumero)
                System.out.println("El número menor es: " + tercerNumero);
            else
                System.out.println("El número menor es: " + segundoNumero);
        }
        else if((segundoNumero >= primerNumero) && (segundoNumero >= tercerNumero)){
            System.out.println("El número mayor es: " + segundoNumero);
            if(tercerNumero > primerNumero)
                System.out.println("El número menor es: " + primerNumero);
            else
                System.out.println("El número menor es: " + tercerNumero);
        }else{
            System.out.println("El número mayor es: " + tercerNumero);
            if(segundoNumero > primerNumero)
                System.out.println("El número menor es: " + primerNumero);
            else
                System.out.println("El número menor es: " + segundoNumero);
        }
    }
}
