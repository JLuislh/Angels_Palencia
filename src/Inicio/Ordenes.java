/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Inicio;

import AdministradorAngels.Contraseña;
import BDclass.BDConexion;
import BDclass.BDOrdenes;
import ClassAngels.OrdenesClass;
import FELclass.Token;
import Pedidos.AceptarPedido;
import Pedidos.InicioPedido;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
//import com.mysql.cj.xdevapi.Client;
//mport jakarta.ws.rs.client.ClientBuilder;
//import jakarta.ws.rs.client.Entity;
//import jakarta.ws.rs.client.Invocation;
//import jakarta.ws.rs.client.WebTarget;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
//import okhttp3.Response;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;


/**
 *
 * @author jluis
 */
public class Ordenes extends javax.swing.JFrame {
   int noorden;
    String Token;
    String FechaExp;
    /**
     * Creates new form Ordenes
     */
    public Ordenes() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
        }
        initComponents();
        //token();
        imagen();
        setLocationRelativeTo(null);
        String texto1 = "<html><center><body>NUEVA ORDEN<br>PARA LLEVAR</body></center></html>";
        llevar.setText(texto1);
        String texto2 = "<html><center><body>REALIZAR<br>PEDIDO</body></center></html>";
        jLabel5.setText(texto2);
        String texto3 = "<html><center><body>ACEPTAR<br>PEDIDO</body></center></html>";
        jLabel6.setText(texto3);
        /*String texto2 = "<html><center><body>PEDIDO<br>PRODUCTO</body></center></html>";
        PRODUCTO.setText(texto2);
        /* String texto2 = "<html><center><body>BEBIDAS<br>SIN LICOR</body></center></html>";
        T3.setText(texto2);*/
    }
    
    public void crear() {

        try {

            OrdenesClass p = new OrdenesClass();
            BDOrdenes.InsertarPedido(p);
            noorden = p.getIdregresoPedido();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        //System.out.println("ID ="+id_pedido);
      

    }
    
    private void imagen() {

        try {
            ImageIcon imgIcon = new ImageIcon(getClass().getResource("/Iconos/angels.png"));
            Image imgEscalada = imgIcon.getImage().getScaledInstance(imagen.getWidth(),
                    imagen.getHeight(), Image.SCALE_SMOOTH);
            Icon iconoEscalado = new ImageIcon(imgEscalada);
            imagen.setIcon(iconoEscalado);
        } catch (Exception e) {
            
            System.out.println("ERRROR IMAGEN "+e);
            JOptionPane.showMessageDialog(null, "ERROR + "+e);
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

        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        NEWORDER = new ClassAngels.PanelRound();
        nueva = new javax.swing.JLabel();
        MESAS = new ClassAngels.PanelRound();
        jLabel3 = new javax.swing.JLabel();
        ADMINISTRAR = new ClassAngels.PanelRound();
        jLabel2 = new javax.swing.JLabel();
        NUEVAPARALLEVAR = new ClassAngels.PanelRound();
        llevar = new javax.swing.JLabel();
        imagen = new javax.swing.JLabel();
        GASTOS = new ClassAngels.PanelRound();
        jLabel4 = new javax.swing.JLabel();
        PEDIDO = new ClassAngels.PanelRound();
        jLabel5 = new javax.swing.JLabel();
        RECIBIR = new ClassAngels.PanelRound();
        jLabel6 = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1060, 643));

        NEWORDER.setBackground(new java.awt.Color(153, 255, 153));
        NEWORDER.setRoundBottomLeft(20);
        NEWORDER.setRoundBottomRight(20);
        NEWORDER.setRoundTopLeft(20);
        NEWORDER.setRoundTopRight(20);

        nueva.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nueva.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nueva.setText("NUEVA ORDEN");
        nueva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nuevaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout NEWORDERLayout = new javax.swing.GroupLayout(NEWORDER);
        NEWORDER.setLayout(NEWORDERLayout);
        NEWORDERLayout.setHorizontalGroup(
            NEWORDERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nueva, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
        );
        NEWORDERLayout.setVerticalGroup(
            NEWORDERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nueva, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
        );

        MESAS.setBackground(new java.awt.Color(153, 255, 153));
        MESAS.setPreferredSize(new java.awt.Dimension(201, 83));
        MESAS.setRoundBottomLeft(20);
        MESAS.setRoundBottomRight(20);
        MESAS.setRoundTopLeft(20);
        MESAS.setRoundTopRight(20);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("MESAS");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MESASLayout = new javax.swing.GroupLayout(MESAS);
        MESAS.setLayout(MESASLayout);
        MESASLayout.setHorizontalGroup(
            MESASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
        );
        MESASLayout.setVerticalGroup(
            MESASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
        );

        ADMINISTRAR.setBackground(new java.awt.Color(153, 255, 153));
        ADMINISTRAR.setPreferredSize(new java.awt.Dimension(201, 49));
        ADMINISTRAR.setRoundBottomLeft(20);
        ADMINISTRAR.setRoundBottomRight(20);
        ADMINISTRAR.setRoundTopLeft(20);
        ADMINISTRAR.setRoundTopRight(20);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ADMINISTRAR");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ADMINISTRARLayout = new javax.swing.GroupLayout(ADMINISTRAR);
        ADMINISTRAR.setLayout(ADMINISTRARLayout);
        ADMINISTRARLayout.setHorizontalGroup(
            ADMINISTRARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
        );
        ADMINISTRARLayout.setVerticalGroup(
            ADMINISTRARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        NUEVAPARALLEVAR.setBackground(new java.awt.Color(153, 255, 153));
        NUEVAPARALLEVAR.setPreferredSize(new java.awt.Dimension(201, 83));
        NUEVAPARALLEVAR.setRoundBottomLeft(20);
        NUEVAPARALLEVAR.setRoundBottomRight(20);
        NUEVAPARALLEVAR.setRoundTopLeft(20);
        NUEVAPARALLEVAR.setRoundTopRight(20);

        llevar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        llevar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        llevar.setText("NUEVA ORDEN");
        llevar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                llevarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout NUEVAPARALLEVARLayout = new javax.swing.GroupLayout(NUEVAPARALLEVAR);
        NUEVAPARALLEVAR.setLayout(NUEVAPARALLEVARLayout);
        NUEVAPARALLEVARLayout.setHorizontalGroup(
            NUEVAPARALLEVARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(llevar, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
        );
        NUEVAPARALLEVARLayout.setVerticalGroup(
            NUEVAPARALLEVARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(llevar, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
        );

        imagen.setText("jLabel1");

        GASTOS.setBackground(new java.awt.Color(153, 255, 153));
        GASTOS.setPreferredSize(new java.awt.Dimension(201, 49));
        GASTOS.setRoundBottomLeft(20);
        GASTOS.setRoundBottomRight(20);
        GASTOS.setRoundTopLeft(20);
        GASTOS.setRoundTopRight(20);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("GASTOS");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout GASTOSLayout = new javax.swing.GroupLayout(GASTOS);
        GASTOS.setLayout(GASTOSLayout);
        GASTOSLayout.setHorizontalGroup(
            GASTOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        GASTOSLayout.setVerticalGroup(
            GASTOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        PEDIDO.setBackground(new java.awt.Color(153, 255, 153));
        PEDIDO.setPreferredSize(new java.awt.Dimension(98, 49));
        PEDIDO.setRoundBottomLeft(20);
        PEDIDO.setRoundBottomRight(20);
        PEDIDO.setRoundTopLeft(20);
        PEDIDO.setRoundTopRight(20);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("PEDIDO");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PEDIDOLayout = new javax.swing.GroupLayout(PEDIDO);
        PEDIDO.setLayout(PEDIDOLayout);
        PEDIDOLayout.setHorizontalGroup(
            PEDIDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
        );
        PEDIDOLayout.setVerticalGroup(
            PEDIDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        RECIBIR.setBackground(new java.awt.Color(153, 255, 153));
        RECIBIR.setPreferredSize(new java.awt.Dimension(98, 49));
        RECIBIR.setRoundBottomLeft(20);
        RECIBIR.setRoundBottomRight(20);
        RECIBIR.setRoundTopLeft(20);
        RECIBIR.setRoundTopRight(20);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ACEPTAR");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout RECIBIRLayout = new javax.swing.GroupLayout(RECIBIR);
        RECIBIR.setLayout(RECIBIRLayout);
        RECIBIRLayout.setHorizontalGroup(
            RECIBIRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
        );
        RECIBIRLayout.setVerticalGroup(
            RECIBIRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NUEVAPARALLEVAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NEWORDER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MESAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 342, Short.MAX_VALUE)
                        .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(PEDIDO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RECIBIR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ADMINISTRAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(GASTOS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(NEWORDER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(MESAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(NUEVAPARALLEVAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RECIBIR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PEDIDO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GASTOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ADMINISTRAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nuevaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevaMouseClicked
       crear();
         Mesas F = new Mesas(noorden);
         F.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_nuevaMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
       MesasSeguimiento F = new MesasSeguimiento();
        F.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void llevarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_llevarMouseClicked
        crear();
        MenuParaLlevar F = new MenuParaLlevar(noorden);
        F.setVisible(true);
        this.dispose(); 
        
    }//GEN-LAST:event_llevarMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        Contraseña F = new Contraseña();
        F.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        Gastos F = new Gastos();
        F.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        InicioPedido F = new InicioPedido();
        F.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        AceptarPedido F = new AceptarPedido();
        F.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

      private void token(){
         // System.out.println("llega token");
       String res = "";
       //String URL = "https://felgttestaws.digifact.com.gt/gt.com.apinuc/api/login/get_token";
       String URL = "https://felgtaws.digifact.com.gt/gt.com.apinuc/api/login/get_token";
        
        try {
            Client client = ClientBuilder.newClient();
            WebTarget target = client.target(URL );
            Invocation.Builder solicitud = target.request();
            Token req = new Token();
            req.setUsername("GT.000120011662.120011662");//NIT EMPRESA y USUARIO DIGIFAC
            req.setPassword("Factur4$Fel");//CONTRASEÑA DIGIFAC
            Gson gson = new Gson();
            String jsonString = gson.toJson(req);
            Response post = solicitud.post(Entity.json(jsonString));
            String resJson = post.readEntity(String.class);
            res = resJson;
            String fichero = "";
            fichero = resJson;
            Properties properties = gson.fromJson(fichero, Properties.class);
            Token = (String) properties.get("Token");
            FechaExp = (String) properties.get("expira_en");
        } catch (JsonSyntaxException e) {
            System.out.println("ERROR" );res = e.toString();
        }
    
        BDConexion conecta = new BDConexion();
        Connection con = conecta.getConexion();
        PreparedStatement sm = null;
        try {
            sm = con.prepareStatement("update token set Token = '"+Token+"',fecha = '"+FechaExp+"' where idToken = 1");
            sm.executeUpdate();
            con.close();
            sm.close();
        } catch (SQLException ex) {
            System.out.println("ERROR =" + ex);
        }
    }
    
    
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
            java.util.logging.Logger.getLogger(Ordenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ordenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ordenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ordenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ordenes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ClassAngels.PanelRound ADMINISTRAR;
    private ClassAngels.PanelRound GASTOS;
    private ClassAngels.PanelRound MESAS;
    private ClassAngels.PanelRound NEWORDER;
    private ClassAngels.PanelRound NUEVAPARALLEVAR;
    private ClassAngels.PanelRound PEDIDO;
    private ClassAngels.PanelRound RECIBIR;
    private javax.swing.JLabel imagen;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JLabel llevar;
    private javax.swing.JLabel nueva;
    // End of variables declaration//GEN-END:variables
}
