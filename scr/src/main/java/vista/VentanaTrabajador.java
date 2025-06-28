package vista;

import modelo.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

public class VentanaTrabajador extends JFrame {
    private JTextField txtNombre, txtApellido, txtRut;
    private JComboBox<PrevisionSalud> cbSalud;
    private JComboBox<AFP> cbAFP;
    private JButton btnAgregar, btnGuardar;
    private JTextArea txtResultados;
    private List<Trabajador> trabajadores = new ArrayList<>();
    private GestorTrabajador gestor = new GestorTrabajador();

    public VentanaTrabajador() {
        setTitle("Registro de Trabajadores");
        setLayout(new BorderLayout());

        // Panel de formulario
        JPanel panelFormulario = new JPanel(new GridLayout(5, 2));
        txtNombre = new JTextField();
        txtApellido = new JTextField();
        txtRut = new JTextField();

        // Combos para Previsión y AFP
        cbSalud = new JComboBox<>();
        cbSalud.addItem(new Fonasa());
        cbSalud.addItem(new Isapre("Banmédica", 12.0));

        cbAFP = new JComboBox<>();
        cbAFP.addItem(new AFP("Capital", 10.0));
        cbAFP.addItem(new AFP("Habitat", 11.5));

        // Botones
        btnAgregar = new JButton("Agregar a Lista");
        btnGuardar = new JButton("Guardar Todos");

        // Área de resultados
        txtResultados = new JTextArea(10, 30);
        txtResultados.setEditable(false);

        // Agregar componentes al panel
        panelFormulario.add(new JLabel("Nombre:"));
        panelFormulario.add(txtNombre);
        panelFormulario.add(new JLabel("Apellido:"));
        panelFormulario.add(txtApellido);
        panelFormulario.add(new JLabel("RUT:"));
        panelFormulario.add(txtRut);
        panelFormulario.add(new JLabel("Previsión Salud:"));
        panelFormulario.add(cbSalud);
        panelFormulario.add(new JLabel("AFP:"));
        panelFormulario.add(cbAFP);

        // Panel de botones
        JPanel panelBotones = new JPanel();
        panelBotones.add(btnAgregar);
        panelBotones.add(btnGuardar);

        // Contenedor principal
        add(panelFormulario, BorderLayout.NORTH);
        add(new JScrollPane(txtResultados), BorderLayout.CENTER);
        add(panelBotones, BorderLayout.SOUTH);

        // Eventos
        btnAgregar.addActionListener(e -> agregarTrabajador());
        btnGuardar.addActionListener(e -> guardarTrabajadores());

        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void agregarTrabajador() {
        Trabajador t = new Trabajador(
                txtNombre.getText(),
                txtApellido.getText(),
                txtRut.getText(),
                (PrevisionSalud) cbSalud.getSelectedItem(),
                (AFP) cbAFP.getSelectedItem()
        );
        trabajadores.add(t);
        txtResultados.append("Agregado: " + t.getNombre() + "\n");
        limpiarCampos();
    }

    private void guardarTrabajadores() {
        gestor.guardarTodos(trabajadores);
        JOptionPane.showMessageDialog(this, "¡" + trabajadores.size() + " trabajadores guardados!");
        trabajadores.clear();
        txtResultados.setText("");
    }

    private void limpiarCampos() {
        txtNombre.setText("");
        txtApellido.setText("");
        txtRut.setText("");
    }
}