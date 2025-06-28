package vista;

import modelo.Trabajador;

public class Consola {
    public void mostrarDatos(Trabajador t) {
        System.out.println("\n--- Datos del Trabajador ---");
        System.out.println("Nombre: " + t.getNombre());
        System.out.println("Isapre: " + t.getIsapre().getNombre());
        System.out.println("AFP: " + t.getAfp().getNombre());
    }
}