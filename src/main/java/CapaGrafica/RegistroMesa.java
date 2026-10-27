package CapaGrafica;

import CapaLogica.Restaurante;
import CapaLogica.Restaurantes;
import javax.swing.JOptionPane;

/**
 *
 * @author aemil
 */
public class RegistroRestaurante extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(RegistroRestaurante.class.getName());
    private Restaurantes gestorRestaurantes = new Restaurantes();

    public RegistroRestaurante() {
        initComponents();
        jTextFieldIdentificadorRestaurante.setEditable(false);
        jTextFieldIdentificadorRestaurante.setText(Restaurantes.generarNuevoIdRestaurante());
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabelNombreRestaurante = new javax.swing.JLabel();
        jLabelDireccionRestaurante = new javax.swing.JLabel();
        jLabelTelefonoRestaurante = new javax.swing.JLabel();
        jLabelIdentificadorRestaurante = new javax.swing.JLabel();
        jTextFieldNombreRestaurante = new javax.swing.JTextField();
        jTextFieldDireccionRestaurante = new javax.swing.JTextField();
        jTextFieldTelefonoRestaurante = new javax.swing.JTextField();
        jTextFieldIdentificadorRestaurante = new javax.swing.JTextField();
        jButtonCancelarRegistroRestaurante = new javax.swing.JButton();
        jButtonRegistrarRestaurante = new javax.swing.JButton();
        jLabelTituloRegistrarRestaurante = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelNombreRestaurante.setText("Nombre");
        jLabelDireccionRestaurante.setText("Direccion");
        jLabelTelefonoRestaurante.setText("Telefono");
        jLabelIdentificadorRestaurante.setText("Identificador");

        jTextFieldNombreRestaurante.addActionListener(this::jTextFieldNombreRestauranteActionPerformed);
        jTextFieldDireccionRestaurante.addActionListener(this::jTextFieldDireccionRestauranteActionPerformed);
        jTextFieldTelefonoRestaurante.addActionListener(this::jTextFieldTelefonoRestauranteActionPerformed);
        jTextFieldIdentificadorRestaurante.addActionListener(this::jTextFieldIdentificadorRestauranteActionPerformed);

        jButtonCancelarRegistroRestaurante.setText("Cancelar");
        jButtonCancelarRegistroRestaurante.addActionListener(this::jButtonCancelarRegistroRestauranteActionPerformed);

        jButtonRegistrarRestaurante.setText("Registrar");
        jButtonRegistrarRestaurante.addActionListener(this::jButtonRegistrarRestauranteActionPerformed);

        jLabelTituloRegistrarRestaurante.setFont(new java.awt.Font("Segoe UI", 0, 18));
        jLabelTituloRegistrarRestaurante.setText("Registrar Restaurante");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonCancelarRegistroRestaurante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonRegistrarRestaurante)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelIdentificadorRestaurante)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldIdentificadorRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelDireccionRestaurante)
                            .addComponent(jLabelTelefonoRestaurante)
                            .addComponent(jLabelNombreRestaurante))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldDireccionRestaurante, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldTelefonoRestaurante)
                            .addComponent(jTextFieldNombreRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 31, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTituloRegistrarRestaurante)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTituloRegistrarRestaurante)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombreRestaurante)
                    .addComponent(jTextFieldNombreRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDireccionRestaurante)
                    .addComponent(jTextFieldDireccionRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTelefonoRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTelefonoRestaurante))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelIdentificadorRestaurante)
                    .addComponent(jTextFieldIdentificadorRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 70, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRegistrarRestaurante)
                    .addComponent(jButtonCancelarRegistroRestaurante))
                .addContainerGap())
        );

        pack();
    }

    private void jTextFieldNombreRestauranteActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jTextFieldDireccionRestauranteActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jTextFieldTelefonoRestauranteActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jTextFieldIdentificadorRestauranteActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jButtonCancelarRegistroRestauranteActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
    }

    private void jButtonRegistrarRestauranteActionPerformed(java.awt.event.ActionEvent evt) {
        if (jTextFieldNombreRestaurante.getText().trim().isEmpty()
                || jTextFieldDireccionRestaurante.getText().trim().isEmpty()
                || jTextFieldTelefonoRestaurante.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Completá todos los campos antes de registrar.");
            return;
        }

        Restaurante nuevoRestaurante = new Restaurante(
            jTextFieldIdentificadorRestaurante.getText().trim(),
            jTextFieldNombreRestaurante.getText().trim(),
            jTextFieldDireccionRestaurante.getText().trim(),
            jTextFieldTelefonoRestaurante.getText().trim()
        );
        gestorRestaurantes.agregarRestaurante(nuevoRestaurante);
        JOptionPane.showMessageDialog(this, "Restaurante agregado exitosamente");
        jTextFieldNombreRestaurante.setText("");
        jTextFieldDireccionRestaurante.setText("");
        jTextFieldTelefonoRestaurante.setText("");
        jTextFieldIdentificadorRestaurante.setText(Restaurantes.generarNuevoIdRestaurante());
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

        java.awt.EventQueue.invokeLater(() -> new RegistroRestaurante().setVisible(true));
    }

    private javax.swing.JButton jButtonCancelarRegistroRestaurante;
    private javax.swing.JButton jButtonRegistrarRestaurante;
    private javax.swing.JLabel jLabelDireccionRestaurante;
    private javax.swing.JLabel jLabelIdentificadorRestaurante;
    private javax.swing.JLabel jLabelNombreRestaurante;
    private javax.swing.JLabel jLabelTelefonoRestaurante;
    private javax.swing.JLabel jLabelTituloRegistrarRestaurante;
    private javax.swing.JTextField jTextFieldDireccionRestaurante;
    private javax.swing.JTextField jTextFieldIdentificadorRestaurante;
    private javax.swing.JTextField jTextFieldNombreRestaurante;
    private javax.swing.JTextField jTextFieldTelefonoRestaurante;
}
