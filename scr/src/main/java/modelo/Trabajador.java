package modelo;

public class Trabajador extends Persona {
    private PrevisionSalud previsionSalud; // Fonasa o Isapre
    private AFP afp;

    public Trabajador(String nombre, String apellido, String rut, PrevisionSalud previsionSalud, AFP afp) {
        super(nombre, apellido, rut);
        this.previsionSalud = previsionSalud;
        this.afp = afp;
    }

    // Getters
    public PrevisionSalud getPrevisionSalud() { return previsionSalud; }
    public AFP getAfp() { return afp; }
}