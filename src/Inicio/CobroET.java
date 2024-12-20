/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Inicio;

import BDclass.BDConexion;
import BDclass.BDOrdenes;
import ClassAngels.InsertarProducto;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;

/**
 *
 * @author jluis
 */
public class CobroET extends javax.swing.JFrame {
     int cobro;
     int noorden;
     String Query;
    /**
     * Creates new form CobroET
     */
    public CobroET(double a,int b) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
        }
        initComponents();
        setLocationRelativeTo(null);
        String texto1 = "<html><center><body>TARJETA<br>EFECTIVO</body></center></html>";
        TYE.setText(texto1);
        CantEfectivo.setEditable(false);
        Canttarjeta.setEditable(false);
        total.setText(String.valueOf(a));
        Orden.setText(String.valueOf(b));
        noorden = b;
        
    }
    
    private void cobrarOrdenET(){
        try {
            BDConexion conecta = new BDConexion();
            Connection con = conecta.getConexion();
            PreparedStatement ps = null;
            ps= con.prepareStatement("UPDATE ORDENES SET efectivo = "+CantEfectivo.getText()+",tarjeta = "+Canttarjeta.getText()+",ESTADO = 2,transferencia = 0.00 where noorden="+Orden.getText());
            ps.executeUpdate();
            con.close();
            ps.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"ERROr = "+ex);
        }
         imprimirCobrodividido();
         Ordenes F = new Ordenes();
         F.setVisible(true);
         this.dispose();
        
        
 }
    
    private void cobrarOrdenTT(){
        try {
            BDConexion conecta = new BDConexion();
            Connection con = conecta.getConexion();
            PreparedStatement ps = null;
            ps= con.prepareStatement("UPDATE ORDENES SET efectivo = "+CantEfectivo.getText()+",tarjeta = 0.00,transferencia = "+Canttarjeta.getText()+",ESTADO = 2 where noorden="+Orden.getText());
            ps.executeUpdate();
            con.close();
            ps.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"ERROr = "+ex);
        }
         imprimirCobrodividido();
         Ordenes F = new Ordenes();
         F.setVisible(true);
         this.dispose();
        
        
 }
    
     private void imprimir(){
      BDConexion con= new BDConexion();
         Connection conexion= con.getConexion();
        try {
            JasperReport jasperReport=(JasperReport)JRLoader.loadObjectFromFile("C:\\Reportes\\ANGELS\\TiketAngelsPreCuenta.jasper");
            Map parametros= new HashMap();
            parametros.put("ID_ORDEN", Integer.parseInt(Orden.getText()));
            JasperPrint print = JasperFillManager.fillReport(jasperReport,parametros, conexion);
            JasperPrintManager.printReport(print, true);
        } catch (Exception e) {System.out.println("F"+e);
           JOptionPane.showMessageDialog(null, "ERROR EJECUTAR REPORTES =  "+e);
        }
    }
     
    private void imprimirCobrodividido(){
      BDConexion con= new BDConexion();
         Connection conexion= con.getConexion();
        try {
            JasperReport jasperReport=(JasperReport)JRLoader.loadObjectFromFile("C:\\Reportes\\ANGELS\\TiketAngelsPreCuentaDividida.jasper");
            Map parametros= new HashMap();
            parametros.put("ID_ORDEN", Integer.parseInt(Orden.getText()));
            JasperPrint print = JasperFillManager.fillReport(jasperReport,parametros, conexion);
            JasperPrintManager.printReport(print, true);
        } catch (Exception e) {System.out.println("F"+e);
           JOptionPane.showMessageDialog(null, "ERROR EJECUTAR REPORTES =  "+e);
        }
    }
    
    private void descargarInventario(){
     
        ArrayList<InsertarProducto> result = BDOrdenes.ListarCodigosPedido(noorden);
        for (int i = 0; i < result.size(); i++) {
          int codigo = result.get(i).getCodigo();
          int cant = result.get(i).getCantidad();
          try {
             System.out.println(result.get(i).getCodigo());
            BDConexion conecta = new BDConexion();
            Connection con = conecta.getConexion();
            Query = "{call Descontar("+codigo+","+cant+")}"; 
            PreparedStatement pse = null;
            pse= con.prepareStatement(Query);
            pse.executeUpdate();                   
            con.close();
            pse.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"ERROR = "+ex);
        }
          
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
        Efectivo = new javax.swing.JButton();
        Tarjeta = new javax.swing.JButton();
        TYE = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Orden = new javax.swing.JTextField();
        total = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Canttarjeta = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CantEfectivo = new javax.swing.JTextField();
        cobrar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(153, 255, 204));
        jPanel1.setForeground(new java.awt.Color(153, 255, 204));

        Efectivo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Efectivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/efectivo.png"))); // NOI18N
        Efectivo.setText("EFECTIVO");
        Efectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EfectivoActionPerformed(evt);
            }
        });

        Tarjeta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Tarjeta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/visa.png"))); // NOI18N
        Tarjeta.setText("TARJETA");
        Tarjeta.setPreferredSize(new java.awt.Dimension(108, 45));
        Tarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TarjetaActionPerformed(evt);
            }
        });

        TYE.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TYE.setText("TYE");
        TYE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TYEActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FORMA DE PAGO");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("No. ORDEN");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("TOTAL");

        Orden.setEditable(false);
        Orden.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Orden.setEnabled(false);

        total.setEditable(false);
        total.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("MONTO TARJETA/TRANSFERENCIA");

        Canttarjeta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Canttarjeta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Canttarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CanttarjetaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("MONTO EN EFECTIVO");

        CantEfectivo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CantEfectivo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CantEfectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CantEfectivoActionPerformed(evt);
            }
        });
        CantEfectivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CantEfectivoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CantEfectivoKeyTyped(evt);
            }
        });

        cobrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cobrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Dollar.png"))); // NOI18N
        cobrar.setText("COBRAR");
        cobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cobrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(cobrar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Canttarjeta)
                            .addComponent(CantEfectivo))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Canttarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CantEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cobrar, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addGap(11, 11, 11))
        );

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/transferencia-movil peque.png"))); // NOI18N
        jButton1.setText("TRANSFERENCIA");
        jButton1.setPreferredSize(new java.awt.Dimension(75, 45));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Orden, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Tarjeta, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Efectivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TYE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Orden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Tarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(Efectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TYE, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TarjetaActionPerformed
       cobro = 1;
       CantEfectivo.setText("0.00");
       Canttarjeta.setText("");
       Canttarjeta.setText(total.getText());
       Canttarjeta.requestFocus();
       CantEfectivo.setEditable(false);
       
       
       
    }//GEN-LAST:event_TarjetaActionPerformed

    private void EfectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EfectivoActionPerformed
      cobro = 2;
      CantEfectivo.setText("");
      Canttarjeta.setText("0.00");
      CantEfectivo.setText(total.getText());
      Canttarjeta.setEditable(false);
      CantEfectivo.setEditable(false);
     
    }//GEN-LAST:event_EfectivoActionPerformed

    private void TYEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TYEActionPerformed
       cobro = 3;
       CantEfectivo.setText("0.00");
       Canttarjeta.setText("");
       Canttarjeta.setText(total.getText());
       CantEfectivo.setEditable(true);
       CantEfectivo.requestFocus();
    }//GEN-LAST:event_TYEActionPerformed

    private void CanttarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CanttarjetaActionPerformed
       cobrar.requestFocus();
    }//GEN-LAST:event_CanttarjetaActionPerformed

    private void CantEfectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CantEfectivoActionPerformed
        cobrar.requestFocus();
    }//GEN-LAST:event_CantEfectivoActionPerformed

    private void totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalActionPerformed
      
    }//GEN-LAST:event_totalActionPerformed

    private void CantEfectivoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CantEfectivoKeyTyped
        
    }//GEN-LAST:event_CantEfectivoKeyTyped

    private void CantEfectivoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CantEfectivoKeyReleased
        //Canttarjeta.setText("");
        double totale = Double.parseDouble(total.getText());
        double efectivo = Double.parseDouble(CantEfectivo.getText());
        double contarje = totale - efectivo;
        Canttarjeta.setText(String.valueOf(contarje));    
    }//GEN-LAST:event_CantEfectivoKeyReleased

    private void cobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cobrarActionPerformed
       if(cobro > 0){
        if(cobro == 3){
            if(Double.parseDouble(Canttarjeta.getText())>0 && Double.parseDouble(CantEfectivo.getText())>0){cobrarOrdenET();descargarInventario();}
            else{JOptionPane.showMessageDialog(null, "EL COBRO TIENE QUE ESTAR DIVIDIDO");}
        }else{
            
         if(cobro ==4){cobrarOrdenTT();descargarInventario();}else{   
        cobrarOrdenET();descargarInventario();}
        }
       }else{JOptionPane.showMessageDialog(null, "SELECCIONAR UN METODO DE PAGO");}
             
    }//GEN-LAST:event_cobrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       cobro = 4;
       CantEfectivo.setText("0.00");
       Canttarjeta.setText("");
       Canttarjeta.setText(total.getText());
       Canttarjeta.requestFocus();
       CantEfectivo.setEditable(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(CobroET.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CobroET.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CobroET.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CobroET.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new CobroET().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CantEfectivo;
    private javax.swing.JTextField Canttarjeta;
    private javax.swing.JButton Efectivo;
    private javax.swing.JTextField Orden;
    private javax.swing.JButton TYE;
    private javax.swing.JButton Tarjeta;
    private javax.swing.JButton cobrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}
