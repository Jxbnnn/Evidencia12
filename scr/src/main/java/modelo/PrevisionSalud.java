package modelo;

public abstract class PrevisionSalud {
    protected String nombre;
    protected double porcentaje;

    public PrevisionSalud(String nombre, double porcentaje) {
        this.nombre = nombre;
        this.porcentaje = porcentaje;
    }

    public String getNombre() { return nombre; }
    public double getPorcentaje() { return porcentaje; }
}