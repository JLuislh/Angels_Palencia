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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author jluis
 */
public class Extras extends javax.swing.JPanel {
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
 String MICHE1_1;String MICHE2_1;String PrecioM1; int codigoM1;
 String MICHE1_2;String MICHE2_2;String PrecioM2; int codigoM2;
 String MICHE1_3;String MICHE2_3;String PrecioM3; int codigoM3;
 String MICHE1_4;String MICHE2_4;String PrecioM4; int codigoM4;
 String MICHE1_5;String MICHE2_5;String PrecioM5; int codigoM5;
 String MICHE1_6;String MICHE2_6;String PrecioM6; int codigoM6;
 String MICHE1_7;String MICHE2_7;String PrecioM7; int codigoM7;
 String MICHE1_8;String MICHE2_8;String PrecioM8; int codigoM8;
 String MICHE1_9;String MICHE2_9;String PrecioM9; int codigoM9;
 String MICHE1_10;String MICHE2_10;String PrecioM10; int codigoM10;
 String MICHE1_11;String MICHE2_11;String PrecioM11; int codigoM11;
 String MICHE1_12;String MICHE2_12;String PrecioM12; int codigoM12;
 String MICHE1_13;String MICHE2_13;String PrecioM13; int codigoM13;
 String MICHE1_14;String MICHE2_14;String PrecioM14; int codigoM14;
 String MICHE1_15;String MICHE2_15;String PrecioM15; int codigoM15;
 String MICHE1_16;String MICHE2_16;String PrecioM16; int codigoM16;
 String MICHE1_17;String MICHE2_17;String PrecioM17; int codigoM17;
 String MICHE1_18;String MICHE2_18;String PrecioM18; int codigoM18;
 String MICHE1_19;String MICHE2_19;String PrecioM19; int codigoM19;
 String MICHE1_20;String MICHE2_20;String PrecioM20; int codigoM20;
 String MICHE1_21;String MICHE2_21;String PrecioM21; int codigoM21;
 String MICHE1_22;String MICHE2_22;String PrecioM22; int codigoM22;
 String MICHE1_23;String MICHE2_23;String PrecioM23; int codigoM23;
 String MICHE1_24;String MICHE2_24;String PrecioM24; int codigoM24;
 String MICHE1_25;String MICHE2_25;String PrecioM25; int codigoM25;
 String MICHE1_26;String MICHE2_26;String PrecioM26; int codigoM26;
 int noorden;
 int codigooreden;
 int existe = 0;
 int tipomenu = 0;
 int tipo;

    /**
     * Creates new form Hamburguesas
     * @param a
     * @param b
     */
    public Extras(int a,int b) {
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
       MICHE1.setBackground(Original);
       MICHE2.setBackground(Original);
       MICHE3.setBackground(Original);
       MICHE4.setBackground(Original);
       MICHE5.setBackground(Original);
       MICHE6.setBackground(Original);
       MICHE7.setBackground(Original);
       MICHE8.setBackground(Original);
       MICHE9.setBackground(Original);
       MICHE10.setBackground(Original);
       MICHE11.setBackground(Original);
       MICHE12.setBackground(Original);
       MICHE13.setBackground(Original);
       MICHE14.setBackground(Original);
       MICHE15.setBackground(Original);
       MICHE16.setBackground(Original);
       MICHE17.setBackground(Original);
       MICHE18.setBackground(Original);
       MICHE19.setBackground(Original);
       MICHE20.setBackground(Original);
       MICHE21.setBackground(Original);
       MICHE22.setBackground(Original);
       MICHE23.setBackground(Original);
       MICHE24.setBackground(Original);
       MICHE25.setBackground(Original);
       MICHE26.setBackground(Original);
     }
    });
    
     public  void BuscarTipo() {
            try {
                BDConexion conecta = new BDConexion();
                Connection cn = conecta.getConexion();
                java.sql.Statement stmt = cn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT COMBEB  FROM PRODUCTOS  WHERE  CODIGO ="+codigooreden );
                while (rs.next()) {
                    tipo = rs.getInt(1);
                }
                rs.close();
                stmt.close();
                cn.close();
            } catch (Exception error) {
                System.out.print(error);
            }
            
        } 
    
    private void InsertarProductoPedido() {
       BuscarTipo();
        try {
            InsertarProducto p1 = new InsertarProducto();
            p1.setNoOrden(noorden);
            p1.setId_producto(codigooreden);
            p1.setTipo(tipo);
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
                 smtp = con.prepareStatement("update VENTAS SET CANTIDAD = CANTIDAD+1, TOTAL = CANTIDAD*(SELECT PRECIO FROM productos WHERE CODIGO = "+codigooreden+") WHERE NOORDEN = "+noorden+" and estado = 1 AND CODIGO = "+codigooreden);
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
                ResultSet rs = stmt.executeQuery("SELECT cantidad as EXISTE FROM ventas  WHERE NOORDEN =  "+noorden+" and estado = 1 AND CODIGO ="+codigooreden );
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
                 smtp = con.prepareStatement("update VENTAS SET CANTIDAD = CANTIDAD-1,Total = TOTAL-(SELECT PRECIO FROM productos WHERE CODIGO = "+codigooreden+") WHERE NOORDEN = "+noorden+" and estado = 1 AND CODIGO = "+codigooreden);
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
            ps= con.prepareStatement("delete from Ventas where noorden="+noorden+" and estado = 1 and codigo = "+codigooreden);
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
        EX1 = new javax.swing.JLabel();
        P2 = new ClassAngels.PanelRound();
        EX2 = new javax.swing.JLabel();
        P3 = new ClassAngels.PanelRound();
        EX3 = new javax.swing.JLabel();
        P4 = new ClassAngels.PanelRound();
        EX4 = new javax.swing.JLabel();
        P5 = new ClassAngels.PanelRound();
        EX5 = new javax.swing.JLabel();
        P6 = new ClassAngels.PanelRound();
        EX6 = new javax.swing.JLabel();
        P7 = new ClassAngels.PanelRound();
        EX7 = new javax.swing.JLabel();
        P8 = new ClassAngels.PanelRound();
        EX8 = new javax.swing.JLabel();
        P9 = new ClassAngels.PanelRound();
        EX9 = new javax.swing.JLabel();
        P10 = new ClassAngels.PanelRound();
        EX10 = new javax.swing.JLabel();
        P11 = new ClassAngels.PanelRound();
        EX11 = new javax.swing.JLabel();
        P12 = new ClassAngels.PanelRound();
        EX12 = new javax.swing.JLabel();
        P13 = new ClassAngels.PanelRound();
        EX13 = new javax.swing.JLabel();
        P14 = new ClassAngels.PanelRound();
        EX14 = new javax.swing.JLabel();
        P15 = new ClassAngels.PanelRound();
        EX15 = new javax.swing.JLabel();
        P16 = new ClassAngels.PanelRound();
        EX16 = new javax.swing.JLabel();
        P17 = new ClassAngels.PanelRound();
        EX17 = new javax.swing.JLabel();
        P18 = new ClassAngels.PanelRound();
        EX18 = new javax.swing.JLabel();
        P19 = new ClassAngels.PanelRound();
        EX19 = new javax.swing.JLabel();
        P20 = new ClassAngels.PanelRound();
        EX20 = new javax.swing.JLabel();
        P21 = new ClassAngels.PanelRound();
        EX21 = new javax.swing.JLabel();
        P22 = new ClassAngels.PanelRound();
        EX22 = new javax.swing.JLabel();
        P23 = new ClassAngels.PanelRound();
        EX23 = new javax.swing.JLabel();
        P24 = new ClassAngels.PanelRound();
        EX24 = new javax.swing.JLabel();
        P25 = new ClassAngels.PanelRound();
        EX25 = new javax.swing.JLabel();
        P26 = new ClassAngels.PanelRound();
        EX26 = new javax.swing.JLabel();
        P27 = new ClassAngels.PanelRound();
        EX27 = new javax.swing.JLabel();
        P28 = new ClassAngels.PanelRound();
        EX28 = new javax.swing.JLabel();
        P29 = new ClassAngels.PanelRound();
        EX29 = new javax.swing.JLabel();
        P30 = new ClassAngels.PanelRound();
        EX30 = new javax.swing.JLabel();
        P31 = new ClassAngels.PanelRound();
        EX31 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        MICHE1 = new ClassAngels.PanelRound();
        MI1 = new javax.swing.JLabel();
        MICHE2 = new ClassAngels.PanelRound();
        MI2 = new javax.swing.JLabel();
        MICHE3 = new ClassAngels.PanelRound();
        MI3 = new javax.swing.JLabel();
        MICHE4 = new ClassAngels.PanelRound();
        MI4 = new javax.swing.JLabel();
        MICHE5 = new ClassAngels.PanelRound();
        MI5 = new javax.swing.JLabel();
        MICHE6 = new ClassAngels.PanelRound();
        MI6 = new javax.swing.JLabel();
        MICHE7 = new ClassAngels.PanelRound();
        MI7 = new javax.swing.JLabel();
        MICHE8 = new ClassAngels.PanelRound();
        MI8 = new javax.swing.JLabel();
        MICHE9 = new ClassAngels.PanelRound();
        MI9 = new javax.swing.JLabel();
        MICHE10 = new ClassAngels.PanelRound();
        MI10 = new javax.swing.JLabel();
        MICHE11 = new ClassAngels.PanelRound();
        MI11 = new javax.swing.JLabel();
        MICHE12 = new ClassAngels.PanelRound();
        MI12 = new javax.swing.JLabel();
        MICHE13 = new ClassAngels.PanelRound();
        MI13 = new javax.swing.JLabel();
        MICHE14 = new ClassAngels.PanelRound();
        MI14 = new javax.swing.JLabel();
        MICHE15 = new ClassAngels.PanelRound();
        MI15 = new javax.swing.JLabel();
        MICHE16 = new ClassAngels.PanelRound();
        MI16 = new javax.swing.JLabel();
        MICHE17 = new ClassAngels.PanelRound();
        MI17 = new javax.swing.JLabel();
        MICHE18 = new ClassAngels.PanelRound();
        MI18 = new javax.swing.JLabel();
        MICHE19 = new ClassAngels.PanelRound();
        MI19 = new javax.swing.JLabel();
        MICHE20 = new ClassAngels.PanelRound();
        MI20 = new javax.swing.JLabel();
        MICHE21 = new ClassAngels.PanelRound();
        MI21 = new javax.swing.JLabel();
        MICHE22 = new ClassAngels.PanelRound();
        MI22 = new javax.swing.JLabel();
        MICHE23 = new ClassAngels.PanelRound();
        MI23 = new javax.swing.JLabel();
        MICHE24 = new ClassAngels.PanelRound();
        MI24 = new javax.swing.JLabel();
        MICHE25 = new ClassAngels.PanelRound();
        MI25 = new javax.swing.JLabel();
        MICHE26 = new ClassAngels.PanelRound();
        MI26 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 102));

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "EXTRAS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        P1.setBackground(new java.awt.Color(204, 255, 102));
        P1.setPreferredSize(new java.awt.Dimension(80, 55));
        P1.setRoundBottomLeft(20);
        P1.setRoundBottomRight(20);
        P1.setRoundTopLeft(20);
        P1.setRoundTopRight(20);

        EX1.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        EX1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EX1.setText("1");
        EX1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EX1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P1Layout = new javax.swing.GroupLayout(P1);
        P1.setLayout(P1Layout);
        P1Layout.setHorizontalGroup(
            P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EX1, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        P1Layout.setVerticalGroup(
            P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EX1, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        P2.setBackground(new java.awt.Color(204, 255, 102));
        P2.setPreferredSize(new java.awt.Dimension(80, 55));
        P2.setRoundBottomLeft(20);
        P2.setRoundBottomRight(20);
        P2.setRoundTopLeft(20);
        P2.setRoundTopRight(20);

        EX2.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        EX2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EX2.setText("2");
        EX2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EX2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P2Layout = new javax.swing.GroupLayout(P2);
        P2.setLayout(P2Layout);
        P2Layout.setHorizontalGroup(
            P2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EX2, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        P2Layout.setVerticalGroup(
            P2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EX2, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        P3.setBackground(new java.awt.Color(204, 255, 102));
        P3.setPreferredSize(new java.awt.Dimension(80, 55));
        P3.setRoundBottomLeft(20);
        P3.setRoundBottomRight(20);
        P3.setRoundTopLeft(20);
        P3.setRoundTopRight(20);

        EX3.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        EX3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EX3.setText("3");
        EX3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EX3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P3Layout = new javax.swing.GroupLayout(P3);
        P3.setLayout(P3Layout);
        P3Layout.setHorizontalGroup(
            P3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EX3, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        P3Layout.setVerticalGroup(
            P3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EX3, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        P4.setBackground(new java.awt.Color(204, 255, 102));
        P4.setPreferredSize(new java.awt.Dimension(80, 55));
        P4.setRoundBottomLeft(20);
        P4.setRoundBottomRight(20);
        P4.setRoundTopLeft(20);
        P4.setRoundTopRight(20);

        EX4.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        EX4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EX4.setText("4");
        EX4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EX4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P4Layout = new javax.swing.GroupLayout(P4);
        P4.setLayout(P4Layout);
        P4Layout.setHorizontalGroup(
            P4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EX4, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        P4Layout.setVerticalGroup(
            P4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EX4, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        P5.setBackground(new java.awt.Color(204, 255, 102));
        P5.setPreferredSize(new java.awt.Dimension(80, 55));
        P5.setRoundBottomLeft(20);
        P5.setRoundBottomRight(20);
        P5.setRoundTopLeft(20);
        P5.setRoundTopRight(20);

        EX5.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        EX5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EX5.setText("5");
        EX5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EX5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P5Layout = new javax.swing.GroupLayout(P5);
        P5.setLayout(P5Layout);
        P5Layout.setHorizontalGroup(
            P5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EX5, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        P5Layout.setVerticalGroup(
            P5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EX5, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        P6.setBackground(new java.awt.Color(204, 255, 102));
        P6.setPreferredSize(new java.awt.Dimension(80, 55));
        P6.setRoundBottomLeft(20);
        P6.setRoundBottomRight(20);
        P6.setRoundTopLeft(20);
        P6.setRoundTopRight(20);

        EX6.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        EX6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EX6.setText("6");
        EX6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EX6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P6Layout = new javax.swing.GroupLayout(P6);
        P6.setLayout(P6Layout);
        P6Layout.setHorizontalGroup(
            P6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EX6, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        P6Layout.setVerticalGroup(
            P6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EX6, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        P7.setBackground(new java.awt.Color(204, 255, 102));
        P7.setPreferredSize(new java.awt.Dimension(80, 55));
        P7.setRoundBottomLeft(20);
        P7.setRoundBottomRight(20);
        P7.setRoundTopLeft(20);
        P7.setRoundTopRight(20);

        EX7.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        EX7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EX7.setText("7");
        EX7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EX7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P7Layout = new javax.swing.GroupLayout(P7);
        P7.setLayout(P7Layout);
        P7Layout.setHorizontalGroup(
            P7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EX7, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        P7Layout.setVerticalGroup(
            P7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EX7, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        P8.setBackground(new java.awt.Color(204, 255, 102));
        P8.setPreferredSize(new java.awt.Dimension(80, 55));
        P8.setRoundBottomLeft(20);
        P8.setRoundBottomRight(20);
        P8.setRoundTopLeft(20);
        P8.setRoundTopRight(20);

        EX8.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        EX8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EX8.setText("8");
        EX8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EX8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P8Layout = new javax.swing.GroupLayout(P8);
        P8.setLayout(P8Layout);
        P8Layout.setHorizontalGroup(
            P8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EX8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        P8Layout.setVerticalGroup(
            P8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EX8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        P9.setBackground(new java.awt.Color(204, 255, 102));
        P9.setPreferredSize(new java.awt.Dimension(80, 55));
        P9.setRoundBottomLeft(20);
        P9.setRoundBottomRight(20);
        P9.setRoundTopLeft(20);
        P9.setRoundTopRight(20);

        EX9.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        EX9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EX9.setText("9");
        EX9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EX9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P9Layout = new javax.swing.GroupLayout(P9);
        P9.setLayout(P9Layout);
        P9Layout.setHorizontalGroup(
            P9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EX9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        P9Layout.setVerticalGroup(
            P9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EX9, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        P10.setBackground(new java.awt.Color(204, 255, 102));
        P10.setMinimumSize(new java.awt.Dimension(100, 75));
        P10.setPreferredSize(new java.awt.Dimension(80, 55));
        P10.setRoundBottomLeft(20);
        P10.setRoundBottomRight(20);
        P10.setRoundTopLeft(20);
        P10.setRoundTopRight(20);

        EX10.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        EX10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EX10.setText("10");
        EX10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EX10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P10Layout = new javax.swing.GroupLayout(P10);
        P10.setLayout(P10Layout);
        P10Layout.setHorizontalGroup(
            P10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EX10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        P10Layout.setVerticalGroup(
            P10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EX10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        P11.setBackground(new java.awt.Color(204, 255, 102));
        P11.setMinimumSize(new java.awt.Dimension(100, 75));
        P11.setPreferredSize(new java.awt.Dimension(80, 55));
        P11.setRoundBottomLeft(20);
        P11.setRoundBottomRight(20);
        P11.setRoundTopLeft(20);
        P11.setRoundTopRight(20);

        EX11.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        EX11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EX11.setText("11");
        EX11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EX11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P11Layout = new javax.swing.GroupLayout(P11);
        P11.setLayout(P11Layout);
        P11Layout.setHorizontalGroup(
            P11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P11Layout.createSequentialGroup()
                .addComponent(EX11, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        P11Layout.setVerticalGroup(
            P11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EX11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        P12.setBackground(new java.awt.Color(204, 255, 102));
        P12.setPreferredSize(new java.awt.Dimension(80, 55));
        P12.setRoundBottomLeft(20);
        P12.setRoundBottomRight(20);
        P12.setRoundTopLeft(20);
        P12.setRoundTopRight(20);

        EX12.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        EX12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EX12.setText("12");
        EX12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EX12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P12Layout = new javax.swing.GroupLayout(P12);
        P12.setLayout(P12Layout);
        P12Layout.setHorizontalGroup(
            P12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EX12, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        P12Layout.setVerticalGroup(
            P12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EX12, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        P13.setBackground(new java.awt.Color(204, 255, 102));
        P13.setPreferredSize(new java.awt.Dimension(80, 55));
        P13.setRoundBottomLeft(20);
        P13.setRoundBottomRight(20);
        P13.setRoundTopLeft(20);
        P13.setRoundTopRight(20);

        EX13.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        EX13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EX13.setText("13");
        EX13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EX13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P13Layout = new javax.swing.GroupLayout(P13);
        P13.setLayout(P13Layout);
        P13Layout.setHorizontalGroup(
            P13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EX13, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        P13Layout.setVerticalGroup(
            P13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EX13, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        P14.setBackground(new java.awt.Color(204, 255, 102));
        P14.setPreferredSize(new java.awt.Dimension(80, 55));
        P14.setRoundBottomLeft(20);
        P14.setRoundBottomRight(20);
        P14.setRoundTopLeft(20);
        P14.setRoundTopRight(20);

        EX14.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        EX14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EX14.setText("14");
        EX14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EX14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P14Layout = new javax.swing.GroupLayout(P14);
        P14.setLayout(P14Layout);
        P14Layout.setHorizontalGroup(
            P14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
            .addGroup(P14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(EX14, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
        );
        P14Layout.setVerticalGroup(
            P14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
            .addGroup(P14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(EX14, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
        );

        P15.setBackground(new java.awt.Color(204, 255, 102));
        P15.setPreferredSize(new java.awt.Dimension(80, 55));
        P15.setRoundBottomLeft(20);
        P15.setRoundBottomRight(20);
        P15.setRoundTopLeft(20);
        P15.setRoundTopRight(20);

        EX15.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        EX15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EX15.setText("15");
        EX15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EX15MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P15Layout = new javax.swing.GroupLayout(P15);
        P15.setLayout(P15Layout);
        P15Layout.setHorizontalGroup(
            P15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EX15, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        P15Layout.setVerticalGroup(
            P15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EX15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        P16.setBackground(new java.awt.Color(204, 255, 102));
        P16.setPreferredSize(new java.awt.Dimension(80, 55));
        P16.setRoundBottomLeft(20);
        P16.setRoundBottomRight(20);
        P16.setRoundTopLeft(20);
        P16.setRoundTopRight(20);

        EX16.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        EX16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EX16.setText("16");
        EX16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EX16MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P16Layout = new javax.swing.GroupLayout(P16);
        P16.setLayout(P16Layout);
        P16Layout.setHorizontalGroup(
            P16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EX16, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        P16Layout.setVerticalGroup(
            P16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EX16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        P17.setBackground(new java.awt.Color(204, 255, 102));
        P17.setPreferredSize(new java.awt.Dimension(80, 55));
        P17.setRoundBottomLeft(20);
        P17.setRoundBottomRight(20);
        P17.setRoundTopLeft(20);
        P17.setRoundTopRight(20);

        EX17.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        EX17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EX17.setText("17");
        EX17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EX17MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P17Layout = new javax.swing.GroupLayout(P17);
        P17.setLayout(P17Layout);
        P17Layout.setHorizontalGroup(
            P17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EX17, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        P17Layout.setVerticalGroup(
            P17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EX17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        P18.setBackground(new java.awt.Color(204, 255, 102));
        P18.setPreferredSize(new java.awt.Dimension(80, 55));
        P18.setRoundBottomLeft(20);
        P18.setRoundBottomRight(20);
        P18.setRoundTopLeft(20);
        P18.setRoundTopRight(20);

        EX18.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        EX18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EX18.setText("18");
        EX18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EX18MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P18Layout = new javax.swing.GroupLayout(P18);
        P18.setLayout(P18Layout);
        P18Layout.setHorizontalGroup(
            P18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EX18, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        P18Layout.setVerticalGroup(
            P18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EX18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        P19.setBackground(new java.awt.Color(204, 255, 102));
        P19.setPreferredSize(new java.awt.Dimension(80, 55));
        P19.setRoundBottomLeft(20);
        P19.setRoundBottomRight(20);
        P19.setRoundTopLeft(20);
        P19.setRoundTopRight(20);

        EX19.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        EX19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EX19.setText("19");
        EX19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EX19MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P19Layout = new javax.swing.GroupLayout(P19);
        P19.setLayout(P19Layout);
        P19Layout.setHorizontalGroup(
            P19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EX19, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        P19Layout.setVerticalGroup(
            P19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EX19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        P20.setBackground(new java.awt.Color(204, 255, 102));
        P20.setPreferredSize(new java.awt.Dimension(80, 55));
        P20.setRoundBottomLeft(20);
        P20.setRoundBottomRight(20);
        P20.setRoundTopLeft(20);
        P20.setRoundTopRight(20);

        EX20.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        EX20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EX20.setText("20");
        EX20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EX20MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P20Layout = new javax.swing.GroupLayout(P20);
        P20.setLayout(P20Layout);
        P20Layout.setHorizontalGroup(
            P20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EX20, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        P20Layout.setVerticalGroup(
            P20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EX20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        P21.setBackground(new java.awt.Color(204, 255, 102));
        P21.setPreferredSize(new java.awt.Dimension(80, 55));
        P21.setRoundBottomLeft(20);
        P21.setRoundBottomRight(20);
        P21.setRoundTopLeft(20);
        P21.setRoundTopRight(20);

        EX21.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        EX21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EX21.setText("21");
        EX21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EX21MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P21Layout = new javax.swing.GroupLayout(P21);
        P21.setLayout(P21Layout);
        P21Layout.setHorizontalGroup(
            P21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EX21, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        P21Layout.setVerticalGroup(
            P21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EX21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        P22.setBackground(new java.awt.Color(204, 255, 102));
        P22.setPreferredSize(new java.awt.Dimension(80, 55));
        P22.setRoundBottomLeft(20);
        P22.setRoundBottomRight(20);
        P22.setRoundTopLeft(20);
        P22.setRoundTopRight(20);

        EX22.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        EX22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EX22.setText("22");
        EX22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EX22MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P22Layout = new javax.swing.GroupLayout(P22);
        P22.setLayout(P22Layout);
        P22Layout.setHorizontalGroup(
            P22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EX22, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        P22Layout.setVerticalGroup(
            P22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EX22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        P23.setBackground(new java.awt.Color(204, 255, 102));
        P23.setPreferredSize(new java.awt.Dimension(80, 55));
        P23.setRoundBottomLeft(20);
        P23.setRoundBottomRight(20);
        P23.setRoundTopLeft(20);
        P23.setRoundTopRight(20);

        EX23.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        EX23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EX23.setText("23");
        EX23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EX23MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P23Layout = new javax.swing.GroupLayout(P23);
        P23.setLayout(P23Layout);
        P23Layout.setHorizontalGroup(
            P23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EX23, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        P23Layout.setVerticalGroup(
            P23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EX23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        P24.setBackground(new java.awt.Color(204, 255, 102));
        P24.setPreferredSize(new java.awt.Dimension(80, 55));
        P24.setRoundBottomLeft(20);
        P24.setRoundBottomRight(20);
        P24.setRoundTopLeft(20);
        P24.setRoundTopRight(20);

        EX24.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        EX24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EX24.setText("24");
        EX24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EX24MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P24Layout = new javax.swing.GroupLayout(P24);
        P24.setLayout(P24Layout);
        P24Layout.setHorizontalGroup(
            P24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EX24, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        P24Layout.setVerticalGroup(
            P24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EX24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        P25.setBackground(new java.awt.Color(204, 255, 102));
        P25.setPreferredSize(new java.awt.Dimension(80, 55));
        P25.setRoundBottomLeft(20);
        P25.setRoundBottomRight(20);
        P25.setRoundTopLeft(20);
        P25.setRoundTopRight(20);

        EX25.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        EX25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EX25.setText("25");
        EX25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EX25MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P25Layout = new javax.swing.GroupLayout(P25);
        P25.setLayout(P25Layout);
        P25Layout.setHorizontalGroup(
            P25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EX25, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        P25Layout.setVerticalGroup(
            P25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EX25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        P26.setBackground(new java.awt.Color(204, 255, 102));
        P26.setPreferredSize(new java.awt.Dimension(80, 55));
        P26.setRoundBottomLeft(20);
        P26.setRoundBottomRight(20);
        P26.setRoundTopLeft(20);
        P26.setRoundTopRight(20);

        EX26.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        EX26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EX26.setText("26");
        EX26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EX26MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P26Layout = new javax.swing.GroupLayout(P26);
        P26.setLayout(P26Layout);
        P26Layout.setHorizontalGroup(
            P26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EX26, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        P26Layout.setVerticalGroup(
            P26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EX26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        P27.setBackground(new java.awt.Color(204, 255, 102));
        P27.setPreferredSize(new java.awt.Dimension(80, 55));
        P27.setRoundBottomLeft(20);
        P27.setRoundBottomRight(20);
        P27.setRoundTopLeft(20);
        P27.setRoundTopRight(20);

        EX27.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        EX27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EX27.setText("27");
        EX27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EX27MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P27Layout = new javax.swing.GroupLayout(P27);
        P27.setLayout(P27Layout);
        P27Layout.setHorizontalGroup(
            P27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EX27, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        P27Layout.setVerticalGroup(
            P27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EX27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        P28.setBackground(new java.awt.Color(204, 255, 102));
        P28.setPreferredSize(new java.awt.Dimension(80, 55));
        P28.setRoundBottomLeft(20);
        P28.setRoundBottomRight(20);
        P28.setRoundTopLeft(20);
        P28.setRoundTopRight(20);

        EX28.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        EX28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EX28.setText("28");
        EX28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EX28MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P28Layout = new javax.swing.GroupLayout(P28);
        P28.setLayout(P28Layout);
        P28Layout.setHorizontalGroup(
            P28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EX28, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        P28Layout.setVerticalGroup(
            P28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EX28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        P29.setBackground(new java.awt.Color(204, 255, 102));
        P29.setPreferredSize(new java.awt.Dimension(80, 55));
        P29.setRoundBottomLeft(20);
        P29.setRoundBottomRight(20);
        P29.setRoundTopLeft(20);
        P29.setRoundTopRight(20);

        EX29.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        EX29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EX29.setText("29");
        EX29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EX29MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P29Layout = new javax.swing.GroupLayout(P29);
        P29.setLayout(P29Layout);
        P29Layout.setHorizontalGroup(
            P29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EX29, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        P29Layout.setVerticalGroup(
            P29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EX29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        P30.setBackground(new java.awt.Color(204, 255, 102));
        P30.setPreferredSize(new java.awt.Dimension(80, 55));
        P30.setRoundBottomLeft(20);
        P30.setRoundBottomRight(20);
        P30.setRoundTopLeft(20);
        P30.setRoundTopRight(20);

        EX30.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        EX30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EX30.setText("30");
        EX30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EX30MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P30Layout = new javax.swing.GroupLayout(P30);
        P30.setLayout(P30Layout);
        P30Layout.setHorizontalGroup(
            P30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EX30, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        P30Layout.setVerticalGroup(
            P30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EX30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        P31.setBackground(new java.awt.Color(204, 255, 102));
        P31.setPreferredSize(new java.awt.Dimension(80, 55));
        P31.setRoundBottomLeft(20);
        P31.setRoundBottomRight(20);
        P31.setRoundTopLeft(20);
        P31.setRoundTopRight(20);

        EX31.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        EX31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EX31.setText("31");
        EX31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EX31MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P31Layout = new javax.swing.GroupLayout(P31);
        P31.setLayout(P31Layout);
        P31Layout.setHorizontalGroup(
            P31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EX31, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        P31Layout.setVerticalGroup(
            P31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EX31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(P12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(P1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(P23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 56, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(P6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(P5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(P4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(P3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(P2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(P1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(P9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(P8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(P7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(P10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(P11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(P15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(P25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel3.setBackground(new java.awt.Color(255, 204, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MICHELADAS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        MICHE1.setBackground(new java.awt.Color(204, 255, 102));
        MICHE1.setPreferredSize(new java.awt.Dimension(80, 55));
        MICHE1.setRoundBottomLeft(20);
        MICHE1.setRoundBottomRight(20);
        MICHE1.setRoundTopLeft(20);
        MICHE1.setRoundTopRight(20);

        MI1.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        MI1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MI1.setText("MI1");
        MI1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MI1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MICHE1Layout = new javax.swing.GroupLayout(MICHE1);
        MICHE1.setLayout(MICHE1Layout);
        MICHE1Layout.setHorizontalGroup(
            MICHE1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MI1, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        MICHE1Layout.setVerticalGroup(
            MICHE1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MI1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        MICHE2.setBackground(new java.awt.Color(204, 255, 102));
        MICHE2.setPreferredSize(new java.awt.Dimension(80, 55));
        MICHE2.setRoundBottomLeft(20);
        MICHE2.setRoundBottomRight(20);
        MICHE2.setRoundTopLeft(20);
        MICHE2.setRoundTopRight(20);

        MI2.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        MI2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MI2.setText("MI2");
        MI2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MI2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MICHE2Layout = new javax.swing.GroupLayout(MICHE2);
        MICHE2.setLayout(MICHE2Layout);
        MICHE2Layout.setHorizontalGroup(
            MICHE2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MI2, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        MICHE2Layout.setVerticalGroup(
            MICHE2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MI2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        MICHE3.setBackground(new java.awt.Color(204, 255, 102));
        MICHE3.setPreferredSize(new java.awt.Dimension(80, 55));
        MICHE3.setRoundBottomLeft(20);
        MICHE3.setRoundBottomRight(20);
        MICHE3.setRoundTopLeft(20);
        MICHE3.setRoundTopRight(20);

        MI3.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        MI3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MI3.setText("MI3");
        MI3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MI3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MICHE3Layout = new javax.swing.GroupLayout(MICHE3);
        MICHE3.setLayout(MICHE3Layout);
        MICHE3Layout.setHorizontalGroup(
            MICHE3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MI3, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        MICHE3Layout.setVerticalGroup(
            MICHE3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MI3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        MICHE4.setBackground(new java.awt.Color(204, 255, 102));
        MICHE4.setPreferredSize(new java.awt.Dimension(80, 55));
        MICHE4.setRoundBottomLeft(20);
        MICHE4.setRoundBottomRight(20);
        MICHE4.setRoundTopLeft(20);
        MICHE4.setRoundTopRight(20);

        MI4.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        MI4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MI4.setText("MI4");
        MI4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MI4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MICHE4Layout = new javax.swing.GroupLayout(MICHE4);
        MICHE4.setLayout(MICHE4Layout);
        MICHE4Layout.setHorizontalGroup(
            MICHE4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MI4, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        MICHE4Layout.setVerticalGroup(
            MICHE4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MI4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        MICHE5.setBackground(new java.awt.Color(204, 255, 102));
        MICHE5.setPreferredSize(new java.awt.Dimension(80, 55));
        MICHE5.setRoundBottomLeft(20);
        MICHE5.setRoundBottomRight(20);
        MICHE5.setRoundTopLeft(20);
        MICHE5.setRoundTopRight(20);

        MI5.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        MI5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MI5.setText("MI5");
        MI5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MI5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MICHE5Layout = new javax.swing.GroupLayout(MICHE5);
        MICHE5.setLayout(MICHE5Layout);
        MICHE5Layout.setHorizontalGroup(
            MICHE5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MI5, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        MICHE5Layout.setVerticalGroup(
            MICHE5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MI5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        MICHE6.setBackground(new java.awt.Color(204, 255, 102));
        MICHE6.setPreferredSize(new java.awt.Dimension(80, 55));
        MICHE6.setRoundBottomLeft(20);
        MICHE6.setRoundBottomRight(20);
        MICHE6.setRoundTopLeft(20);
        MICHE6.setRoundTopRight(20);

        MI6.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        MI6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MI6.setText("MI6");
        MI6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MI6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MICHE6Layout = new javax.swing.GroupLayout(MICHE6);
        MICHE6.setLayout(MICHE6Layout);
        MICHE6Layout.setHorizontalGroup(
            MICHE6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MI6, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        MICHE6Layout.setVerticalGroup(
            MICHE6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MI6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        MICHE7.setBackground(new java.awt.Color(204, 255, 102));
        MICHE7.setPreferredSize(new java.awt.Dimension(80, 55));
        MICHE7.setRoundBottomLeft(20);
        MICHE7.setRoundBottomRight(20);
        MICHE7.setRoundTopLeft(20);
        MICHE7.setRoundTopRight(20);

        MI7.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        MI7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MI7.setText("MI7");
        MI7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MI7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MICHE7Layout = new javax.swing.GroupLayout(MICHE7);
        MICHE7.setLayout(MICHE7Layout);
        MICHE7Layout.setHorizontalGroup(
            MICHE7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MI7, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        MICHE7Layout.setVerticalGroup(
            MICHE7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MI7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        MICHE8.setBackground(new java.awt.Color(204, 255, 102));
        MICHE8.setPreferredSize(new java.awt.Dimension(80, 55));
        MICHE8.setRoundBottomLeft(20);
        MICHE8.setRoundBottomRight(20);
        MICHE8.setRoundTopLeft(20);
        MICHE8.setRoundTopRight(20);

        MI8.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        MI8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MI8.setText("MI8");
        MI8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MI8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MICHE8Layout = new javax.swing.GroupLayout(MICHE8);
        MICHE8.setLayout(MICHE8Layout);
        MICHE8Layout.setHorizontalGroup(
            MICHE8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MI8, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        MICHE8Layout.setVerticalGroup(
            MICHE8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MI8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        MICHE9.setBackground(new java.awt.Color(204, 255, 102));
        MICHE9.setPreferredSize(new java.awt.Dimension(80, 55));
        MICHE9.setRoundBottomLeft(20);
        MICHE9.setRoundBottomRight(20);
        MICHE9.setRoundTopLeft(20);
        MICHE9.setRoundTopRight(20);

        MI9.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        MI9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MI9.setText("MI9");
        MI9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MI9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MICHE9Layout = new javax.swing.GroupLayout(MICHE9);
        MICHE9.setLayout(MICHE9Layout);
        MICHE9Layout.setHorizontalGroup(
            MICHE9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MI9, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        MICHE9Layout.setVerticalGroup(
            MICHE9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MI9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        MICHE10.setBackground(new java.awt.Color(204, 255, 102));
        MICHE10.setPreferredSize(new java.awt.Dimension(80, 55));
        MICHE10.setRoundBottomLeft(20);
        MICHE10.setRoundBottomRight(20);
        MICHE10.setRoundTopLeft(20);
        MICHE10.setRoundTopRight(20);

        MI10.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        MI10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MI10.setText("MI10");
        MI10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MI10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MICHE10Layout = new javax.swing.GroupLayout(MICHE10);
        MICHE10.setLayout(MICHE10Layout);
        MICHE10Layout.setHorizontalGroup(
            MICHE10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MI10, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        MICHE10Layout.setVerticalGroup(
            MICHE10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MI10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        MICHE11.setBackground(new java.awt.Color(204, 255, 102));
        MICHE11.setPreferredSize(new java.awt.Dimension(80, 55));
        MICHE11.setRoundBottomLeft(20);
        MICHE11.setRoundBottomRight(20);
        MICHE11.setRoundTopLeft(20);
        MICHE11.setRoundTopRight(20);

        MI11.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        MI11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MI11.setText("MI11");
        MI11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MI11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MICHE11Layout = new javax.swing.GroupLayout(MICHE11);
        MICHE11.setLayout(MICHE11Layout);
        MICHE11Layout.setHorizontalGroup(
            MICHE11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MI11, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        MICHE11Layout.setVerticalGroup(
            MICHE11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MI11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        MICHE12.setBackground(new java.awt.Color(204, 255, 102));
        MICHE12.setPreferredSize(new java.awt.Dimension(80, 55));
        MICHE12.setRoundBottomLeft(20);
        MICHE12.setRoundBottomRight(20);
        MICHE12.setRoundTopLeft(20);
        MICHE12.setRoundTopRight(20);

        MI12.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        MI12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MI12.setText("MI12");
        MI12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MI12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MICHE12Layout = new javax.swing.GroupLayout(MICHE12);
        MICHE12.setLayout(MICHE12Layout);
        MICHE12Layout.setHorizontalGroup(
            MICHE12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MI12, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        MICHE12Layout.setVerticalGroup(
            MICHE12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MI12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        MICHE13.setBackground(new java.awt.Color(204, 255, 102));
        MICHE13.setPreferredSize(new java.awt.Dimension(80, 55));
        MICHE13.setRoundBottomLeft(20);
        MICHE13.setRoundBottomRight(20);
        MICHE13.setRoundTopLeft(20);
        MICHE13.setRoundTopRight(20);

        MI13.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        MI13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MI13.setText("MI13");
        MI13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MI13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MICHE13Layout = new javax.swing.GroupLayout(MICHE13);
        MICHE13.setLayout(MICHE13Layout);
        MICHE13Layout.setHorizontalGroup(
            MICHE13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MI13, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        MICHE13Layout.setVerticalGroup(
            MICHE13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MI13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        MICHE14.setBackground(new java.awt.Color(204, 255, 102));
        MICHE14.setPreferredSize(new java.awt.Dimension(80, 55));
        MICHE14.setRoundBottomLeft(20);
        MICHE14.setRoundBottomRight(20);
        MICHE14.setRoundTopLeft(20);
        MICHE14.setRoundTopRight(20);

        MI14.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        MI14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MI14.setText("MI14");
        MI14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MI14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MICHE14Layout = new javax.swing.GroupLayout(MICHE14);
        MICHE14.setLayout(MICHE14Layout);
        MICHE14Layout.setHorizontalGroup(
            MICHE14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MI14, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        MICHE14Layout.setVerticalGroup(
            MICHE14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MI14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        MICHE15.setBackground(new java.awt.Color(204, 255, 102));
        MICHE15.setPreferredSize(new java.awt.Dimension(80, 55));
        MICHE15.setRoundBottomLeft(20);
        MICHE15.setRoundBottomRight(20);
        MICHE15.setRoundTopLeft(20);
        MICHE15.setRoundTopRight(20);

        MI15.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        MI15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MI15.setText("MI15");
        MI15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MI15MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MICHE15Layout = new javax.swing.GroupLayout(MICHE15);
        MICHE15.setLayout(MICHE15Layout);
        MICHE15Layout.setHorizontalGroup(
            MICHE15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MI15, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        MICHE15Layout.setVerticalGroup(
            MICHE15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MI15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        MICHE16.setBackground(new java.awt.Color(204, 255, 102));
        MICHE16.setPreferredSize(new java.awt.Dimension(80, 55));
        MICHE16.setRoundBottomLeft(20);
        MICHE16.setRoundBottomRight(20);
        MICHE16.setRoundTopLeft(20);
        MICHE16.setRoundTopRight(20);

        MI16.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        MI16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MI16.setText("MI16");
        MI16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MI16MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MICHE16Layout = new javax.swing.GroupLayout(MICHE16);
        MICHE16.setLayout(MICHE16Layout);
        MICHE16Layout.setHorizontalGroup(
            MICHE16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MI16, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        MICHE16Layout.setVerticalGroup(
            MICHE16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MI16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        MICHE17.setBackground(new java.awt.Color(204, 255, 102));
        MICHE17.setPreferredSize(new java.awt.Dimension(80, 55));
        MICHE17.setRoundBottomLeft(20);
        MICHE17.setRoundBottomRight(20);
        MICHE17.setRoundTopLeft(20);
        MICHE17.setRoundTopRight(20);

        MI17.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        MI17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MI17.setText("MI17");
        MI17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MI17MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MICHE17Layout = new javax.swing.GroupLayout(MICHE17);
        MICHE17.setLayout(MICHE17Layout);
        MICHE17Layout.setHorizontalGroup(
            MICHE17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MI17, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        MICHE17Layout.setVerticalGroup(
            MICHE17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MI17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        MICHE18.setBackground(new java.awt.Color(204, 255, 102));
        MICHE18.setPreferredSize(new java.awt.Dimension(80, 55));
        MICHE18.setRoundBottomLeft(20);
        MICHE18.setRoundBottomRight(20);
        MICHE18.setRoundTopLeft(20);
        MICHE18.setRoundTopRight(20);

        MI18.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        MI18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MI18.setText("MI18");
        MI18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MI18MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MICHE18Layout = new javax.swing.GroupLayout(MICHE18);
        MICHE18.setLayout(MICHE18Layout);
        MICHE18Layout.setHorizontalGroup(
            MICHE18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MI18, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        MICHE18Layout.setVerticalGroup(
            MICHE18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MI18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        MICHE19.setBackground(new java.awt.Color(204, 255, 102));
        MICHE19.setPreferredSize(new java.awt.Dimension(80, 55));
        MICHE19.setRoundBottomLeft(20);
        MICHE19.setRoundBottomRight(20);
        MICHE19.setRoundTopLeft(20);
        MICHE19.setRoundTopRight(20);

        MI19.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        MI19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MI19.setText("MI19");
        MI19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MI19MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MICHE19Layout = new javax.swing.GroupLayout(MICHE19);
        MICHE19.setLayout(MICHE19Layout);
        MICHE19Layout.setHorizontalGroup(
            MICHE19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MI19, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        MICHE19Layout.setVerticalGroup(
            MICHE19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MI19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        MICHE20.setBackground(new java.awt.Color(204, 255, 102));
        MICHE20.setPreferredSize(new java.awt.Dimension(80, 55));
        MICHE20.setRoundBottomLeft(20);
        MICHE20.setRoundBottomRight(20);
        MICHE20.setRoundTopLeft(20);
        MICHE20.setRoundTopRight(20);

        MI20.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        MI20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MI20.setText("MI20");
        MI20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MI20MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MICHE20Layout = new javax.swing.GroupLayout(MICHE20);
        MICHE20.setLayout(MICHE20Layout);
        MICHE20Layout.setHorizontalGroup(
            MICHE20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MI20, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        MICHE20Layout.setVerticalGroup(
            MICHE20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MI20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        MICHE21.setBackground(new java.awt.Color(204, 255, 102));
        MICHE21.setPreferredSize(new java.awt.Dimension(80, 55));
        MICHE21.setRoundBottomLeft(20);
        MICHE21.setRoundBottomRight(20);
        MICHE21.setRoundTopLeft(20);
        MICHE21.setRoundTopRight(20);

        MI21.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        MI21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MI21.setText("MI21");
        MI21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MI21MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MICHE21Layout = new javax.swing.GroupLayout(MICHE21);
        MICHE21.setLayout(MICHE21Layout);
        MICHE21Layout.setHorizontalGroup(
            MICHE21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MI21, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        MICHE21Layout.setVerticalGroup(
            MICHE21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MI21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        MICHE22.setBackground(new java.awt.Color(204, 255, 102));
        MICHE22.setPreferredSize(new java.awt.Dimension(80, 55));
        MICHE22.setRoundBottomLeft(20);
        MICHE22.setRoundBottomRight(20);
        MICHE22.setRoundTopLeft(20);
        MICHE22.setRoundTopRight(20);

        MI22.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        MI22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MI22.setText("MI22");
        MI22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MI22MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MICHE22Layout = new javax.swing.GroupLayout(MICHE22);
        MICHE22.setLayout(MICHE22Layout);
        MICHE22Layout.setHorizontalGroup(
            MICHE22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MI22, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        MICHE22Layout.setVerticalGroup(
            MICHE22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MI22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        MICHE23.setBackground(new java.awt.Color(204, 255, 102));
        MICHE23.setPreferredSize(new java.awt.Dimension(80, 55));
        MICHE23.setRoundBottomLeft(20);
        MICHE23.setRoundBottomRight(20);
        MICHE23.setRoundTopLeft(20);
        MICHE23.setRoundTopRight(20);

        MI23.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        MI23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MI23.setText("MI23");
        MI23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MI23MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MICHE23Layout = new javax.swing.GroupLayout(MICHE23);
        MICHE23.setLayout(MICHE23Layout);
        MICHE23Layout.setHorizontalGroup(
            MICHE23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MI23, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        MICHE23Layout.setVerticalGroup(
            MICHE23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MI23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        MICHE24.setBackground(new java.awt.Color(204, 255, 102));
        MICHE24.setPreferredSize(new java.awt.Dimension(80, 55));
        MICHE24.setRoundBottomLeft(20);
        MICHE24.setRoundBottomRight(20);
        MICHE24.setRoundTopLeft(20);
        MICHE24.setRoundTopRight(20);

        MI24.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        MI24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MI24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MI24MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MICHE24Layout = new javax.swing.GroupLayout(MICHE24);
        MICHE24.setLayout(MICHE24Layout);
        MICHE24Layout.setHorizontalGroup(
            MICHE24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MI24, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        MICHE24Layout.setVerticalGroup(
            MICHE24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MI24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        MICHE25.setBackground(new java.awt.Color(204, 255, 102));
        MICHE25.setPreferredSize(new java.awt.Dimension(80, 55));
        MICHE25.setRoundBottomLeft(20);
        MICHE25.setRoundBottomRight(20);
        MICHE25.setRoundTopLeft(20);
        MICHE25.setRoundTopRight(20);

        MI25.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        MI25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MI25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MI25MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MICHE25Layout = new javax.swing.GroupLayout(MICHE25);
        MICHE25.setLayout(MICHE25Layout);
        MICHE25Layout.setHorizontalGroup(
            MICHE25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MI25, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        MICHE25Layout.setVerticalGroup(
            MICHE25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MI25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        MICHE26.setBackground(new java.awt.Color(204, 255, 102));
        MICHE26.setPreferredSize(new java.awt.Dimension(80, 55));
        MICHE26.setRoundBottomLeft(20);
        MICHE26.setRoundBottomRight(20);
        MICHE26.setRoundTopLeft(20);
        MICHE26.setRoundTopRight(20);

        MI26.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        MI26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MI26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MI26MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MICHE26Layout = new javax.swing.GroupLayout(MICHE26);
        MICHE26.setLayout(MICHE26Layout);
        MICHE26Layout.setHorizontalGroup(
            MICHE26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MI26, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        MICHE26Layout.setVerticalGroup(
            MICHE26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MI26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(MICHE1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MICHE2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MICHE3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MICHE4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MICHE5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MICHE6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MICHE7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MICHE8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MICHE9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MICHE10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MICHE11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(MICHE12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MICHE13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MICHE14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(MICHE23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MICHE24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MICHE25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(MICHE15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MICHE16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MICHE17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MICHE18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MICHE19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MICHE20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MICHE21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MICHE22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(MICHE26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MICHE7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MICHE6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MICHE5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MICHE4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MICHE3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MICHE2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MICHE1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MICHE8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MICHE9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MICHE10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MICHE11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(MICHE15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(MICHE14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(MICHE16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(MICHE17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(MICHE18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(MICHE19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(MICHE20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MICHE12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MICHE13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(MICHE22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(MICHE21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(MICHE23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MICHE24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MICHE25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MICHE26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void EX1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EX1MouseClicked
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
    }//GEN-LAST:event_EX1MouseClicked

    private void EX2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EX2MouseClicked
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
    }//GEN-LAST:event_EX2MouseClicked

    private void EX3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EX3MouseClicked
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
    }//GEN-LAST:event_EX3MouseClicked

    private void EX4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EX4MouseClicked
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
    }//GEN-LAST:event_EX4MouseClicked

    private void EX5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EX5MouseClicked
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
    }//GEN-LAST:event_EX5MouseClicked

    private void EX6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EX6MouseClicked
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
    }//GEN-LAST:event_EX6MouseClicked

    private void EX7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EX7MouseClicked
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
    }//GEN-LAST:event_EX7MouseClicked

    private void EX8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EX8MouseClicked
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
    }//GEN-LAST:event_EX8MouseClicked

    private void EX9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EX9MouseClicked
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
    }//GEN-LAST:event_EX9MouseClicked

    private void EX10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EX10MouseClicked
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
    }//GEN-LAST:event_EX10MouseClicked

    private void EX11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EX11MouseClicked
        if ((evt.getModifiers() & 4) !=0){
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
       }
    }//GEN-LAST:event_EX11MouseClicked

    private void EX12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EX12MouseClicked
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
    }//GEN-LAST:event_EX12MouseClicked

    private void EX13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EX13MouseClicked
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
    }//GEN-LAST:event_EX13MouseClicked

    private void EX14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EX14MouseClicked
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
    }//GEN-LAST:event_EX14MouseClicked

    private void EX15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EX15MouseClicked
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
    }//GEN-LAST:event_EX15MouseClicked

    private void EX16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EX16MouseClicked
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
    }//GEN-LAST:event_EX16MouseClicked

    private void EX17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EX17MouseClicked
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
    }//GEN-LAST:event_EX17MouseClicked

    private void EX18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EX18MouseClicked
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
    }//GEN-LAST:event_EX18MouseClicked

    private void EX19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EX19MouseClicked
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
    }//GEN-LAST:event_EX19MouseClicked

    private void EX20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EX20MouseClicked
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
    }//GEN-LAST:event_EX20MouseClicked

    private void EX21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EX21MouseClicked
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
    }//GEN-LAST:event_EX21MouseClicked

    private void EX22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EX22MouseClicked
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
    }//GEN-LAST:event_EX22MouseClicked

    private void EX23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EX23MouseClicked
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
    }//GEN-LAST:event_EX23MouseClicked

    private void EX24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EX24MouseClicked
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
    }//GEN-LAST:event_EX24MouseClicked

    private void EX25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EX25MouseClicked
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
    }//GEN-LAST:event_EX25MouseClicked

    private void EX26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EX26MouseClicked
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
    }//GEN-LAST:event_EX26MouseClicked

    private void MI1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MI1MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigoM1;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            MICHE1.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        }else{
            codigooreden = codigoM1;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            MICHE1.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_MI1MouseClicked

    private void MI2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MI2MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigoM2;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            MICHE2.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        }else{
            codigooreden = codigoM2;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            MICHE2.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_MI2MouseClicked

    private void MI3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MI3MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigoM3;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            MICHE3.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        }else{
            codigooreden = codigoM3;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            MICHE3.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_MI3MouseClicked

    private void MI4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MI4MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigoM4;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            MICHE4.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        }else{
            codigooreden = codigoM4;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            MICHE4.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_MI4MouseClicked

    private void MI5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MI5MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigoM5;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            MICHE5.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        }else{
            codigooreden = codigoM5;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            MICHE5.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_MI5MouseClicked

    private void MI6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MI6MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigoM6;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            MICHE6.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        }else{
            codigooreden = codigoM6;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            MICHE6.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_MI6MouseClicked

    private void MI7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MI7MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigoM7;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            MICHE7.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        }else{
            codigooreden = codigoM7;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            MICHE7.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_MI7MouseClicked

    private void MI8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MI8MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigoM8;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            MICHE8.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        }else{
            codigooreden = codigoM8;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            MICHE8.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_MI8MouseClicked

    private void MI9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MI9MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigoM9;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            MICHE9.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        }else{
            codigooreden = codigoM9;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            MICHE9.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_MI9MouseClicked

    private void MI10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MI10MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigoM10;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            MICHE10.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        }else{
            codigooreden = codigoM10;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            MICHE10.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_MI10MouseClicked

    private void MI11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MI11MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigoM11;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            MICHE11.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        }else{
            codigooreden = codigoM11;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            MICHE11.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_MI11MouseClicked

    private void MI12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MI12MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigoM12;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            MICHE12.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        }else{
            codigooreden = codigoM12;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            MICHE12.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_MI12MouseClicked

    private void MI13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MI13MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigoM13;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            MICHE13.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        }else{
            codigooreden = codigoM13;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            MICHE13.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_MI13MouseClicked

    private void MI14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MI14MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigoM14;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            MICHE14.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        }else{
            codigooreden = codigoM14;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            MICHE14.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_MI14MouseClicked

    private void MI15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MI15MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigoM15;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            MICHE15.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        }else{
            codigooreden = codigoM15;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            MICHE15.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_MI15MouseClicked

    private void MI16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MI16MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigoM16;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            MICHE16.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        }else{
            codigooreden = codigoM16;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            MICHE16.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_MI16MouseClicked

    private void MI17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MI17MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigoM17;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            MICHE17.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        }else{
            codigooreden = codigoM17;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            MICHE17.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_MI17MouseClicked

    private void MI18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MI18MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigoM18;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            MICHE18.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        }else{
            codigooreden = codigoM18;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            MICHE18.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_MI18MouseClicked

    private void MI19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MI19MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigoM19;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            MICHE19.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        }else{
            codigooreden = codigoM19;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            MICHE19.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_MI19MouseClicked

    private void MI20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MI20MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigoM20;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            MICHE20.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        }else{
            codigooreden = codigoM20;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            MICHE20.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_MI20MouseClicked

    private void MI21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MI21MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigoM21;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            MICHE21.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        }else{
            codigooreden = codigoM21;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            MICHE21.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_MI21MouseClicked

    private void MI22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MI22MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigoM22;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            MICHE22.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        }else{
            codigooreden = codigoM22;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            MICHE22.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_MI22MouseClicked

    private void MI23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MI23MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigoM23;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            MICHE23.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        }else{
            codigooreden = codigoM23;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            MICHE23.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_MI23MouseClicked

    private void MI24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MI24MouseClicked
          if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigoM24;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            MICHE24.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        }else{
            codigooreden = codigoM24;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            MICHE24.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_MI24MouseClicked

    private void MI25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MI25MouseClicked
        /* if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigoM25;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            MICHE25.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        }else{
            codigooreden = codigoM25;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            MICHE25.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
        }*/
    }//GEN-LAST:event_MI25MouseClicked

    private void MI26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MI26MouseClicked
        /*if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigoM26;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            MICHE26.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        }else{
            codigooreden = codigoM26;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            MICHE26.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
        }*/
    }//GEN-LAST:event_MI26MouseClicked

    private void EX27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EX27MouseClicked
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
    }//GEN-LAST:event_EX27MouseClicked

    private void EX28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EX28MouseClicked
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
    }//GEN-LAST:event_EX28MouseClicked

    private void EX29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EX29MouseClicked
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
    }//GEN-LAST:event_EX29MouseClicked

    private void EX30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EX30MouseClicked
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
    }//GEN-LAST:event_EX30MouseClicked

    private void EX31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EX31MouseClicked
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
    }//GEN-LAST:event_EX31MouseClicked
 
    
    private void nombres(){
    ArrayList<EtiquetasClass> result = EtiquetasClass.ListaEtiquetasExtras();
        for (int i = 0; i < result.size(); i++) {
          int codigo = result.get(i).getCodigo();
          
            if (157 == codigo) {
             descripcion1 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_1 = result.get(i).getDescripcion2().toUpperCase(); Precio1 = result.get(i).getPrecio();codigo1 = result.get(i).getCodigo();
            }
            else if (158 == codigo){
             descripcion2 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_2 = result.get(i).getDescripcion2().toUpperCase(); Precio2 = result.get(i).getPrecio();codigo2 = result.get(i).getCodigo();
            }
             else if (159 == codigo){
             descripcion3 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_3 = result.get(i).getDescripcion2().toUpperCase(); Precio3 = result.get(i).getPrecio();codigo3 = result.get(i).getCodigo();
            }
             else if (160== codigo){
             descripcion4 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_4 = result.get(i).getDescripcion2().toUpperCase(); Precio4 = result.get(i).getPrecio();codigo4 = result.get(i).getCodigo();
            } ////////LLLEGA AQUI
             else if (202== codigo){
             descripcion5 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_5 = result.get(i).getDescripcion2().toUpperCase(); Precio5 = result.get(i).getPrecio();codigo5 = result.get(i).getCodigo();
            }
             else if (94== codigo){
             descripcion6 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_6 = result.get(i).getDescripcion2().toUpperCase(); Precio6 = result.get(i).getPrecio();codigo6 = result.get(i).getCodigo();
            }
             else if (182== codigo){
             descripcion7 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_7 = result.get(i).getDescripcion2().toUpperCase(); Precio7 = result.get(i).getPrecio();codigo7 = result.get(i).getCodigo();
            }
             else if (161== codigo){
             descripcion8 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_8 = result.get(i).getDescripcion2().toUpperCase(); Precio8 = result.get(i).getPrecio();codigo8 = result.get(i).getCodigo();
            }
             else if (162== codigo){
             descripcion9 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_9 = result.get(i).getDescripcion2().toUpperCase(); Precio9 = result.get(i).getPrecio();codigo9 = result.get(i).getCodigo();
            }
             else if (163== codigo){
             descripcion10 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_10 = result.get(i).getDescripcion2().toUpperCase(); Precio10 = result.get(i).getPrecio();codigo10 = result.get(i).getCodigo();
            }
             else if (164== codigo){
             descripcion11 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_11 = result.get(i).getDescripcion2().toUpperCase(); Precio11 = result.get(i).getPrecio();codigo11 = result.get(i).getCodigo();
            }
             else if (165== codigo){
             descripcion12 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_12 = result.get(i).getDescripcion2().toUpperCase(); Precio12 = result.get(i).getPrecio();codigo12 = result.get(i).getCodigo();
            }
             else if (166== codigo){
             descripcion13 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_13 = result.get(i).getDescripcion2().toUpperCase(); Precio13 = result.get(i).getPrecio();codigo13 = result.get(i).getCodigo();
            }
             else if (167== codigo){
             descripcion14 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_14 = result.get(i).getDescripcion2().toUpperCase(); Precio14 = result.get(i).getPrecio();codigo14 = result.get(i).getCodigo();
            }
             else if (168== codigo){
             descripcion15 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_15 = result.get(i).getDescripcion2().toUpperCase(); Precio15 = result.get(i).getPrecio();codigo15 = result.get(i).getCodigo();
            }
            else if (189== codigo){
             descripcion16 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_16 = result.get(i).getDescripcion2().toUpperCase(); Precio16 = result.get(i).getPrecio();codigo16 = result.get(i).getCodigo();
            }
            else if (169== codigo){
             descripcion17 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_17 = result.get(i).getDescripcion2().toUpperCase(); Precio17 = result.get(i).getPrecio();codigo17 = result.get(i).getCodigo();
            }
            else if (170== codigo){
             descripcion18 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_18 = result.get(i).getDescripcion2().toUpperCase(); Precio18 = result.get(i).getPrecio();codigo18 = result.get(i).getCodigo();
            }
            else if (171== codigo){
             descripcion19 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_19 = result.get(i).getDescripcion2().toUpperCase(); Precio19 = result.get(i).getPrecio();codigo19 = result.get(i).getCodigo();
            }
            else if (199== codigo){
             descripcion20 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_20 = result.get(i).getDescripcion2().toUpperCase(); Precio20 = result.get(i).getPrecio();codigo20 = result.get(i).getCodigo();
            }
            else if (200== codigo){
             descripcion21 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_21 = result.get(i).getDescripcion2().toUpperCase(); Precio21 = result.get(i).getPrecio();codigo21 = result.get(i).getCodigo();
            }
            else if (206== codigo){
             descripcion22 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_22 = result.get(i).getDescripcion2().toUpperCase(); Precio22 = result.get(i).getPrecio();codigo22 = result.get(i).getCodigo();
            }
            else if (205== codigo){
             descripcion23 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_23 = result.get(i).getDescripcion2().toUpperCase(); Precio23 = result.get(i).getPrecio();codigo23 = result.get(i).getCodigo();
            }
            else if (201== codigo){
             descripcion24 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_24 = result.get(i).getDescripcion2().toUpperCase(); Precio24 = result.get(i).getPrecio();codigo24 = result.get(i).getCodigo();
            }
            else if (269== codigo){
             descripcion25 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_25 = result.get(i).getDescripcion2().toUpperCase(); Precio25 = result.get(i).getPrecio();codigo25 = result.get(i).getCodigo();
            }
            else if (270== codigo){
             descripcion26 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_26 = result.get(i).getDescripcion2().toUpperCase(); Precio26 = result.get(i).getPrecio();codigo26 = result.get(i).getCodigo();
            }
             else if (276== codigo){
             descripcion27 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_27 = result.get(i).getDescripcion2().toUpperCase(); Precio27 = result.get(i).getPrecio();codigo27 = result.get(i).getCodigo();
            }
            else if (277== codigo){
             descripcion28 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_28 = result.get(i).getDescripcion2().toUpperCase(); Precio28 = result.get(i).getPrecio();codigo28 = result.get(i).getCodigo();
            }
             else if (279== codigo){
             descripcion29 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_29 = result.get(i).getDescripcion2().toUpperCase(); Precio29 = result.get(i).getPrecio();codigo29 = result.get(i).getCodigo();
            }
            else if (280== codigo){
             descripcion30= result.get(i).getDescripcion1().toUpperCase(); descripcion2_30 = result.get(i).getDescripcion2().toUpperCase(); Precio30 = result.get(i).getPrecio();codigo30 = result.get(i).getCodigo();
            }
            else if (285== codigo){
             descripcion31 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_31 = result.get(i).getDescripcion2().toUpperCase(); Precio31 = result.get(i).getPrecio();codigo31 = result.get(i).getCodigo();
            }
            else if (0== codigo){
             descripcion32 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_32 = result.get(i).getDescripcion2().toUpperCase(); Precio32 = result.get(i).getPrecio();codigo32 = result.get(i).getCodigo();
            }
            else if (204== codigo){
             descripcion33 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_33 = result.get(i).getDescripcion2().toUpperCase(); Precio33 = result.get(i).getPrecio();codigo33 = result.get(i).getCodigo();
            }
            else if (0== codigo){
             descripcion34 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_34 = result.get(i).getDescripcion2().toUpperCase(); Precio34 = result.get(i).getPrecio();codigo34 = result.get(i).getCodigo();
            }
            else if (0== codigo){
             descripcion35 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_35 = result.get(i).getDescripcion2().toUpperCase(); Precio35 = result.get(i).getPrecio();codigo35 = result.get(i).getCodigo();
            }
            
            else if (246== codigo){
             MICHE1_1 = result.get(i).getDescripcion1().toUpperCase(); MICHE2_1 = result.get(i).getDescripcion2().toUpperCase(); PrecioM1 = result.get(i).getPrecio(); codigoM1 = result.get(i).getCodigo();
            }
            else if (247== codigo){
             MICHE1_2 = result.get(i).getDescripcion1().toUpperCase(); MICHE2_2 = result.get(i).getDescripcion2().toUpperCase(); PrecioM2 = result.get(i).getPrecio();codigoM2 = result.get(i).getCodigo();
            }
            else if (248== codigo){
             MICHE1_3 = result.get(i).getDescripcion1().toUpperCase(); MICHE2_3 = result.get(i).getDescripcion2().toUpperCase(); PrecioM3 = result.get(i).getPrecio();codigoM3 = result.get(i).getCodigo();
            }
            else if (249== codigo){
             MICHE1_4 = result.get(i).getDescripcion1().toUpperCase(); MICHE2_4 = result.get(i).getDescripcion2().toUpperCase(); PrecioM4 = result.get(i).getPrecio();codigoM4 = result.get(i).getCodigo();
            }
            else if (250== codigo){
             MICHE1_5 = result.get(i).getDescripcion1().toUpperCase(); MICHE2_5 = result.get(i).getDescripcion2().toUpperCase(); PrecioM5 = result.get(i).getPrecio();codigoM5 = result.get(i).getCodigo();
            }
            else if (251== codigo){
             MICHE1_6 = result.get(i).getDescripcion1().toUpperCase(); MICHE2_6 = result.get(i).getDescripcion2().toUpperCase(); PrecioM6 = result.get(i).getPrecio();codigoM6 = result.get(i).getCodigo();
            }
            else if (252== codigo){
             MICHE1_7 = result.get(i).getDescripcion1().toUpperCase(); MICHE2_7 = result.get(i).getDescripcion2().toUpperCase(); PrecioM7 = result.get(i).getPrecio();codigoM7 = result.get(i).getCodigo();
            }
            else if (253== codigo){
             MICHE1_8 = result.get(i).getDescripcion1().toUpperCase(); MICHE2_8 = result.get(i).getDescripcion2().toUpperCase(); PrecioM8 = result.get(i).getPrecio();codigoM8 = result.get(i).getCodigo();
            }
            else if (254== codigo){
             MICHE1_9 = result.get(i).getDescripcion1().toUpperCase(); MICHE2_9 = result.get(i).getDescripcion2().toUpperCase(); PrecioM9 = result.get(i).getPrecio();codigoM9 = result.get(i).getCodigo();
            }
            else if (255== codigo){
             MICHE1_10 = result.get(i).getDescripcion1().toUpperCase(); MICHE2_10 = result.get(i).getDescripcion2().toUpperCase(); PrecioM10 = result.get(i).getPrecio();codigoM10 = result.get(i).getCodigo();
            }
            else if (256== codigo){
             MICHE1_11 = result.get(i).getDescripcion1().toUpperCase(); MICHE2_11 = result.get(i).getDescripcion2().toUpperCase(); PrecioM11 = result.get(i).getPrecio();codigoM11 = result.get(i).getCodigo();
            }
            else if (257== codigo){
             MICHE1_12 = result.get(i).getDescripcion1().toUpperCase(); MICHE2_12 = result.get(i).getDescripcion2().toUpperCase(); PrecioM12 = result.get(i).getPrecio();codigoM12 = result.get(i).getCodigo();
            }
            else if (258== codigo){
             MICHE1_13 = result.get(i).getDescripcion1().toUpperCase(); MICHE2_13 = result.get(i).getDescripcion2().toUpperCase(); PrecioM13 = result.get(i).getPrecio();codigoM13 = result.get(i).getCodigo();
            }
            else if (259== codigo){
             MICHE1_14 = result.get(i).getDescripcion1().toUpperCase(); MICHE2_14 = result.get(i).getDescripcion2().toUpperCase(); PrecioM14 = result.get(i).getPrecio();codigoM14 = result.get(i).getCodigo();
            }
            else if (260== codigo){
             MICHE1_15 = result.get(i).getDescripcion1().toUpperCase(); MICHE2_15 = result.get(i).getDescripcion2().toUpperCase(); PrecioM15 = result.get(i).getPrecio();codigoM15 = result.get(i).getCodigo();
            }
            else if (261== codigo){
             MICHE1_16 = result.get(i).getDescripcion1().toUpperCase(); MICHE2_16 = result.get(i).getDescripcion2().toUpperCase(); PrecioM16 = result.get(i).getPrecio();codigoM16 = result.get(i).getCodigo();
            }
            else if (262== codigo){
             MICHE1_17 = result.get(i).getDescripcion1().toUpperCase(); MICHE2_17 = result.get(i).getDescripcion2().toUpperCase(); PrecioM17 = result.get(i).getPrecio();codigoM17 = result.get(i).getCodigo();
            }
            else if (263== codigo){
             MICHE1_18 = result.get(i).getDescripcion1().toUpperCase(); MICHE2_18 = result.get(i).getDescripcion2().toUpperCase(); PrecioM18 = result.get(i).getPrecio();codigoM18 = result.get(i).getCodigo();
            }
             else if (264== codigo){
             MICHE1_19 = result.get(i).getDescripcion1().toUpperCase(); MICHE2_19 = result.get(i).getDescripcion2().toUpperCase(); PrecioM19 = result.get(i).getPrecio();codigoM19 = result.get(i).getCodigo();
            }
             else if (265== codigo){
             MICHE1_20 = result.get(i).getDescripcion1().toUpperCase(); MICHE2_20 = result.get(i).getDescripcion2().toUpperCase(); PrecioM20 = result.get(i).getPrecio();codigoM20 = result.get(i).getCodigo();
            }
             else if (266== codigo){
             MICHE1_21 = result.get(i).getDescripcion1().toUpperCase(); MICHE2_21 = result.get(i).getDescripcion2().toUpperCase(); PrecioM21 = result.get(i).getPrecio();codigoM21 = result.get(i).getCodigo();
            }
             else if (267== codigo){
             MICHE1_22 = result.get(i).getDescripcion1().toUpperCase(); MICHE2_22 = result.get(i).getDescripcion2().toUpperCase(); PrecioM22 = result.get(i).getPrecio();codigoM22 = result.get(i).getCodigo();
            }
             else if (268== codigo){
             MICHE1_23 = result.get(i).getDescripcion1().toUpperCase(); MICHE2_23 = result.get(i).getDescripcion2().toUpperCase(); PrecioM23 = result.get(i).getPrecio();codigoM23 = result.get(i).getCodigo();
            }
             else if (91== codigo){
             MICHE1_24 = result.get(i).getDescripcion1().toUpperCase(); MICHE2_24 = result.get(i).getDescripcion2().toUpperCase(); PrecioM24 = result.get(i).getPrecio();codigoM24 = result.get(i).getCodigo();
            }
        }
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EX1;
    private javax.swing.JLabel EX10;
    private javax.swing.JLabel EX11;
    private javax.swing.JLabel EX12;
    private javax.swing.JLabel EX13;
    private javax.swing.JLabel EX14;
    private javax.swing.JLabel EX15;
    private javax.swing.JLabel EX16;
    private javax.swing.JLabel EX17;
    private javax.swing.JLabel EX18;
    private javax.swing.JLabel EX19;
    private javax.swing.JLabel EX2;
    private javax.swing.JLabel EX20;
    private javax.swing.JLabel EX21;
    private javax.swing.JLabel EX22;
    private javax.swing.JLabel EX23;
    private javax.swing.JLabel EX24;
    private javax.swing.JLabel EX25;
    private javax.swing.JLabel EX26;
    private javax.swing.JLabel EX27;
    private javax.swing.JLabel EX28;
    private javax.swing.JLabel EX29;
    private javax.swing.JLabel EX3;
    private javax.swing.JLabel EX30;
    private javax.swing.JLabel EX31;
    private javax.swing.JLabel EX4;
    private javax.swing.JLabel EX5;
    private javax.swing.JLabel EX6;
    private javax.swing.JLabel EX7;
    private javax.swing.JLabel EX8;
    private javax.swing.JLabel EX9;
    private javax.swing.JLabel MI1;
    private javax.swing.JLabel MI10;
    private javax.swing.JLabel MI11;
    private javax.swing.JLabel MI12;
    private javax.swing.JLabel MI13;
    private javax.swing.JLabel MI14;
    private javax.swing.JLabel MI15;
    private javax.swing.JLabel MI16;
    private javax.swing.JLabel MI17;
    private javax.swing.JLabel MI18;
    private javax.swing.JLabel MI19;
    private javax.swing.JLabel MI2;
    private javax.swing.JLabel MI20;
    private javax.swing.JLabel MI21;
    private javax.swing.JLabel MI22;
    private javax.swing.JLabel MI23;
    private javax.swing.JLabel MI24;
    private javax.swing.JLabel MI25;
    private javax.swing.JLabel MI26;
    private javax.swing.JLabel MI3;
    private javax.swing.JLabel MI4;
    private javax.swing.JLabel MI5;
    private javax.swing.JLabel MI6;
    private javax.swing.JLabel MI7;
    private javax.swing.JLabel MI8;
    private javax.swing.JLabel MI9;
    private ClassAngels.PanelRound MICHE1;
    private ClassAngels.PanelRound MICHE10;
    private ClassAngels.PanelRound MICHE11;
    private ClassAngels.PanelRound MICHE12;
    private ClassAngels.PanelRound MICHE13;
    private ClassAngels.PanelRound MICHE14;
    private ClassAngels.PanelRound MICHE15;
    private ClassAngels.PanelRound MICHE16;
    private ClassAngels.PanelRound MICHE17;
    private ClassAngels.PanelRound MICHE18;
    private ClassAngels.PanelRound MICHE19;
    private ClassAngels.PanelRound MICHE2;
    private ClassAngels.PanelRound MICHE20;
    private ClassAngels.PanelRound MICHE21;
    private ClassAngels.PanelRound MICHE22;
    private ClassAngels.PanelRound MICHE23;
    private ClassAngels.PanelRound MICHE24;
    private ClassAngels.PanelRound MICHE25;
    private ClassAngels.PanelRound MICHE26;
    private ClassAngels.PanelRound MICHE3;
    private ClassAngels.PanelRound MICHE4;
    private ClassAngels.PanelRound MICHE5;
    private ClassAngels.PanelRound MICHE6;
    private ClassAngels.PanelRound MICHE7;
    private ClassAngels.PanelRound MICHE8;
    private ClassAngels.PanelRound MICHE9;
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
    private ClassAngels.PanelRound P4;
    private ClassAngels.PanelRound P5;
    private ClassAngels.PanelRound P6;
    private ClassAngels.PanelRound P7;
    private ClassAngels.PanelRound P8;
    private ClassAngels.PanelRound P9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
 private void Etiquetas() {

        String texto1 = "<html><center><body>"+descripcion1+"<br>"+descripcion2_1+"<br><font color='RED'>Q"+Precio1+"</font></body></center></html>";
        EX1.setText(texto1);
        String texto2 ="<html><center><body>"+descripcion2+"<br>"+descripcion2_2+"<br><font color='RED'>Q"+Precio2+"</font></body></center></html>";
        EX2.setText(texto2);
        String texto3 ="<html><center><body>"+descripcion3+"<br>"+descripcion2_3+"<br><font color='RED'>Q"+Precio3+"</font></body></center></html>";
        EX3.setText(texto3);
        String texto4 ="<html><center><body>"+descripcion4+"<br>"+descripcion2_4+"<br><font color='RED'>Q"+Precio4+"</font></body></center></html>";
        EX4.setText(texto4);
        String texto5 ="<html><center><body>"+descripcion5+"<br>"+descripcion2_5+"<br><font color='RED'>Q"+Precio5+"</font></body></center></html>";
        EX5.setText(texto5);
        String texto6 ="<html><center><body>"+descripcion6+"<br>"+descripcion2_6+"<br><font color='RED'>Q"+Precio6+"</font></body></center></html>";
        EX6.setText(texto6);
        String texto7 ="<html><center><body>"+descripcion7+"<br>"+descripcion2_7+"<br><font color='RED'>Q"+Precio7+"</font></body></center></html>";
        EX7.setText(texto7);
        String texto8 ="<html><center><body>"+descripcion8+"<br>"+descripcion2_8+"<br><font color='RED'>Q"+Precio8+"</font></body></center></html>";
        EX8.setText(texto8);
        String texto9 ="<html><center><body>"+descripcion9+"<br>"+descripcion2_9+"<br><font color='RED'>Q"+Precio9+"</font></body></center></html>";
        EX9.setText(texto9);
        String texto10 ="<html><center><body>"+descripcion10+"<br>"+descripcion2_10+"<br><font color='RED'>Q"+Precio10+"</font></body></center></html>";
        EX10.setText(texto10);
        String texto11 ="<html><center><body>"+descripcion11+"<br>"+descripcion2_11+"<br><font color='RED'>Q"+Precio11+"</font></body></center></html>";
        EX11.setText(texto11);
        String texto12 ="<html><center><body>"+descripcion12+"<br>"+descripcion2_12+"<br><font color='RED'>Q"+Precio12+"</font></body></center></html>";
        EX12.setText(texto12);
        String texto13 ="<html><center><body>"+descripcion13+"<br>"+descripcion2_13+"<br><font color='RED'>Q"+Precio13+"</font></body></center></html>";
        EX13.setText(texto13);
        String texto14 ="<html><center><body>"+descripcion14+"<br>"+descripcion2_14+"<br><font color='RED'>Q"+Precio14+"</font></body></center></html>";
        EX14.setText(texto14);
        String texto15 ="<html><center><body>"+descripcion15+"<br>"+descripcion2_15+"<br><font color='RED'>Q"+Precio15+"</font></body></center></html>";
        EX15.setText(texto15);
        String texto16 ="<html><center><body>"+descripcion16+"<br>"+descripcion2_16+"<br><font color='RED'>Q"+Precio16+"</font></body></center></html>";
        EX16.setText(texto16);
        String texto17 ="<html><center><body>"+descripcion17+"<br>"+descripcion2_17+"<br><font color='RED'>Q"+Precio17+"</font></body></center></html>";
        EX17.setText(texto17);
        String texto18 ="<html><center><body>"+descripcion18+"<br>"+descripcion2_18+"<br><font color='RED'>Q"+Precio18+"</font></body></center></html>";
        EX18.setText(texto18);
        String texto19 ="<html><center><body>"+descripcion19+"<br>"+descripcion2_19+"<br><font color='RED'>Q"+Precio19+"</font></body></center></html>";
        EX19.setText(texto19);
        String texto20 ="<html><center><body>"+descripcion20+"<br>"+descripcion2_20+"<br><font color='RED'>Q"+Precio20+"</font></body></center></html>";
        EX20.setText(texto20);
        String texto21 ="<html><center><body>"+descripcion21+"<br>"+descripcion2_21+"<br><font color='RED'>Q"+Precio21+"</font></body></center></html>";
        EX21.setText(texto21);
        String texto22 ="<html><center><body>"+descripcion22+"<br>"+descripcion2_22+"<br><font color='RED'>Q"+Precio22+"</font></body></center></html>";
        EX22.setText(texto22);
        String texto23 ="<html><center><body>"+descripcion23+"<br>"+descripcion2_23+"<br><font color='RED'>Q"+Precio23+"</font></body></center></html>";
        EX23.setText(texto23);
        String texto24 ="<html><center><body>"+descripcion24+"<br>"+descripcion2_24+"<br><font color='RED'>Q"+Precio24+"</font></body></center></html>";
        EX24.setText(texto24);
        String texto25 ="<html><center><body>"+descripcion25+"<br>"+descripcion2_25+"<br><font color='RED'>Q"+Precio25+"</font></body></center></html>";
        EX25.setText(texto25);
        String texto26 ="<html><center><body>"+descripcion26+"<br>"+descripcion2_26+"<br><font color='RED'>Q"+Precio26+"</font></body></center></html>";
        EX26.setText(texto26);
        String texto27 ="<html><center><body>"+descripcion27+"<br>"+descripcion2_27+"<br><font color='RED'>Q"+Precio27+"</font></body></center></html>";
        EX27.setText(texto27);
        String texto28 ="<html><center><body>"+descripcion28+"<br>"+descripcion2_28+"<br><font color='RED'>Q"+Precio28+"</font></body></center></html>";
        EX28.setText(texto28);
        String texto29 ="<html><center><body>"+descripcion29+"<br>"+descripcion2_29+"<br><font color='RED'>Q"+Precio29+"</font></body></center></html>";
        EX29.setText(texto29);
        String texto30 ="<html><center><body>"+descripcion30+"<br>"+descripcion2_30+"<br><font color='RED'>Q"+Precio30+"</font></body></center></html>";
        EX30.setText(texto30);
        String texto31 ="<html><center><body>"+descripcion31+"<br>"+descripcion2_31+"<br><font color='RED'>Q"+Precio31+"</font></body></center></html>";
        EX31.setText(texto31);
        /*String texto32 ="<html><center><body>"+descripcion32+"<br>"+descripcion2_32+"<br><font color='RED'>Q"+Precio32+"</font></body></center></html>";
        EX32.setText(texto32);
        String texto33 ="<html><center><body>"+descripcion33+"<br>"+descripcion2_33+"<br><font color='RED'>Q"+Precio33+"</font></body></center></html>";
        EX33.setText(texto33);
        String texto34 ="<html><center><body>"+descripcion34+"<br>"+descripcion2_34+"<br><font color='RED'>Q"+Precio34+"</font></body></center></html>";
        EX34.setText(texto34);
        String texto35 ="<html><center><body>"+descripcion35+"<br>"+descripcion2_35+"<br><font color='RED'>Q"+Precio35+"</font></body></center></html>";
        EX35.setText(texto35);*/
    //////////////////////////////////MICHE/////////////////////////////////////////
        
        String M1 ="<html><center><body>"+MICHE1_1+"<br>"+MICHE2_1+"<br><font color='RED'>Q"+PrecioM1+"</font></body></center></html>";
        MI1.setText(M1);
        String M2 ="<html><center><body>"+MICHE1_2+"<br>"+MICHE2_2+"<br><font color='RED'>Q"+PrecioM2+"</font></body></center></html>";
        MI2.setText(M2);
        String M3="<html><center><body>"+MICHE1_3+"<br>"+MICHE2_3+"<br><font color='RED'>Q"+PrecioM3+"</font></body></center></html>";
        MI3.setText(M3);
        String M4 ="<html><center><body>"+MICHE1_4+"<br>"+MICHE2_4+"<br><font color='RED'>Q"+PrecioM4+"</font></body></center></html>";
        MI4.setText(M4);
        String M5 ="<html><center><body>"+MICHE1_5+"<br>"+MICHE2_5+"<br><font color='RED'>Q"+PrecioM5+"</font></body></center></html>";
        MI5.setText(M5);
        String M6 ="<html><center><body>"+MICHE1_6+"<br>"+MICHE2_6+"<br><font color='RED'>Q"+PrecioM6+"</font></body></center></html>";
        MI6.setText(M6);
        String M7 ="<html><center><body>"+MICHE1_7+"<br>"+MICHE2_7+"<br><font color='RED'>Q"+PrecioM7+"</font></body></center></html>";
        MI7.setText(M7);
        String M8 ="<html><center><body>"+MICHE1_8+"<br>"+MICHE2_8+"<br><font color='RED'>Q"+PrecioM8+"</font></body></center></html>";
        MI8.setText(M8);
        String M9 ="<html><center><body>"+MICHE1_9+"<br>"+MICHE2_9+"<br><font color='RED'>Q"+PrecioM9+"</font></body></center></html>";
        MI9.setText(M9);
        String M10 ="<html><center><body>"+MICHE1_10+"<br>"+MICHE2_10+"<br><font color='RED'>Q"+PrecioM10+"</font></body></center></html>";
        MI10.setText(M10);
        String M11 ="<html><center><body>"+MICHE1_11+"<br>"+MICHE2_11+"<br><font color='RED'>Q"+PrecioM11+"</font></body></center></html>";
        MI11.setText(M11);
        String M12 ="<html><center><body>"+MICHE1_12+"<br>"+MICHE2_12+"<br><font color='RED'>Q"+PrecioM12+"</font></body></center></html>";
        MI12.setText(M12);
        String M13 ="<html><center><body>"+MICHE1_13+"<br>"+MICHE2_13+"<br><font color='RED'>Q"+PrecioM13+"</font></body></center></html>";
        MI13.setText(M13);
        String M14 ="<html><center><body>"+MICHE1_14+"<br>"+MICHE2_14+"<br><font color='RED'>Q"+PrecioM14+"</font></body></center></html>";
        MI14.setText(M14);
        String M15 ="<html><center><body>"+MICHE1_15+"<br>"+MICHE2_15+"<br><font color='RED'>Q"+PrecioM15+"</font></body></center></html>";
        MI15.setText(M15);
        String M16 ="<html><center><body>"+MICHE1_16+"<br>"+MICHE2_16+"<br><font color='RED'>Q"+PrecioM16+"</font></body></center></html>";
        MI16.setText(M16);
        String M17 ="<html><center><body>"+MICHE1_17+"<br>"+MICHE2_17+"<br><font color='RED'>Q"+PrecioM17+"</font></body></center></html>";
        MI17.setText(M17);
        String M18 ="<html><center><body>"+MICHE1_18+"<br>"+MICHE2_18+"<br><font color='RED'>Q"+PrecioM18+"</font></body></center></html>";
        MI18.setText(M18);
        String M19 ="<html><center><body>"+MICHE1_19+"<br>"+MICHE2_19+"<br><font color='RED'>Q"+PrecioM19+"</font></body></center></html>";
        MI19.setText(M19);
        String M20 ="<html><center><body>"+MICHE1_20+"<br>"+MICHE2_20+"<br><font color='RED'>Q"+PrecioM20+"</font></body></center></html>";
        MI20.setText(M20);
        String M21 ="<html><center><body>"+MICHE1_21+"<br>"+MICHE2_21+"<br><font color='RED'>Q"+PrecioM21+"</font></body></center></html>";
        MI21.setText(M21);
        String M22 ="<html><center><body>"+MICHE1_22+"<br>"+MICHE2_22+"<br><font color='RED'>Q"+PrecioM22+"</font></body></center></html>";
        MI22.setText(M22);
        String M23 ="<html><center><body>"+MICHE1_23+"<br>"+MICHE2_23+"<br><font color='RED'>Q"+PrecioM23+"</font></body></center></html>";
        MI23.setText(M23);
        String M24 ="<html><center><body>"+MICHE1_24+"<br>"+MICHE2_24+"<br><font color='RED'>Q"+PrecioM24+"</font></body></center></html>";
       MI24.setText(M24);
        String M25 ="<html><center><body>"+MICHE1_25+"<br>"+MICHE2_25+"<br><font color='RED'>Q"+PrecioM25+"</font></body></center></html>";
        /*MI25.setText(M25);
        String M26 ="<html><center><body>"+MICHE1_26+"<br>"+MICHE2_26+"<br><font color='RED'>Q"+PrecioM26+"</font></body></center></html>";
        MI26.setText(M26);*/
    }
}

