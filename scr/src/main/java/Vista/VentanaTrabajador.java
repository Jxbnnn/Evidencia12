package vista;

import modelo.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class VentanaTrabajador extends JFrame {
    private JTextField txtNombre, txtApellido, txtRut;
    private JComboBox<Isapre> cbIsapre;
    private JComboBox<AFP> cbAfp;
    private GestorTrabajador gestor = new GestorTrabajador();

    public VentanaTrabajador() {
        setTitle("Registro de Trabajador");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2));

        add(new JLabel("Nombre:"));
        txtNombre = new JTextField();
        add(txtNombre);

        add(new JLabel("Apellido:"));
        txtApellido = new JTextField();
        add(txtApellido);

        add(new JLabel("RUT:"));
        txtRut = new JTextField();
        add(txtRut);

        add(new JLabel("Isapre:"));
        cbIsapre = new JComboBox<>(new Isapre[]{
                new Isapre("Fonasa", 7.0),
                new Isapre("Banmédica", 12.0)
        });
        add(cbIsapre);

        add(new JLabel("AFP:"));
        cbAfp = new JComboBox<>(new AFP[]{
                new AFP("Capital", 10.0),
                new AFP("Habitat", 11.5)
        });
        add(cbAfp);

        JButton btnGuardar = new JButton("Guardar");
        btnGuardar.addActionListener(this::guardarTrabajador);
        add(btnGuardar);
    }

    private void guardarTrabajador(ActionEvent e) {
        Trabajador trabajador = new Trabajador(
                txtNombre.getText(),
                txtApellido.getText(),
                txtRut.getText(),
                (Isapre) cbIsapre.getSelectedItem(),
                (AFP) cbAfp.getSelectedItem()
        );
        gestor.guardarTrabajador(trabajador);
        JOptionPane.showMessageDialog(this, "Trabajador registrado exitosamente!");
    }
}