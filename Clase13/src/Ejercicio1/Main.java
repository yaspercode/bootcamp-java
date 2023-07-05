package Ejercicio1;

import java.util.Scanner;

public class Main {
    static Scanner teclado = new Scanner(System.in);
    static boolean estadoMenu = true;
    public static void main(String[] args) {
        while (estadoMenu){
            int opcionSelecionada = elegirOpcionDelMenu();
            ingresarOpcionFigura(opcionSelecionada);
        }
    }

    private static boolean ingresarOpcionFigura(int opcionSelecionada) {
        switch (opcionSelecionada) {
            case 1:
                System.out.println("Has elegido crear un triángulo.");
                Triangulo triangulo = new Triangulo();
                triangulo.ingresarDatos();
                mostrarResultados(triangulo);
                break;
            case 2:
                System.out.println("Has elegido crear un rectángulo.");
                Rectangulo rectangulo = new Rectangulo();
                rectangulo.ingresarDatos();
                mostrarResultados(rectangulo);
                break;
            case 3:
                System.out.println("Has elegido crear un círculo.");
                Circulo circulo = new Circulo();
                circulo.ingresarDatos();
                System.out.println("El área es: " + circulo.calcularArea());
                System.out.println("El perímetro es: " + circulo.calcularPerimetro());
                break;
            case 4:
                System.out.println("Saliendo del programa...");
                teclado.close();
                return estadoMenu = false;
            default:
                System.out.println("Selecciona una opción válida.");
                break;
        }
        return estadoMenu = true;
    }

    private static void mostrarResultados(PoligonoRegular figura) {
        System.out.println("El área es: " + figura.calcularArea());
        System.out.println("El perímetro es: " + figura.calcularPerimetro());
    }

    private static int elegirOpcionDelMenu() {
        System.out.println("╔══════════════════════╗");
        System.out.println("║       MENÚ           ║");
        System.out.println("╠══════════════════════╣");
        System.out.println("║ 1. Crear triángulo   ║");
        System.out.println("║ 2. Crear rectángulo  ║");
        System.out.println("║ 3. Crear círculo     ║");
        System.out.println("║ 4. Salir             ║");
        System.out.println("╚══════════════════════╝");
        System.out.print("Elige una opción: ");
        return teclado.nextInt();
    }
}
