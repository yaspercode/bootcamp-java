public class Cuenta {
    private String titular;
    private double cantidad;

    public Cuenta() {

    }

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad() {
        this.cantidad += cantidad;
    }

    public void ingresarCantidad(double cantidad) {
        if (cantidad >= 0) {
            this.cantidad += cantidad;
        }
    }

    public void retirarCantidad(double cantidadRetirar) {
        this.cantidad -= cantidadRetirar;
    }

    public void mostrar() {
        System.out.println(
                "\nTitular: " + titular +
                        "\nCuenta: " + cantidad);
    }

}
