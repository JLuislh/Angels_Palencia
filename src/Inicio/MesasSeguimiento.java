/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Inicio;

import BDclass.BDConexion;
import ClassAngels.MesasClass;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author jluis
 */
public final class MesasSeguimiento extends javax.swing.JFrame {

     int id_mesa;
     int noorden;
     int orden1;
     int orden2;
     int orden3;
     int orden4;
     int orden5;
     int orden6;
     int orden7;
     int orden8;
     int orden9;
     int orden10;
     int orden11;
     int orden12;
     int orden13;
     int orden14;
     int orden15;
     int orden16;
     int orden17;
     int orden18;
     int orden19;
     int orden20;
     int ordendia;
     int[] ordenmesa = new int[21];
     Color Mesas = new Color(255,51,51);

    /**
     * Creates new form Mesas
     */
    public MesasSeguimiento() {
        initComponents();
        setLocationRelativeTo(null);
        habilitartodo();
        disponibilidad(false);
        Etiquetas();
        for (int i = 0; i < ordenmesa.length; i++) {ordenmesa[i] = i + 1;}
    }
    
    private void BuscarOrdenDia() {
            try {
                BDConexion conecta = new BDConexion();
                Connection cn = conecta.getConexion();
                java.sql.Statement stmt = cn.createStatement();
                ResultSet rs = stmt.executeQuery("select ordendia  from ordenes where date_format(fecha,'%d/%m/%Y') = date_format(now(),'%d/%m/%Y') and NOORDEN = "+noorden);
                while (rs.next()) {
                ordendia= (rs.getInt(1));
                }
                rs.close();
                stmt.close();
                cn.close();
            } catch (Exception error) {
                System.out.print(error);
            }
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
            String b = result.get(i).getMesa();
           if ("MESA1".equals(b)) {
                Mesa1.setEnabled(a);
                Mesa1.setBackground(Mesas);
                orden1 = result.get(i).getOrden();
                ordenmesa[1] = result.get(i).getOrdendia();
            } else if ("MESA2".equals(b)) {
                Mesa2.setEnabled(a);
                Mesa2.setBackground(Mesas);
                orden2 = result.get(i).getOrden();
                ordenmesa[2] = result.get(i).getOrdendia();
            } else if ("MESA3".equals(b)) {
                Mesa3.setEnabled(a);
                Mesa3.setBackground(Mesas);
                orden3 = result.get(i).getOrden();
                ordenmesa[3] = result.get(i).getOrdendia();
            } else if ("MESA4".equals(b)) {
                Mesa4.setEnabled(a);
                Mesa4.setBackground(Mesas);
                orden4 = result.get(i).getOrden();
                ordenmesa[4] = result.get(i).getOrdendia();
            } else if ("MESA5".equals(b)) {
                Mesa5.setEnabled(a);
                Mesa5.setBackground(Mesas);
                orden5 = result.get(i).getOrden();
                ordenmesa[5] = result.get(i).getOrdendia();
            } else if ("MESA6".equals(b)) {
                Mesa6.setEnabled(a);
                Mesa6.setBackground(Mesas);
                orden6 = result.get(i).getOrden();
                ordenmesa[6] = result.get(i).getOrdendia();
            } else if ("MESA7".equals(b)) {
                Mesa7.setEnabled(a);
                Mesa7.setBackground(Mesas);
                orden7 = result.get(i).getOrden();
                ordenmesa[7] = result.get(i).getOrdendia();
            } else if ("MESA8".equals(b)) {
                Mesa8.setEnabled(a);
                Mesa8.setBackground(Mesas);
                orden8 = result.get(i).getOrden();
                ordenmesa[8] = result.get(i).getOrdendia();
            } else if ("MESA9".equals(b)) {
                Mesa9.setEnabled(a);
                Mesa9.setBackground(Mesas);
                orden9 = result.get(i).getOrden();
                ordenmesa[9] = result.get(i).getOrdendia();
            } else if ("MESA10".equals(b)) {
                Mesa10.setEnabled(a);
                Mesa10.setBackground(Mesas);
                orden10 = result.get(i).getOrden();
                ordenmesa[10] = result.get(i).getOrdendia();
            } else if ("MESA11".equals(b)) {
                Mesa11.setEnabled(a);
                Mesa11.setBackground(Mesas);
                orden11 = result.get(i).getOrden();
                ordenmesa[11] = result.get(i).getOrdendia();
            } else if ("MESA12".equals(b)) {
                Mesa12.setEnabled(a);
                Mesa12.setBackground(Mesas);
                orden12 = result.get(i).getOrden();
                ordenmesa[12] = result.get(i).getOrdendia();
            } else if ("MESA13".equals(b)) {
                Mesa13.setEnabled(a);
                Mesa13.setBackground(Mesas);
                orden13 = result.get(i).getOrden();
                ordenmesa[13] = result.get(i).getOrdendia();
            } else if ("MESA14".equals(b)) {
                Mesa14.setEnabled(a);
                Mesa14.setBackground(Mesas);
                orden14 = result.get(i).getOrden();
                ordenmesa[14] = result.get(i).getOrdendia();
            } else if ("MESA15".equals(b)) {
                Mesa15.setEnabled(a);
                Mesa15.setBackground(Mesas);
                orden15 = result.get(i).getOrden();
                ordenmesa[15] = result.get(i).getOrdendia();
            } else if ("MESA16".equals(b)) {
                Mesa16.setEnabled(a);
                Mesa16.setBackground(Mesas);
                orden16 = result.get(i).getOrden();
                ordenmesa[16] = result.get(i).getOrdendia();
            } else if ("MESA17".equals(b)) {
                Mesa17.setEnabled(a);
                Mesa17.setBackground(Mesas);
                orden17 = result.get(i).getOrden();
                ordenmesa[17] = result.get(i).getOrdendia();
            } else if ("MESA18".equals(b)) {
                Mesa18.setEnabled(a);
                Mesa18.setBackground(Mesas);
                orden18 = result.get(i).getOrden();
                ordenmesa[18] = result.get(i).getOrdendia();
            } else if ("MESA19".equals(b)) {
                Mesa19.setEnabled(a);
                Mesa19.setBackground(Mesas);
                orden19 = result.get(i).getOrden();
                ordenmesa[19] = result.get(i).getOrdendia();
            } else if ("MESA20".equals(b)) {
                Mesa20.setEnabled(a);
                Mesa20.setBackground(Mesas);
                orden20 = result.get(i).getOrden();
                ordenmesa[20] = result.get(i).getOrdendia();
            }
            //System.out.println("MESA " +result.get(i).getMesa());
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
        ME1 = new javax.swing.JLabel();
        Mesa2 = new ClassAngels.PanelRound();
        ME2 = new javax.swing.JLabel();
        Mesa3 = new ClassAngels.PanelRound();
        ME3 = new javax.swing.JLabel();
        Mesa4 = new ClassAngels.PanelRound();
        ME4 = new javax.swing.JLabel();
        Mesa5 = new ClassAngels.PanelRound();
        ME5 = new javax.swing.JLabel();
        Mesa6 = new ClassAngels.PanelRound();
        ME6 = new javax.swing.JLabel();
        Mesa7 = new ClassAngels.PanelRound();
        ME7 = new javax.swing.JLabel();
        Mesa8 = new ClassAngels.PanelRound();
        ME8 = new javax.swing.JLabel();
        Mesa9 = new ClassAngels.PanelRound();
        ME9 = new javax.swing.JLabel();
        Mesa10 = new ClassAngels.PanelRound();
        ME10 = new javax.swing.JLabel();
        Mesa11 = new ClassAngels.PanelRound();
        ME11 = new javax.swing.JLabel();
        Mesa12 = new ClassAngels.PanelRound();
        ME12 = new javax.swing.JLabel();
        Mesa13 = new ClassAngels.PanelRound();
        ME13 = new javax.swing.JLabel();
        Mesa14 = new ClassAngels.PanelRound();
        ME14 = new javax.swing.JLabel();
        Mesa15 = new ClassAngels.PanelRound();
        ME15 = new javax.swing.JLabel();
        Mesa16 = new ClassAngels.PanelRound();
        ME16 = new javax.swing.JLabel();
        Mesa17 = new ClassAngels.PanelRound();
        ME17 = new javax.swing.JLabel();
        Mesa18 = new ClassAngels.PanelRound();
        ME18 = new javax.swing.JLabel();
        Mesa19 = new ClassAngels.PanelRound();
        ME19 = new javax.swing.JLabel();
        Mesa20 = new ClassAngels.PanelRound();
        ME20 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panelRound1 = new ClassAngels.PanelRound();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 643));

        Mesa1.setBackground(new java.awt.Color(255, 153, 153));
        Mesa1.setRoundBottomLeft(20);
        Mesa1.setRoundBottomRight(20);
        Mesa1.setRoundTopLeft(20);
        Mesa1.setRoundTopRight(20);

        ME1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ME1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ME1.setText("MESA 1");
        ME1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ME1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa1Layout = new javax.swing.GroupLayout(Mesa1);
        Mesa1.setLayout(Mesa1Layout);
        Mesa1Layout.setHorizontalGroup(
            Mesa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa1Layout.setVerticalGroup(
            Mesa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa2.setBackground(new java.awt.Color(255, 153, 153));
        Mesa2.setRoundBottomLeft(20);
        Mesa2.setRoundBottomRight(20);
        Mesa2.setRoundTopLeft(20);
        Mesa2.setRoundTopRight(20);

        ME2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ME2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ME2.setText("MESA 2");
        ME2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ME2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa2Layout = new javax.swing.GroupLayout(Mesa2);
        Mesa2.setLayout(Mesa2Layout);
        Mesa2Layout.setHorizontalGroup(
            Mesa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa2Layout.setVerticalGroup(
            Mesa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa3.setBackground(new java.awt.Color(255, 153, 153));
        Mesa3.setRoundBottomLeft(20);
        Mesa3.setRoundBottomRight(20);
        Mesa3.setRoundTopLeft(20);
        Mesa3.setRoundTopRight(20);

        ME3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ME3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ME3.setText("MESA 3");
        ME3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ME3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa3Layout = new javax.swing.GroupLayout(Mesa3);
        Mesa3.setLayout(Mesa3Layout);
        Mesa3Layout.setHorizontalGroup(
            Mesa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa3Layout.setVerticalGroup(
            Mesa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa4.setBackground(new java.awt.Color(255, 153, 153));
        Mesa4.setRoundBottomLeft(20);
        Mesa4.setRoundBottomRight(20);
        Mesa4.setRoundTopLeft(20);
        Mesa4.setRoundTopRight(20);

        ME4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ME4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ME4.setText("MESA 4");
        ME4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ME4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa4Layout = new javax.swing.GroupLayout(Mesa4);
        Mesa4.setLayout(Mesa4Layout);
        Mesa4Layout.setHorizontalGroup(
            Mesa4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME4, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa4Layout.setVerticalGroup(
            Mesa4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME4, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa5.setBackground(new java.awt.Color(255, 153, 153));
        Mesa5.setRoundBottomLeft(20);
        Mesa5.setRoundBottomRight(20);
        Mesa5.setRoundTopLeft(20);
        Mesa5.setRoundTopRight(20);

        ME5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ME5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ME5.setText("MESA 5");
        ME5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ME5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa5Layout = new javax.swing.GroupLayout(Mesa5);
        Mesa5.setLayout(Mesa5Layout);
        Mesa5Layout.setHorizontalGroup(
            Mesa5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME5, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa5Layout.setVerticalGroup(
            Mesa5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME5, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa6.setBackground(new java.awt.Color(255, 153, 153));
        Mesa6.setRoundBottomLeft(20);
        Mesa6.setRoundBottomRight(20);
        Mesa6.setRoundTopLeft(20);
        Mesa6.setRoundTopRight(20);

        ME6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ME6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ME6.setText("MESA 6");
        ME6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ME6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa6Layout = new javax.swing.GroupLayout(Mesa6);
        Mesa6.setLayout(Mesa6Layout);
        Mesa6Layout.setHorizontalGroup(
            Mesa6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME6, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa6Layout.setVerticalGroup(
            Mesa6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME6, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa7.setBackground(new java.awt.Color(255, 153, 153));
        Mesa7.setRoundBottomLeft(20);
        Mesa7.setRoundBottomRight(20);
        Mesa7.setRoundTopLeft(20);
        Mesa7.setRoundTopRight(20);

        ME7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ME7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ME7.setText("MESA 7");
        ME7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ME7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa7Layout = new javax.swing.GroupLayout(Mesa7);
        Mesa7.setLayout(Mesa7Layout);
        Mesa7Layout.setHorizontalGroup(
            Mesa7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa7Layout.setVerticalGroup(
            Mesa7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME7, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa8.setBackground(new java.awt.Color(255, 153, 153));
        Mesa8.setRoundBottomLeft(20);
        Mesa8.setRoundBottomRight(20);
        Mesa8.setRoundTopLeft(20);
        Mesa8.setRoundTopRight(20);

        ME8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ME8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ME8.setText("MESA 8");
        ME8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ME8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa8Layout = new javax.swing.GroupLayout(Mesa8);
        Mesa8.setLayout(Mesa8Layout);
        Mesa8Layout.setHorizontalGroup(
            Mesa8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME8, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa8Layout.setVerticalGroup(
            Mesa8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME8, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa9.setBackground(new java.awt.Color(255, 153, 153));
        Mesa9.setRoundBottomLeft(20);
        Mesa9.setRoundBottomRight(20);
        Mesa9.setRoundTopLeft(20);
        Mesa9.setRoundTopRight(20);

        ME9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ME9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ME9.setText("MESA 9");
        ME9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ME9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa9Layout = new javax.swing.GroupLayout(Mesa9);
        Mesa9.setLayout(Mesa9Layout);
        Mesa9Layout.setHorizontalGroup(
            Mesa9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME9, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa9Layout.setVerticalGroup(
            Mesa9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME9, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa10.setBackground(new java.awt.Color(255, 153, 153));
        Mesa10.setRoundBottomLeft(20);
        Mesa10.setRoundBottomRight(20);
        Mesa10.setRoundTopLeft(20);
        Mesa10.setRoundTopRight(20);

        ME10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ME10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ME10.setText("MESA 10");
        ME10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ME10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa10Layout = new javax.swing.GroupLayout(Mesa10);
        Mesa10.setLayout(Mesa10Layout);
        Mesa10Layout.setHorizontalGroup(
            Mesa10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME10, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa10Layout.setVerticalGroup(
            Mesa10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME10, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa11.setBackground(new java.awt.Color(255, 153, 153));
        Mesa11.setRoundBottomLeft(20);
        Mesa11.setRoundBottomRight(20);
        Mesa11.setRoundTopLeft(20);
        Mesa11.setRoundTopRight(20);

        ME11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ME11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ME11.setText("MESA 11");
        ME11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ME11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa11Layout = new javax.swing.GroupLayout(Mesa11);
        Mesa11.setLayout(Mesa11Layout);
        Mesa11Layout.setHorizontalGroup(
            Mesa11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME11, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa11Layout.setVerticalGroup(
            Mesa11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME11, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa12.setBackground(new java.awt.Color(255, 153, 153));
        Mesa12.setRoundBottomLeft(20);
        Mesa12.setRoundBottomRight(20);
        Mesa12.setRoundTopLeft(20);
        Mesa12.setRoundTopRight(20);

        ME12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ME12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ME12.setText("MESA 12");
        ME12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ME12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa12Layout = new javax.swing.GroupLayout(Mesa12);
        Mesa12.setLayout(Mesa12Layout);
        Mesa12Layout.setHorizontalGroup(
            Mesa12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME12, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa12Layout.setVerticalGroup(
            Mesa12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME12, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa13.setBackground(new java.awt.Color(255, 153, 153));
        Mesa13.setRoundBottomLeft(20);
        Mesa13.setRoundBottomRight(20);
        Mesa13.setRoundTopLeft(20);
        Mesa13.setRoundTopRight(20);

        ME13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ME13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ME13.setText("MESA 13");
        ME13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ME13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa13Layout = new javax.swing.GroupLayout(Mesa13);
        Mesa13.setLayout(Mesa13Layout);
        Mesa13Layout.setHorizontalGroup(
            Mesa13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME13, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa13Layout.setVerticalGroup(
            Mesa13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME13, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa14.setBackground(new java.awt.Color(255, 153, 153));
        Mesa14.setRoundBottomLeft(20);
        Mesa14.setRoundBottomRight(20);
        Mesa14.setRoundTopLeft(20);
        Mesa14.setRoundTopRight(20);

        ME14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ME14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ME14.setText("MESA 14");
        ME14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ME14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa14Layout = new javax.swing.GroupLayout(Mesa14);
        Mesa14.setLayout(Mesa14Layout);
        Mesa14Layout.setHorizontalGroup(
            Mesa14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME14, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa14Layout.setVerticalGroup(
            Mesa14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME14, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa15.setBackground(new java.awt.Color(255, 153, 153));
        Mesa15.setRoundBottomLeft(20);
        Mesa15.setRoundBottomRight(20);
        Mesa15.setRoundTopLeft(20);
        Mesa15.setRoundTopRight(20);

        ME15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ME15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ME15.setText("MESA 15");
        ME15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ME15MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa15Layout = new javax.swing.GroupLayout(Mesa15);
        Mesa15.setLayout(Mesa15Layout);
        Mesa15Layout.setHorizontalGroup(
            Mesa15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME15, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa15Layout.setVerticalGroup(
            Mesa15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME15, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa16.setBackground(new java.awt.Color(255, 153, 153));
        Mesa16.setRoundBottomLeft(20);
        Mesa16.setRoundBottomRight(20);
        Mesa16.setRoundTopLeft(20);
        Mesa16.setRoundTopRight(20);

        ME16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ME16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ME16.setText("MESA 16");
        ME16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ME16MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa16Layout = new javax.swing.GroupLayout(Mesa16);
        Mesa16.setLayout(Mesa16Layout);
        Mesa16Layout.setHorizontalGroup(
            Mesa16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME16, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa16Layout.setVerticalGroup(
            Mesa16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME16, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa17.setBackground(new java.awt.Color(255, 153, 153));
        Mesa17.setRoundBottomLeft(20);
        Mesa17.setRoundBottomRight(20);
        Mesa17.setRoundTopLeft(20);
        Mesa17.setRoundTopRight(20);

        ME17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ME17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ME17.setText("MESA 17");
        ME17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ME17MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa17Layout = new javax.swing.GroupLayout(Mesa17);
        Mesa17.setLayout(Mesa17Layout);
        Mesa17Layout.setHorizontalGroup(
            Mesa17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME17, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa17Layout.setVerticalGroup(
            Mesa17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME17, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa18.setBackground(new java.awt.Color(255, 153, 153));
        Mesa18.setRoundBottomLeft(20);
        Mesa18.setRoundBottomRight(20);
        Mesa18.setRoundTopLeft(20);
        Mesa18.setRoundTopRight(20);

        ME18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ME18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ME18.setText("MESA 18");
        ME18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ME18MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa18Layout = new javax.swing.GroupLayout(Mesa18);
        Mesa18.setLayout(Mesa18Layout);
        Mesa18Layout.setHorizontalGroup(
            Mesa18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME18, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa18Layout.setVerticalGroup(
            Mesa18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME18, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa19.setBackground(new java.awt.Color(255, 153, 153));
        Mesa19.setRoundBottomLeft(20);
        Mesa19.setRoundBottomRight(20);
        Mesa19.setRoundTopLeft(20);
        Mesa19.setRoundTopRight(20);

        ME19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ME19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ME19.setText("MESA 19");
        ME19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ME19MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa19Layout = new javax.swing.GroupLayout(Mesa19);
        Mesa19.setLayout(Mesa19Layout);
        Mesa19Layout.setHorizontalGroup(
            Mesa19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME19, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa19Layout.setVerticalGroup(
            Mesa19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME19, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa20.setBackground(new java.awt.Color(255, 153, 153));
        Mesa20.setRoundBottomLeft(20);
        Mesa20.setRoundBottomRight(20);
        Mesa20.setRoundTopLeft(20);
        Mesa20.setRoundTopRight(20);

        ME20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ME20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ME20.setText("MESA 20");
        ME20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ME20MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa20Layout = new javax.swing.GroupLayout(Mesa20);
        Mesa20.setLayout(Mesa20Layout);
        Mesa20Layout.setHorizontalGroup(
            Mesa20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME20, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa20Layout.setVerticalGroup(
            Mesa20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Mesa20Layout.createSequentialGroup()
                .addComponent(ME20, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
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
        jLabel22.setText("INICIO");
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ME1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ME1MouseClicked
        if(Mesa1.isEnabled()){JOptionPane.showMessageDialog(null, "Mesa No Tiene Orden Abierta...");}
        else{
        id_mesa = 1;
        noorden = orden1;
        MenuSeguimiento F = new MenuSeguimiento(noorden,id_mesa);
        F.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_ME1MouseClicked

    private void ME2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ME2MouseClicked
         if(Mesa2.isEnabled()){JOptionPane.showMessageDialog(null, "Mesa No Tiene Orden Abierta...");}
        else{
        id_mesa = 2;
        noorden = orden2;
        MenuSeguimiento F = new MenuSeguimiento(noorden,id_mesa);
        F.setVisible(true);
        this.dispose();
         }
    }//GEN-LAST:event_ME2MouseClicked

    private void ME3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ME3MouseClicked
         if(Mesa3.isEnabled()){JOptionPane.showMessageDialog(null, "Mesa No Tiene Orden Abierta...");}
        else{
        id_mesa = 3;
        noorden = orden3;
        MenuSeguimiento F = new MenuSeguimiento(noorden,id_mesa);
        F.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_ME3MouseClicked

    private void ME4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ME4MouseClicked
        if(Mesa4.isEnabled()){JOptionPane.showMessageDialog(null, "Mesa No Tiene Orden Abierta...");}
        else{
        id_mesa = 4;
        noorden = orden4;
        MenuSeguimiento F = new MenuSeguimiento(noorden,id_mesa);
        F.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_ME4MouseClicked

    private void ME5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ME5MouseClicked
         if(Mesa5.isEnabled()){JOptionPane.showMessageDialog(null, "Mesa No Tiene Orden Abierta...");}
        else{
        id_mesa = 5;
        noorden = orden5;
        MenuSeguimiento F = new MenuSeguimiento(noorden,id_mesa);
        F.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_ME5MouseClicked

    private void ME6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ME6MouseClicked
        if(Mesa6.isEnabled()){JOptionPane.showMessageDialog(null, "Mesa No Tiene Orden Abierta...");}
        else{
        id_mesa = 6;
        noorden = orden6;
        MenuSeguimiento F = new MenuSeguimiento(noorden,id_mesa);
        F.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_ME6MouseClicked

    private void ME7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ME7MouseClicked
         if(Mesa7.isEnabled()){JOptionPane.showMessageDialog(null, "Mesa No Tiene Orden Abierta...");}
        else{
        id_mesa = 7;
        noorden = orden7;
        MenuSeguimiento F = new MenuSeguimiento(noorden,id_mesa);
        F.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_ME7MouseClicked

    private void ME8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ME8MouseClicked
         if(Mesa8.isEnabled()){JOptionPane.showMessageDialog(null, "Mesa No Tiene Orden Abierta...");}
        else{
        id_mesa = 8;
        noorden = orden8;
        MenuSeguimiento F = new MenuSeguimiento(noorden,id_mesa);
        F.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_ME8MouseClicked

    private void ME9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ME9MouseClicked
         if(Mesa9.isEnabled()){JOptionPane.showMessageDialog(null, "Mesa No Tiene Orden Abierta...");}
        else{
        id_mesa = 9;
        noorden = orden9;
        MenuSeguimiento F = new MenuSeguimiento(noorden,id_mesa);
        F.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_ME9MouseClicked

    private void ME10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ME10MouseClicked
         if(Mesa10.isEnabled()){JOptionPane.showMessageDialog(null, "Mesa No Tiene Orden Abierta...");}
        else{
        id_mesa = 10;
        noorden = orden10;
        MenuSeguimiento F = new MenuSeguimiento(noorden,id_mesa);
        F.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_ME10MouseClicked

    private void ME11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ME11MouseClicked
        if(Mesa11.isEnabled()){JOptionPane.showMessageDialog(null, "Mesa No Tiene Orden Abierta...");}
        else{
        id_mesa = 11;
        noorden = orden11;
        MenuSeguimiento F = new MenuSeguimiento(noorden,id_mesa);
        F.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_ME11MouseClicked

    private void ME12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ME12MouseClicked
        if(Mesa12.isEnabled()){JOptionPane.showMessageDialog(null, "Mesa No Tiene Orden Abierta...");}
        else{
        id_mesa = 12;
        noorden = orden12;
        MenuSeguimiento F = new MenuSeguimiento(noorden,id_mesa);
        F.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_ME12MouseClicked

    private void ME13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ME13MouseClicked
      if(Mesa13.isEnabled()){JOptionPane.showMessageDialog(null, "Mesa No Tiene Orden Abierta...");}
        else{
        id_mesa = 13;
        noorden = orden13;
        MenuSeguimiento F = new MenuSeguimiento(noorden,id_mesa);
        F.setVisible(true);
        this.dispose();
      }
    }//GEN-LAST:event_ME13MouseClicked

    private void ME14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ME14MouseClicked
      if(Mesa14.isEnabled()){JOptionPane.showMessageDialog(null, "Mesa No Tiene Orden Abierta...");}
        else{
        id_mesa = 14;
        noorden = orden14;
        MenuSeguimiento F = new MenuSeguimiento(noorden,id_mesa);
        F.setVisible(true);
        this.dispose();
      }
    }//GEN-LAST:event_ME14MouseClicked

    private void ME15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ME15MouseClicked
      if(Mesa15.isEnabled()){JOptionPane.showMessageDialog(null, "Mesa No Tiene Orden Abierta...");}
        else{
        id_mesa = 15;
        noorden = orden15;
        MenuSeguimiento F = new MenuSeguimiento(noorden,id_mesa);
        F.setVisible(true);
        this.dispose();
      }
    }//GEN-LAST:event_ME15MouseClicked

    private void ME16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ME16MouseClicked
       if(Mesa16.isEnabled()){JOptionPane.showMessageDialog(null, "Mesa No Tiene Orden Abierta...");}
        else{
        id_mesa = 16;
        noorden = orden16;
        MenuSeguimiento F = new MenuSeguimiento(noorden,id_mesa);
        F.setVisible(true);
        this.dispose();
      }
    }//GEN-LAST:event_ME16MouseClicked

    private void ME17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ME17MouseClicked
        if(Mesa17.isEnabled()){JOptionPane.showMessageDialog(null, "Mesa No Tiene Orden Abierta...");}
        else{
        id_mesa = 17;
        noorden = orden17;
        MenuSeguimiento F = new MenuSeguimiento(noorden,id_mesa);
        F.setVisible(true);
        this.dispose();
      }
    }//GEN-LAST:event_ME17MouseClicked

    private void ME18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ME18MouseClicked
       if(Mesa18.isEnabled()){JOptionPane.showMessageDialog(null, "Mesa No Tiene Orden Abierta...");}
        else{
        id_mesa = 18;
        noorden = orden18;
        MenuSeguimiento F = new MenuSeguimiento(noorden,id_mesa);
        F.setVisible(true);
        this.dispose();
      }
    }//GEN-LAST:event_ME18MouseClicked

    private void ME19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ME19MouseClicked
       if(Mesa19.isEnabled()){JOptionPane.showMessageDialog(null, "Mesa No Tiene Orden Abierta...");}
        else{
        id_mesa = 19;
        noorden = orden19;
        MenuSeguimiento F = new MenuSeguimiento(noorden,id_mesa);
        F.setVisible(true);
        this.dispose();
      }
    }//GEN-LAST:event_ME19MouseClicked

    private void ME20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ME20MouseClicked
       if(Mesa20.isEnabled()){JOptionPane.showMessageDialog(null, "Mesa No Tiene Orden Abierta...");}
        else{
        id_mesa = 20;
        noorden = orden20;
        MenuSeguimiento F = new MenuSeguimiento(noorden,id_mesa);
        F.setVisible(true);
        this.dispose();
      }
    }//GEN-LAST:event_ME20MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
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
            java.util.logging.Logger.getLogger(MesasSeguimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MesasSeguimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MesasSeguimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MesasSeguimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            new MesasSeguimiento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ME1;
    private javax.swing.JLabel ME10;
    private javax.swing.JLabel ME11;
    private javax.swing.JLabel ME12;
    private javax.swing.JLabel ME13;
    private javax.swing.JLabel ME14;
    private javax.swing.JLabel ME15;
    private javax.swing.JLabel ME16;
    private javax.swing.JLabel ME17;
    private javax.swing.JLabel ME18;
    private javax.swing.JLabel ME19;
    private javax.swing.JLabel ME2;
    private javax.swing.JLabel ME20;
    private javax.swing.JLabel ME3;
    private javax.swing.JLabel ME4;
    private javax.swing.JLabel ME5;
    private javax.swing.JLabel ME6;
    private javax.swing.JLabel ME7;
    private javax.swing.JLabel ME8;
    private javax.swing.JLabel ME9;
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
    private javax.swing.JLabel jLabel22;
    private javax.swing.JPanel jPanel1;
    private ClassAngels.PanelRound panelRound1;
    // End of variables declaration//GEN-END:variables

private void Etiquetas() {
String texto1 = "<html><center><body>MESA 1<br>Orden No<br><font color='white'>"+ordenmesa[1]+"</font></body></center></html>";
         ME1.setText(texto1);
        String texto2 ="<html><center><body>MESA 2<br>Orden No<br><font color='white'>"+ordenmesa[2]+"</font></body></center></html>";
        ME2.setText(texto2);
        String texto3 ="<html><center><body>MESA 3<br>Orden No<br><font color='white'>"+ordenmesa[3]+"</font></body></center></html>";
        ME3.setText(texto3);
        String texto4 ="<html><center><body>MESA 4<br>Orden No<br><font color='white'>"+ordenmesa[4]+"</font></body></center></html>";
        ME4.setText(texto4);
        String texto5 ="<html><center><body>MESA 5<br>Orden No<br><font color='white'>"+ordenmesa[5]+"</font></body></center></html>";
        ME5.setText(texto5);
        String texto6 ="<html><center><body>MESA 6<br>Orden No<br><font color='white'>"+ordenmesa[6]+"</font></body></center></html>";
        ME6.setText(texto6);
        String texto7 ="<html><center><body>MESA 7<br>Orden No<br><font color='white'>"+ordenmesa[7]+"</font></body></center></html>";
        ME7.setText(texto7);
        String texto8 ="<html><center><body>MESA 8<br>Orden No<br><font color='white'>"+ordenmesa[8]+"</font></body></center></html>";
        ME8.setText(texto8);
        String texto9 ="<html><center><body>MESA 9<br>Orden No<br><font color='white'>"+ordenmesa[9]+"</font></body></center></html>";
        ME9.setText(texto9);
        String texto10 ="<html><center><body>MESA 10<br>Orden No<br><font color='white'>"+ordenmesa[10]+"</font></body></center></html>";
        ME10.setText(texto10);
        String texto11 ="<html><center><body>MESA 11<br>Orden No<br><font color='white'>"+ordenmesa[11]+"</font></body></center></html>";
        ME11.setText(texto11);
        String texto12 ="<html><center><body>MESA 12<br>Orden No<br><font color='white'>"+ordenmesa[12]+"</font></body></center></html>";
        ME12.setText(texto12);
        String texto13 ="<html><center><body>MESA 13<br>Orden No<br><font color='white'>"+ordenmesa[13]+"</font></body></center></html>";
        ME13.setText(texto13);
        String texto14 ="<html><center><body>MESA 14<br>Orden No<br><font color='white'>"+ordenmesa[14]+"</font></body></center></html>";
        ME14.setText(texto14);
        String texto15 ="<html><center><body>MESA 15<br>Orden No<br><font color='white'>"+ordenmesa[15]+"</font></body></center></html>";
        ME15.setText(texto15);
        String texto16 ="<html><center><body>MESA 16<br>Orden No<br><font color='white'>"+ordenmesa[16]+"</font></body></center></html>";
        ME16.setText(texto16);
        String texto17 ="<html><center><body>MESA 17<br>Orden No<br><font color='white'>"+ordenmesa[17]+"</font></body></center></html>";
        ME17.setText(texto17);
        String texto18 ="<html><center><body>MESA 18<br>Orden No<br><font color='white'>"+ordenmesa[18]+"</font></body></center></html>";
        ME18.setText(texto18);
        String texto19 ="<html><center><body>MESA 19<br>Orden No<br><font color='white'>"+ordenmesa[19]+"</font></body></center></html>";
        ME19.setText(texto19);
        String texto20 ="<html><center><body>MESA 20<br>Orden No<br><font color='white'>"+ordenmesa[20]+"</font></body></center></html>";
        ME20.setText(texto20);
 }

}
