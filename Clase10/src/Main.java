import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //LocalDate, LocalDateTime, LocalTime
        Cliente cliente = new Cliente("Miguel", "Mallqui", 23, "17/10/1999",70612215);
        cliente.mostrarDatos();

        Cuenta cuenta = new Cuenta("Miguel", 200.00);
        cuenta.retirarCantidad(100.00);
        cuenta.mostrar();
    }
}
