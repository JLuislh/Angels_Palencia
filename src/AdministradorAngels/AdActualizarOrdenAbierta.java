/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package AdministradorAngels;

import BDclass.BDConexion;
import BDclass.BDOrdenes;
import ClassAngels.InsertarProducto;
import ClassAngels.TextAreaRenderer;
import static Inicio.Menu.noorden;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumn;

/**
 *
 * @author it
 */
public class AdActualizarOrdenAbierta extends javax.swing.JPanel {
    int orden;
    int id;
    int codigo;
    int existe = 0;
    /**
     * Creates new form AdActualizarOrdenAbierta
     */
    public AdActualizarOrdenAbierta() {
        initComponents();
        ListarOrdenes();
        
    }
    
     private void eliminarOrden(){
        try {
            BDConexion conecta = new BDConexion();
            Connection con = conecta.getConexion();
            PreparedStatement ps = null;
            PreparedStatement p = null;
            ps= con.prepareStatement("delete from Ordenes where noorden="+Noorden.getText());
            p = con.prepareStatement("UPDATE MESAS SET ESTADO = 1 WHERE id_mesa =" + Mesa.getText());
            ps.executeUpdate();
            p.executeUpdate();
            con.close();
            ps.close();
            p.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"ERROr = "+ex);
        }
 }
    
    private void ListarOrdenes(){
        
       
     
        ArrayList<Productos> result = BDIngresos.OrdenesAbiertas();
        RecargarTablaDetallado(result);  
    }
     private void RecargarTablaDetallado(ArrayList<Productos> list) {
         DecimalFormat df = new DecimalFormat("#.00");
              Object[][] datos = new Object[list.size()][5];
              int i = 0;
              for(Productos t : list)
              {
                  datos[i][0] = t.getNoOrden();
                  datos[i][1] = t.getOrdenDia();
                  datos[i][2] = t.getNoMesa();
                  datos[i][3] = t.getFecha();
                  
                  i++;
              }    
             OrdenesDia.setModel(new javax.swing.table.DefaultTableModel(
                datos,
                new String[]{
                "NO. REF","NO ORDEN","NO. MESA","FECHA"
             })
             {  
                 @Override
                 public boolean isCellEditable(int row, int column){
                 return false;

             }
             });
             OrdenesDia.getColumnModel().getColumn(1).setCellRenderer(new TextAreaRenderer());
             TableColumn columna1 = OrdenesDia.getColumn("NO. REF");
             columna1.setPreferredWidth(0);
             TableColumn columna2 = OrdenesDia.getColumn("NO ORDEN");
             columna2.setPreferredWidth(15);
             TableColumn columna3 = OrdenesDia.getColumn("NO. MESA");
             columna3.setPreferredWidth(15);
             TableColumn columna4 = OrdenesDia.getColumn("FECHA");
             columna4.setPreferredWidth(45);
            
     }
     
      private void ListarOrdenesPedidas(){
        ArrayList<Productos> result1 = BDIngresos.DetalleOrdenes(orden);
        Pedido(result1);  
    }
     private void Pedido(ArrayList<Productos> list) {
         DecimalFormat df = new DecimalFormat("#.00");
              Object[][] datos = new Object[list.size()][5];
              int i = 0;
              for(Productos t : list)
              {
                  datos[i][0] = t.getId_producto();
                  datos[i][1] = t.getCodigo();
                  datos[i][2] = t.getDescripcion();
                  datos[i][3] = t.getCantidad();
                  datos[i][4] = df.format(t.getTotal());
                  i++;
              }    
             Detalles.setModel(new javax.swing.table.DefaultTableModel(
                datos,
                new String[]{
                "ID","CODIGO","DESCRIPCION","CANTIDAD","TOTAL"
             })
             {  
                 @Override
                 public boolean isCellEditable(int row, int column){
                 return false;
             }
             });
             Detalles.getColumnModel().getColumn(1).setCellRenderer(new TextAreaRenderer());
             TableColumn columna1 = Detalles.getColumn("CODIGO");
             columna1.setPreferredWidth(-20);
             TableColumn columna2 = Detalles.getColumn("DESCRIPCION");
             columna2.setPreferredWidth(275);
             TableColumn columna3 = Detalles.getColumn("CANTIDAD");
             columna3.setPreferredWidth(35);
             TableColumn columna4 = Detalles.getColumn("TOTAL");
             columna4.setPreferredWidth(35);
             ID.setText("");
     }
     

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        OrdenesDia = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        Detalles = new javax.swing.JTable();
        panelRound1 = new ClassAngels.PanelRound();
        MAS = new javax.swing.JLabel();
        panelRound2 = new ClassAngels.PanelRound();
        MENOS = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Mesa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Noorden = new javax.swing.JTextField();
        panelRound3 = new ClassAngels.PanelRound();
        MENOS1 = new javax.swing.JLabel();

        OrdenesDia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        OrdenesDia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OrdenesDiaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(OrdenesDia);

        Detalles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "DESCRIPCION", "CANTIDAD", "TOTAL"
            }
        ));
        Detalles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DetallesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Detalles);

        panelRound1.setBackground(new java.awt.Color(153, 255, 153));
        panelRound1.setForeground(new java.awt.Color(153, 255, 153));
        panelRound1.setToolTipText("");
        panelRound1.setRoundBottomLeft(20);
        panelRound1.setRoundBottomRight(20);
        panelRound1.setRoundTopLeft(20);
        panelRound1.setRoundTopRight(20);

        MAS.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        MAS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MAS.setText("+");
        MAS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MASMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MAS, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MAS, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        panelRound2.setBackground(new java.awt.Color(255, 102, 102));
        panelRound2.setRoundBottomLeft(20);
        panelRound2.setRoundBottomRight(20);
        panelRound2.setRoundTopLeft(20);
        panelRound2.setRoundTopRight(20);

        MENOS.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        MENOS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MENOS.setText("-");
        MENOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MENOSMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MENOS, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MENOS, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        ID.setEditable(false);
        ID.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ID.setForeground(new java.awt.Color(255, 0, 0));
        ID.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setText("MESA");

        jLabel2.setText("REFERENCIA");

        panelRound3.setBackground(new java.awt.Color(255, 102, 102));
        panelRound3.setRoundBottomLeft(20);
        panelRound3.setRoundBottomRight(20);
        panelRound3.setRoundTopLeft(20);
        panelRound3.setRoundTopRight(20);

        MENOS1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        MENOS1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MENOS1.setText("Eliminar");
        MENOS1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MENOS1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelRound3Layout = new javax.swing.GroupLayout(panelRound3);
        panelRound3.setLayout(panelRound3Layout);
        panelRound3Layout.setHorizontalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MENOS1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelRound3Layout.setVerticalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MENOS1, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Mesa, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Noorden, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(170, 170, 170)
                        .addComponent(panelRound3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(Mesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(Noorden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelRound3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void OrdenesDiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrdenesDiaMouseClicked
        orden = (Integer.parseInt(String.valueOf(OrdenesDia.getModel().getValueAt(OrdenesDia.getSelectedRow(), 0))));
        Noorden.setText((String.valueOf(OrdenesDia.getModel().getValueAt(OrdenesDia.getSelectedRow(), 0))));
        Mesa.setText((String.valueOf(OrdenesDia.getModel().getValueAt(OrdenesDia.getSelectedRow(), 2))));
        ListarOrdenesPedidas();
    }//GEN-LAST:event_OrdenesDiaMouseClicked

    private void DetallesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DetallesMouseClicked
       id = (Integer.parseInt(String.valueOf(Detalles.getModel().getValueAt(Detalles.getSelectedRow(), 0))));
       codigo = (Integer.parseInt(String.valueOf(Detalles.getModel().getValueAt(Detalles.getSelectedRow(), 1))));
       ID.setText(String.valueOf(id));
    }//GEN-LAST:event_DetallesMouseClicked

    private void MASMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MASMouseClicked
       
        if(ID.getText().compareTo("")!=0){
            UpdateCantidadMas();
        }else{JOptionPane.showMessageDialog(null, "SELECCIONAR UN PRODUCTO A ACTUALIZAR...");}
        
        
        
    }//GEN-LAST:event_MASMouseClicked

    private void MENOSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MENOSMouseClicked
        if(ID.getText().compareTo("")!=0){
        BuscarExistencia();
        if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();}
        }else{JOptionPane.showMessageDialog(null, "SELECCIONAR UN PRODUCTO A ACTUALIZAR...");}
    }//GEN-LAST:event_MENOSMouseClicked

    private void MENOS1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MENOS1MouseClicked
        if (Noorden.getText().compareTo("")!=0) {
            eliminarOrden();
            ListarOrdenes();
            ListarOrdenesPedidas();
            Mesa.setText("");
            Noorden.setText("");
            JOptionPane.showMessageDialog(null, "ORDEN ELIMINADA...");
        }else{JOptionPane.showMessageDialog(null, "SELECCIONAR ORDEN A ELIMINAR");}
        
    }//GEN-LAST:event_MENOS1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Detalles;
    private javax.swing.JTextField ID;
    private javax.swing.JLabel MAS;
    private javax.swing.JLabel MENOS;
    private javax.swing.JLabel MENOS1;
    private javax.swing.JTextField Mesa;
    private javax.swing.JTextField Noorden;
    private javax.swing.JTable OrdenesDia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private ClassAngels.PanelRound panelRound1;
    private ClassAngels.PanelRound panelRound2;
    private ClassAngels.PanelRound panelRound3;
    // End of variables declaration//GEN-END:variables

 public  void BuscarExistencia() {
            try {
                BDConexion conecta = new BDConexion();
                Connection cn = conecta.getConexion();
                java.sql.Statement stmt = cn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT cantidad as EXISTE FROM ventas  WHERE NOORDEN =  "+orden+" and IDVENTA = "+id+" AND CODIGO ="+codigo);
                while (rs.next()) {
                    existe = rs.getInt(1);
                }
                rs.close();
                stmt.close();
                cn.close();
            } catch (Exception error) {
                System.out.print(error);
            }
            
        }
     
     private void UpdateCantidadMenos() {
        try {
                 BDConexion conecta = new BDConexion();
                 Connection con = conecta.getConexion();
                 PreparedStatement smtp = null;
                 smtp = con.prepareStatement("update VENTAS SET CANTIDAD = CANTIDAD-1,Total = TOTAL-(SELECT PRECIO FROM productos WHERE CODIGO = "+codigo+") WHERE NOORDEN = "+orden+" and IDVENTA = "+id+" AND CODIGO = "+codigo);
                 smtp.executeUpdate();
                 con.close();
                 smtp.close();
               // JOptionPane.showMessageDialog(null, "Guardado...");
            } catch (SQLException ex) {
                JOptionPane.showConfirmDialog(null, ex);
            }
     ListarOrdenesPedidas();
     }
     
      private void eliminarProducto(){
        try {
            BDConexion conecta = new BDConexion();
            Connection con = conecta.getConexion();
            PreparedStatement ps = null;
            ps= con.prepareStatement("delete from Ventas where noorden="+orden+" and IDVENTA = "+id+" and codigo = "+codigo);
            ps.executeUpdate();
            con.close();
            ps.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"ERROr = "+ex);
        }
      ListarOrdenesPedidas();
      }
      
       private void UpdateCantidadMas() {
        try {
                 BDConexion conecta = new BDConexion();
                 Connection con = conecta.getConexion();
                 PreparedStatement smtp = null;
                 smtp = con.prepareStatement("update VENTAS SET CANTIDAD = CANTIDAD+1, TOTAL = CANTIDAD*(SELECT PRECIO FROM productos WHERE CODIGO = "+codigo+") WHERE NOORDEN = "+orden+" and IDVENTA = "+id+" AND CODIGO = "+codigo);
                 smtp.executeUpdate();
                 con.close();
                 smtp.close();
               // JOptionPane.showMessageDialog(null, "Guardado...");
            } catch (SQLException ex) {
                JOptionPane.showConfirmDialog(null, ex);
            }
           ListarOrdenesPedidas();
       }
}
