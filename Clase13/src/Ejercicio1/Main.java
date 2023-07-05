package Ejercicio1;

import java.util.Scanner;

public class Main {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        boolean estadoMenu = true;

        while (estadoMenu){
            int opciónSelecionada = elegirOpcionDelMenu();
            ingresarOpcionFigura(opciónSelecionada);

        }

    }

    private static boolean ingresarOpcionFigura(int opciónSelecionada) {
        switch (opciónSelecionada) {
            case 1:
                System.out.println("Has elegido crear un triángulo.");
                Triangulo triangulo = new Triangulo();
                triangulo.ingresarDatos();
                mostrarResultados(triangulo);
                break;
            case 2:
                System.out.println("Has elegido crear un rectangulo.");
                Rectangulo rectangulo = new Rectangulo();
                rectangulo.ingresarDatos();
                mostrarResultados(rectangulo);
                break;
            case 3:
                System.out.println("Has elegido crear un circulo.");
                Circulo circulo = new Circulo();
                circulo.ingresarDatos();
                System.out.println("El Area es: " + circulo.calcularArea());
                System.out.println("El Perimetro es: " + circulo.calcularPerimetro());
                break;
            case 4:
                System.out.println("Saliendo del programa...");
                return false;
            default:
                System.out.println("Selecione una opción valida");
                break;
        }
        return true;
    }

    private static void mostrarResultados(PoligonoRegular figura) {
        System.out.println("El Area es: " + figura.calcularArea());
        System.out.println("El Perimetro es: " + figura.calcularPerimetro());
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
