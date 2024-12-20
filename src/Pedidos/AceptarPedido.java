/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pedidos;

import BDclass.BDConexionPedidos;
import ClassAngels.TextAreaRenderer;
import Inicio.Ordenes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumn;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author it
 */
public class AceptarPedido extends javax.swing.JFrame {
  String sede;
  int id_producto;
  int Sucursal = 0;
  int bloqueo = 0;
    /**
     * Creates new form InicioPedido
     */
    public AceptarPedido() {
        initComponents();
        setLocationRelativeTo(null);
        sede = System.getProperty("user.name");
        ListarPedidosRecido();
        buscasucursal();
    }
    
    
    private void buscasucursal(){
        switch (sede) {
            case "it" -> Sucursal = 1;
            case "AngelsParaiso" -> Sucursal = 2;//ok
            case "AngelsSanLuis" -> Sucursal = 3;//ok
            case "angelspalencia" -> Sucursal = 4;//ok
            case "AngelsResidenciales" -> Sucursal = 5;
            case "AngelsSantaInes" -> Sucursal = 6;
            default -> {
            }
        }
    }
    
    private void ActualizarCantidades(){
    try {
            
            switch (Sucursal) {
                case 1:
                    ActualizartablaSantaInesR();
                    break;
                case 2:
                    ActualizartablaParaisoR();
                    break;
                case 3:
                    ActualizartablaSanLuisR();
                    break;
                case 4:
                    ActualizartablaPalenciaR();
                    break;
                case 5:
                    ActualizartablaResidencialesR();
                    break;
                case 6:
                    ActualizartablaSantaInesR();
                    break;
                default:
                    break;
            }
        } catch (SQLException ex) {
            System.out.println("ERROR DE ACTUALIZAR CANTIDAD-- "+ex);
        }
    }
    
    public void insertarProducto(){
     try {
            ClassProductos p = new ClassProductos();
            p.setId_pedido(Integer.parseInt(NoPedido.getText()));
            p.setId_producto(id_producto);
            BDIngresosConsultas.InsertarProductosPedido(p);
        } catch (NumberFormatException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
     }

    private void ListarPedidosRecido() {

        ArrayList<ClassProductos> result = BDIngresosConsultas.ListarPedidosRecibido();
        RecargarTablaPedidos(result);
    }

    private void RecargarTablaPedidos(ArrayList<ClassProductos> list) {
        Object[][] datos = new Object[list.size()][2];
        int i = 0;
        for (ClassProductos t : list) {
            datos[i][0] = t.getId_pedido();
            datos[i][1] = t.getFechain();
            i++;
        }
        TablePedidos.setModel(new javax.swing.table.DefaultTableModel(
                datos,
                new String[]{
                    "No.", "FECHA"
                }) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        });
        TablePedidos.getColumnModel().getColumn(1).setCellRenderer(new TextAreaRenderer());
        TableColumn columna1 = TablePedidos.getColumn("No.");
        columna1.setPreferredWidth(-20);
        TableColumn columna2 = TablePedidos.getColumn("FECHA");
        columna2.setPreferredWidth(255);
    }

  
    private void ListarProductosSolicitadosSantaInesR() {
        ArrayList<ClassProductos> result = BDIngresosConsultas.ListarProductosSolicitadosSantaInesRecibido(Integer.parseInt(NoPedido.getText()));
        RecargarTabla(result);
    }
    private void ListarProductosSolicitadosResidencialesR() {
        ArrayList<ClassProductos> result = BDIngresosConsultas.ListarProductosSolicitadosResidencialesRecibido(Integer.parseInt(NoPedido.getText()));
        RecargarTabla(result);
    }
    private void ListarProductosSolicitadosSanLuisR() {
        ArrayList<ClassProductos> result = BDIngresosConsultas.ListarProductosSolicitadosPuertaNegraRecibido(Integer.parseInt(NoPedido.getText()));
        RecargarTabla(result);
    }
    private void ListarProductosSolicitadosParaisoR() {
        ArrayList<ClassProductos> result = BDIngresosConsultas.ListarProductosSolicitadosParaisoRecibido(Integer.parseInt(NoPedido.getText()));
        RecargarTabla(result);
    }
    private void ListarProductosSolicitadosPalencaR() {
        ArrayList<ClassProductos> result = BDIngresosConsultas.ListarProductosSolicitadosPalenciaRecibido(Integer.parseInt(NoPedido.getText()));
        RecargarTabla(result);
    }
    private void RecargarTabla(ArrayList<ClassProductos> list) {
        Object[][] datos = new Object[list.size()][4];
        int i = 0;
        for (ClassProductos t : list) {
            datos[i][0] = t.getId_producto();
            datos[i][1] = t.getDescripcion();
            datos[i][2] = t.getUnidad();
            datos[i][3] = t.getCantidad();
            i++;
        }
        Solicitado.setModel(new javax.swing.table.DefaultTableModel(
                datos,
                new String[]{
                    "CODIGO", "DESCRIPCION", "MEDIDA", "CANTIDAD"
                }) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return !(column==0) &&  !(column==1) &&  !(column==2);

            }
        });
        Solicitado.getColumnModel().getColumn(1).setCellRenderer(new TextAreaRenderer());
        TableColumn columna1 = Solicitado.getColumn("CODIGO");
        columna1.setPreferredWidth(-20);
        TableColumn columna2 = Solicitado.getColumn("DESCRIPCION");
        columna2.setPreferredWidth(255);
        TableColumn columna3 = Solicitado.getColumn("MEDIDA");
        columna3.setPreferredWidth(55);
    }

    private void ActualizartablaSantaInesR() throws SQLException {
        if (Solicitado.getRowCount() > 0) {
                    BDConexionPedidos conecta = new BDConexionPedidos();
                    try (Connection cn = conecta.getConexion()) {
                    PreparedStatement ps;
            for (int i = 0; i < Solicitado.getRowCount(); i++) {
                    ps = cn.prepareStatement("update productos_pedido SET R_SANTAINES = " + Solicitado.getValueAt(i, 3) + " WHERE ID_PEDIDO = " + NoPedido.getText() + " AND ID_PRODUCTO =" + Solicitado.getValueAt(i, 0));
                    ps.executeUpdate();
                    ps.close();
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "La lista esta Vacia");
        }
    }
    
    private void ActualizartablaSanLuisR() throws SQLException {
        if (Solicitado.getRowCount() > 0) {
                     BDConexionPedidos conecta = new BDConexionPedidos();
                     try (Connection cn = conecta.getConexion()) {
                     PreparedStatement ps;
            for (int i = 0; i < Solicitado.getRowCount(); i++) {
                     ps = cn.prepareStatement("update productos_pedido SET R_PUERTANE = " + Solicitado.getValueAt(i, 3) + " WHERE ID_PEDIDO = " + NoPedido.getText() + " AND ID_PRODUCTO =" + Solicitado.getValueAt(i, 0));
                     ps.executeUpdate();
                     ps.close();
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "La lista esta Vacia");
        }
    }
    
    private void ActualizartablaResidencialesR() throws SQLException {
        if (Solicitado.getRowCount() > 0) {
                BDConexionPedidos conecta = new BDConexionPedidos();
                try (Connection cn = conecta.getConexion()) {
                PreparedStatement ps;
            for (int i = 0; i < Solicitado.getRowCount(); i++) {
                    ps = cn.prepareStatement("update productos_pedido SET R_RESIDENCIALES = " + Solicitado.getValueAt(i, 3) + " WHERE ID_PEDIDO = " + NoPedido.getText() + " AND ID_PRODUCTO =" + Solicitado.getValueAt(i, 0));
                    ps.executeUpdate();
                    ps.close();
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "La lista esta Vacia");
        }
    }
    
    private void ActualizartablaParaisoR() throws SQLException {
        if (Solicitado.getRowCount() > 0) {
                BDConexionPedidos conecta = new BDConexionPedidos();
                try (Connection cn = conecta.getConexion()) {
                PreparedStatement ps;
            for (int i = 0; i < Solicitado.getRowCount(); i++) {
                    ps = cn.prepareStatement("update productos_pedido SET R_PARAISO = " + Solicitado.getValueAt(i, 3) + " WHERE ID_PEDIDO = " + NoPedido.getText() + " AND ID_PRODUCTO =" + Solicitado.getValueAt(i, 0));
                    ps.executeUpdate();
                    ps.close();
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "La lista esta Vacia");
        }
    }
    
    private void ActualizartablaPalenciaR() throws SQLException {
        if (Solicitado.getRowCount() > 0) {
                BDConexionPedidos conecta = new BDConexionPedidos();
                try (Connection cn = conecta.getConexion()) {
                PreparedStatement ps;
            for (int i = 0; i < Solicitado.getRowCount(); i++) {
                    ps = cn.prepareStatement("update productos_pedido SET R_PALENCIA = " + Solicitado.getValueAt(i, 3) + " WHERE ID_PEDIDO = " + NoPedido.getText() + " AND ID_PRODUCTO =" + Solicitado.getValueAt(i, 0));
                    ps.executeUpdate();
                    ps.close();
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "La lista esta Vacia");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Solicitado = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablePedidos = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        NoPedido = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TxtFecha = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Solicitado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "DESCRIPCION", "CANTIDAD"
            }
        ));
        Solicitado.setColumnSelectionAllowed(true);
        Solicitado.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        Solicitado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SolicitadoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Solicitado);

        TablePedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No. Pedido", "Fecha"
            }
        ));
        TablePedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablePedidosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TablePedidos);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("No. PEDIDO");

        jLabel2.setText("FECHA");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NoPedido, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(TxtFecha))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/save2.png"))); // NOI18N
        jButton1.setText("GUARDAR PEDIDO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 0, 0));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("X");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1004, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(419, 419, 419))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TablePedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablePedidosMouseClicked
        if(bloqueo == 0){
        NoPedido.setText((String.valueOf(TablePedidos.getModel().getValueAt(TablePedidos.getSelectedRow(), 0))));
        TxtFecha.setText((String.valueOf(TablePedidos.getModel().getValueAt(TablePedidos.getSelectedRow(), 1))));
        switch (Sucursal) {
            case 1:
                ListarProductosSolicitadosSantaInesR();
                break;
            case 2:
                ListarProductosSolicitadosParaisoR();
                break;
            case 3:
                ListarProductosSolicitadosSanLuisR();
                break;
            case 4:
                ListarProductosSolicitadosPalencaR();
                break;
            case 5:
                ListarProductosSolicitadosResidencialesR();
                break;
            case 6:
                ListarProductosSolicitadosSantaInesR();
                break;
            default:
                break;
        }
        }
    }//GEN-LAST:event_TablePedidosMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            
            switch (Sucursal) {
                case 1:
                    ActualizartablaSantaInesR();
                    break;
                case 2:
                    ActualizartablaParaisoR();
                    break;
                case 3:
                    ActualizartablaSanLuisR();
                    break;
                case 4:
                    ActualizartablaPalenciaR();
                    break;
                case 5:
                    ActualizartablaResidencialesR();
                    break;
                case 6:
                    ActualizartablaSantaInesR();
                    break;
                default:
                    break;
            }
        } catch (SQLException ex) {
            System.out.println("ERROR DE ACTUALIZAR CANTIDAD-- "+ex);
        }
        JOptionPane.showMessageDialog(null, "CANTIDADES ACTUALIZADAS...");
        bloqueo=0;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        if(bloqueo == 0){
        Ordenes F = new Ordenes();
        F.setVisible(true);
        this.dispose();}else{JOptionPane.showMessageDialog(null, "GUARDAR ANTES DE SALIR");}
    }//GEN-LAST:event_jLabel7MouseClicked

    private void SolicitadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SolicitadoMouseClicked
       bloqueo = 1;
    }//GEN-LAST:event_SolicitadoMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AceptarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AceptarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AceptarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AceptarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AceptarPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NoPedido;
    private javax.swing.JTable Solicitado;
    private javax.swing.JTable TablePedidos;
    private javax.swing.JTextField TxtFecha;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
