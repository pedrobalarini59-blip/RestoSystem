package CapaGrafica;

import CapaLogica.Cocinero;
import CapaLogica.Empleado;
import CapaLogica.Empleados;
import CapaLogica.Mozo;
import CapaLogica.Restaurantes;
import javax.swing.JOptionPane;

/**
 *
 * @author aemil
 */
public class RegistroEmpleado extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(RegistroEmpleado.class.getName());
    private Empleados gestorEmpleados = new Empleados();
    private static final String PLACEHOLDER_FECHA = "AAAA-MM-DD";

    private void ponerPlaceholderFecha() {
        jTextFieldFechaIngresoEmpleado.setText(PLACEHOLDER_FECHA);
        jTextFieldFechaIngresoEmpleado.setForeground(java.awt.Color.GRAY);
    }

    public RegistroEmpleado() {
        initComponents();
        ponerPlaceholderFecha();
        jTextFieldIdentificadorEmpleado.setEditable(false);
        jTextFieldIdentificadorEmpleado.setText(Empleados.generarNuevoIdEmpleado());
        Restaurantes.cargarComboRestaurantes(jComboBoxIDRestauranteEmpleado);

        jTextFieldFechaIngresoEmpleado.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent e) {
                if (jTextFieldFechaIngresoEmpleado.getText().equals(PLACEHOLDER_FECHA)) {
                    jTextFieldFechaIngresoEmpleado.setText("");
                    jTextFieldFechaIngresoEmpleado.setForeground(java.awt.Color.BLACK);
                }
            }

            @Override
            public void focusLost(java.awt.event.FocusEvent e) {
                if (jTextFieldFechaIngresoEmpleado.getText().trim().isEmpty()) {
                    ponerPlaceholderFecha();
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabelNombreEmpleado = new javax.swing.JLabel();
        jLabelApellidoEmpleado = new javax.swing.JLabel();
        jLabelCargoEmpleado = new javax.swing.JLabel();
        jComboBoxCargoEmpleado = new javax.swing.JComboBox<>();
        jLabelIdentificadorEmpleado = new javax.swing.JLabel();
        jTextFieldNombreEmpleado = new javax.swing.JTextField();
        jTextFieldIdentificadorEmpleado = new javax.swing.JTextField();
        jTextFieldApellidoEmpleado = new javax.swing.JTextField();
        jLabelIDRestauranteEmpleado = new javax.swing.JLabel();
        jComboBoxIDRestauranteEmpleado = new javax.swing.JComboBox<>();
        jButtonCancelarEmpleado = new javax.swing.JButton();
        jButtonRegistrarEmpleado = new javax.swing.JButton();
        jLabelFechaIngresoEmpleado = new javax.swing.JLabel();
        jTextFieldFechaIngresoEmpleado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18));
        jLabel1.setText("Registrar Empleado");

        jLabelNombreEmpleado.setText("Nombre");
        jLabelApellidoEmpleado.setText("Apellido");
        jLabelCargoEmpleado.setText("Cargo");
        jComboBoxCargoEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mozo", "Cocinero" }));
        jLabelIdentificadorEmpleado.setText("Identificador Empleado");
        jLabelIDRestauranteEmpleado.setText("Restaurante");

        jTextFieldNombreEmpleado.addActionListener(this::jTextFieldNombreEmpleadoActionPerformed);
        jTextFieldIdentificadorEmpleado.addActionListener(this::jTextFieldIdentificadorEmpleadoActionPerformed);
        jTextFieldApellidoEmpleado.addActionListener(this::jTextFieldApellidoEmpleadoActionPerformed);

        jButtonCancelarEmpleado.setText("Cancelar");
        jButtonCancelarEmpleado.addActionListener(this::jButtonCancelarEmpleadoActionPerformed);

        jButtonRegistrarEmpleado.setText("Registrar");
        jButtonRegistrarEmpleado.addActionListener(this::jButtonRegistrarEmpleadoActionPerformed);

        jLabelFechaIngresoEmpleado.setText("Fecha de Ingreso");
        jTextFieldFechaIngresoEmpleado.addActionListener(this::jTextFieldFechaIngresoEmpleadoActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButtonCancelarEmpleado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonRegistrarEmpleado))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelIDRestauranteEmpleado)
                                        .addGap(18, 18, 18)
                                        .addComponent(jComboBoxIDRestauranteEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabelApellidoEmpleado)
                                            .addComponent(jLabelFechaIngresoEmpleado)
                                            .addComponent(jLabelNombreEmpleado)
                                            .addComponent(jLabelCargoEmpleado)
                                            .addComponent(jLabelIdentificadorEmpleado))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextFieldNombreEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                            .addComponent(jTextFieldApellidoEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                            .addComponent(jComboBoxCargoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldFechaIngresoEmpleado)
                                            .addComponent(jTextFieldIdentificadorEmpleado))))
                                .addGap(0, 15, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxIDRestauranteEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelIDRestauranteEmpleado))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldIdentificadorEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelIdentificadorEmpleado))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombreEmpleado)
                    .addComponent(jTextFieldNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelApellidoEmpleado)
                    .addComponent(jTextFieldApellidoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFechaIngresoEmpleado)
                    .addComponent(jTextFieldFechaIngresoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCargoEmpleado)
                    .addComponent(jComboBoxCargoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRegistrarEmpleado)
                    .addComponent(jButtonCancelarEmpleado))
                .addContainerGap())
        );

        pack();
    }

    private void jTextFieldNombreEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jTextFieldIdentificadorEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jTextFieldApellidoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jButtonCancelarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
    }

    private void jButtonRegistrarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {
        if (jTextFieldIdentificadorEmpleado.getText().trim().isEmpty()
                || jTextFieldNombreEmpleado.getText().trim().isEmpty()
                || jTextFieldApellidoEmpleado.getText().trim().isEmpty()
                || jTextFieldFechaIngresoEmpleado.getText().trim().isEmpty()
                || jTextFieldFechaIngresoEmpleado.getText().equals(PLACEHOLDER_FECHA)) {
            JOptionPane.showMessageDialog(this, "Completá todos los campos antes de registrar.");
            return;
        }

        if (jComboBoxIDRestauranteEmpleado.getItemCount() == 0 || "No hay restaurantes registrados".equals(jComboBoxIDRestauranteEmpleado.getSelectedItem())) {
            JOptionPane.showMessageDialog(this, "Primero registrá al menos un restaurante.");
            return;
        }

        String cargo = jComboBoxCargoEmpleado.getSelectedItem().toString();
        String nombreCompleto = (jTextFieldNombreEmpleado.getText().trim() + " " + jTextFieldApellidoEmpleado.getText().trim()).trim();
        String fecha = jTextFieldFechaIngresoEmpleado.getText().trim();
        String nombreRestaurante = (String) jComboBoxIDRestauranteEmpleado.getSelectedItem();
        String idRestaurante = Restaurantes.obtenerIdRestaurantePorNombre(nombreRestaurante);
        if (idRestaurante == null || idRestaurante.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Seleccioná un restaurante válido.");
            return;
        }

        try {
            java.time.LocalDate.parse(fecha);
        } catch (java.time.format.DateTimeParseException e) {
            JOptionPane.showMessageDialog(this, "La fecha debe tener el formato AAAA-MM-DD, por ejemplo 2024-12-02.");
            return;
        }

        Empleado nuevoEmpleado;
        if (cargo.equals("Mozo")) {
            nuevoEmpleado = new Mozo(
                jTextFieldIdentificadorEmpleado.getText().trim(),
                nombreCompleto,
                cargo,
                fecha,
                idRestaurante
            );
        } else {
            nuevoEmpleado = new Cocinero(
                jTextFieldIdentificadorEmpleado.getText().trim(),
                nombreCompleto,
                cargo,
                fecha,
                idRestaurante
            );
        }

        gestorEmpleados.agregarEmpleado(nuevoEmpleado);
        JOptionPane.showMessageDialog(this, "Empleado agregado exitosamente");
        jTextFieldIdentificadorEmpleado.setText(Empleados.generarNuevoIdEmpleado());
        jTextFieldNombreEmpleado.setText("");
        jTextFieldApellidoEmpleado.setText("");
        ponerPlaceholderFecha();
    }

    private void jTextFieldFechaIngresoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> new RegistroEmpleado().setVisible(true));
    }

    private javax.swing.JButton jButtonCancelarEmpleado;
    private javax.swing.JButton jButtonRegistrarEmpleado;
    private javax.swing.JComboBox<String> jComboBoxCargoEmpleado;
    private javax.swing.JComboBox<String> jComboBoxIDRestauranteEmpleado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelApellidoEmpleado;
    private javax.swing.JLabel jLabelCargoEmpleado;
    private javax.swing.JLabel jLabelFechaIngresoEmpleado;
    private javax.swing.JLabel jLabelIDRestauranteEmpleado;
    private javax.swing.JLabel jLabelIdentificadorEmpleado;
    private javax.swing.JLabel jLabelNombreEmpleado;
    private javax.swing.JTextField jTextFieldApellidoEmpleado;
    private javax.swing.JTextField jTextFieldFechaIngresoEmpleado;
    private javax.swing.JTextField jTextFieldIdentificadorEmpleado;
    private javax.swing.JTextField jTextFieldNombreEmpleado;
}
