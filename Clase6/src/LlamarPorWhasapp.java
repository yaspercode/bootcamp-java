import java.util.Scanner;

public class LlamarPorWhasapp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número de telefono: ");
        //Lee la cadena completa
        String numeroCelular = scanner.nextLine();
        //Se reemplaza los que tienen espacios a sin espacio
        String telefono = numeroCelular.replaceAll(" ", "");
        System.out.println("https://api.whatsapp.com/send?phone=" + telefono);
    }
}
