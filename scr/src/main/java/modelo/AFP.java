package modelo;

public class AFP {
    private String nombre;
    private double porcentaje;

    public AFP(String nombre, double porcentaje) {
        this.nombre = nombre;
        this.porcentaje = porcentaje;
    }

    public String getNombre() { return nombre; }
    public double getPorcentaje() { return porcentaje; }
}