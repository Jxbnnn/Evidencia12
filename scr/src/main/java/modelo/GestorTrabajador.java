package modelo;

import java.util.List;

public class GestorTrabajador {
    public void guardarTrabajador(Trabajador trabajador) {
        System.out.println("Guardando: " + trabajador.getNombre() +
                " | Salud: " + trabajador.getPrevisionSalud().getNombre() +
                " | AFP: " + trabajador.getAfp().getNombre());
    }

    public void guardarTodos(List<Trabajador> trabajadores) {
        for (Trabajador t : trabajadores) {
            guardarTrabajador(t);
        }
    }
}