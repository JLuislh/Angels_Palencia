/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Inicio;

import BDclass.BDConexion;
import BDclass.BDOrdenes;
import ClassAngels.InsertarProducto;
import ClassAngels.TextAreaRenderer;
import FEL.CobroFacturacion;
import SubPanelesSantaInes.BebidasSinAlcohol;
import SubPanelesSantaInes.Botellas;
import SubPanelesSantaInes.CaldosAntojos;
import SubPanelesSantaInes.Ceviches;
import SubPanelesSantaInes.ConAlcohol;
import SubPanelesSantaInes.Extras;
import SubPanelesSantaInes.Hamburguesas;
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
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
public class MenuSeguimiento extends javax.swing.JFrame {
     public static int noorden;
     int nomesa;
     int tipomenu = 1;
     int ordendia;
     String Query;
    /**
     * Creates new form Menu
     * @param a
     * @param b
     */
    public MenuSeguimiento(int a,int b) {
        initComponents();
        setLocationRelativeTo(null);
        this.nomesa = b;
        MenuSeguimiento.noorden = a;
        BuscarOrdenDia();
        Ordentxt.setText(String.valueOf(ordendia));
        mesatxt.setText(String.valueOf(b));
        String texto7 = "<html><center><body>CALDOS<br>PAL ANTOJO</body></center></html>";
        Titulo1.setText(texto7);
        String texto1 = "<html><center><body>HAMBURGUEZAS<br>FUERA DEL MAR</body></center></html>";
        Titulo2.setText(texto1);
        String texto2 = "<html><center><body>AMANTES DEL CEVICHE<br>SABORES DEL MAR</body></center></html>";
        Titulo3.setText(texto2);
        String texto3 = "<html><center><body>BEBIDAS<br>BEBIDAS PREPARADAS</body></center></html>";
        Titulo4.setText(texto3);
        String texto4 = "<html><center><body>CERVEZAS<br>DRINKS</body></center></html>";
        Titulo5.setText(texto4);
        String texto5 = "<html><center><body>BOTELLAS</body></center></html>";
        Titulo6.setText(texto5);
        String texto6 = "<html><center><body>EXTRAS<br>MICHELADAS</body></center></html>";
        Titulo8.setText(texto6);
        ListarProductosPedidos();
    }
    
    
    private void BuscarOrdenDia() {
            try {
                BDConexion conecta = new BDConexion();
                Connection cn = conecta.getConexion();
                java.sql.Statement stmt = cn.createStatement();
                ResultSet rs = stmt.executeQuery("select ordendia  from ordenes where date_format(fecha,'%d/%m/%Y') = date_format(now(),'%d/%m/%Y') and NOORDEN = "+noorden);
                while (rs.next()) {
                      ordendia = (rs.getInt(1));
                }
                rs.close();
                stmt.close();
                cn.close();
            } catch (Exception error) {
                System.out.print(error);
            }
            System.out.println("ORDEN = "+ordendia+" NO"+noorden);
        }
    
    private void cobrarOrdenyCerrar(){
        try {
            BDConexion conecta = new BDConexion();
            Connection con = conecta.getConexion();
            PreparedStatement ps = null;
            PreparedStatement p = null;
            ps= con.prepareStatement("UPDATE ORDENES SET TOTAL = "+Total.getText()+" where noorden="+noorden);
            p = con.prepareStatement("UPDATE MESAS SET ESTADO = 1 WHERE id_mesa =" + nomesa);
            ps.executeUpdate();
            p.executeUpdate();
            con.close();
            ps.close();
            p.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"ERROr = "+ex);
        }
 }
    
    private void Totalizar(){
        try {
            BDConexion conecta = new BDConexion();
            Connection con = conecta.getConexion();
            PreparedStatement ps = null;
            ps= con.prepareStatement("UPDATE ORDENES SET TOTAL = "+Total.getText()+" where noorden="+noorden);
            ps.executeUpdate();
            con.close();
            ps.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"ERROr = "+ex);
        }
 }
       
    
    /* private void descargarInventario(){
     
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
     
     }*/
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Menu1 = new ClassAngels.PanelRound();
        Titulo1 = new javax.swing.JLabel();
        Menu2 = new ClassAngels.PanelRound();
        Titulo2 = new javax.swing.JLabel();
        Menu3 = new ClassAngels.PanelRound();
        Titulo3 = new javax.swing.JLabel();
        Menu4 = new ClassAngels.PanelRound();
        Titulo4 = new javax.swing.JLabel();
        Menu5 = new ClassAngels.PanelRound();
        Titulo5 = new javax.swing.JLabel();
        Menu6 = new ClassAngels.PanelRound();
        Titulo6 = new javax.swing.JLabel();
        Menu7 = new ClassAngels.PanelRound();
        Titulo8 = new javax.swing.JLabel();
        Menu8 = new ClassAngels.PanelRound();
        Titulo7 = new javax.swing.JLabel();
        PanelMenu = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Ordentxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        mesatxt = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Total = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Pedidos = new javax.swing.JTable();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1010, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 680));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setPreferredSize(new java.awt.Dimension(1024, 50));

        Menu1.setBackground(new java.awt.Color(255, 204, 153));
        Menu1.setPreferredSize(new java.awt.Dimension(110, 50));
        Menu1.setRoundTopLeft(20);
        Menu1.setRoundTopRight(20);

        Titulo1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Titulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo1.setText("CALDOS / PAL ANTOJO");
        Titulo1.setPreferredSize(new java.awt.Dimension(110, 50));
        Titulo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Titulo1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Menu1Layout = new javax.swing.GroupLayout(Menu1);
        Menu1.setLayout(Menu1Layout);
        Menu1Layout.setHorizontalGroup(
            Menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu1Layout.createSequentialGroup()
                .addComponent(Titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Menu1Layout.setVerticalGroup(
            Menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Titulo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Menu2.setBackground(new java.awt.Color(204, 204, 255));
        Menu2.setPreferredSize(new java.awt.Dimension(110, 50));
        Menu2.setRoundTopLeft(20);
        Menu2.setRoundTopRight(20);

        Titulo2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Titulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo2.setText("Hamburguesas / Feura Mar");
        Titulo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Titulo2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Menu2Layout = new javax.swing.GroupLayout(Menu2);
        Menu2.setLayout(Menu2Layout);
        Menu2Layout.setHorizontalGroup(
            Menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Titulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, Short.MAX_VALUE)
        );
        Menu2Layout.setVerticalGroup(
            Menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Titulo2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        Menu3.setBackground(new java.awt.Color(0, 204, 204));
        Menu3.setPreferredSize(new java.awt.Dimension(110, 50));
        Menu3.setRoundTopLeft(20);
        Menu3.setRoundTopRight(20);

        Titulo3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Titulo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo3.setText("CEVICHES");
        Titulo3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Titulo3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Menu3Layout = new javax.swing.GroupLayout(Menu3);
        Menu3.setLayout(Menu3Layout);
        Menu3Layout.setHorizontalGroup(
            Menu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Titulo3, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        Menu3Layout.setVerticalGroup(
            Menu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Titulo3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        Menu4.setBackground(new java.awt.Color(153, 255, 204));
        Menu4.setPreferredSize(new java.awt.Dimension(110, 50));
        Menu4.setRoundTopLeft(20);
        Menu4.setRoundTopRight(20);

        Titulo4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Titulo4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo4.setText("SIN ALCOHOL");
        Titulo4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Titulo4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Menu4Layout = new javax.swing.GroupLayout(Menu4);
        Menu4.setLayout(Menu4Layout);
        Menu4Layout.setHorizontalGroup(
            Menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Titulo4, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        Menu4Layout.setVerticalGroup(
            Menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Titulo4, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        Menu5.setBackground(new java.awt.Color(204, 204, 204));
        Menu5.setPreferredSize(new java.awt.Dimension(110, 50));
        Menu5.setRoundTopLeft(20);
        Menu5.setRoundTopRight(20);

        Titulo5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Titulo5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo5.setText("CON ALCOHOL");
        Titulo5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Titulo5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Menu5Layout = new javax.swing.GroupLayout(Menu5);
        Menu5.setLayout(Menu5Layout);
        Menu5Layout.setHorizontalGroup(
            Menu5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Titulo5, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        Menu5Layout.setVerticalGroup(
            Menu5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Titulo5, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        Menu6.setBackground(new java.awt.Color(51, 153, 255));
        Menu6.setPreferredSize(new java.awt.Dimension(110, 50));
        Menu6.setRoundTopLeft(20);
        Menu6.setRoundTopRight(20);

        Titulo6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Titulo6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo6.setText("BOTELLAS");
        Titulo6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Titulo6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Menu6Layout = new javax.swing.GroupLayout(Menu6);
        Menu6.setLayout(Menu6Layout);
        Menu6Layout.setHorizontalGroup(
            Menu6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Titulo6, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        Menu6Layout.setVerticalGroup(
            Menu6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Titulo6, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        Menu7.setBackground(new java.awt.Color(255, 204, 102));
        Menu7.setPreferredSize(new java.awt.Dimension(110, 50));
        Menu7.setRoundTopLeft(20);
        Menu7.setRoundTopRight(20);

        Titulo8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Titulo8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo8.setText("EXTRAS");
        Titulo8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Titulo8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Menu7Layout = new javax.swing.GroupLayout(Menu7);
        Menu7.setLayout(Menu7Layout);
        Menu7Layout.setHorizontalGroup(
            Menu7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Titulo8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        Menu7Layout.setVerticalGroup(
            Menu7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Titulo8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        Menu8.setBackground(new java.awt.Color(204, 204, 0));
        Menu8.setPreferredSize(new java.awt.Dimension(110, 50));
        Menu8.setRoundTopLeft(20);
        Menu8.setRoundTopRight(20);

        Titulo7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Titulo7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Back.png"))); // NOI18N
        Titulo7.setText("INICIO");
        Titulo7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Titulo7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Menu8Layout = new javax.swing.GroupLayout(Menu8);
        Menu8.setLayout(Menu8Layout);
        Menu8Layout.setHorizontalGroup(
            Menu8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Titulo7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        Menu8Layout.setVerticalGroup(
            Menu8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Titulo7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Menu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Menu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Menu3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Menu4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Menu5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Menu6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Menu7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Menu8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Menu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Menu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Menu3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Menu5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Menu4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Menu6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Menu7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Menu8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        PanelMenu.setBackground(new java.awt.Color(255, 255, 255));
        PanelMenu.setPreferredSize(new java.awt.Dimension(1024, 440));

        javax.swing.GroupLayout PanelMenuLayout = new javax.swing.GroupLayout(PanelMenu);
        PanelMenu.setLayout(PanelMenuLayout);
        PanelMenuLayout.setHorizontalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1024, Short.MAX_VALUE)
        );
        PanelMenuLayout.setVerticalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        jPanel1.add(PanelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        jPanel6.setBackground(new java.awt.Color(153, 204, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(284, 210));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText(" NO. ORDEN");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText(" NO. MESA");

        jButton2.setBackground(new java.awt.Color(102, 255, 102));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Dollar.png"))); // NOI18N
        jButton2.setText("COBRAR");
        jButton2.setPreferredSize(new java.awt.Dimension(75, 25));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 153));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Print.png"))); // NOI18N
        jButton3.setText("PRE CUENTA");
        jButton3.setPreferredSize(new java.awt.Dimension(75, 25));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 153));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Print.png"))); // NOI18N
        jButton4.setText("AGREGAR");
        jButton4.setPreferredSize(new java.awt.Dimension(75, 25));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("TOTAL");

        Total.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Total.setForeground(new java.awt.Color(255, 0, 0));
        Total.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 27, Short.MAX_VALUE)
                        .addComponent(Total, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mesatxt, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(Ordentxt))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(4, 4, 4)
                        .addComponent(Ordentxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(mesatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 490, 410, 190));

        Pedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CANTIDAD", "DESCRIPCION", "PRECIO", "TOTAL"
            }
        ));
        jScrollPane1.setViewportView(Pedidos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 620, 190));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void ListarProductosPedidos(){
        ArrayList<InsertarProducto> result = BDOrdenes.ListarProductosPedidos(noorden);
        RecargarTabla(result);  
        System.out.println("llega1");
    }
     public static void RecargarTabla(ArrayList<InsertarProducto> list) {
         DecimalFormat df = new DecimalFormat("#.00");
         System.out.println("llega2");
              Object[][] datos = new Object[list.size()][4];
              int i = 0;
              for(InsertarProducto t : list)
              {
                  datos[i][0] = t.getCantidad();
                  datos[i][1] = t.getDescripcion();
                  datos[i][2] = df.format(t.getPrecio());
                  datos[i][3] = df.format(t.getTotal());
                  i++;
              }    
             Pedidos.setModel(new javax.swing.table.DefaultTableModel(
                datos,
                new String[]{
                "CANTIDAD","DESCRIPCION","PRECIO","TOTAL"
             })
             {  
                 @Override
                 public boolean isCellEditable(int row, int column){
                 return false;

             }
             });
             Pedidos.getColumnModel().getColumn(1).setCellRenderer(new TextAreaRenderer());
             TableColumn columna1 = Pedidos.getColumn("CANTIDAD");
             columna1.setPreferredWidth(-20);
             TableColumn columna2 = Pedidos.getColumn("DESCRIPCION");
             columna2.setPreferredWidth(275);
             TableColumn columna3 = Pedidos.getColumn("PRECIO");
             columna3.setPreferredWidth(35);
             TableColumn columna4 = Pedidos.getColumn("TOTAL");
             columna4.setPreferredWidth(55);
             sumaTotal();
     }
    
    
    public static void sumaTotal() {
        DecimalFormat df = new DecimalFormat("#.00");
            try {
                 BDConexion conecta = new BDConexion();
                Connection cn = conecta.getConexion();
                java.sql.Statement stmt = cn.createStatement();
                ResultSet rs = stmt.executeQuery("select truncate(sum(total),2) as Total from ventas where noorden =" + noorden);
                while (rs.next()) {
                     String TOTAL = df.format(rs.getInt(1));
                    Total.setText(String.valueOf(TOTAL));
                }
                rs.close();
                stmt.close();
                cn.close();
            } catch (Exception error) {
                System.out.print(error);
            }
        }


        
    
    private void Titulo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Titulo1MouseClicked
    CaldosAntojos op1 = new CaldosAntojos(noorden,tipomenu);
    op1.setSize(1024, 440);
    op1.setLocation(0, 0);
    PanelMenu.removeAll();
    PanelMenu.add(op1,BorderLayout.CENTER);
    PanelMenu.revalidate();
    PanelMenu.repaint();
    //CambiarBodes();
    //P1.setBorder(BorderFactory.createMatteBorder(0, 0, 10, 0, Color.red));
    }//GEN-LAST:event_Titulo1MouseClicked

    private void Titulo2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Titulo2MouseClicked
    Hamburguesas op1 = new Hamburguesas(noorden,tipomenu);
    op1.setSize(1024, 440);
    op1.setLocation(0, 0);
    PanelMenu.removeAll();
    PanelMenu.add(op1,BorderLayout.CENTER);
    PanelMenu.revalidate();
    PanelMenu.repaint();
    }//GEN-LAST:event_Titulo2MouseClicked

    private void Titulo3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Titulo3MouseClicked
    Ceviches op1 = new Ceviches(noorden,tipomenu);
    op1.setSize(1024, 440);
    op1.setLocation(0, 0);
    PanelMenu.removeAll();
    PanelMenu.add(op1,BorderLayout.CENTER);
    PanelMenu.revalidate();
    PanelMenu.repaint();
    }//GEN-LAST:event_Titulo3MouseClicked

    private void Titulo4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Titulo4MouseClicked
    BebidasSinAlcohol op1 = new BebidasSinAlcohol(noorden,tipomenu);
    op1.setSize(1024, 440);
    op1.setLocation(0, 0);
    PanelMenu.removeAll();
    PanelMenu.add(op1,BorderLayout.CENTER);
    PanelMenu.revalidate();
    PanelMenu.repaint();
    }//GEN-LAST:event_Titulo4MouseClicked

    private void Titulo5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Titulo5MouseClicked
    ConAlcohol op1 = new ConAlcohol(noorden,tipomenu);
    op1.setSize(1024, 440);
    op1.setLocation(0, 0);
    PanelMenu.removeAll();
    PanelMenu.add(op1,BorderLayout.CENTER);
    PanelMenu.revalidate();
    PanelMenu.repaint();
    }//GEN-LAST:event_Titulo5MouseClicked

    private void Titulo6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Titulo6MouseClicked
    Botellas op1 = new Botellas(noorden,tipomenu);
    op1.setSize(1024, 440);
    op1.setLocation(0, 0);
    PanelMenu.removeAll();
    PanelMenu.add(op1,BorderLayout.CENTER);
    PanelMenu.revalidate();
    PanelMenu.repaint();
    }//GEN-LAST:event_Titulo6MouseClicked

    private void Titulo7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Titulo7MouseClicked
           CambiarVentaImprimir();
           Ordenes F = new Ordenes();
           F.setVisible(true);
           this.dispose();

    }//GEN-LAST:event_Titulo7MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Totalizar();
        imprimir();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        int resp=JOptionPane.showConfirmDialog(null,"COBRAR Q."+Total.getText()+" PARA CERRAR ORDEN");
          if (JOptionPane.OK_OPTION == resp){ 
                //descargarInventario();
                CambiarVentaImprimir();
                cobrarOrdenyCerrar();
                CobroET F = new CobroET(Double.parseDouble(Total.getText()),noorden);
                //CobroFacturacion F = new CobroFacturacion(Double.parseDouble(Total.getText()),Integer.parseInt(Ordentxt.getText()));
                F.setVisible(true);
                this.dispose();       
          }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void Titulo8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Titulo8MouseClicked
    Extras op1 = new Extras(noorden,tipomenu);
    op1.setSize(1024, 440);
    op1.setLocation(0, 0);
    PanelMenu.removeAll();
    PanelMenu.add(op1,BorderLayout.CENTER);
    PanelMenu.revalidate();
    PanelMenu.repaint();
    }//GEN-LAST:event_Titulo8MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        imprimirMas();
        CambiarVentaImprimir();
        Ordenes F = new Ordenes();
        F.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuSeguimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuSeguimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuSeguimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuSeguimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new MenuSeguimiento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ClassAngels.PanelRound Menu1;
    private ClassAngels.PanelRound Menu2;
    private ClassAngels.PanelRound Menu3;
    private ClassAngels.PanelRound Menu4;
    private ClassAngels.PanelRound Menu5;
    private ClassAngels.PanelRound Menu6;
    private ClassAngels.PanelRound Menu7;
    private ClassAngels.PanelRound Menu8;
    private javax.swing.JTextField Ordentxt;
    private javax.swing.JPanel PanelMenu;
    public static javax.swing.JTable Pedidos;
    private javax.swing.JLabel Titulo1;
    private javax.swing.JLabel Titulo2;
    private javax.swing.JLabel Titulo3;
    private javax.swing.JLabel Titulo4;
    private javax.swing.JLabel Titulo5;
    private javax.swing.JLabel Titulo6;
    private javax.swing.JLabel Titulo7;
    private javax.swing.JLabel Titulo8;
    public static javax.swing.JTextField Total;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mesatxt;
    // End of variables declaration//GEN-END:variables
 private void imprimir(){
      CambiarVentaImprimir();
      BDConexion con= new BDConexion();
         Connection conexion= con.getConexion();
        try {
            JasperReport jasperReport=(JasperReport)JRLoader.loadObjectFromFile("C:\\Reportes\\ANGELS\\TiketAngelsPreCuenta.jasper");
            Map parametros= new HashMap();
            parametros.put("ID_ORDEN", noorden);
            JasperPrint print = JasperFillManager.fillReport(jasperReport,parametros, conexion);
            JasperPrintManager.printReport(print, true);
        } catch (Exception e) {System.out.println("F"+e);
           JOptionPane.showMessageDialog(null, "ERROR EJECUTAR REPORTES =  "+e);
        }
    }
 
 private void imprimirMas(){
      BDConexion con= new BDConexion();
         Connection conexion= con.getConexion();
        try {
            JasperReport jasperReport=(JasperReport)JRLoader.loadObjectFromFile("C:\\Reportes\\ANGELS\\TiketAngels.jasper");
            Map parametros= new HashMap();
            parametros.put("ID_ORDEN", noorden);
            JasperPrint print = JasperFillManager.fillReport(jasperReport,parametros, conexion);
            JasperPrintManager.printReport(print, true);
        } catch (Exception e) {System.out.println("F"+e);
           JOptionPane.showMessageDialog(null, "ERROR EJECUTAR REPORTES =  "+e);
        }
    }
 
 private void CambiarVentaImprimir(){
        try {
            BDConexion conecta = new BDConexion();
            Connection con = conecta.getConexion();
            PreparedStatement ps = null;
            ps= con.prepareStatement("UPDATE ventas SET estado = 2 where noorden="+noorden);
            ps.executeUpdate();
            con.close();
            ps.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"ERROr = "+ex);
        }
 }
 
}
