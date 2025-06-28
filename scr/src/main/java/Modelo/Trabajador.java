package modelo;

public class Trabajador extends Persona {
    private Isapre isapre;
    private AFP afp;

    public Trabajador(String nombre, String apellido, String rut, Isapre isapre, AFP afp) {
        super(nombre, apellido, rut);
        this.isapre = isapre;
        this.afp = afp;
    }

    public Isapre getIsapre() { return isapre; }
    public AFP getAfp() { return afp; }
}