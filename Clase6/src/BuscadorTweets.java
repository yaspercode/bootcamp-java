import java.util.Scanner;

public class BuscadorTweets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre de una celebridad: ");
        //Lee una linea completa del texto ingresado
        String nombreCelebridad = scanner.nextLine();
        //Toma la subcadena desde el indice 0 antes del espacio en blanco
        String palabra = nombreCelebridad.substring(0, nombreCelebridad.indexOf(" "));
        System.out.println("https://twitter.com/search?q=" + palabra);
    }
}
