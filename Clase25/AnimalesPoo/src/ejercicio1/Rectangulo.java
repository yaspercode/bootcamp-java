package ejercicio1;

public class Rectangulo implements FiguraGeometrica{
    private float ancho;
    private float alto;

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getAlto() {
        return alto;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }

    @Override
    public float calcularArea() {
        return ancho * alto;
    }
}
