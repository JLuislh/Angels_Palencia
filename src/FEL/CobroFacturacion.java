/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FEL;

import Inicio.*;
import BDclass.BDConexion;
import FELclass.CrearXML_Angels;
import FELclass.CrearXML_Zona4;
import FELclass.FELclas;
import FELclass.NumeroLetras;
import FELclass.ObtenerProductosFactura;
import FELclass.RestApiClient;
import java.io.IOException;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import org.json.JSONArray;
import org.json.JSONObject;
import org.w3c.dom.Document;

/**
 *
 * @author jluis
 */
public class CobroFacturacion extends javax.swing.JFrame {
    static final private Logger LOGGER = Logger.getLogger("mx.com.hash.pruebaxml.PruebaXML");
    int cobro;
     String Token;
     String Usuario;
     String NI; //"000044653948";
     String grantotal;
     String TotalLetras;
     int IdNitCliente;
     int validarnit;
     int id_orden;
     String serie;
     String numero;
     String autoriza;
     String FechaCerti;
     int impresion = 0;
    /**
     * Creates new form CobroET
     */
    public CobroFacturacion(double a,int b) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
        }
        initComponents();
        setLocationRelativeTo(null);
        String texto1 = "<html><center><body>TARJETA<br>EFECTIVO / TRANSFERENCIA</body></center></html>";
        TYE.setText(texto1);
        CantEfectivo.setEditable(false);
        Canttarjeta.setEditable(false);
        total.setText(String.valueOf(a));
        Orden.setText(String.valueOf(b));
        TokenLocal();
        sumaTotal();
        
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
        
        if(impresion ==1){
        imprimirCobrodividido();
        Ordenes F = new Ordenes();
        F.setVisible(true);
        this.dispose();}else{}
        
        
 }
    
    private void cobrarOrdenETT(){
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
        
       if(impresion ==1){
        imprimirCobrodividido();
        Ordenes F = new Ordenes();
        F.setVisible(true);
        this.dispose();}
        
        
 }
    
    /* private void imprimir(){
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
    }*/
     
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Orden = new javax.swing.JTextField();
        total = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Canttarjeta = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CantEfectivo = new javax.swing.JTextField();
        Tarjeta = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Efectivo = new javax.swing.JButton();
        TYE = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        nit = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        facturar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(153, 255, 204));
        jPanel1.setForeground(new java.awt.Color(153, 255, 204));

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

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(153, 255, 204));

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Tarjeta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Tarjeta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/visa.png"))); // NOI18N
        Tarjeta.setText("TARJETA");
        Tarjeta.setPreferredSize(new java.awt.Dimension(108, 45));
        Tarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TarjetaActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/transferencia-movil peque.png"))); // NOI18N
        jButton1.setText("TRANSFERENCIA");
        jButton1.setPreferredSize(new java.awt.Dimension(75, 45));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Efectivo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Efectivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/efectivo.png"))); // NOI18N
        Efectivo.setText("EFECTIVO");
        Efectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EfectivoActionPerformed(evt);
            }
        });

        TYE.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TYE.setText("TYE");
        TYE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TYEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Efectivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Tarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TYE, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Tarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Efectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TYE, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setText("NIT");
        jButton2.setPreferredSize(new java.awt.Dimension(72, 39));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jButton3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton3.setText("CF");
        jButton3.setPreferredSize(new java.awt.Dimension(72, 39));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jButton4.setPreferredSize(new java.awt.Dimension(72, 39));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        nit.setEditable(false);
        nit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nitActionPerformed(evt);
            }
        });
        nit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nitKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("NIT");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("NOMBRE");

        nombre.setEditable(false);
        nombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(nit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                        .addComponent(nombre, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(17, 17, 17))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        facturar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        facturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/unnamed (2).png"))); // NOI18N
        facturar.setText("FACTURAR");
        facturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facturarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Orden, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(295, 295, 295)
                .addComponent(facturar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Orden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(facturar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
       facturar.requestFocus();
    }//GEN-LAST:event_CanttarjetaActionPerformed

    private void CantEfectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CantEfectivoActionPerformed
        facturar.requestFocus();
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

    private void facturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facturarActionPerformed
       if(cobro > 0){
        if(cobro == 3){
            if(Double.parseDouble(Canttarjeta.getText())>0 && Double.parseDouble(CantEfectivo.getText())>0){  crearXMLAngels();Certificar(); cobrarOrdenET();}
            else{JOptionPane.showMessageDialog(null, "EL COBRO TIENE QUE ESTAR DIVIDIDO");}
        }else{
            
         if(cobro ==4){crearXMLAngels();Certificar();cobrarOrdenETT();}else{crearXMLAngels(); Certificar(); cobrarOrdenET();}
        }
       }else{JOptionPane.showMessageDialog(null, "SELECCIONAR UN METODO DE PAGO");}
    }//GEN-LAST:event_facturarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       cobro = 4;
       CantEfectivo.setText("0.00");
       Canttarjeta.setText("");
       Canttarjeta.setText(total.getText());
       Canttarjeta.requestFocus();
       CantEfectivo.setEditable(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        nit.setText("");
        nombre.setText("");
        nit.setEditable(true);
        nit.requestFocus();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        nit.setText("CF");
        nombre.setText("CONSUMIDOR FINAL");
        IdNitCliente = 1;
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        impresion = 1;
        if(cobro > 0){
        if(cobro == 3){
            if(Double.parseDouble(Canttarjeta.getText())>0 && Double.parseDouble(CantEfectivo.getText())>0){cobrarOrdenET();}
            else{JOptionPane.showMessageDialog(null, "EL COBRO TIENE QUE ESTAR DIVIDIDO");}
        }else{
            
         if(cobro ==4){cobrarOrdenETT();}else{   
        cobrarOrdenET();}
        }
       }else{JOptionPane.showMessageDialog(null, "SELECCIONAR UN METODO DE PAGO");}
    }//GEN-LAST:event_jButton4ActionPerformed

    private void nitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nitActionPerformed
        NitValidar();
        
        if(validarnit==1){
            NitLocal();
            facturar.requestFocus();
        }else{
            Obtenernit();
        }

    }//GEN-LAST:event_nitActionPerformed

    private void nitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nitKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9') && (c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c !='ñ') && (c !='Ñ')) {
            evt.consume();
        }
    }//GEN-LAST:event_nitKeyTyped

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
            java.util.logging.Logger.getLogger(CobroFacturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CobroFacturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CobroFacturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CobroFacturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new CobroET().setVisible(true);
            }
        });
    }
    
    
     public void InsertarDatosComprador(){
    
     try {
            
            ObtenerProductosFactura p = new ObtenerProductosFactura();
            p.setNit(nit.getText());
            p.setNombre(nombre.getText());
            ObtenerProductosFactura.InsertarNit(p);
            IdNitCliente = p.getIdNit();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
     
     
   public void InsertarDatosFEL(){
    
     try {
            //serie,numero,autorizacion,fechacertificacion,id_pedido,idNit
            ObtenerProductosFactura p = new ObtenerProductosFactura();
            p.setSerie(serie);
            p.setNumero(numero);
            p.setAutorizacion(autoriza);
            p.setFechaCertifica(FechaCerti);
            p.setId_pedido(Integer.parseInt(Orden.getText()));
            p.setIdNit(IdNitCliente);
            ObtenerProductosFactura.InsertarFEL(p);
            imprimirFel();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }  

     public  void TokenLocal() {
      //  DecimalFormat df = new DecimalFormat("#.00");
            try {
                BDConexion conecta = new BDConexion();
                Connection cn = conecta.getConexion();
                java.sql.Statement stmt = cn.createStatement();
                ResultSet rs = stmt.executeQuery("select token  from TOKEN where idToken = 1");
                while (rs.next()) {
                      Token = rs.getString("token");
                      //Usuario = rs.getString("usuario");
                }
                rs.close();
                stmt.close();
                cn.close();
            } catch (Exception error) {
                System.out.print(error);
            }
        }
    
    
    public  void NitLocal() {
      //  DecimalFormat df = new DecimalFormat("#.00");
            try {
                 BDConexion conecta = new BDConexion();
                Connection cn = conecta.getConexion();
                java.sql.Statement stmt = cn.createStatement();
                ResultSet rs = stmt.executeQuery("select nombre,idNit from compradornit where nit ='"+nit.getText()+"'");
                while (rs.next()) {
                       nombre.setText(rs.getString("nombre"));
                       IdNitCliente = rs.getInt("idNit");
                }
                rs.close();
                stmt.close();
                cn.close();
            } catch (Exception error) {
                System.out.print(error);
            }
        }
    
    public  void NitValidar() {
      //  DecimalFormat df = new DecimalFormat("#.00");
            try {
                BDConexion conecta = new BDConexion();
                Connection cn = conecta.getConexion();
                java.sql.Statement stmt = cn.createStatement();
                ResultSet rs = stmt.executeQuery("select count(nit) from compradornit where nit ='"+nit.getText()+"'");
                while (rs.next()) {
                    validarnit = rs.getInt(1);
                }
                rs.close();
                stmt.close();
                cn.close();
            } catch (Exception error) {
                System.out.print(error);
            }
        }
    
    
    public  void sumaTotal() {
      //  DecimalFormat df = new DecimalFormat("#.00");
            try {
                 BDConexion conecta = new BDConexion();
                Connection cn = conecta.getConexion();
                java.sql.Statement stmt = cn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT sum(total) as Total FROM ventas where NOORDEN =" + Orden.getText());
                while (rs.next()) {
                      grantotal = rs.getString(1);
                      total.setText(grantotal);
                }
                rs.close();
                stmt.close();
                cn.close();
            } catch (Exception error) {
                System.out.print("ERROR DE SUMA TOTAL"+error);
            }
        }
    
    
    private void Obtenernit(){
        
     
   RestApiClient apiClient = new RestApiClient();
        
        try {
            String apiKey = "TAXID=000120011662&DATA1=SHARED_GETINFONITcom&DATA2=NIT%7C"+nit.getText()+"&COUNTRY=GT&USERNAME=120011662";
            String accessToken = Token;
            String response = apiClient.get( apiKey, accessToken);
            JSONObject  jsonObject = new JSONObject(response);
            JSONArray arrayObject = (JSONArray) jsonObject.get("RESPONSE");
             for (int i = 0; i < arrayObject.length(); i++) {
                if (i == 0) {
            JSONObject object2 = (JSONObject) arrayObject.get(i);
                  NI = object2.get("NOMBRE").toString();
                  String nombrev = object2.get("NOMBRE").toString();
                  String nitv = object2.get("NIT").toString();
            nombre.setText(nombrev);
            nit.setText(nitv);
                }
             }
             if(NI.equalsIgnoreCase(""))
             {JOptionPane.showMessageDialog(null, "NIT INGRESADO ES INCORRECTO");
             nombre.setText("");
             nit.setText("");
             nit.requestFocus();
             }
             else{ InsertarDatosComprador(); facturar.requestFocus();}
   
   }    catch (IOException ex) {
            Logger.getLogger(CobroFacturacion.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
    
    private void Certificar(){
    FELclas apiClient = new FELclas();
        
        try {
            String apiKey = "TAXID=000120011662&FORMAT=''&USERNAME=120011662";//NIT DE NEGOCIO y USUARIO QUE DE DIGIFAC
            String accessToken = Token;
            //System.out.println("Token = "+Token);
            String response = apiClient.get(apiKey, accessToken);
            JSONObject  jsonObject = new JSONObject(response);
            JSONObject object2 = (jsonObject); 
            //System.out.println("JSON = "+jsonObject);
            autoriza = object2.get("authNumber").toString();
            serie = object2.get("batch").toString();
            numero = object2.get("serial").toString();
            FechaCerti = object2.get("enrolledTimeStamp").toString();
            InsertarDatosFEL();
            //String autorizacion.setText(auto);
            //lote.setText(lot);
            //seriee.setText(serie);
           // fechaout.setText(fecha);
            //System.out.println("No. Autorizacion = "+autoriza);
            //System.out.println("No. Lote = "+numero);
            //System.out.println("No. Serie = "+serie);
            //System.out.println("Fecha = "+FechaCerti);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "ERROR DE COMUNICACION PARA EMITIR LA FACTURA INTENTAR DE NUEVO");
        }
        
    }
    
    private void crearXMLAngels(){
        
        NumeroLetras NumLetra  = new NumeroLetras();
        String numero = total.getText();
        TotalLetras =  (NumLetra .Convertir(numero,true));
    
         try {
             CrearXML_Angels ejemploXML = new CrearXML_Angels(nombre.getText(),nit.getText(),Orden.getText(),grantotal,TotalLetras);
            Document documento = ejemploXML.crearDocumento();
            
            //System.out.println(ejemploXML.convertirString(documento));
            
            ejemploXML.escribirArchivo(documento, "C:\\Reportes\\XMLFel.xml");            
            
        } catch (ParserConfigurationException ex) {
            LOGGER.log(Level.SEVERE, "Error de configuracion");
            LOGGER.log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            LOGGER.log(Level.SEVERE, "Error de transformacion XML a String");
            LOGGER.log(Level.SEVERE, null, ex);
        }
    }
    
  

    private void imprimirFel(){
     id_orden = Integer.parseInt(Orden.getText());
      BDConexion con= new BDConexion();
      Connection conexion= con.getConexion();
        try {
            JasperReport jasperReport=(JasperReport)JRLoader.loadObjectFromFile("C:\\Reportes\\ANGELS\\FELAngels.jasper");
            Map parametros= new HashMap();
            parametros.put("ID_ORDEN", id_orden);
            JasperPrint print = JasperFillManager.fillReport(jasperReport,parametros, conexion);
            JasperPrintManager.printReport(print, true);
        } catch (Exception e) {System.out.println("F"+e);
           JOptionPane.showMessageDialog(null, "ERROR EJECUTAR REPORTES =  "+e);
        }
        Ordenes F = new Ordenes();
        F.setVisible(true);
        this.dispose();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CantEfectivo;
    private javax.swing.JTextField Canttarjeta;
    private javax.swing.JButton Efectivo;
    private javax.swing.JTextField Orden;
    private javax.swing.JButton TYE;
    private javax.swing.JButton Tarjeta;
    private javax.swing.JButton facturar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField nit;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}
