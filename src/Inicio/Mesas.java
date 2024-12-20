/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Inicio;

import BDclass.BDConexion;
import ClassAngels.MesasClass;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author jluis
 */
public final class Mesas extends javax.swing.JFrame {

    int id_mesa;
    int orden;

    /**
     * Creates new form Mesas
     */
    public Mesas(int ord) {
        initComponents();
        this.orden = ord;
        setLocationRelativeTo(null);
        habilitartodo();
        disponibilidad(false);
    }

    public void habilitartodo() {
        Mesa1.setEnabled(true);
        Mesa2.setEnabled(true);
        Mesa3.setEnabled(true);
        Mesa4.setEnabled(true);
        Mesa5.setEnabled(true);
        Mesa6.setEnabled(true);
        Mesa7.setEnabled(true);
        Mesa8.setEnabled(true);
        Mesa9.setEnabled(true);
        Mesa10.setEnabled(true);
        Mesa11.setEnabled(true);
        Mesa12.setEnabled(true);
        Mesa13.setEnabled(true);
        Mesa14.setEnabled(true);
        Mesa15.setEnabled(true);
        Mesa16.setEnabled(true);
        Mesa17.setEnabled(true);
        Mesa18.setEnabled(true);
        Mesa19.setEnabled(true);
        Mesa20.setEnabled(true);
        Mesa1.setBackground(Color.GREEN);
        Mesa2.setBackground(Color.GREEN);
        Mesa3.setBackground(Color.GREEN);
        Mesa4.setBackground(Color.GREEN);
        Mesa5.setBackground(Color.GREEN);
        Mesa6.setBackground(Color.GREEN);
        Mesa7.setBackground(Color.GREEN);
        Mesa8.setBackground(Color.GREEN);
        Mesa9.setBackground(Color.GREEN);
        Mesa10.setBackground(Color.GREEN);
        Mesa11.setBackground(Color.GREEN);
        Mesa12.setBackground(Color.GREEN);
        Mesa13.setBackground(Color.GREEN);
        Mesa14.setBackground(Color.GREEN);
        Mesa15.setBackground(Color.GREEN);
        Mesa16.setBackground(Color.GREEN);
        Mesa17.setBackground(Color.GREEN);
        Mesa18.setBackground(Color.GREEN);
        Mesa19.setBackground(Color.GREEN);
        Mesa20.setBackground(Color.GREEN);
    }

    public void disponibilidad(boolean a) {
        ArrayList<MesasClass> result = MesasClass.ListaMesas();
        for (int i = 0; i < result.size(); i++) {
            //Añadir cada elemento del ArrayList en el modelo de la lista
            //String a = "Mesa"+result.get(i).getMesa()= setEnabled(true);
            String b = result.get(i).getMesa();
            if ("MESA1".equals(b)) {
                Mesa1.setEnabled(a);
                Mesa1.setBackground(Color.red);
            } else if ("MESA2".equals(b)) {
                Mesa2.setEnabled(a);
                Mesa2.setBackground(Color.red);
            } else if ("MESA3".equals(b)) {
                Mesa3.setEnabled(a);
                Mesa3.setBackground(Color.red);
            } else if ("MESA4".equals(b)) {
                Mesa4.setEnabled(a);
                Mesa4.setBackground(Color.red);
            } else if ("MESA5".equals(b)) {
                Mesa5.setEnabled(a);
                Mesa5.setBackground(Color.red);
            } else if ("MESA6".equals(b)) {
                Mesa6.setEnabled(a);
                Mesa6.setBackground(Color.red);
            } else if ("MESA7".equals(b)) {
                Mesa7.setEnabled(a);
                Mesa7.setBackground(Color.red);
            } else if ("MESA8".equals(b)) {
                Mesa8.setEnabled(a);
                Mesa8.setBackground(Color.red);
            } else if ("MESA9".equals(b)) {
                Mesa9.setEnabled(a);
                Mesa9.setBackground(Color.red);
            } else if ("MESA10".equals(b)) {
                Mesa10.setEnabled(a);
                Mesa10.setBackground(Color.red);
            } else if ("MESA11".equals(b)) {
                Mesa11.setEnabled(a);
                Mesa11.setBackground(Color.red);
            } else if ("MESA12".equals(b)) {
                Mesa12.setEnabled(a);
                Mesa12.setBackground(Color.red);
            } else if ("MESA13".equals(b)) {
                Mesa13.setEnabled(a);
                Mesa13.setBackground(Color.red);
            } else if ("MESA14".equals(b)) {
                Mesa14.setEnabled(a);
                Mesa14.setBackground(Color.red);
            } else if ("MESA15".equals(b)) {
                Mesa15.setEnabled(a);
                Mesa15.setBackground(Color.red);
            } else if ("MESA16".equals(b)) {
                Mesa16.setEnabled(a);
                Mesa16.setBackground(Color.red);
            } else if ("MESA17".equals(b)) {
                Mesa17.setEnabled(a);
                Mesa17.setBackground(Color.red);
            } else if ("MESA18".equals(b)) {
                Mesa18.setEnabled(a);
                Mesa18.setBackground(Color.red);
            } else if ("MESA19".equals(b)) {
                Mesa19.setEnabled(a);
                Mesa19.setBackground(Color.red);
            } else if ("MESA20".equals(b)) {
                Mesa20.setEnabled(a);
                Mesa20.setBackground(Color.red);
            }
            //System.out.println("MESA " +result.get(i).getMesa());
        }
    }

    public void actualizarmesa() {

        try {
            BDConexion conecta = new BDConexion();
            Connection con = conecta.getConexion();
            PreparedStatement ps = null;
            PreparedStatement p = null;
            ps = con.prepareStatement("UPDATE MESAS SET ESTADO = 2 WHERE id_mesa =" + id_mesa);
            p = con.prepareStatement("UPDATE ordenes SET id_mesa = "+id_mesa+"  WHERE noorden =" + orden);
            ps.executeUpdate();
            p.executeUpdate();
            con.close();
            ps.close();
            p.close();

        } catch (SQLException e) {
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
        Mesa1 = new ClassAngels.PanelRound();
        jLabel2 = new javax.swing.JLabel();
        Mesa2 = new ClassAngels.PanelRound();
        jLabel3 = new javax.swing.JLabel();
        Mesa3 = new ClassAngels.PanelRound();
        jLabel4 = new javax.swing.JLabel();
        Mesa4 = new ClassAngels.PanelRound();
        jLabel5 = new javax.swing.JLabel();
        Mesa5 = new ClassAngels.PanelRound();
        jLabel6 = new javax.swing.JLabel();
        Mesa6 = new ClassAngels.PanelRound();
        jLabel7 = new javax.swing.JLabel();
        Mesa7 = new ClassAngels.PanelRound();
        jLabel8 = new javax.swing.JLabel();
        Mesa8 = new ClassAngels.PanelRound();
        jLabel9 = new javax.swing.JLabel();
        Mesa9 = new ClassAngels.PanelRound();
        jLabel10 = new javax.swing.JLabel();
        Mesa10 = new ClassAngels.PanelRound();
        jLabel11 = new javax.swing.JLabel();
        Mesa11 = new ClassAngels.PanelRound();
        jLabel12 = new javax.swing.JLabel();
        Mesa12 = new ClassAngels.PanelRound();
        jLabel13 = new javax.swing.JLabel();
        Mesa13 = new ClassAngels.PanelRound();
        jLabel14 = new javax.swing.JLabel();
        Mesa14 = new ClassAngels.PanelRound();
        jLabel15 = new javax.swing.JLabel();
        Mesa15 = new ClassAngels.PanelRound();
        jLabel16 = new javax.swing.JLabel();
        Mesa16 = new ClassAngels.PanelRound();
        jLabel17 = new javax.swing.JLabel();
        Mesa17 = new ClassAngels.PanelRound();
        jLabel18 = new javax.swing.JLabel();
        Mesa18 = new ClassAngels.PanelRound();
        jLabel19 = new javax.swing.JLabel();
        Mesa19 = new ClassAngels.PanelRound();
        jLabel20 = new javax.swing.JLabel();
        Mesa20 = new ClassAngels.PanelRound();
        jLabel21 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panelRound1 = new ClassAngels.PanelRound();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 643));

        Mesa1.setBackground(new java.awt.Color(255, 153, 153));
        Mesa1.setRoundBottomLeft(20);
        Mesa1.setRoundBottomRight(20);
        Mesa1.setRoundTopLeft(20);
        Mesa1.setRoundTopRight(20);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MESA 1");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa1Layout = new javax.swing.GroupLayout(Mesa1);
        Mesa1.setLayout(Mesa1Layout);
        Mesa1Layout.setHorizontalGroup(
            Mesa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa1Layout.setVerticalGroup(
            Mesa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa2.setBackground(new java.awt.Color(255, 153, 153));
        Mesa2.setRoundBottomLeft(20);
        Mesa2.setRoundBottomRight(20);
        Mesa2.setRoundTopLeft(20);
        Mesa2.setRoundTopRight(20);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("MESA 2");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa2Layout = new javax.swing.GroupLayout(Mesa2);
        Mesa2.setLayout(Mesa2Layout);
        Mesa2Layout.setHorizontalGroup(
            Mesa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa2Layout.setVerticalGroup(
            Mesa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa3.setBackground(new java.awt.Color(255, 153, 153));
        Mesa3.setRoundBottomLeft(20);
        Mesa3.setRoundBottomRight(20);
        Mesa3.setRoundTopLeft(20);
        Mesa3.setRoundTopRight(20);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("MESA 3");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa3Layout = new javax.swing.GroupLayout(Mesa3);
        Mesa3.setLayout(Mesa3Layout);
        Mesa3Layout.setHorizontalGroup(
            Mesa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa3Layout.setVerticalGroup(
            Mesa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa4.setBackground(new java.awt.Color(255, 153, 153));
        Mesa4.setRoundBottomLeft(20);
        Mesa4.setRoundBottomRight(20);
        Mesa4.setRoundTopLeft(20);
        Mesa4.setRoundTopRight(20);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("MESA 4");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa4Layout = new javax.swing.GroupLayout(Mesa4);
        Mesa4.setLayout(Mesa4Layout);
        Mesa4Layout.setHorizontalGroup(
            Mesa4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa4Layout.setVerticalGroup(
            Mesa4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa5.setBackground(new java.awt.Color(255, 153, 153));
        Mesa5.setRoundBottomLeft(20);
        Mesa5.setRoundBottomRight(20);
        Mesa5.setRoundTopLeft(20);
        Mesa5.setRoundTopRight(20);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("MESA 5");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa5Layout = new javax.swing.GroupLayout(Mesa5);
        Mesa5.setLayout(Mesa5Layout);
        Mesa5Layout.setHorizontalGroup(
            Mesa5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa5Layout.setVerticalGroup(
            Mesa5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa6.setBackground(new java.awt.Color(255, 153, 153));
        Mesa6.setRoundBottomLeft(20);
        Mesa6.setRoundBottomRight(20);
        Mesa6.setRoundTopLeft(20);
        Mesa6.setRoundTopRight(20);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("MESA 6");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa6Layout = new javax.swing.GroupLayout(Mesa6);
        Mesa6.setLayout(Mesa6Layout);
        Mesa6Layout.setHorizontalGroup(
            Mesa6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa6Layout.setVerticalGroup(
            Mesa6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa7.setBackground(new java.awt.Color(255, 153, 153));
        Mesa7.setRoundBottomLeft(20);
        Mesa7.setRoundBottomRight(20);
        Mesa7.setRoundTopLeft(20);
        Mesa7.setRoundTopRight(20);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("MESA 7");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa7Layout = new javax.swing.GroupLayout(Mesa7);
        Mesa7.setLayout(Mesa7Layout);
        Mesa7Layout.setHorizontalGroup(
            Mesa7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa7Layout.setVerticalGroup(
            Mesa7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa8.setBackground(new java.awt.Color(255, 153, 153));
        Mesa8.setRoundBottomLeft(20);
        Mesa8.setRoundBottomRight(20);
        Mesa8.setRoundTopLeft(20);
        Mesa8.setRoundTopRight(20);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("MESA 8");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa8Layout = new javax.swing.GroupLayout(Mesa8);
        Mesa8.setLayout(Mesa8Layout);
        Mesa8Layout.setHorizontalGroup(
            Mesa8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa8Layout.setVerticalGroup(
            Mesa8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa9.setBackground(new java.awt.Color(255, 153, 153));
        Mesa9.setRoundBottomLeft(20);
        Mesa9.setRoundBottomRight(20);
        Mesa9.setRoundTopLeft(20);
        Mesa9.setRoundTopRight(20);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("MESA 9");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa9Layout = new javax.swing.GroupLayout(Mesa9);
        Mesa9.setLayout(Mesa9Layout);
        Mesa9Layout.setHorizontalGroup(
            Mesa9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa9Layout.setVerticalGroup(
            Mesa9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa10.setBackground(new java.awt.Color(255, 153, 153));
        Mesa10.setRoundBottomLeft(20);
        Mesa10.setRoundBottomRight(20);
        Mesa10.setRoundTopLeft(20);
        Mesa10.setRoundTopRight(20);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("MESA 10");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa10Layout = new javax.swing.GroupLayout(Mesa10);
        Mesa10.setLayout(Mesa10Layout);
        Mesa10Layout.setHorizontalGroup(
            Mesa10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa10Layout.setVerticalGroup(
            Mesa10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa11.setBackground(new java.awt.Color(255, 153, 153));
        Mesa11.setRoundBottomLeft(20);
        Mesa11.setRoundBottomRight(20);
        Mesa11.setRoundTopLeft(20);
        Mesa11.setRoundTopRight(20);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("MESA 11");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa11Layout = new javax.swing.GroupLayout(Mesa11);
        Mesa11.setLayout(Mesa11Layout);
        Mesa11Layout.setHorizontalGroup(
            Mesa11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa11Layout.setVerticalGroup(
            Mesa11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa12.setBackground(new java.awt.Color(255, 153, 153));
        Mesa12.setRoundBottomLeft(20);
        Mesa12.setRoundBottomRight(20);
        Mesa12.setRoundTopLeft(20);
        Mesa12.setRoundTopRight(20);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("MESA 12");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa12Layout = new javax.swing.GroupLayout(Mesa12);
        Mesa12.setLayout(Mesa12Layout);
        Mesa12Layout.setHorizontalGroup(
            Mesa12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa12Layout.setVerticalGroup(
            Mesa12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa13.setBackground(new java.awt.Color(255, 153, 153));
        Mesa13.setRoundBottomLeft(20);
        Mesa13.setRoundBottomRight(20);
        Mesa13.setRoundTopLeft(20);
        Mesa13.setRoundTopRight(20);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("MESA 13");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa13Layout = new javax.swing.GroupLayout(Mesa13);
        Mesa13.setLayout(Mesa13Layout);
        Mesa13Layout.setHorizontalGroup(
            Mesa13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa13Layout.setVerticalGroup(
            Mesa13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa14.setBackground(new java.awt.Color(255, 153, 153));
        Mesa14.setRoundBottomLeft(20);
        Mesa14.setRoundBottomRight(20);
        Mesa14.setRoundTopLeft(20);
        Mesa14.setRoundTopRight(20);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("MESA 14");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa14Layout = new javax.swing.GroupLayout(Mesa14);
        Mesa14.setLayout(Mesa14Layout);
        Mesa14Layout.setHorizontalGroup(
            Mesa14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa14Layout.setVerticalGroup(
            Mesa14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa15.setBackground(new java.awt.Color(255, 153, 153));
        Mesa15.setRoundBottomLeft(20);
        Mesa15.setRoundBottomRight(20);
        Mesa15.setRoundTopLeft(20);
        Mesa15.setRoundTopRight(20);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("MESA 15");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa15Layout = new javax.swing.GroupLayout(Mesa15);
        Mesa15.setLayout(Mesa15Layout);
        Mesa15Layout.setHorizontalGroup(
            Mesa15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa15Layout.setVerticalGroup(
            Mesa15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa16.setBackground(new java.awt.Color(255, 153, 153));
        Mesa16.setRoundBottomLeft(20);
        Mesa16.setRoundBottomRight(20);
        Mesa16.setRoundTopLeft(20);
        Mesa16.setRoundTopRight(20);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("MESA 16");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa16Layout = new javax.swing.GroupLayout(Mesa16);
        Mesa16.setLayout(Mesa16Layout);
        Mesa16Layout.setHorizontalGroup(
            Mesa16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa16Layout.setVerticalGroup(
            Mesa16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa17.setBackground(new java.awt.Color(255, 153, 153));
        Mesa17.setRoundBottomLeft(20);
        Mesa17.setRoundBottomRight(20);
        Mesa17.setRoundTopLeft(20);
        Mesa17.setRoundTopRight(20);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("MESA 17");
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa17Layout = new javax.swing.GroupLayout(Mesa17);
        Mesa17.setLayout(Mesa17Layout);
        Mesa17Layout.setHorizontalGroup(
            Mesa17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa17Layout.setVerticalGroup(
            Mesa17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa18.setBackground(new java.awt.Color(255, 153, 153));
        Mesa18.setRoundBottomLeft(20);
        Mesa18.setRoundBottomRight(20);
        Mesa18.setRoundTopLeft(20);
        Mesa18.setRoundTopRight(20);

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("MESA 18");
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa18Layout = new javax.swing.GroupLayout(Mesa18);
        Mesa18.setLayout(Mesa18Layout);
        Mesa18Layout.setHorizontalGroup(
            Mesa18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa18Layout.setVerticalGroup(
            Mesa18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa19.setBackground(new java.awt.Color(255, 153, 153));
        Mesa19.setRoundBottomLeft(20);
        Mesa19.setRoundBottomRight(20);
        Mesa19.setRoundTopLeft(20);
        Mesa19.setRoundTopRight(20);

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("MESA 19");
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa19Layout = new javax.swing.GroupLayout(Mesa19);
        Mesa19.setLayout(Mesa19Layout);
        Mesa19Layout.setHorizontalGroup(
            Mesa19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa19Layout.setVerticalGroup(
            Mesa19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa20.setBackground(new java.awt.Color(255, 153, 153));
        Mesa20.setRoundBottomLeft(20);
        Mesa20.setRoundBottomRight(20);
        Mesa20.setRoundTopLeft(20);
        Mesa20.setRoundTopRight(20);

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("MESA 20");
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa20Layout = new javax.swing.GroupLayout(Mesa20);
        Mesa20.setLayout(Mesa20Layout);
        Mesa20Layout.setHorizontalGroup(
            Mesa20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa20Layout.setVerticalGroup(
            Mesa20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Mesa20Layout.createSequentialGroup()
                .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONTROL");

        panelRound1.setBackground(new java.awt.Color(255, 255, 0));
        panelRound1.setRoundBottomLeft(20);
        panelRound1.setRoundBottomRight(20);
        panelRound1.setRoundTopLeft(20);
        panelRound1.setRoundTopRight(20);

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("CANCELAR");
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 861, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Mesa15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Mesa8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Mesa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Mesa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Mesa9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Mesa16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Mesa17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Mesa18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Mesa10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Mesa11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Mesa3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(Mesa4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Mesa5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Mesa12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Mesa19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Mesa6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Mesa7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Mesa13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Mesa14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Mesa20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(93, 93, 93))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Mesa7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mesa6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mesa5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mesa4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mesa3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mesa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mesa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Mesa8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mesa9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mesa10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mesa11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mesa12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mesa13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mesa14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Mesa15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mesa16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mesa17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mesa18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mesa19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mesa20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(203, 203, 203))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        if(Mesa1.isEnabled()){
        id_mesa = 1;
        actualizarmesa();
        Menu F = new Menu(id_mesa,orden);
        F.setVisible(true);
        this.dispose();
        }else{ JOptionPane.showMessageDialog(null, "MESA ESTA EN USO..."); }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        if(Mesa2.isEnabled()){
        id_mesa = 2;
        actualizarmesa();
        Menu F = new Menu(id_mesa,orden);
        F.setVisible(true);
        this.dispose();
        }else{ JOptionPane.showMessageDialog(null, "MESA ESTA EN USO..."); }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
         if(Mesa3.isEnabled()){
        id_mesa = 3;
        actualizarmesa();
        Menu F = new Menu(id_mesa,orden);
        F.setVisible(true);
        this.dispose();
        }else{ JOptionPane.showMessageDialog(null, "MESA ESTA EN USO..."); }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        if(Mesa4.isEnabled()){
        id_mesa = 4;
        actualizarmesa();
        Menu F = new Menu(id_mesa,orden);
        F.setVisible(true);
        this.dispose();
        }else{ JOptionPane.showMessageDialog(null, "MESA ESTA EN USO..."); }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        if(Mesa5.isEnabled()){
        id_mesa = 5;
        actualizarmesa();
        Menu F = new Menu(id_mesa,orden);
        F.setVisible(true);
        this.dispose();
        }else{ JOptionPane.showMessageDialog(null, "MESA ESTA EN USO..."); }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        if(Mesa6.isEnabled()){
        id_mesa = 6;
        actualizarmesa();
        Menu F = new Menu(id_mesa,orden);
        F.setVisible(true);
        this.dispose();
        }else{ JOptionPane.showMessageDialog(null, "MESA ESTA EN USO..."); }
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        if(Mesa7.isEnabled()){
        id_mesa = 7;
        actualizarmesa();
        Menu F = new Menu(id_mesa,orden);
        F.setVisible(true);
        this.dispose();
        }else{ JOptionPane.showMessageDialog(null, "MESA ESTA EN USO..."); }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        if(Mesa8.isEnabled()){
        id_mesa = 8;
        actualizarmesa();
        Menu F = new Menu(id_mesa,orden);
        F.setVisible(true);
        this.dispose();
        }else{ JOptionPane.showMessageDialog(null, "MESA ESTA EN USO..."); }
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        if(Mesa9.isEnabled()){
        id_mesa = 9;
        actualizarmesa();
        Menu F = new Menu(id_mesa,orden);
        F.setVisible(true);
        this.dispose();
        }else{ JOptionPane.showMessageDialog(null, "MESA ESTA EN USO..."); }
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        if(Mesa10.isEnabled()){
        id_mesa = 10;
        actualizarmesa();
        Menu F = new Menu(id_mesa,orden);
        F.setVisible(true);
        this.dispose();
        }else{ JOptionPane.showMessageDialog(null, "MESA ESTA EN USO..."); }
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        if(Mesa11.isEnabled()){
        id_mesa = 11;
        actualizarmesa();
        Menu F = new Menu(id_mesa,orden);
        F.setVisible(true);
        this.dispose();
        }else{ JOptionPane.showMessageDialog(null, "MESA ESTA EN USO..."); }
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        if(Mesa12.isEnabled()){
        id_mesa = 12;
        actualizarmesa();
        Menu F = new Menu(id_mesa,orden);
        F.setVisible(true);
        this.dispose();
        }else{ JOptionPane.showMessageDialog(null, "MESA ESTA EN USO..."); }
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        if(Mesa13.isEnabled()){
        id_mesa = 13;
        actualizarmesa();
        Menu F = new Menu(id_mesa,orden);
        F.setVisible(true);
        this.dispose();
        }else{ JOptionPane.showMessageDialog(null, "MESA ESTA EN USO..."); }
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        if(Mesa14.isEnabled()){
        id_mesa = 14;
        actualizarmesa();
        Menu F = new Menu(id_mesa,orden);
        F.setVisible(true);
        this.dispose();
        }else{ JOptionPane.showMessageDialog(null, "MESA ESTA EN USO..."); }
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        if(Mesa15.isEnabled()){
        id_mesa = 15;
        actualizarmesa();
        Menu F = new Menu(id_mesa,orden);
        F.setVisible(true);
        this.dispose();
        }else{ JOptionPane.showMessageDialog(null, "MESA ESTA EN USO..."); }
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        if(Mesa16.isEnabled()){
        id_mesa = 16;
        actualizarmesa();
        Menu F = new Menu(id_mesa,orden);
        F.setVisible(true);
        this.dispose();
        }else{ JOptionPane.showMessageDialog(null, "MESA ESTA EN USO..."); }
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        if(Mesa17.isEnabled()){
        id_mesa = 17;
        actualizarmesa();
        Menu F = new Menu(id_mesa,orden);
        F.setVisible(true);
        this.dispose();
        }else{ JOptionPane.showMessageDialog(null, "MESA ESTA EN USO..."); }
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        if(Mesa18.isEnabled()){
        id_mesa = 18;
        actualizarmesa();
        Menu F = new Menu(id_mesa,orden);
        F.setVisible(true);
        this.dispose();
        }else{ JOptionPane.showMessageDialog(null, "MESA ESTA EN USO..."); }
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        if(Mesa19.isEnabled()){
        id_mesa = 19;
        actualizarmesa();
        Menu F = new Menu(id_mesa,orden);
        F.setVisible(true);
        this.dispose();
        }else{ JOptionPane.showMessageDialog(null, "MESA ESTA EN USO..."); }
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        if(Mesa20.isEnabled()){
        id_mesa = 20;
        actualizarmesa();
        Menu F = new Menu(id_mesa,orden);
        F.setVisible(true);
        this.dispose();
        }else{ JOptionPane.showMessageDialog(null, "MESA ESTA EN USO..."); }
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
          
        try {
            
            BDConexion conecta = new BDConexion();
            Connection con = conecta.getConexion();
            PreparedStatement ps = null;
            ps= con.prepareStatement("delete from Ordenes where noorden="+orden);
            ps.executeUpdate();
            con.close();
            ps.close();
            
            
        } catch (SQLException e) { System.out.println("ERRROR ELIMINANDO LA ORDEN EN MESAS"+e);
        }
        Ordenes F = new Ordenes();
        F.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jLabel22MouseClicked

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
            java.util.logging.Logger.getLogger(Mesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // new Mesas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ClassAngels.PanelRound Mesa1;
    private ClassAngels.PanelRound Mesa10;
    private ClassAngels.PanelRound Mesa11;
    private ClassAngels.PanelRound Mesa12;
    private ClassAngels.PanelRound Mesa13;
    private ClassAngels.PanelRound Mesa14;
    private ClassAngels.PanelRound Mesa15;
    private ClassAngels.PanelRound Mesa16;
    private ClassAngels.PanelRound Mesa17;
    private ClassAngels.PanelRound Mesa18;
    private ClassAngels.PanelRound Mesa19;
    private ClassAngels.PanelRound Mesa2;
    private ClassAngels.PanelRound Mesa20;
    private ClassAngels.PanelRound Mesa3;
    private ClassAngels.PanelRound Mesa4;
    private ClassAngels.PanelRound Mesa5;
    private ClassAngels.PanelRound Mesa6;
    private ClassAngels.PanelRound Mesa7;
    private ClassAngels.PanelRound Mesa8;
    private ClassAngels.PanelRound Mesa9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private ClassAngels.PanelRound panelRound1;
    // End of variables declaration//GEN-END:variables
}
