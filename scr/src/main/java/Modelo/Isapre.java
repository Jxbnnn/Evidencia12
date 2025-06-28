package modelo;

public class Isapre {
    private String nombre;
    private double porcentaje;

    public Isapre(String nombre, double porcentaje) {
        this.nombre = nombre;
        this.porcentaje = porcentaje;
    }

    public String getNombre() { return nombre; }
    public double getPorcentaje() { return porcentaje; }
}