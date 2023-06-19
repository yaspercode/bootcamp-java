public class Cliente {
    //Propiedad o atributos
    private String nombre;
    private String apellido;
    private Integer edad;
    private String fecha;
    private Integer dni;

    //Constructor
    public Cliente(){

    }
    public Cliente (String nombre, String apellido, Integer edad, String fecha, Integer dni){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.fecha = fecha;
        this.dni = dni;
    }

    //método
    public Boolean esMayorDeEdad(){
        return edad >= 18;
    }

    //getter y setter (Mejor control de entrada y salida de datos)
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public Integer getEdad(){
        return edad;
    }
    public void setEdad(Integer edad){
        this.edad = edad;
    }
    public String getFecha(){
        return fecha;
    }
    public void setFecha(String fecha){
        this.fecha = fecha;
    }
    public Integer getDni(){
        return dni;
    }
    public void setDni(Integer dni){
        this.dni = dni;
    }
    public void mostrarDatos() {
        System.out.println(
                "\nnombre: " + nombre +
                        "\napellido: " + apellido +
                        "\nedad: " + edad +
                        "\nFecha: " + fecha +
                        "\nDNI: " + dni +
                        "\nEs mayor de edad: " + (esMayorDeEdad() ? "Si" : "No")
        );
    }
}
