/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package SubPanelesSantaInes;

import BDclass.BDConexion;
import BDclass.BDOrdenes;
import ClassAngels.EtiquetasClass;
import ClassAngels.InsertarProducto;
import Inicio.Menu;
import Inicio.MenuParaLlevar;
import Inicio.MenuSeguimiento;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author jluis
 */
public class BebidasSinAlcohol extends javax.swing.JPanel {
 String descripcion1;	String descripcion2_1;	 String Precio1;  int codigo1;
 String descripcion2;	String descripcion2_2;	 String Precio2;  int codigo2;
 String descripcion3;	String descripcion2_3;	 String Precio3;  int codigo3;
 String descripcion4;	String descripcion2_4;	 String Precio4;  int codigo4;
 String descripcion5;	String descripcion2_5;	 String Precio5;  int codigo5;
 String descripcion6;	String descripcion2_6;	 String Precio6;  int codigo6;
 String descripcion7;	String descripcion2_7;	 String Precio7;  int codigo7;
 String descripcion8;	String descripcion2_8;	 String Precio8;  int codigo8;
 String descripcion9;	String descripcion2_9;	 String Precio9;  int codigo9;
 String descripcion10;	String descripcion2_10;	 String Precio10; int codigo10;
 String descripcion11;	String descripcion2_11;	 String Precio11; int codigo11;
 String descripcion12;	String descripcion2_12;	 String Precio12; int codigo12;
 String descripcion13;	String descripcion2_13;	 String Precio13; int codigo13;
 String descripcion14;	String descripcion2_14;	 String Precio14; int codigo14;
 String descripcion15;	String descripcion2_15;	 String Precio15; int codigo15;
 String descripcion16;	String descripcion2_16;	 String Precio16; int codigo16;
 String descripcion17;	String descripcion2_17;	 String Precio17; int codigo17;
 String descripcion18;	String descripcion2_18;	 String Precio18; int codigo18;
 String descripcion19;	String descripcion2_19;	 String Precio19; int codigo19;
 String descripcion20;	String descripcion2_20;	 String Precio20; int codigo20;
 String descripcion21;	String descripcion2_21;	 String Precio21; int codigo21;
 String descripcion22;	String descripcion2_22;	 String Precio22; int codigo22;
 String descripcion23;	String descripcion2_23;	 String Precio23; int codigo23;
 String descripcion24;	String descripcion2_24;	 String Precio24; int codigo24;
 String descripcion25;	String descripcion2_25;	 String Precio25; int codigo25;
 String descripcion26;	String descripcion2_26;	 String Precio26; int codigo26;
 String descripcion27;	String descripcion2_27;	 String Precio27; int codigo27;
 String descripcion28;	String descripcion2_28;	 String Precio28; int codigo28;
 String descripcion29;	String descripcion2_29;	 String Precio29; int codigo29;
 String descripcion30;	String descripcion2_30;	 String Precio30; int codigo30;
 String descripcion31;	String descripcion2_31;	 String Precio31; int codigo31;
 String descripcion32;	String descripcion2_32;	 String Precio32; int codigo32;
 String descripcion33;	String descripcion2_33;	 String Precio33; int codigo33;
 String descripcion34;	String descripcion2_34;	 String Precio34; int codigo34;
 String descripcion35;	String descripcion2_35;	 String Precio35; int codigo35;
 String descripcion36;	String descripcion2_36;	 String Precio36; int codigo36;
 String descripcion37;	String descripcion2_37;	 String Precio37; int codigo37;
 String descripcion38;	String descripcion2_38;	 String Precio38; int codigo38;
 String descripcion39;	String descripcion2_39;	 String Precio39; int codigo39;
 int noorden;
 int codigooreden;
 int existe = 0;
 int tipomenu = 0;
    /**
     * Creates new form BebidasSinAlcohol
     */
    public BebidasSinAlcohol(int a,int b) {
        initComponents();
        nombres();
        Etiquetas();
        this.noorden = a;
        this.tipomenu = b;
    }
     Timer timer = new Timer(300, new ActionListener()
    {
    public void actionPerformed(ActionEvent e)
    { 
       
       Color Original = new Color(204,255,102);
       P1.setBackground(Original);
       P2.setBackground(Original);
       P3.setBackground(Original);
       P4.setBackground(Original);
       P5.setBackground(Original);
       P6.setBackground(Original);
       P7.setBackground(Original);
       P8.setBackground(Original);
       P9.setBackground(Original);
       P10.setBackground(Original);
       P11.setBackground(Original);
       P12.setBackground(Original);
       P13.setBackground(Original);
       P14.setBackground(Original);
       P15.setBackground(Original);
       P16.setBackground(Original);
       P17.setBackground(Original);
       P18.setBackground(Original);
       P19.setBackground(Original);
       P20.setBackground(Original);
       P21.setBackground(Original);
       P22.setBackground(Original);
       P23.setBackground(Original);
       P24.setBackground(Original);
       P25.setBackground(Original);
       P26.setBackground(Original);
       P27.setBackground(Original);
       P28.setBackground(Original);
       P29.setBackground(Original);
       P30.setBackground(Original);
       P31.setBackground(Original);
       P32.setBackground(Original);
       P33.setBackground(Original);
       P34.setBackground(Original);
       P35.setBackground(Original);
       P36.setBackground(Original);
       P37.setBackground(Original);
       P38.setBackground(Original);
       P39.setBackground(Original);
     }
    });
    
    private void InsertarProductoPedido() {
       
        try {
            InsertarProducto p1 = new InsertarProducto();
            p1.setNoOrden(noorden);
            p1.setId_producto(codigooreden);
            BDOrdenes.InsertarProducto_Pedido(p1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "QUE MIERDA PASA= "+e);
        }
     switch (tipomenu) {
         case 0:
             Menu.ListarProductosPedidos();
             break;
         case 1:
             MenuSeguimiento.ListarProductosPedidos();
             break;
         case 2:
              MenuParaLlevar.ListarProductosPedidos();
             break;
         default:
             break;
     }
         existe = 0;
    }
    
     private void UpdateCantidad() {
        try {
                 BDConexion conecta = new BDConexion();
                 Connection con = conecta.getConexion();
                 PreparedStatement smtp = null;
                 smtp = con.prepareStatement("update VENTAS SET CANTIDAD = CANTIDAD+1, TOTAL = CANTIDAD*(SELECT PRECIO FROM productos WHERE CODIGO = "+codigooreden+") WHERE NOORDEN = "+noorden+" AND CODIGO = "+codigooreden);
                 smtp.executeUpdate();
                 con.close();
                 smtp.close();
               // JOptionPane.showMessageDialog(null, "Guardado...");
            } catch (SQLException ex) {
                JOptionPane.showConfirmDialog(null, ex);
            }
        
         switch (tipomenu) {
         case 0:
             Menu.ListarProductosPedidos();
             break;
         case 1:
             MenuSeguimiento.ListarProductosPedidos();
             break;
         case 2:
              MenuParaLlevar.ListarProductosPedidos();
             break;
         default:
             break;
     }
        existe = 0;
    }
     
     public  void BuscarExistencia() {
            try {
                BDConexion conecta = new BDConexion();
                Connection cn = conecta.getConexion();
                java.sql.Statement stmt = cn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT cantidad as EXISTE FROM ventas  WHERE NOORDEN =  "+noorden+" AND CODIGO ="+codigooreden );
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
                 smtp = con.prepareStatement("update VENTAS SET CANTIDAD = CANTIDAD-1,Total = TOTAL-(SELECT PRECIO FROM productos WHERE CODIGO = "+codigooreden+") WHERE NOORDEN = "+noorden+" AND CODIGO = "+codigooreden);
                 smtp.executeUpdate();
                 con.close();
                 smtp.close();
               // JOptionPane.showMessageDialog(null, "Guardado...");
            } catch (SQLException ex) {
                JOptionPane.showConfirmDialog(null, ex);
            }
        
        switch (tipomenu) {
         case 0:
             Menu.ListarProductosPedidos();
             break;
         case 1:
             MenuSeguimiento.ListarProductosPedidos();
             break;
         case 2:
              MenuParaLlevar.ListarProductosPedidos();
             break;
         default:
             break;
     }
        existe = 0;
    }
     
    private void eliminarProducto(){
        try {
            BDConexion conecta = new BDConexion();
            Connection con = conecta.getConexion();
            PreparedStatement ps = null;
            ps= con.prepareStatement("delete from Ventas where noorden="+noorden+" and codigo = "+codigooreden);
            ps.executeUpdate();
            con.close();
            ps.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"ERROr = "+ex);
        }
        switch (tipomenu) {
         case 0:
             Menu.ListarProductosPedidos();
             break;
         case 1:
             MenuSeguimiento.ListarProductosPedidos();
             break;
         case 2:
             MenuParaLlevar.ListarProductosPedidos();
             break;
         default:
             break;
     }
        existe = 0;
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
        P1 = new ClassAngels.PanelRound();
        BE1 = new javax.swing.JLabel();
        P2 = new ClassAngels.PanelRound();
        BE2 = new javax.swing.JLabel();
        P3 = new ClassAngels.PanelRound();
        BE3 = new javax.swing.JLabel();
        P4 = new ClassAngels.PanelRound();
        BE4 = new javax.swing.JLabel();
        P5 = new ClassAngels.PanelRound();
        BE5 = new javax.swing.JLabel();
        P6 = new ClassAngels.PanelRound();
        BE6 = new javax.swing.JLabel();
        P9 = new ClassAngels.PanelRound();
        BE9 = new javax.swing.JLabel();
        P10 = new ClassAngels.PanelRound();
        BE10 = new javax.swing.JLabel();
        P11 = new ClassAngels.PanelRound();
        BE11 = new javax.swing.JLabel();
        P22 = new ClassAngels.PanelRound();
        BE12 = new javax.swing.JLabel();
        P23 = new ClassAngels.PanelRound();
        BE13 = new javax.swing.JLabel();
        P24 = new ClassAngels.PanelRound();
        BE14 = new javax.swing.JLabel();
        P25 = new ClassAngels.PanelRound();
        BE15 = new javax.swing.JLabel();
        P26 = new ClassAngels.PanelRound();
        BE16 = new javax.swing.JLabel();
        P27 = new ClassAngels.PanelRound();
        BE17 = new javax.swing.JLabel();
        P28 = new ClassAngels.PanelRound();
        BE18 = new javax.swing.JLabel();
        P29 = new ClassAngels.PanelRound();
        BE19 = new javax.swing.JLabel();
        P7 = new ClassAngels.PanelRound();
        BE7 = new javax.swing.JLabel();
        P8 = new ClassAngels.PanelRound();
        BE8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        P12 = new ClassAngels.PanelRound();
        BEPRE1 = new javax.swing.JLabel();
        P13 = new ClassAngels.PanelRound();
        BEPRE2 = new javax.swing.JLabel();
        P14 = new ClassAngels.PanelRound();
        BEPRE3 = new javax.swing.JLabel();
        P15 = new ClassAngels.PanelRound();
        BEPRE4 = new javax.swing.JLabel();
        P16 = new ClassAngels.PanelRound();
        BEPRE5 = new javax.swing.JLabel();
        P17 = new ClassAngels.PanelRound();
        BEPRE6 = new javax.swing.JLabel();
        P18 = new ClassAngels.PanelRound();
        BEPRE7 = new javax.swing.JLabel();
        P19 = new ClassAngels.PanelRound();
        BEPRE8 = new javax.swing.JLabel();
        P20 = new ClassAngels.PanelRound();
        BEPRE9 = new javax.swing.JLabel();
        P21 = new ClassAngels.PanelRound();
        BEPRE10 = new javax.swing.JLabel();
        P30 = new ClassAngels.PanelRound();
        BEPRE11 = new javax.swing.JLabel();
        P31 = new ClassAngels.PanelRound();
        BEPRE12 = new javax.swing.JLabel();
        P32 = new ClassAngels.PanelRound();
        BEPRE13 = new javax.swing.JLabel();
        P33 = new ClassAngels.PanelRound();
        BEPRE14 = new javax.swing.JLabel();
        P34 = new ClassAngels.PanelRound();
        BEPRE15 = new javax.swing.JLabel();
        P35 = new ClassAngels.PanelRound();
        BEPRE16 = new javax.swing.JLabel();
        P36 = new ClassAngels.PanelRound();
        BEPRE17 = new javax.swing.JLabel();
        P37 = new ClassAngels.PanelRound();
        BEPRE18 = new javax.swing.JLabel();
        P38 = new ClassAngels.PanelRound();
        BEPRE19 = new javax.swing.JLabel();
        P39 = new ClassAngels.PanelRound();
        BEPRE20 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 255, 204));
        setPreferredSize(new java.awt.Dimension(1024, 380));

        jPanel1.setBackground(new java.awt.Color(153, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BEBIDAS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        P1.setBackground(new java.awt.Color(204, 255, 102));
        P1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        P1.setPreferredSize(new java.awt.Dimension(80, 55));
        P1.setRoundBottomLeft(20);
        P1.setRoundBottomRight(20);
        P1.setRoundTopLeft(20);
        P1.setRoundTopRight(20);

        BE1.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        BE1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BE1.setText("1");
        BE1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BE1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P1Layout = new javax.swing.GroupLayout(P1);
        P1.setLayout(P1Layout);
        P1Layout.setHorizontalGroup(
            P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BE1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        P1Layout.setVerticalGroup(
            P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BE1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        P2.setBackground(new java.awt.Color(204, 255, 102));
        P2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        P2.setPreferredSize(new java.awt.Dimension(80, 55));
        P2.setRoundBottomLeft(20);
        P2.setRoundBottomRight(20);
        P2.setRoundTopLeft(20);
        P2.setRoundTopRight(20);

        BE2.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        BE2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BE2.setText("2");
        BE2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BE2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P2Layout = new javax.swing.GroupLayout(P2);
        P2.setLayout(P2Layout);
        P2Layout.setHorizontalGroup(
            P2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BE2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        P2Layout.setVerticalGroup(
            P2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BE2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        P3.setBackground(new java.awt.Color(204, 255, 102));
        P3.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        P3.setPreferredSize(new java.awt.Dimension(80, 55));
        P3.setRoundBottomLeft(20);
        P3.setRoundBottomRight(20);
        P3.setRoundTopLeft(20);
        P3.setRoundTopRight(20);

        BE3.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        BE3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BE3.setText("3");
        BE3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BE3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P3Layout = new javax.swing.GroupLayout(P3);
        P3.setLayout(P3Layout);
        P3Layout.setHorizontalGroup(
            P3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BE3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        P3Layout.setVerticalGroup(
            P3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BE3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        P4.setBackground(new java.awt.Color(204, 255, 102));
        P4.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        P4.setPreferredSize(new java.awt.Dimension(80, 55));
        P4.setRoundBottomLeft(20);
        P4.setRoundBottomRight(20);
        P4.setRoundTopLeft(20);
        P4.setRoundTopRight(20);

        BE4.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        BE4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BE4.setText("4");
        BE4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BE4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P4Layout = new javax.swing.GroupLayout(P4);
        P4.setLayout(P4Layout);
        P4Layout.setHorizontalGroup(
            P4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BE4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        P4Layout.setVerticalGroup(
            P4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BE4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        P5.setBackground(new java.awt.Color(204, 255, 102));
        P5.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        P5.setPreferredSize(new java.awt.Dimension(80, 55));
        P5.setRoundBottomLeft(20);
        P5.setRoundBottomRight(20);
        P5.setRoundTopLeft(20);
        P5.setRoundTopRight(20);

        BE5.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        BE5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BE5.setText("5");
        BE5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BE5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P5Layout = new javax.swing.GroupLayout(P5);
        P5.setLayout(P5Layout);
        P5Layout.setHorizontalGroup(
            P5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BE5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        P5Layout.setVerticalGroup(
            P5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BE5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        P6.setBackground(new java.awt.Color(204, 255, 102));
        P6.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        P6.setPreferredSize(new java.awt.Dimension(80, 55));
        P6.setRoundBottomLeft(20);
        P6.setRoundBottomRight(20);
        P6.setRoundTopLeft(20);
        P6.setRoundTopRight(20);

        BE6.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        BE6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BE6.setText("6");
        BE6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BE6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P6Layout = new javax.swing.GroupLayout(P6);
        P6.setLayout(P6Layout);
        P6Layout.setHorizontalGroup(
            P6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BE6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        P6Layout.setVerticalGroup(
            P6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BE6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        P9.setBackground(new java.awt.Color(204, 255, 102));
        P9.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        P9.setPreferredSize(new java.awt.Dimension(80, 55));
        P9.setRoundBottomLeft(20);
        P9.setRoundBottomRight(20);
        P9.setRoundTopLeft(20);
        P9.setRoundTopRight(20);

        BE9.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        BE9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BE9.setText("9");
        BE9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BE9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P9Layout = new javax.swing.GroupLayout(P9);
        P9.setLayout(P9Layout);
        P9Layout.setHorizontalGroup(
            P9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BE9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        P9Layout.setVerticalGroup(
            P9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BE9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        P10.setBackground(new java.awt.Color(204, 255, 102));
        P10.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        P10.setPreferredSize(new java.awt.Dimension(80, 55));
        P10.setRoundBottomLeft(20);
        P10.setRoundBottomRight(20);
        P10.setRoundTopLeft(20);
        P10.setRoundTopRight(20);

        BE10.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        BE10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BE10.setText("10");
        BE10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BE10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P10Layout = new javax.swing.GroupLayout(P10);
        P10.setLayout(P10Layout);
        P10Layout.setHorizontalGroup(
            P10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BE10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        P10Layout.setVerticalGroup(
            P10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BE10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        P11.setBackground(new java.awt.Color(204, 255, 102));
        P11.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        P11.setPreferredSize(new java.awt.Dimension(80, 55));
        P11.setRoundBottomLeft(20);
        P11.setRoundBottomRight(20);
        P11.setRoundTopLeft(20);
        P11.setRoundTopRight(20);

        BE11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BE11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BE11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BE11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P11Layout = new javax.swing.GroupLayout(P11);
        P11.setLayout(P11Layout);
        P11Layout.setHorizontalGroup(
            P11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BE11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        P11Layout.setVerticalGroup(
            P11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BE11, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        P22.setBackground(new java.awt.Color(204, 255, 102));
        P22.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        P22.setPreferredSize(new java.awt.Dimension(80, 55));
        P22.setRoundBottomLeft(20);
        P22.setRoundBottomRight(20);
        P22.setRoundTopLeft(20);
        P22.setRoundTopRight(20);

        BE12.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        BE12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BE12.setText("22");
        BE12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BE12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P22Layout = new javax.swing.GroupLayout(P22);
        P22.setLayout(P22Layout);
        P22Layout.setHorizontalGroup(
            P22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
            .addGroup(P22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(BE12, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
        );
        P22Layout.setVerticalGroup(
            P22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
            .addGroup(P22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(BE12, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
        );

        P23.setBackground(new java.awt.Color(204, 255, 102));
        P23.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        P23.setPreferredSize(new java.awt.Dimension(80, 55));
        P23.setRoundBottomLeft(20);
        P23.setRoundBottomRight(20);
        P23.setRoundTopLeft(20);
        P23.setRoundTopRight(20);

        BE13.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        BE13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BE13.setText("23");
        BE13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BE13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P23Layout = new javax.swing.GroupLayout(P23);
        P23.setLayout(P23Layout);
        P23Layout.setHorizontalGroup(
            P23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BE13, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        P23Layout.setVerticalGroup(
            P23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BE13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        P24.setBackground(new java.awt.Color(204, 255, 102));
        P24.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        P24.setPreferredSize(new java.awt.Dimension(80, 55));
        P24.setRoundBottomLeft(20);
        P24.setRoundBottomRight(20);
        P24.setRoundTopLeft(20);
        P24.setRoundTopRight(20);

        BE14.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        BE14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BE14.setText("24");
        BE14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BE14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P24Layout = new javax.swing.GroupLayout(P24);
        P24.setLayout(P24Layout);
        P24Layout.setHorizontalGroup(
            P24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
            .addGroup(P24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(BE14, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
        );
        P24Layout.setVerticalGroup(
            P24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
            .addGroup(P24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(BE14, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
        );

        P25.setBackground(new java.awt.Color(204, 255, 102));
        P25.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        P25.setPreferredSize(new java.awt.Dimension(80, 55));
        P25.setRoundBottomLeft(20);
        P25.setRoundBottomRight(20);
        P25.setRoundTopLeft(20);
        P25.setRoundTopRight(20);

        BE15.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        BE15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BE15.setText("25");
        BE15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BE15MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P25Layout = new javax.swing.GroupLayout(P25);
        P25.setLayout(P25Layout);
        P25Layout.setHorizontalGroup(
            P25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
            .addGroup(P25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(BE15, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
        );
        P25Layout.setVerticalGroup(
            P25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
            .addGroup(P25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(BE15, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
        );

        P26.setBackground(new java.awt.Color(204, 255, 102));
        P26.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        P26.setPreferredSize(new java.awt.Dimension(80, 55));
        P26.setRoundBottomLeft(20);
        P26.setRoundBottomRight(20);
        P26.setRoundTopLeft(20);
        P26.setRoundTopRight(20);

        BE16.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        BE16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BE16.setText("26");
        BE16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BE16MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P26Layout = new javax.swing.GroupLayout(P26);
        P26.setLayout(P26Layout);
        P26Layout.setHorizontalGroup(
            P26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
            .addGroup(P26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(BE16, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
        );
        P26Layout.setVerticalGroup(
            P26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
            .addGroup(P26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(BE16, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
        );

        P27.setBackground(new java.awt.Color(204, 255, 102));
        P27.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        P27.setPreferredSize(new java.awt.Dimension(80, 55));
        P27.setRoundBottomLeft(20);
        P27.setRoundBottomRight(20);
        P27.setRoundTopLeft(20);
        P27.setRoundTopRight(20);

        BE17.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        BE17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BE17.setText("27");
        BE17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BE17MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P27Layout = new javax.swing.GroupLayout(P27);
        P27.setLayout(P27Layout);
        P27Layout.setHorizontalGroup(
            P27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
            .addGroup(P27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(BE17, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
        );
        P27Layout.setVerticalGroup(
            P27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
            .addGroup(P27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(BE17, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
        );

        P28.setBackground(new java.awt.Color(204, 255, 102));
        P28.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        P28.setPreferredSize(new java.awt.Dimension(80, 55));
        P28.setRoundBottomLeft(20);
        P28.setRoundBottomRight(20);
        P28.setRoundTopLeft(20);
        P28.setRoundTopRight(20);

        BE18.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        BE18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BE18.setText("28");
        BE18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BE18MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P28Layout = new javax.swing.GroupLayout(P28);
        P28.setLayout(P28Layout);
        P28Layout.setHorizontalGroup(
            P28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
            .addGroup(P28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(BE18, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
        );
        P28Layout.setVerticalGroup(
            P28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
            .addGroup(P28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(BE18, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
        );

        P29.setBackground(new java.awt.Color(204, 255, 102));
        P29.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        P29.setPreferredSize(new java.awt.Dimension(80, 55));
        P29.setRoundBottomLeft(20);
        P29.setRoundBottomRight(20);
        P29.setRoundTopLeft(20);
        P29.setRoundTopRight(20);

        BE19.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        BE19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BE19.setText("29");
        BE19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BE19MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P29Layout = new javax.swing.GroupLayout(P29);
        P29.setLayout(P29Layout);
        P29Layout.setHorizontalGroup(
            P29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BE19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        P29Layout.setVerticalGroup(
            P29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BE19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        P7.setBackground(new java.awt.Color(204, 255, 102));
        P7.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        P7.setPreferredSize(new java.awt.Dimension(80, 55));
        P7.setRoundBottomLeft(20);
        P7.setRoundBottomRight(20);
        P7.setRoundTopLeft(20);
        P7.setRoundTopRight(20);

        BE7.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        BE7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BE7.setText("7");
        BE7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BE7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P7Layout = new javax.swing.GroupLayout(P7);
        P7.setLayout(P7Layout);
        P7Layout.setHorizontalGroup(
            P7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BE7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        P7Layout.setVerticalGroup(
            P7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BE7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        P8.setBackground(new java.awt.Color(204, 255, 102));
        P8.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        P8.setPreferredSize(new java.awt.Dimension(80, 55));
        P8.setRoundBottomLeft(20);
        P8.setRoundBottomRight(20);
        P8.setRoundTopLeft(20);
        P8.setRoundTopRight(20);

        BE8.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        BE8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BE8.setText("8");
        BE8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BE8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P8Layout = new javax.swing.GroupLayout(P8);
        P8.setLayout(P8Layout);
        P8Layout.setHorizontalGroup(
            P8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BE8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        P8Layout.setVerticalGroup(
            P8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BE8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(P1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(P2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(P3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(P4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(P26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(P27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(P28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(P29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(P5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(P6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(P22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(P23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(P24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(P25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(P7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(P8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(P9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(P10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(P11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(P6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(P24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(P25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(P29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(P26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(P27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(P28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(P7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(P8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(P11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BEBIDAS PREPARADAS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        P12.setBackground(new java.awt.Color(204, 255, 102));
        P12.setPreferredSize(new java.awt.Dimension(80, 55));
        P12.setRoundBottomLeft(20);
        P12.setRoundBottomRight(20);
        P12.setRoundTopLeft(20);
        P12.setRoundTopRight(20);

        BEPRE1.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        BEPRE1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BEPRE1.setText("12");
        BEPRE1.setPreferredSize(new java.awt.Dimension(80, 55));
        BEPRE1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BEPRE1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P12Layout = new javax.swing.GroupLayout(P12);
        P12.setLayout(P12Layout);
        P12Layout.setHorizontalGroup(
            P12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BEPRE1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        P12Layout.setVerticalGroup(
            P12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BEPRE1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        P13.setBackground(new java.awt.Color(204, 255, 102));
        P13.setPreferredSize(new java.awt.Dimension(80, 55));
        P13.setRoundBottomLeft(20);
        P13.setRoundBottomRight(20);
        P13.setRoundTopLeft(20);
        P13.setRoundTopRight(20);

        BEPRE2.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        BEPRE2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BEPRE2.setText("13");
        BEPRE2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BEPRE2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P13Layout = new javax.swing.GroupLayout(P13);
        P13.setLayout(P13Layout);
        P13Layout.setHorizontalGroup(
            P13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BEPRE2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        P13Layout.setVerticalGroup(
            P13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BEPRE2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        P14.setBackground(new java.awt.Color(204, 255, 102));
        P14.setPreferredSize(new java.awt.Dimension(80, 55));
        P14.setRoundBottomLeft(20);
        P14.setRoundBottomRight(20);
        P14.setRoundTopLeft(20);
        P14.setRoundTopRight(20);

        BEPRE3.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        BEPRE3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BEPRE3.setText("14");
        BEPRE3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BEPRE3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P14Layout = new javax.swing.GroupLayout(P14);
        P14.setLayout(P14Layout);
        P14Layout.setHorizontalGroup(
            P14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BEPRE3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        P14Layout.setVerticalGroup(
            P14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BEPRE3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        P15.setBackground(new java.awt.Color(204, 255, 102));
        P15.setPreferredSize(new java.awt.Dimension(80, 55));
        P15.setRoundBottomLeft(20);
        P15.setRoundBottomRight(20);
        P15.setRoundTopLeft(20);
        P15.setRoundTopRight(20);

        BEPRE4.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        BEPRE4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BEPRE4.setText("15");
        BEPRE4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BEPRE4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P15Layout = new javax.swing.GroupLayout(P15);
        P15.setLayout(P15Layout);
        P15Layout.setHorizontalGroup(
            P15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BEPRE4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        P15Layout.setVerticalGroup(
            P15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BEPRE4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        P16.setBackground(new java.awt.Color(204, 255, 102));
        P16.setPreferredSize(new java.awt.Dimension(80, 55));
        P16.setRoundBottomLeft(20);
        P16.setRoundBottomRight(20);
        P16.setRoundTopLeft(20);
        P16.setRoundTopRight(20);

        BEPRE5.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        BEPRE5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BEPRE5.setText("16");
        BEPRE5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BEPRE5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P16Layout = new javax.swing.GroupLayout(P16);
        P16.setLayout(P16Layout);
        P16Layout.setHorizontalGroup(
            P16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BEPRE5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        P16Layout.setVerticalGroup(
            P16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BEPRE5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        P17.setBackground(new java.awt.Color(204, 255, 102));
        P17.setPreferredSize(new java.awt.Dimension(80, 55));
        P17.setRoundBottomLeft(20);
        P17.setRoundBottomRight(20);
        P17.setRoundTopLeft(20);
        P17.setRoundTopRight(20);

        BEPRE6.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        BEPRE6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BEPRE6.setText("17");
        BEPRE6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BEPRE6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P17Layout = new javax.swing.GroupLayout(P17);
        P17.setLayout(P17Layout);
        P17Layout.setHorizontalGroup(
            P17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BEPRE6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        P17Layout.setVerticalGroup(
            P17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BEPRE6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        P18.setBackground(new java.awt.Color(204, 255, 102));
        P18.setPreferredSize(new java.awt.Dimension(80, 55));
        P18.setRoundBottomLeft(20);
        P18.setRoundBottomRight(20);
        P18.setRoundTopLeft(20);
        P18.setRoundTopRight(20);

        BEPRE7.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        BEPRE7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BEPRE7.setText("18");
        BEPRE7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BEPRE7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P18Layout = new javax.swing.GroupLayout(P18);
        P18.setLayout(P18Layout);
        P18Layout.setHorizontalGroup(
            P18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BEPRE7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        P18Layout.setVerticalGroup(
            P18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BEPRE7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        P19.setBackground(new java.awt.Color(204, 255, 102));
        P19.setPreferredSize(new java.awt.Dimension(80, 55));
        P19.setRoundBottomLeft(20);
        P19.setRoundBottomRight(20);
        P19.setRoundTopLeft(20);
        P19.setRoundTopRight(20);

        BEPRE8.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        BEPRE8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BEPRE8.setText("19");
        BEPRE8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BEPRE8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P19Layout = new javax.swing.GroupLayout(P19);
        P19.setLayout(P19Layout);
        P19Layout.setHorizontalGroup(
            P19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BEPRE8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        P19Layout.setVerticalGroup(
            P19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BEPRE8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        P20.setBackground(new java.awt.Color(204, 255, 102));
        P20.setPreferredSize(new java.awt.Dimension(80, 55));
        P20.setRoundBottomLeft(20);
        P20.setRoundBottomRight(20);
        P20.setRoundTopLeft(20);
        P20.setRoundTopRight(20);

        BEPRE9.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        BEPRE9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BEPRE9.setText("20");
        BEPRE9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BEPRE9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P20Layout = new javax.swing.GroupLayout(P20);
        P20.setLayout(P20Layout);
        P20Layout.setHorizontalGroup(
            P20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BEPRE9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        P20Layout.setVerticalGroup(
            P20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BEPRE9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        P21.setBackground(new java.awt.Color(204, 255, 102));
        P21.setPreferredSize(new java.awt.Dimension(80, 55));
        P21.setRoundBottomLeft(20);
        P21.setRoundBottomRight(20);
        P21.setRoundTopLeft(20);
        P21.setRoundTopRight(20);

        BEPRE10.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        BEPRE10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BEPRE10.setText("21");
        BEPRE10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BEPRE10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P21Layout = new javax.swing.GroupLayout(P21);
        P21.setLayout(P21Layout);
        P21Layout.setHorizontalGroup(
            P21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BEPRE10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        P21Layout.setVerticalGroup(
            P21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BEPRE10, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        P30.setBackground(new java.awt.Color(204, 255, 102));
        P30.setPreferredSize(new java.awt.Dimension(80, 55));
        P30.setRoundBottomLeft(20);
        P30.setRoundBottomRight(20);
        P30.setRoundTopLeft(20);
        P30.setRoundTopRight(20);

        BEPRE11.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        BEPRE11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BEPRE11.setText("30");
        BEPRE11.setPreferredSize(new java.awt.Dimension(80, 55));
        BEPRE11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BEPRE11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P30Layout = new javax.swing.GroupLayout(P30);
        P30.setLayout(P30Layout);
        P30Layout.setHorizontalGroup(
            P30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BEPRE11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        P30Layout.setVerticalGroup(
            P30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BEPRE11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        P31.setBackground(new java.awt.Color(204, 255, 102));
        P31.setPreferredSize(new java.awt.Dimension(80, 55));
        P31.setRoundBottomLeft(20);
        P31.setRoundBottomRight(20);
        P31.setRoundTopLeft(20);
        P31.setRoundTopRight(20);

        BEPRE12.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        BEPRE12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BEPRE12.setText("31");
        BEPRE12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BEPRE12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P31Layout = new javax.swing.GroupLayout(P31);
        P31.setLayout(P31Layout);
        P31Layout.setHorizontalGroup(
            P31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BEPRE12, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        P31Layout.setVerticalGroup(
            P31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BEPRE12, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        P32.setBackground(new java.awt.Color(204, 255, 102));
        P32.setPreferredSize(new java.awt.Dimension(80, 55));
        P32.setRoundBottomLeft(20);
        P32.setRoundBottomRight(20);
        P32.setRoundTopLeft(20);
        P32.setRoundTopRight(20);

        BEPRE13.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        BEPRE13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BEPRE13.setText("32");
        BEPRE13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BEPRE13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P32Layout = new javax.swing.GroupLayout(P32);
        P32.setLayout(P32Layout);
        P32Layout.setHorizontalGroup(
            P32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BEPRE13, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        P32Layout.setVerticalGroup(
            P32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BEPRE13, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        P33.setBackground(new java.awt.Color(204, 255, 102));
        P33.setPreferredSize(new java.awt.Dimension(80, 55));
        P33.setRoundBottomLeft(20);
        P33.setRoundBottomRight(20);
        P33.setRoundTopLeft(20);
        P33.setRoundTopRight(20);

        BEPRE14.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        BEPRE14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BEPRE14.setText("33");
        BEPRE14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BEPRE14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P33Layout = new javax.swing.GroupLayout(P33);
        P33.setLayout(P33Layout);
        P33Layout.setHorizontalGroup(
            P33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BEPRE14, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        P33Layout.setVerticalGroup(
            P33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BEPRE14, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        P34.setBackground(new java.awt.Color(204, 255, 102));
        P34.setPreferredSize(new java.awt.Dimension(80, 55));
        P34.setRoundBottomLeft(20);
        P34.setRoundBottomRight(20);
        P34.setRoundTopLeft(20);
        P34.setRoundTopRight(20);

        BEPRE15.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        BEPRE15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BEPRE15.setText("34");
        BEPRE15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BEPRE15MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P34Layout = new javax.swing.GroupLayout(P34);
        P34.setLayout(P34Layout);
        P34Layout.setHorizontalGroup(
            P34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BEPRE15, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        P34Layout.setVerticalGroup(
            P34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BEPRE15, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        P35.setBackground(new java.awt.Color(204, 255, 102));
        P35.setPreferredSize(new java.awt.Dimension(80, 55));
        P35.setRoundBottomLeft(20);
        P35.setRoundBottomRight(20);
        P35.setRoundTopLeft(20);
        P35.setRoundTopRight(20);

        BEPRE16.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        BEPRE16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BEPRE16.setText("35");
        BEPRE16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BEPRE16MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P35Layout = new javax.swing.GroupLayout(P35);
        P35.setLayout(P35Layout);
        P35Layout.setHorizontalGroup(
            P35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BEPRE16, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        P35Layout.setVerticalGroup(
            P35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BEPRE16, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        P36.setBackground(new java.awt.Color(204, 255, 102));
        P36.setPreferredSize(new java.awt.Dimension(80, 55));
        P36.setRoundBottomLeft(20);
        P36.setRoundBottomRight(20);
        P36.setRoundTopLeft(20);
        P36.setRoundTopRight(20);

        BEPRE17.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        BEPRE17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BEPRE17.setText("36");
        BEPRE17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BEPRE17MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P36Layout = new javax.swing.GroupLayout(P36);
        P36.setLayout(P36Layout);
        P36Layout.setHorizontalGroup(
            P36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BEPRE17, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        P36Layout.setVerticalGroup(
            P36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BEPRE17, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        P37.setBackground(new java.awt.Color(204, 255, 102));
        P37.setPreferredSize(new java.awt.Dimension(80, 55));
        P37.setRoundBottomLeft(20);
        P37.setRoundBottomRight(20);
        P37.setRoundTopLeft(20);
        P37.setRoundTopRight(20);

        BEPRE18.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        BEPRE18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BEPRE18.setText("37");
        BEPRE18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BEPRE18MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P37Layout = new javax.swing.GroupLayout(P37);
        P37.setLayout(P37Layout);
        P37Layout.setHorizontalGroup(
            P37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BEPRE18, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        P37Layout.setVerticalGroup(
            P37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BEPRE18, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        P38.setBackground(new java.awt.Color(204, 255, 102));
        P38.setPreferredSize(new java.awt.Dimension(80, 55));
        P38.setRoundBottomLeft(20);
        P38.setRoundBottomRight(20);
        P38.setRoundTopLeft(20);
        P38.setRoundTopRight(20);

        BEPRE19.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        BEPRE19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BEPRE19.setText("38");
        BEPRE19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BEPRE19MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P38Layout = new javax.swing.GroupLayout(P38);
        P38.setLayout(P38Layout);
        P38Layout.setHorizontalGroup(
            P38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BEPRE19, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        P38Layout.setVerticalGroup(
            P38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BEPRE19, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        P39.setBackground(new java.awt.Color(204, 255, 102));
        P39.setPreferredSize(new java.awt.Dimension(80, 55));
        P39.setRoundBottomLeft(20);
        P39.setRoundBottomRight(20);
        P39.setRoundTopLeft(20);
        P39.setRoundTopRight(20);

        BEPRE20.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        BEPRE20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BEPRE20.setText("39");
        BEPRE20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BEPRE20MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P39Layout = new javax.swing.GroupLayout(P39);
        P39.setLayout(P39Layout);
        P39Layout.setHorizontalGroup(
            P39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BEPRE20, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        P39Layout.setVerticalGroup(
            P39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BEPRE20, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(P12, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(P13, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(P14, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(P15, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(P16, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(P17, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(P18, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(P19, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(P20, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P21, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(P30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(P31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(P32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(P33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(P34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(P35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(P36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(P37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(P38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(P20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(P30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void BE1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BE1MouseClicked
      if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo1;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P1.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo1;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P1.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_BE1MouseClicked

    private void BE2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BE2MouseClicked
      if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo2;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P2.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo2;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P2.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_BE2MouseClicked

    private void BE3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BE3MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo3;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P3.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo3;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P3.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_BE3MouseClicked

    private void BE4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BE4MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo4;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P4.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo4;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P4.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_BE4MouseClicked

    private void BE5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BE5MouseClicked
         if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo5;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P5.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo5;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P5.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_BE5MouseClicked

    private void BE6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BE6MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo6;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P6.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo6;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P6.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_BE6MouseClicked

    private void BE7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BE7MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo7;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P7.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo7;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P7.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_BE7MouseClicked

    private void BE8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BE8MouseClicked
         if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo8;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P8.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo8;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P8.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_BE8MouseClicked

    private void BE9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BE9MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo9;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P9.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo9;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P9.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_BE9MouseClicked

    private void BE10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BE10MouseClicked
       if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo10;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P10.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo10;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P10.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_BE10MouseClicked

    private void BE11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BE11MouseClicked
        /*if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo11;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P11.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo11;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P11.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }*/
    }//GEN-LAST:event_BE11MouseClicked

    private void BEPRE1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BEPRE1MouseClicked
       if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo12;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P12.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo12;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P12.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_BEPRE1MouseClicked

    private void BEPRE2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BEPRE2MouseClicked
         if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo13;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P13.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo13;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P13.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_BEPRE2MouseClicked

    private void BEPRE3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BEPRE3MouseClicked
         if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo14;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P14.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo14;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P14.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_BEPRE3MouseClicked

    private void BEPRE4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BEPRE4MouseClicked
         if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo15;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P15.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo15;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P15.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_BEPRE4MouseClicked

    private void BEPRE5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BEPRE5MouseClicked
         if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo16;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P16.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo16;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P16.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_BEPRE5MouseClicked

    private void BEPRE6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BEPRE6MouseClicked
       if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo17;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P17.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo17;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P17.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_BEPRE6MouseClicked

    private void BEPRE7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BEPRE7MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo18;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P18.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo18;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P18.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_BEPRE7MouseClicked

    private void BEPRE8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BEPRE8MouseClicked
         if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo19;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P19.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo19;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P19.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_BEPRE8MouseClicked

    private void BEPRE9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BEPRE9MouseClicked
       if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo20;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P20.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo20;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P20.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_BEPRE9MouseClicked

    private void BEPRE10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BEPRE10MouseClicked
       if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo21;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P21.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo21;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P21.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_BEPRE10MouseClicked

    private void BE12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BE12MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo22;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P22.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo22;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P22.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_BE12MouseClicked

    private void BE13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BE13MouseClicked
       if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo23;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P23.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo23;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P23.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_BE13MouseClicked

    private void BE14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BE14MouseClicked
       if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo24;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P24.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo24;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P24.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_BE14MouseClicked

    private void BE15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BE15MouseClicked
       if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo25;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P25.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo25;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P25.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_BE15MouseClicked

    private void BE16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BE16MouseClicked
       if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo26;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P26.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo26;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P26.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_BE16MouseClicked

    private void BE17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BE17MouseClicked
       if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo27;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P27.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo27;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P27.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_BE17MouseClicked

    private void BE18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BE18MouseClicked
      if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo28;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P28.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo28;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P28.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_BE18MouseClicked

    private void BE19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BE19MouseClicked
       if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo29;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P29.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo29;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P29.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_BE19MouseClicked

    private void BEPRE11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BEPRE11MouseClicked
       if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo30;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P30.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo30;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P30.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_BEPRE11MouseClicked

    private void BEPRE12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BEPRE12MouseClicked
       if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo31;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P31.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo31;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P31.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_BEPRE12MouseClicked

    private void BEPRE13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BEPRE13MouseClicked
       if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo32;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P32.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo32;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P32.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_BEPRE13MouseClicked

    private void BEPRE14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BEPRE14MouseClicked
       if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo33;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P33.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo33;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P33.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_BEPRE14MouseClicked

    private void BEPRE15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BEPRE15MouseClicked
       if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo34;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P34.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo34;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P34.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_BEPRE15MouseClicked

    private void BEPRE16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BEPRE16MouseClicked
       if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo35;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P35.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo35;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P35.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_BEPRE16MouseClicked

    private void BEPRE17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BEPRE17MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo36;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P36.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo36;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P36.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_BEPRE17MouseClicked

    private void BEPRE18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BEPRE18MouseClicked
       if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo37;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P37.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo37;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P37.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_BEPRE18MouseClicked

    private void BEPRE19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BEPRE19MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo38;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P38.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo38;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P38.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_BEPRE19MouseClicked

    private void BEPRE20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BEPRE20MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo39;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P39.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo39;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P39.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_BEPRE20MouseClicked
   private void nombres(){
    ArrayList<EtiquetasClass> result = EtiquetasClass.ListaEtiquetasBebidas();
        for (int i = 0; i < result.size(); i++) {
          int codigo = result.get(i).getCodigo();
          
            if (54 == codigo) {
             descripcion1 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_1 = result.get(i).getDescripcion2().toUpperCase(); Precio1 = result.get(i).getPrecio();codigo1 = result.get(i).getCodigo();
            }
            else if (55 == codigo){
             descripcion2 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_2 = result.get(i).getDescripcion2().toUpperCase(); Precio2 = result.get(i).getPrecio();codigo2 = result.get(i).getCodigo();
            }
             else if (56 == codigo){
             descripcion3 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_3 = result.get(i).getDescripcion2().toUpperCase(); Precio3 = result.get(i).getPrecio();codigo3 = result.get(i).getCodigo();
            }
             else if (57== codigo){
             descripcion4 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_4 = result.get(i).getDescripcion2().toUpperCase(); Precio4 = result.get(i).getPrecio();codigo4 = result.get(i).getCodigo();
            }
             else if (58== codigo){
             descripcion5 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_5 = result.get(i).getDescripcion2().toUpperCase(); Precio5 = result.get(i).getPrecio();codigo5 = result.get(i).getCodigo();
            }
             else if (59== codigo){
             descripcion6 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_6 = result.get(i).getDescripcion2().toUpperCase(); Precio6 = result.get(i).getPrecio();codigo6 = result.get(i).getCodigo();
            }
             else if (84== codigo){
             descripcion7 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_7 = result.get(i).getDescripcion2().toUpperCase(); Precio7 = result.get(i).getPrecio();codigo7 = result.get(i).getCodigo();
            }
             else if (141== codigo){
             descripcion8 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_8 = result.get(i).getDescripcion2().toUpperCase(); Precio8 = result.get(i).getPrecio();codigo8 = result.get(i).getCodigo();
            }
             else if (190== codigo){
             descripcion9 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_9 = result.get(i).getDescripcion2().toUpperCase(); Precio9 = result.get(i).getPrecio();codigo9 = result.get(i).getCodigo();
            }
             else if (191== codigo){
             descripcion10 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_10 = result.get(i).getDescripcion2().toUpperCase(); Precio10 = result.get(i).getPrecio();codigo10 = result.get(i).getCodigo();
            }
            /* else if (64== codigo){
             descripcion11 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_11 = result.get(i).getDescripcion2().toUpperCase(); Precio11 = result.get(i).getPrecio();codigo11 = result.get(i).getCodigo();
            }*/
             else if (65== codigo){
             descripcion12 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_12 = result.get(i).getDescripcion2().toUpperCase(); Precio12 = result.get(i).getPrecio();codigo12 = result.get(i).getCodigo();
            }
             else if (66== codigo){
             descripcion13 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_13 = result.get(i).getDescripcion2().toUpperCase(); Precio13 = result.get(i).getPrecio();codigo13 = result.get(i).getCodigo();
            }
             else if (67== codigo){
             descripcion14 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_14 = result.get(i).getDescripcion2().toUpperCase(); Precio14 = result.get(i).getPrecio();codigo14 = result.get(i).getCodigo();
            }
             else if (68== codigo){
             descripcion15 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_15 = result.get(i).getDescripcion2().toUpperCase(); Precio15 = result.get(i).getPrecio();codigo15 = result.get(i).getCodigo();
            }
             else if (69== codigo){
             descripcion16 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_16 = result.get(i).getDescripcion2().toUpperCase(); Precio16 = result.get(i).getPrecio();codigo16 = result.get(i).getCodigo();
            }
            else if (70== codigo){
             descripcion17 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_17 = result.get(i).getDescripcion2().toUpperCase(); Precio17 = result.get(i).getPrecio();codigo17 = result.get(i).getCodigo();
            }
            else if (71== codigo){
             descripcion18 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_18 = result.get(i).getDescripcion2().toUpperCase(); Precio18 = result.get(i).getPrecio();codigo18 = result.get(i).getCodigo();
            }
            else if (72== codigo){
             descripcion19 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_19 = result.get(i).getDescripcion2().toUpperCase(); Precio19 = result.get(i).getPrecio();codigo19 = result.get(i).getCodigo();
            }
            else if (73== codigo){
             descripcion20 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_20 = result.get(i).getDescripcion2().toUpperCase(); Precio20 = result.get(i).getPrecio();codigo20 = result.get(i).getCodigo();
            }
            else if (74== codigo){
             descripcion21 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_21 = result.get(i).getDescripcion2().toUpperCase(); Precio21 = result.get(i).getPrecio();codigo21 = result.get(i).getCodigo();
            }
            else if (121== codigo){
             descripcion22 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_22 = result.get(i).getDescripcion2().toUpperCase(); Precio22 = result.get(i).getPrecio();codigo22 = result.get(i).getCodigo();
            }
            else if (122== codigo){
             descripcion23 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_23 = result.get(i).getDescripcion2().toUpperCase(); Precio23 = result.get(i).getPrecio();codigo23 = result.get(i).getCodigo();
            }
            else if (123== codigo){
             descripcion24 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_24 = result.get(i).getDescripcion2().toUpperCase(); Precio24 = result.get(i).getPrecio();codigo24 = result.get(i).getCodigo();
            }
            else if (124== codigo){
             descripcion25 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_25 = result.get(i).getDescripcion2().toUpperCase(); Precio25 = result.get(i).getPrecio();codigo25 = result.get(i).getCodigo();
            }
            else if (125== codigo){
             descripcion26 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_26 = result.get(i).getDescripcion2().toUpperCase(); Precio26 = result.get(i).getPrecio();codigo26 = result.get(i).getCodigo();
            }
            else if (126== codigo){
             descripcion27 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_27 = result.get(i).getDescripcion2().toUpperCase(); Precio27 = result.get(i).getPrecio();codigo27 = result.get(i).getCodigo();
            }
            else if (127== codigo){
             descripcion28 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_28 = result.get(i).getDescripcion2().toUpperCase(); Precio28 = result.get(i).getPrecio();codigo28 = result.get(i).getCodigo();
            }
            else if (128== codigo){
             descripcion29 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_29 = result.get(i).getDescripcion2().toUpperCase(); Precio29 = result.get(i).getPrecio();codigo29 = result.get(i).getCodigo();
            }
            else if (129== codigo){
             descripcion30 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_30 = result.get(i).getDescripcion2().toUpperCase(); Precio30 = result.get(i).getPrecio();codigo30 = result.get(i).getCodigo();
            }
            else if (130== codigo){
             descripcion31 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_31 = result.get(i).getDescripcion2().toUpperCase(); Precio31 = result.get(i).getPrecio();codigo31 = result.get(i).getCodigo();
            }
            else if (131== codigo){
             descripcion32 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_32 = result.get(i).getDescripcion2().toUpperCase(); Precio32 = result.get(i).getPrecio();codigo32 = result.get(i).getCodigo();
            }
            else if (132== codigo){
             descripcion33 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_33 = result.get(i).getDescripcion2().toUpperCase(); Precio33 = result.get(i).getPrecio();codigo33 = result.get(i).getCodigo();
            }
            else if (133== codigo){
             descripcion34 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_34 = result.get(i).getDescripcion2().toUpperCase(); Precio34 = result.get(i).getPrecio();codigo34 = result.get(i).getCodigo();
            }
            else if (134== codigo){
             descripcion35 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_35 = result.get(i).getDescripcion2().toUpperCase(); Precio35 = result.get(i).getPrecio();codigo35 = result.get(i).getCodigo();
            }
            else if (135== codigo){
             descripcion36 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_36 = result.get(i).getDescripcion2().toUpperCase(); Precio36 = result.get(i).getPrecio();codigo36 = result.get(i).getCodigo();
            }
            else if (136== codigo){
             descripcion37 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_37 = result.get(i).getDescripcion2().toUpperCase(); Precio37 = result.get(i).getPrecio();codigo37 = result.get(i).getCodigo();
            }
            else if (278== codigo){
             descripcion38 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_38 = result.get(i).getDescripcion2().toUpperCase(); Precio38 = result.get(i).getPrecio();codigo38 = result.get(i).getCodigo();
            }
            else if (286== codigo){
             descripcion39 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_39 = result.get(i).getDescripcion2().toUpperCase(); Precio39 = result.get(i).getPrecio();codigo39 = result.get(i).getCodigo();
            }
        }
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BE1;
    private javax.swing.JLabel BE10;
    private javax.swing.JLabel BE11;
    private javax.swing.JLabel BE12;
    private javax.swing.JLabel BE13;
    private javax.swing.JLabel BE14;
    private javax.swing.JLabel BE15;
    private javax.swing.JLabel BE16;
    private javax.swing.JLabel BE17;
    private javax.swing.JLabel BE18;
    private javax.swing.JLabel BE19;
    private javax.swing.JLabel BE2;
    private javax.swing.JLabel BE3;
    private javax.swing.JLabel BE4;
    private javax.swing.JLabel BE5;
    private javax.swing.JLabel BE6;
    private javax.swing.JLabel BE7;
    private javax.swing.JLabel BE8;
    private javax.swing.JLabel BE9;
    private javax.swing.JLabel BEPRE1;
    private javax.swing.JLabel BEPRE10;
    private javax.swing.JLabel BEPRE11;
    private javax.swing.JLabel BEPRE12;
    private javax.swing.JLabel BEPRE13;
    private javax.swing.JLabel BEPRE14;
    private javax.swing.JLabel BEPRE15;
    private javax.swing.JLabel BEPRE16;
    private javax.swing.JLabel BEPRE17;
    private javax.swing.JLabel BEPRE18;
    private javax.swing.JLabel BEPRE19;
    private javax.swing.JLabel BEPRE2;
    private javax.swing.JLabel BEPRE20;
    private javax.swing.JLabel BEPRE3;
    private javax.swing.JLabel BEPRE4;
    private javax.swing.JLabel BEPRE5;
    private javax.swing.JLabel BEPRE6;
    private javax.swing.JLabel BEPRE7;
    private javax.swing.JLabel BEPRE8;
    private javax.swing.JLabel BEPRE9;
    private ClassAngels.PanelRound P1;
    private ClassAngels.PanelRound P10;
    private ClassAngels.PanelRound P11;
    private ClassAngels.PanelRound P12;
    private ClassAngels.PanelRound P13;
    private ClassAngels.PanelRound P14;
    private ClassAngels.PanelRound P15;
    private ClassAngels.PanelRound P16;
    private ClassAngels.PanelRound P17;
    private ClassAngels.PanelRound P18;
    private ClassAngels.PanelRound P19;
    private ClassAngels.PanelRound P2;
    private ClassAngels.PanelRound P20;
    private ClassAngels.PanelRound P21;
    private ClassAngels.PanelRound P22;
    private ClassAngels.PanelRound P23;
    private ClassAngels.PanelRound P24;
    private ClassAngels.PanelRound P25;
    private ClassAngels.PanelRound P26;
    private ClassAngels.PanelRound P27;
    private ClassAngels.PanelRound P28;
    private ClassAngels.PanelRound P29;
    private ClassAngels.PanelRound P3;
    private ClassAngels.PanelRound P30;
    private ClassAngels.PanelRound P31;
    private ClassAngels.PanelRound P32;
    private ClassAngels.PanelRound P33;
    private ClassAngels.PanelRound P34;
    private ClassAngels.PanelRound P35;
    private ClassAngels.PanelRound P36;
    private ClassAngels.PanelRound P37;
    private ClassAngels.PanelRound P38;
    private ClassAngels.PanelRound P39;
    private ClassAngels.PanelRound P4;
    private ClassAngels.PanelRound P5;
    private ClassAngels.PanelRound P6;
    private ClassAngels.PanelRound P7;
    private ClassAngels.PanelRound P8;
    private ClassAngels.PanelRound P9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
 private void Etiquetas() {

        String texto1 = "<html><center><body>"+descripcion1+"<br>"+descripcion2_1+"<br><font color='RED'>Q"+Precio1+"</font></body></center></html>";
        BE1.setText(texto1);
        String texto2 ="<html><center><body>"+descripcion2+"<br>"+descripcion2_2+"<br><font color='RED'>Q"+Precio2+"</font></body></center></html>";
        BE2.setText(texto2);
        String texto3 ="<html><center><body>"+descripcion3+"<br>"+descripcion2_3+"<br><font color='RED'>Q"+Precio3+"</font></body></center></html>";
        BE3.setText(texto3);
        String texto4 ="<html><center><body>"+descripcion4+"<br>"+descripcion2_4+"<br><font color='RED'>Q"+Precio4+"</font></body></center></html>";
        BE4.setText(texto4);
        String texto5 ="<html><center><body>"+descripcion5+"<br>"+descripcion2_5+"<br><font color='RED'>Q"+Precio5+"</font></body></center></html>";
        BE5.setText(texto5);
        String texto6 ="<html><center><body>"+descripcion6+"<br>"+descripcion2_6+"<br><font color='RED'>Q"+Precio6+"</font></body></center></html>";
        BE6.setText(texto6);
        String texto7 ="<html><center><body>"+descripcion7+"<br>"+descripcion2_7+"<br><font color='RED'>Q"+Precio7+"</font></body></center></html>";
        BE7.setText(texto7);
        String texto8 ="<html><center><body>"+descripcion8+"<br>"+descripcion2_8+"<br><font color='RED'>Q"+Precio8+"</font></body></center></html>";
        BE8.setText(texto8);
        String texto9 ="<html><center><body>"+descripcion9+"<br>"+descripcion2_9+"<br><font color='RED'>Q"+Precio9+"</font></body></center></html>";
        BE9.setText(texto9);
        String texto10 ="<html><center><body>"+descripcion10+"<br>"+descripcion2_10+"<br><font color='RED'>Q"+Precio10+"</font></body></center></html>";
        BE10.setText(texto10);
       /*String texto11 ="<html><center><body>"+descripcion11+"<br>"+descripcion2_11+"<br><font color='RED'>Q"+Precio11+"</font></body></center></html>";
        BE11.setText(texto11);*/
        String texto12 ="<html><center><body>"+descripcion12+"<br>"+descripcion2_12+"<br><font color='RED'>Q"+Precio12+"</font></body></center></html>";
        BEPRE1.setText(texto12);
        String texto13 ="<html><center><body>"+descripcion13+"<br>"+descripcion2_13+"<br><font color='RED'>Q"+Precio13+"</font></body></center></html>";
        BEPRE2.setText(texto13);
        String texto14 ="<html><center><body>"+descripcion14+"<br>"+descripcion2_14+"<br><font color='RED'>Q"+Precio14+"</font></body></center></html>";
        BEPRE3.setText(texto14);
        String texto15 ="<html><center><body>"+descripcion15+"<br>"+descripcion2_15+"<br><font color='RED'>Q"+Precio15+"</font></body></center></html>";
        BEPRE4.setText(texto15);
        String texto16 ="<html><center><body>"+descripcion16+"<br>"+descripcion2_16+"<br><font color='RED'>Q"+Precio16+"</font></body></center></html>";
        BEPRE5.setText(texto16);
         String texto17 ="<html><center><body>"+descripcion17+"<br>"+descripcion2_17+"<br><font color='RED'>Q"+Precio17+"</font></body></center></html>";
        BEPRE6.setText(texto17);
         String texto18 ="<html><center><body>"+descripcion18+"<br>"+descripcion2_18+"<br><font color='RED'>Q"+Precio18+"</font></body></center></html>";
        BEPRE7.setText(texto18);
         String texto19 ="<html><center><body>"+descripcion19+"<br>"+descripcion2_19+"<br><font color='RED'>Q"+Precio19+"</font></body></center></html>";
        BEPRE8.setText(texto19);
         String texto20 ="<html><center><body>"+descripcion20+"<br>"+descripcion2_20+"<br><font color='RED'>Q"+Precio20+"</font></body></center></html>";
        BEPRE9.setText(texto20);
         String texto21 ="<html><center><body>"+descripcion21+"<br>"+descripcion2_21+"<br><font color='RED'>Q"+Precio21+"</font></body></center></html>";
        BEPRE10.setText(texto21);
        String texto22 ="<html><center><body>"+descripcion22+"<br>"+descripcion2_22+"<br><font color='RED'>Q"+Precio22+"</font></body></center></html>";
        BE12.setText(texto22);
        String texto23 ="<html><center><body>"+descripcion23+"<br>"+descripcion2_23+"<br><font color='RED'>Q"+Precio23+"</font></body></center></html>";
        BE13.setText(texto23);
        String texto24 ="<html><center><body>"+descripcion24+"<br>"+descripcion2_24+"<br><font color='RED'>Q"+Precio24+"</font></body></center></html>";
        BE14.setText(texto24);
        String texto25 ="<html><center><body>"+descripcion25+"<br>"+descripcion2_25+"<br><font color='RED'>Q"+Precio25+"</font></body></center></html>";
        BE15.setText(texto25);
        String texto26 ="<html><center><body>"+descripcion26+"<br>"+descripcion2_26+"<br><font color='RED'>Q"+Precio26+"</font></body></center></html>";
        BE16.setText(texto26);
        String texto27 ="<html><center><body>"+descripcion27+"<br>"+descripcion2_27+"<br><font color='RED'>Q"+Precio27+"</font></body></center></html>";
        BE17.setText(texto27);
        String texto28 ="<html><center><body>"+descripcion28+"<br>"+descripcion2_28+"<br><font color='RED'>Q"+Precio28+"</font></body></center></html>";
        BE18.setText(texto28);
        String texto29 ="<html><center><body>"+descripcion29+"<br>"+descripcion2_29+"<br><font color='RED'>Q"+Precio29+"</font></body></center></html>";
        BE19.setText(texto29);
        String texto30 ="<html><center><body>"+descripcion30+"<br>"+descripcion2_30+"<br><font color='RED'>Q"+Precio30+"</font></body></center></html>";
        BEPRE11.setText(texto30);
        String texto31 ="<html><center><body>"+descripcion31+"<br>"+descripcion2_31+"<br><font color='RED'>Q"+Precio31+"</font></body></center></html>";
        BEPRE12.setText(texto31);
        String texto32 ="<html><center><body>"+descripcion32+"<br>"+descripcion2_32+"<br><font color='RED'>Q"+Precio32+"</font></body></center></html>";
        BEPRE13.setText(texto32);
        String texto33 ="<html><center><body>"+descripcion33+"<br>"+descripcion2_33+"<br><font color='RED'>Q"+Precio33+"</font></body></center></html>";
        BEPRE14.setText(texto33);
        String texto34 ="<html><center><body>"+descripcion34+"<br>"+descripcion2_34+"<br><font color='RED'>Q"+Precio34+"</font></body></center></html>";
        BEPRE15.setText(texto34);
        String texto35 ="<html><center><body>"+descripcion35+"<br>"+descripcion2_35+"<br><font color='RED'>Q"+Precio35+"</font></body></center></html>";
        BEPRE16.setText(texto35);
        String texto36 ="<html><center><body>"+descripcion36+"<br>"+descripcion2_36+"<br><font color='RED'>Q"+Precio36+"</font></body></center></html>";
        BEPRE17.setText(texto36);
        String texto37 ="<html><center><body>"+descripcion37+"<br>"+descripcion2_37+"<br><font color='RED'>Q"+Precio37+"</font></body></center></html>";
        BEPRE18.setText(texto37);
        String texto38 ="<html><center><body>"+descripcion38+"<br>"+descripcion2_38+"<br><font color='RED'>Q"+Precio38+"</font></body></center></html>";
        BEPRE19.setText(texto38);
        String texto39 ="<html><center><body>"+descripcion39+"<br>"+descripcion2_39+"<br><font color='RED'>Q"+Precio39+"</font></body></center></html>";
        BEPRE20.setText(texto39);
    }

}
