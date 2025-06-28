package modelo;

public class GestorTrabajador {
    public void guardarTrabajador(Trabajador trabajador) {
        System.out.println("Guardando trabajador en sistema...");
        System.out.println("Nombre: " + trabajador.getNombre());
        System.out.println("Isapre: " + trabajador.getIsapre().getNombre());
        System.out.println("AFP: " + trabajador.getAfp().getNombre());
    }
}