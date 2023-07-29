package animales;

public class Pato extends Ave implements Nadador{

    @Override
    public void nadar() {
        System.out.println("Nado bien");
    }

    @Override
    public void aletear() {
        System.out.println("Si aleteo");
    }

    @Override
    public void planear() {
        System.out.println("Más o menos planeo");
    }
}
