package vista;

import modelo.*;
import javax.swing.*;

public class VentanaTrabajador extends JFrame {
    private GestorTrabajador gestor = new GestorTrabajador();

    public VentanaTrabajador() {
        btnGuardar.addActionListener(e -> {
            Trabajador t = new Trabajador(
                    txtNombre.getText(),
                    "",
                    txtRut.getText(),
                    (Isapre) cbIsapre.getSelectedItem(),
                    (AFP) cbAfp.getSelectedItem()
            );
            gestor.guardarTrabajador(t);
        });
    }
}