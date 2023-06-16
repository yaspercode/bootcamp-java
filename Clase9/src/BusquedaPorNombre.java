import java.util.Arrays;
import java.util.Scanner;

public class BusquedaPorNombre {
    public static void main(String[] args) {
        String[] persona = {"Lucas Moy", "Miguel Mallqui", "Antony Sandoval", "Melani Casandra"};
        System.out.print("Ingrese su busqueda: ");
        Scanner scanner = new Scanner(System.in);
        String busqueda = scanner.nextLine();

        for (String nombrePersona : persona){
            //Encuentra si concide las palabras
            if(nombrePersona.contains(busqueda))
                System.out.println("Persona econtrada: " + nombrePersona);
        }

        /*
        Arrays.stream(persona).parallel().filter(nombre -> nombre.contains(busqueda));
         */
    }
}
