/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package AdministradorAngels;

import BDclass.BDConexion;
import BDclass.BDOrdenes;
import ClassAngels.InsertarProducto;
import ClassAngels.TextAreaRenderer;
import java.sql.Connection;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumn;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;

/**
 *
 * @author jluis
 */
public class AdVentasPorDia extends javax.swing.JPanel {
     String Fecha;
    /**
     * Creates new form VentasPorDia
     */
    public AdVentasPorDia() {
        initComponents();
        
    }
    
    private void ListarVentas(){
        
         DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
         Fecha = df.format(Fe.getDate());
     
        ArrayList<InsertarProducto> result = BDOrdenes.ProductosVentas(Fecha);
        RecargarTabla(result);  
    }
     private void RecargarTabla(ArrayList<InsertarProducto> list) {
         DecimalFormat df = new DecimalFormat("#.00");
              Object[][] datos = new Object[list.size()][5];
              int i = 0;
              for(InsertarProducto t : list)
              {
                  datos[i][0] = t.getCodigo();
                  datos[i][1] = t.getDescripcion();
                  datos[i][2] = t.getCantidad();
                  datos[i][3] = df.format(t.getPrecio());
                  datos[i][4] = df.format(t.getTotal());
                  i++;
              }    
             Ventas.setModel(new javax.swing.table.DefaultTableModel(
                datos,
                new String[]{
                "CODIGO","DESCRIPCION","CANTIDAD","PRECIO","TOTAL"
             })
             {  
                 @Override
                 public boolean isCellEditable(int row, int column){
                 return false;

             }
             });
             Ventas.getColumnModel().getColumn(1).setCellRenderer(new TextAreaRenderer());
             TableColumn columna1 = Ventas.getColumn("CODIGO");
             columna1.setPreferredWidth(-20);
             TableColumn columna2 = Ventas.getColumn("DESCRIPCION");
             columna2.setPreferredWidth(275);
             TableColumn columna3 = Ventas.getColumn("CANTIDAD");
             columna3.setPreferredWidth(35);
             TableColumn columna4 = Ventas.getColumn("PRECIO");
             columna4.setPreferredWidth(35);
             
     }
     
     
     
     private void ListarVentasDetallado(){
        
         DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
         Fecha = df.format(Fe.getDate());
     
        ArrayList<InsertarProducto> result = BDOrdenes.ProductosVentasDetallado(Fecha);
        RecargarTablaDetallado(result);  
    }
     private void RecargarTablaDetallado(ArrayList<InsertarProducto> list) {
         DecimalFormat df = new DecimalFormat("#.00");
              Object[][] datos = new Object[list.size()][6];
              int i = 0;
              for(InsertarProducto t : list)
              {
                  datos[i][0] = t.getCodigo();
                  datos[i][1] = t.getDescripcion();
                  datos[i][2] = t.getCantidad();
                  datos[i][3] = t.getFecha();
                  datos[i][4] = df.format(t.getPrecio());
                  datos[i][5] = df.format(t.getTotal());
                  i++;
              }    
             Ventas.setModel(new javax.swing.table.DefaultTableModel(
                datos,
                new String[]{
                "CODIGO","DESCRIPCION","CANTIDAD","FECHA","PRECIO","TOTAL"
             })
             {  
                 @Override
                 public boolean isCellEditable(int row, int column){
                 return false;

             }
             });
             Ventas.getColumnModel().getColumn(1).setCellRenderer(new TextAreaRenderer());
             TableColumn columna1 = Ventas.getColumn("CODIGO");
             columna1.setPreferredWidth(-20);
             TableColumn columna2 = Ventas.getColumn("DESCRIPCION");
             columna2.setPreferredWidth(275);
             TableColumn columna3 = Ventas.getColumn("CANTIDAD");
             columna3.setPreferredWidth(35);
             TableColumn columna4 = Ventas.getColumn("PRECIO");
             columna4.setPreferredWidth(35);
             
     }
     
     private void imprimirventa(){
            
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            Fecha = df.format(Fe.getDate());
         
            BDConexion con = new BDConexion();
            Connection conexion = con.getConexion();
            try {
                JasperReport jasperReport = (JasperReport) JRLoader.loadObjectFromFile("C:\\Reportes\\ANGELS\\ReporteVentasResumen.jasper");
                Map parametros = new HashMap();
                parametros.put("FECHA", Fecha );
                System.out.println(parametros);
                JasperPrint print = JasperFillManager.fillReport(jasperReport, parametros, conexion);
                JasperPrintManager.printReport(print, true);
            } catch (Exception e) {
                System.out.println("F" + e);
                JOptionPane.showMessageDialog(null, "ERROR EJECUTAR REPORTES =  " + e);
            }
        } 

    
    
    
    private void imprimirventadetallado(){
        
           DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
           Fecha = df.format(Fe.getDate());
    
            BDConexion con = new BDConexion();
            Connection conexion = con.getConexion();
            try {
                JasperReport jasperReport = (JasperReport) JRLoader.loadObjectFromFile("C:\\Reportes\\ANGELS\\ReporteVentasTodo.jasper");
                Map parametros = new HashMap();
                parametros.put("FECHA", Fecha );
                System.out.println(parametros);
                JasperPrint print = JasperFillManager.fillReport(jasperReport, parametros, conexion);
                JasperPrintManager.printReport(print, true);
            } catch (Exception e) {
                System.out.println("F" + e);
                JOptionPane.showMessageDialog(null, "ERROR EJECUTAR REPORTES =  " + e);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        Ventas = new javax.swing.JTable();
        Fe = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        detalle = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1024, 635));

        Ventas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Ventas);

        jButton1.setText("Consultar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        detalle.setText("DETALLADO");

        jButton2.setText("IMPRIMIR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(Fe, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(detalle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 893, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(349, 349, 349)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Fe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(detalle)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
      if(Fe.getDate() != null){ 
        if(detalle.isSelected()){ListarVentasDetallado();}else{ListarVentas();}
        }
        else{
        JOptionPane.showMessageDialog(null, "INGRESE UNA FECHA...");
        
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (Fe.getDate() != null) {
            if (detalle.isSelected()) {
                imprimirventadetallado();
            } else {
                imprimirventa();
            }
        } else {
            JOptionPane.showMessageDialog(null, "INGRESE UNA FECHA...");

        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Fe;
    private javax.swing.JTable Ventas;
    private javax.swing.JCheckBox detalle;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
