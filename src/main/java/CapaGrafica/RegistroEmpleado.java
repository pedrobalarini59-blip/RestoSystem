package CapaGrafica;

import CapaLogica.Mesa;
import CapaLogica.Mesas;
import CapaLogica.Restaurantes;
import javax.swing.JOptionPane;

/**
 *
 * @author aemil
 */
public class RegistroMesa extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(RegistroMesa.class.getName());
    private Mesas gestorMesas = new Mesas();

    public RegistroMesa() {
        initComponents();
        jTextFieldIDRegistroMesa.setEditable(false);
        jTextFieldIDRegistroMesa.setText(Mesas.generarNuevoIdMesa());
        Restaurantes.cargarComboRestaurantes(jComboBoxIDRestauranteRegistroMesa);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabelTituloRegistrarMesa = new javax.swing.JLabel();
        jLabelIDRegistroMesa = new javax.swing.JLabel();
        jLabelCapacidadRegistroMesa = new javax.swing.JLabel();
        jLabelUbicacionRegistroMesa = new javax.swing.JLabel();
        jLabelNumeroRegistroMesa = new javax.swing.JLabel();
        jLabelIDRestauranteRegistroMesa = new javax.swing.JLabel();
        jTextFieldIDRegistroMesa = new javax.swing.JTextField();
        jTextFieldCapacidadRegistroMesa = new javax.swing.JTextField();
        jTextFieldUbicacionRegistroMesa = new javax.swing.JTextField();
        jTextFieldNumeroRegistroMesa = new javax.swing.JTextField();
        jComboBoxIDRestauranteRegistroMesa = new javax.swing.JComboBox<>();
        jButtonCancelarRegistroMesa = new javax.swing.JButton();
        jButtonRegistrarMesa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelTituloRegistrarMesa.setFont(new java.awt.Font("Segoe UI", 0, 18));
        jLabelTituloRegistrarMesa.setText("Registrar Mesa");

        jLabelIDRegistroMesa.setText("ID de Mesa");
        jLabelCapacidadRegistroMesa.setText("Capacidad");
        jLabelUbicacionRegistroMesa.setText("Ubicacion");
        jLabelNumeroRegistroMesa.setText("Numero");
        jLabelIDRestauranteRegistroMesa.setText("Restaurante");

        jTextFieldIDRegistroMesa.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCapacidadRegistroMesa.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldUbicacionRegistroMesa.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNumeroRegistroMesa.setBackground(new java.awt.Color(255, 255, 255));

        jButtonCancelarRegistroMesa.setText("Cancelar");
        jButtonCancelarRegistroMesa.addActionListener(this::jButtonCancelarRegistroMesaActionPerformed);

        jButtonRegistrarMesa.setText("Registrar");
        jButtonRegistrarMesa.addActionListener(this::jButtonRegistrarMesaActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelIDRegistroMesa)
                            .addComponent(jLabelNumeroRegistroMesa)
                            .addComponent(jLabelIDRestauranteRegistroMesa)
                            .addComponent(jLabelCapacidadRegistroMesa)
                            .addComponent(jLabelUbicacionRegistroMesa)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonCancelarRegistroMesa)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldNumeroRegistroMesa, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                .addComponent(jComboBoxIDRestauranteRegistroMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldUbicacionRegistroMesa)
                                .addComponent(jTextFieldIDRegistroMesa))
                            .addComponent(jTextFieldCapacidadRegistroMesa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(47, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonRegistrarMesa)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTituloRegistrarMesa)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTituloRegistrarMesa)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIDRegistroMesa)
                    .addComponent(jTextFieldIDRegistroMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCapacidadRegistroMesa)
                    .addComponent(jTextFieldCapacidadRegistroMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUbicacionRegistroMesa)
                    .addComponent(jTextFieldUbicacionRegistroMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumeroRegistroMesa)
                    .addComponent(jTextFieldNumeroRegistroMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIDRestauranteRegistroMesa)
                    .addComponent(jComboBoxIDRestauranteRegistroMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 84, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRegistrarMesa)
                    .addComponent(jButtonCancelarRegistroMesa))
                .addContainerGap())
        );

        pack();
    }

    private void jTextFieldIDRegistroMesaActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jButtonCancelarRegistroMesaActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
    }

    private void jButtonRegistrarMesaActionPerformed(java.awt.event.ActionEvent evt) {
        if (jTextFieldIDRegistroMesa.getText().trim().isEmpty()
                || jTextFieldNumeroRegistroMesa.getText().trim().isEmpty()
                || jTextFieldCapacidadRegistroMesa.getText().trim().isEmpty()
                || jTextFieldUbicacionRegistroMesa.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Completá todos los campos antes de registrar.");
            return;
        }

        if (jComboBoxIDRestauranteRegistroMesa.getItemCount() == 0 || "No hay restaurantes registrados".equals(jComboBoxIDRestauranteRegistroMesa.getSelectedItem())) {
            JOptionPane.showMessageDialog(this, "Primero registrá al menos un restaurante.");
            return;
        }

        String nombreRestaurante = (String) jComboBoxIDRestauranteRegistroMesa.getSelectedItem();
        String idRestaurante = Restaurantes.obtenerIdRestaurantePorNombre(nombreRestaurante);
        if (idRestaurante == null || idRestaurante.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Seleccioná un restaurante válido.");
            return;
        }

        Mesa nuevaMesa = new Mesa(
            jTextFieldIDRegistroMesa.getText().trim(),
            jTextFieldNumeroRegistroMesa.getText().trim(),
            jTextFieldCapacidadRegistroMesa.getText().trim(),
            jTextFieldUbicacionRegistroMesa.getText().trim(),
            idRestaurante
        );
        gestorMesas.agregarMesa(nuevaMesa);
        JOptionPane.showMessageDialog(this, "Mesa agregada exitosamente");
        jTextFieldIDRegistroMesa.setText(Mesas.generarNuevoIdMesa());
        jTextFieldNumeroRegistroMesa.setText("");
        jTextFieldCapacidadRegistroMesa.setText("");
        jTextFieldUbicacionRegistroMesa.setText("");
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

        java.awt.EventQueue.invokeLater(() -> new RegistroMesa().setVisible(true));
    }

    private javax.swing.JButton jButtonCancelarRegistroMesa;
    private javax.swing.JButton jButtonRegistrarMesa;
    private javax.swing.JComboBox<String> jComboBoxIDRestauranteRegistroMesa;
    private javax.swing.JLabel jLabelCapacidadRegistroMesa;
    private javax.swing.JLabel jLabelIDRegistroMesa;
    private javax.swing.JLabel jLabelIDRestauranteRegistroMesa;
    private javax.swing.JLabel jLabelNumeroRegistroMesa;
    private javax.swing.JLabel jLabelTituloRegistrarMesa;
    private javax.swing.JLabel jLabelUbicacionRegistroMesa;
    private javax.swing.JTextField jTextFieldCapacidadRegistroMesa;
    private javax.swing.JTextField jTextFieldIDRegistroMesa;
    private javax.swing.JTextField jTextFieldNumeroRegistroMesa;
    private javax.swing.JTextField jTextFieldUbicacionRegistroMesa;
}
