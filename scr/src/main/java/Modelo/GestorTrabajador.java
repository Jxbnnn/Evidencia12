package modelo;

public class GestorTrabajador {
    public void guardarTrabajador(Trabajador t) {
        System.out.println("Guardando: " + t.getNombre() + " | Isapre: " + t.getIsapre().getNombre());
    }
}