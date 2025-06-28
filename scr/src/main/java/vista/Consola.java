package vista;

import modelo.*;

public class Consola {
    public static void main(String[] args) {
        PrevisionSalud salud = new Isapre("Colmena", 8.5);
        AFP afp = new AFP("Habitat", 11.5);
        Trabajador t = new Trabajador("Juan", "Pérez", "12345678-9", salud, afp);

        System.out.println("=== Datos del Trabajador ===");
        System.out.println("Nombre: " + t.getNombre());
        System.out.println("Previsión: " + t.getPrevisionSalud().getNombre());
        System.out.println("AFP: " + t.getAfp().getNombre());
    }
}