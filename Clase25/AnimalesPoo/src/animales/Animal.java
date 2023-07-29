package animales;

public abstract class Animal {
    //No deja crear objetos de esta clase cuando es abstracta
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
