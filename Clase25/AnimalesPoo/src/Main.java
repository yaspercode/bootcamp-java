import animales.Gorrion;
import animales.PezBetta;
import ejercicio1.Circulo;
import ejercicio1.FiguraGeometrica;
import ejercicio1.Triangulo;
import ejercicio2.Guitarra;
import ejercicio2.Sonoro;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FiguraGeometrica> figura  =new ArrayList<>();

        Gorrion gorrion = new Gorrion();
        gorrion.aletear();
        gorrion.planear();
        PezBetta pezBetta = new PezBetta();
        pezBetta.nadar();

        Triangulo triangulo = new Triangulo();
        triangulo.setAlto(10);
        triangulo.setAncho(5);
        figura.add(triangulo);

        Circulo circulo = new Circulo();
        circulo.setRadio(10);
        figura.add(circulo);

        for(FiguraGeometrica figuraGeometrica : figura){
            System.out.println("Area total: " + figuraGeometrica.calcularArea());
        }

        Sonoro instrumentoSonoro = new Guitarra();
    }
}
