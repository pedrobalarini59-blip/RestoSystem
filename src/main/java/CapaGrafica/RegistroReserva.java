package CapaGrafica;

import CapaLogica.Pedido;
import CapaLogica.Pedidos;
import CapaLogica.Restaurantes;
import javax.swing.JOptionPane;

/**
 *
 * @author aemil
 */
public class RegistroPedido extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(RegistroPedido.class.getName());
    private Pedidos gestorPedidos = new Pedidos();

    public RegistroPedido() {
        initComponents();
        jTextFieldIdentificadorRegistroPedido.setEditable(false);
        jTextFieldIdentificadorRegistroPedido.setText(Pedidos.generarNuevoIdPedido());
        Restaurantes.cargarComboRestaurantes(jComboBoxIDRestauranteRegistroPedido);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabelTituloRegistrarPedido = new javax.swing.JLabel();
        jLabelIdentificadorRegistroPedido = new javax.swing.JLabel();
        jLabelEstadoRegistroPedido = new javax.swing.JLabel();
        jLabelHoraRegistroPedido = new javax.swing.JLabel();
        jLabelFechaRegistroPedido = new javax.swing.JLabel();
        jLabelIncluyeRegistroPedido = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaIncluyeRegistroPedido = new javax.swing.JTextArea();
        jTextFieldHoraRegistroPedido = new javax.swing.JTextField();
        jTextFieldFechaRegistroPedido = new javax.swing.JTextField();
        jTextFieldIdentificadorRegistroPedido = new javax.swing.JTextField();
        jComboBoxEstadoRegistroPedido = new javax.swing.JComboBox<>();
        jLabelPrecioTotalRegistroPedido = new javax.swing.JLabel();
        jTextFieldPrecioTotalRegistroPedido = new javax.swing.JTextField();
        jButtonCancelarRegistroPedido = new javax.swing.JButton();
        jLabelIDRestauranteRegistroPedido = new javax.swing.JLabel();
        jComboBoxIDRestauranteRegistroPedido = new javax.swing.JComboBox<>();
        jButtonRegistrarPedido = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelTituloRegistrarPedido.setFont(new java.awt.Font("Segoe UI", 0, 18));
        jLabelTituloRegistrarPedido.setText("Registrar Pedido");

        jLabelIdentificadorRegistroPedido.setText("Identificador");
        jLabelEstadoRegistroPedido.setText("Estado");
        jLabelHoraRegistroPedido.setText("Hora");
        jLabelFechaRegistroPedido.setText("Fecha");
        jLabelIncluyeRegistroPedido.setText("Incluye");

        jTextAreaIncluyeRegistroPedido.setColumns(20);
        jTextAreaIncluyeRegistroPedido.setRows(5);
        jScrollPane1.setViewportView(jTextAreaIncluyeRegistroPedido);

        jTextFieldFechaRegistroPedido.addActionListener(this::jTextFieldFechaRegistroPedidoActionPerformed);
        jComboBoxEstadoRegistroPedido.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Abierto", "Cerrado", "Cancelado" }));

        jLabelPrecioTotalRegistroPedido.setText("Precio Total");
        jTextFieldPrecioTotalRegistroPedido.addActionListener(this::jTextFieldPrecioTotalRegistroPedidoActionPerformed);

        jButtonCancelarRegistroPedido.setText("Cancelar");
        jButtonCancelarRegistroPedido.addActionListener(this::jButtonCancelarRegistroPedidoActionPerformed);

        jLabelIDRestauranteRegistroPedido.setText("Restaurante");
        jButtonRegistrarPedido.setText("Registrar");
        jButtonRegistrarPedido.addActionListener(this::jButtonRegistrarPedidoActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonCancelarRegistroPedido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonRegistrarPedido))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelTituloRegistrarPedido))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelEstadoRegistroPedido)
                                    .addComponent(jLabelIdentificadorRegistroPedido)
                                    .addComponent(jLabelFechaRegistroPedido)
                                    .addComponent(jLabelHoraRegistroPedido)
                                    .addComponent(jLabelIncluyeRegistroPedido)
                                    .addComponent(jLabelPrecioTotalRegistroPedido)
                                    .addComponent(jLabelIDRestauranteRegistroPedido))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxEstadoRegistroPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextFieldFechaRegistroPedido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                        .addComponent(jTextFieldIdentificadorRegistroPedido, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldHoraRegistroPedido, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jComboBoxIDRestauranteRegistroPedido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                        .addComponent(jTextFieldPrecioTotalRegistroPedido, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 46, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTituloRegistrarPedido)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIdentificadorRegistroPedido)
                    .addComponent(jTextFieldIdentificadorRegistroPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEstadoRegistroPedido)
                    .addComponent(jComboBoxEstadoRegistroPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFechaRegistroPedido)
                    .addComponent(jTextFieldFechaRegistroPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHoraRegistroPedido)
                    .addComponent(jTextFieldHoraRegistroPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelIncluyeRegistroPedido)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPrecioTotalRegistroPedido)
                    .addComponent(jTextFieldPrecioTotalRegistroPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelIDRestauranteRegistroPedido)
                    .addComponent(jComboBoxIDRestauranteRegistroPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelarRegistroPedido)
                    .addComponent(jButtonRegistrarPedido))
                .addContainerGap())
        );

        pack();
    }

    private void jTextFieldFechaRegistroPedidoActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jTextFieldPrecioTotalRegistroPedidoActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jButtonCancelarRegistroPedidoActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
    }

    private void jButtonRegistrarPedidoActionPerformed(java.awt.event.ActionEvent evt) {
        if (jTextFieldIdentificadorRegistroPedido.getText().trim().isEmpty()
                || jTextFieldFechaRegistroPedido.getText().trim().isEmpty()
                || jTextFieldHoraRegistroPedido.getText().trim().isEmpty()
                || jTextFieldPrecioTotalRegistroPedido.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Completá todos los campos antes de registrar.");
            return;
        }

        if (jComboBoxIDRestauranteRegistroPedido.getItemCount() == 0 || "No hay restaurantes registrados".equals(jComboBoxIDRestauranteRegistroPedido.getSelectedItem())) {
            JOptionPane.showMessageDialog(this, "Primero registrá al menos un restaurante.");
            return;
        }

        String nombreRestaurante = (String) jComboBoxIDRestauranteRegistroPedido.getSelectedItem();
        String idRestaurante = Restaurantes.obtenerIdRestaurantePorNombre(nombreRestaurante);
        if (idRestaurante == null || idRestaurante.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Seleccioná un restaurante válido.");
            return;
        }

        Pedido nuevoPedido = new Pedido(
            jTextFieldIdentificadorRegistroPedido.getText().trim(),
            jTextFieldFechaRegistroPedido.getText().trim(),
            jTextFieldHoraRegistroPedido.getText().trim(),
            jTextFieldPrecioTotalRegistroPedido.getText().trim(),
            jComboBoxEstadoRegistroPedido.getSelectedItem().toString(),
            idRestaurante
        );
        gestorPedidos.agregarPedido(nuevoPedido);
        JOptionPane.showMessageDialog(this, "Pedido agregado exitosamente");
        jTextFieldIdentificadorRegistroPedido.setText(Pedidos.generarNuevoIdPedido());
        jTextFieldFechaRegistroPedido.setText("");
        jTextFieldHoraRegistroPedido.setText("");
        jTextFieldPrecioTotalRegistroPedido.setText("");
        jTextAreaIncluyeRegistroPedido.setText("");
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

        java.awt.EventQueue.invokeLater(() -> new RegistroPedido().setVisible(true));
    }

    private javax.swing.JButton jButtonCancelarRegistroPedido;
    private javax.swing.JButton jButtonRegistrarPedido;
    private javax.swing.JComboBox<String> jComboBoxEstadoRegistroPedido;
    private javax.swing.JComboBox<String> jComboBoxIDRestauranteRegistroPedido;
    private javax.swing.JLabel jLabelEstadoRegistroPedido;
    private javax.swing.JLabel jLabelFechaRegistroPedido;
    private javax.swing.JLabel jLabelHoraRegistroPedido;
    private javax.swing.JLabel jLabelIDRestauranteRegistroPedido;
    private javax.swing.JLabel jLabelIdentificadorRegistroPedido;
    private javax.swing.JLabel jLabelIncluyeRegistroPedido;
    private javax.swing.JLabel jLabelPrecioTotalRegistroPedido;
    private javax.swing.JLabel jLabelTituloRegistrarPedido;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaIncluyeRegistroPedido;
    private javax.swing.JTextField jTextFieldFechaRegistroPedido;
    private javax.swing.JTextField jTextFieldHoraRegistroPedido;
    private javax.swing.JTextField jTextFieldIdentificadorRegistroPedido;
    private javax.swing.JTextField jTextFieldPrecioTotalRegistroPedido;
}
