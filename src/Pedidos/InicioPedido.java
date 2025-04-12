/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pedidos;

import BDclass.BDConexionPedidos;
import ClassAngels.TextAreaRenderer;
import Inicio.Ordenes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumn;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;

/**
 *
 * @author it
 */
public class InicioPedido extends javax.swing.JFrame {
  String sede;
  int id_producto;
  int Sucursal = 0;
  String Linksucursal;
  int bloqueo;
    /**
     * Creates new form InicioPedido
     */
    public InicioPedido() {
        initComponents();
        setLocationRelativeTo(null);
        sede = System.getProperty("user.name");
        ListarPedidos();
        buscasucursal();
    }
    
    
    private void buscasucursal(){
        switch (sede) {
            case "it" -> Sucursal = 5;
            case "AngelsParaiso" -> Sucursal = 2;
            case "AngelsSanLuis" -> Sucursal = 3;//ok
            case "angelspalencia" -> Sucursal = 4;//ok
            case "AngelsResidenciales" -> Sucursal = 5;
            case "AngelsSantaInes" -> Sucursal = 6;
            default -> {
            }
        }
    }
    
    public void insertarProducto(){
         
     try {
            ClassProductos p = new ClassProductos();
            p.setId_pedido(Integer.parseInt(NoPedido.getText()));
            p.setId_producto(id_producto);
            BDIngresosConsultas.InsertarProductosPedido(p);
        } catch (NumberFormatException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
     }

    private void ListarPedidos() {

        ArrayList<ClassProductos> result = BDIngresosConsultas.ListarPedidos();
        RecargarTablaPedidos(result);
    }

    private void RecargarTablaPedidos(ArrayList<ClassProductos> list) {
        Object[][] datos = new Object[list.size()][2];
        int i = 0;
        for (ClassProductos t : list) {
            datos[i][0] = t.getId_pedido();
            datos[i][1] = t.getFechain();
            i++;
        }
        TablePedidos.setModel(new javax.swing.table.DefaultTableModel(
                datos,
                new String[]{
                    "No.", "FECHA"
                }) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        });
        TablePedidos.getColumnModel().getColumn(1).setCellRenderer(new TextAreaRenderer());
        TableColumn columna1 = TablePedidos.getColumn("No.");
        columna1.setPreferredWidth(-20);
        TableColumn columna2 = TablePedidos.getColumn("FECHA");
        columna2.setPreferredWidth(255);
    }

    private void ListarProductos() {

        /* DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
         Fecha = df.format(Fe.getDate());*/
        ArrayList<ClassProductos> result = BDIngresosConsultas.ListarProductos(Integer.parseInt(NoPedido.getText()),BUSCAR.getText());
        RecargarTablaDetallado(result);
    }

    private void RecargarTablaDetallado(ArrayList<ClassProductos> list) {
        //DecimalFormat df = new DecimalFormat("#.00");
        Object[][] datos = new Object[list.size()][3];
        int i = 0;
        for (ClassProductos t : list) {
            datos[i][0] = t.getId_producto();
            datos[i][1] = t.getDescripcion();
            datos[i][2] = t.getUnidad();
            
            i++;
        }
        Productos.setModel(new javax.swing.table.DefaultTableModel(
                datos,
                new String[]{
                    "CODIGO", "DESCRIPCION", "MEDIDA"
                }) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;

            }
        });
        Productos.getColumnModel().getColumn(1).setCellRenderer(new TextAreaRenderer());
        TableColumn columna1 = Productos.getColumn("CODIGO");
        columna1.setPreferredWidth(-20);
        TableColumn columna2 = Productos.getColumn("DESCRIPCION");
        columna2.setPreferredWidth(255);
        TableColumn columna3 = Productos.getColumn("MEDIDA");
        columna3.setPreferredWidth(55);
    }

    private void ListarProductosSolicitadosSantaInes() {
        ArrayList<ClassProductos> result = BDIngresosConsultas.ListarProductosSolicitadosSantaInes(Integer.parseInt(NoPedido.getText()));
        RecargarTabla(result);
    }
    private void ListarProductosSolicitadosResidenciales() {
        ArrayList<ClassProductos> result = BDIngresosConsultas.ListarProductosSolicitadosResidenciales(Integer.parseInt(NoPedido.getText()));
        RecargarTabla(result);
    }
    private void ListarProductosSolicitadosSanLuis() {
        ArrayList<ClassProductos> result = BDIngresosConsultas.ListarProductosSolicitadosPuertaNegra(Integer.parseInt(NoPedido.getText()));
        RecargarTabla(result);
    }
    private void ListarProductosSolicitadosParaiso() {
        ArrayList<ClassProductos> result = BDIngresosConsultas.ListarProductosSolicitadosParaiso(Integer.parseInt(NoPedido.getText()));
        RecargarTabla(result);
    }
    private void ListarProductosSolicitadosPalenca() {
        ArrayList<ClassProductos> result = BDIngresosConsultas.ListarProductosSolicitadosPalencia(Integer.parseInt(NoPedido.getText()));
        RecargarTabla(result);
    }
    private void RecargarTabla(ArrayList<ClassProductos> list) {
        Object[][] datos = new Object[list.size()][4];
        int i = 0;
        for (ClassProductos t : list) {
            datos[i][0] = t.getId_producto();
            datos[i][1] = t.getDescripcion();
            datos[i][2] = t.getUnidad();
            datos[i][3] = t.getCantidad();
            i++;
        }
        Solicitado.setModel(new javax.swing.table.DefaultTableModel(
                datos,
                new String[]{
                    "CODIGO", "DESCRIPCION", "MEDIDA", "CANTIDAD"
                }) {
            @Override
            public boolean isCellEditable(int row, int column) {
               return !(column==0) &&  !(column==1) &&  !(column==2);

            }
        });
        Solicitado.getColumnModel().getColumn(1).setCellRenderer(new TextAreaRenderer());
        TableColumn columna1 = Solicitado.getColumn("CODIGO");
        columna1.setPreferredWidth(-20);
        TableColumn columna2 = Solicitado.getColumn("DESCRIPCION");
        columna2.setPreferredWidth(255);
        TableColumn columna3 = Solicitado.getColumn("MEDIDA");
        columna3.setPreferredWidth(55);
    }

    private void ActualizartablaSantaInes() throws SQLException {
        if (Solicitado.getRowCount() > 0) {
                    BDConexionPedidos conecta = new BDConexionPedidos();
                    try (Connection cn = conecta.getConexion()) {
                    PreparedStatement ps;
            for (int i = 0; i < Solicitado.getRowCount(); i++) {
                    ps = cn.prepareStatement("update productos_pedido SET C_SANTAINES = " + Solicitado.getValueAt(i, 3) + " WHERE ID_PEDIDO = " + NoPedido.getText() + " AND ID_PRODUCTO =" + Solicitado.getValueAt(i, 0));
                    ps.executeUpdate();
                    ps.close();
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "La lista esta Vacia");
        }
    }
    
    private void ActualizartablaSanLuis() throws SQLException {
        if (Solicitado.getRowCount() > 0) {
                    BDConexionPedidos conecta = new BDConexionPedidos();
                    try (Connection cn = conecta.getConexion()) {
                    PreparedStatement ps;            
                    for (int i = 0; i < Solicitado.getRowCount(); i++) {
                    ps = cn.prepareStatement("update productos_pedido SET C_PUERTANE = " + Solicitado.getValueAt(i, 3) + " WHERE ID_PEDIDO = " + NoPedido.getText() + " AND ID_PRODUCTO =" + Solicitado.getValueAt(i, 0));
                    ps.executeUpdate();
                    ps.close();
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "La lista esta Vacia");
        }
    }
    
    private void ActualizartablaResidenciales() throws SQLException {
        if (Solicitado.getRowCount() > 0) {
                    BDConexionPedidos conecta = new BDConexionPedidos();
                    try (Connection cn = conecta.getConexion()) {
                    PreparedStatement ps;
            for (int i = 0; i < Solicitado.getRowCount(); i++) {
                    ps = cn.prepareStatement("update productos_pedido SET C_RESIDENCIALES = " + Solicitado.getValueAt(i, 3) + " WHERE ID_PEDIDO = " + NoPedido.getText() + " AND ID_PRODUCTO =" + Solicitado.getValueAt(i, 0));
                    ps.executeUpdate();
                    ps.close();
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "La lista esta Vacia");
        }
    }
    
    private void ActualizartablaParaiso() throws SQLException {
        if (Solicitado.getRowCount() > 0) {
                    BDConexionPedidos conecta = new BDConexionPedidos();
                    try (Connection cn = conecta.getConexion()) {
                    PreparedStatement ps;
            for (int i = 0; i < Solicitado.getRowCount(); i++) {
                    ps = cn.prepareStatement("update productos_pedido SET C_PARAISO = " + Solicitado.getValueAt(i, 3) + " WHERE ID_PEDIDO = " + NoPedido.getText() + " AND ID_PRODUCTO =" + Solicitado.getValueAt(i, 0));
                    ps.executeUpdate();
                    ps.close();
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "La lista esta Vacia");
        }
    }
    
    private void ActualizartablaPalencia() throws SQLException {
        if (Solicitado.getRowCount() > 0) {
                    BDConexionPedidos conecta = new BDConexionPedidos();
                    try (Connection cn = conecta.getConexion()) {
                    PreparedStatement ps;
            for (int i = 0; i < Solicitado.getRowCount(); i++) {
                    ps = cn.prepareStatement("update productos_pedido SET C_PALENCIA = " + Solicitado.getValueAt(i, 3) + " WHERE ID_PEDIDO = " + NoPedido.getText() + " AND ID_PRODUCTO =" + Solicitado.getValueAt(i, 0));
                    ps.executeUpdate();
                    ps.close();
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "La lista esta Vacia");
        }
    }
    
    private void actualizarcantidades(){
    
    try {
            switch (Sucursal) {
                case 1:
                    ActualizartablaSantaInes();
                    break;
                case 2:
                    ActualizartablaParaiso();
                    break;
                case 3:
                    ActualizartablaSanLuis();
                    break;
                case 4:
                    ActualizartablaPalencia();
                    break;
                case 5:
                    ActualizartablaResidenciales();
                    break;
                case 6:
                    ActualizartablaSantaInes();
                    break;
                default:
                    break;
            }
        } catch (SQLException ex) {
            System.out.println("ERROR DE ACTUALIZAR CANTIDAD-- "+ex);
        }
    }
    
   private void imprimir(){
      BDConexionPedidos con= new BDConexionPedidos();
         Connection conexion= con.getConexion();
        try {
            
            switch (Sucursal) {
            case 1: //SANTA INES IT PRUEBA
                Linksucursal = "C:\\Reportes\\ANGELS\\PEDIDO\\ProductoSolicitadoSantaInes.jasper";
                break;
            case 2://PARAISO
                Linksucursal = "C:\\Reportes\\ANGELS\\PEDIDO\\ProductoSolicitadoParaiso.jasper";
                break;
            case 3://SAN LUIS
                Linksucursal = "C:\\Reportes\\ANGELS\\PEDIDO\\ProductoSolicitadoPuertaNegra.jasper";
                break;
            case 4://PALENCIA
                Linksucursal = "C:\\Reportes\\ANGELS\\PEDIDO\\ProductoSolicitadoPalencia.jasper";
                break;
            case 5://RESIDENCIALES
                Linksucursal = "C:\\Reportes\\ANGELS\\PEDIDO\\ProductoSolicitadoResidenciales.jasper";
                break;
            case 6://SANTA INES
                Linksucursal = "C:\\Reportes\\ANGELS\\PEDIDO\\ProductoSolicitadoSantaInes.jasper";
                break;
            default:
                break;
        }
            
            JasperReport jasperReport=(JasperReport)JRLoader.loadObjectFromFile(Linksucursal);
            Map parametros= new HashMap();
            parametros.put("PEDIDO", Integer.parseInt(NoPedido.getText()));
            JasperPrint print = JasperFillManager.fillReport(jasperReport,parametros, conexion);
            JasperPrintManager.printReport(print, true);
        } catch (Exception e) {System.out.println("F"+e);
           JOptionPane.showMessageDialog(null, "ERROR EJECUTAR REPORTES =  "+e);
        }
    }
   
   private void Listar(){
        
        switch (Sucursal) {
            case 1:
                ListarProductosSolicitadosSantaInes();
                break;
            case 2:
                ListarProductosSolicitadosParaiso();
                break;
            case 3:
                ListarProductosSolicitadosSanLuis();
                break;
            case 4:
                ListarProductosSolicitadosPalenca();
                break;
            case 5:
                ListarProductosSolicitadosResidenciales();
                break;
            case 6:
                ListarProductosSolicitadosSantaInes();
                break;
            default:
                break;
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
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Productos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        Solicitado = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablePedidos = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        NoPedido = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TxtFecha = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        BUSCAR = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "DESCRIPCION"
            }
        ));
        Productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Productos);

        Solicitado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "DESCRIPCION", "CANTIDAD"
            }
        ));
        Solicitado.setColumnSelectionAllowed(true);
        Solicitado.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        Solicitado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SolicitadoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Solicitado);

        TablePedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No. Pedido", "Fecha"
            }
        ));
        TablePedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablePedidosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TablePedidos);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("No. PEDIDO");

        jLabel2.setText("FECHA");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NoPedido)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(TxtFecha))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/save2.png"))); // NOI18N
        jButton1.setText("GUARDAR PEDIDO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 0, 0));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("X");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Print.png"))); // NOI18N
        jButton2.setText("IMPRIMIR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("AGREGAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        BUSCAR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BUSCARKeyTyped(evt);
            }
        });

        jLabel3.setText("BUSCAR:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addComponent(jButton2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BUSCAR)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(BUSCAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TablePedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablePedidosMouseClicked
      if(bloqueo==0){
        BUSCAR.requestFocus();
        NoPedido.setText((String.valueOf(TablePedidos.getModel().getValueAt(TablePedidos.getSelectedRow(), 0))));
        TxtFecha.setText((String.valueOf(TablePedidos.getModel().getValueAt(TablePedidos.getSelectedRow(), 1))));
        //if (Solicitado.getRowCount() > 0) {actualizarcantidades();}   
        ListarProductos();
        switch (Sucursal) {
            case 1:
                ListarProductosSolicitadosSantaInes();
                break;
            case 2:
                ListarProductosSolicitadosParaiso();
                break;
            case 3:
                ListarProductosSolicitadosSanLuis();
                break;
            case 4:
                ListarProductosSolicitadosPalenca();
                break;
            case 5:
                ListarProductosSolicitadosResidenciales();
                break;
            case 6:
                ListarProductosSolicitadosSantaInes();
                break;
            default:
                break;
        }
      }
    }//GEN-LAST:event_TablePedidosMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            
            switch (Sucursal) {
                case 1:
                    ActualizartablaSantaInes();
                    break;
                case 2:
                    ActualizartablaParaiso();
                    break;
                case 3:
                    ActualizartablaSanLuis();
                    break;
                case 4:
                    ActualizartablaPalencia();
                    break;
                case 5:
                    ActualizartablaResidenciales();
                    break;
                case 6:
                    ActualizartablaSantaInes();
                    break;
                default:
                    break;
            }
        } catch (SQLException ex) {
            System.out.println("ERROR DE ACTUALIZAR CANTIDAD-- "+ex);
        }
        JOptionPane.showMessageDialog(null, "CANTIDADES ACTUALIZADAS...");
        Listar();
        bloqueo = 0;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductosMouseClicked
/*        if(bloqueo == 0){
        id_producto = (Integer.parseInt(String.valueOf(Productos.getModel().getValueAt(Productos.getSelectedRow(), 0))));
        if (evt.getClickCount() > 1) {
            // if (Solicitado.getRowCount() > 0) {actualizarcantidades();}    
         insertarProducto();
         ListarProductos();
         switch (Sucursal) {
            case 1:
                ListarProductosSolicitadosSantaInes();
                break;
            case 2:
                ListarProductosSolicitadosParaiso();
                break;
            case 3:
                ListarProductosSolicitadosSanLuis();
                break;
            case 4:
                ListarProductosSolicitadosPalenca();
                break;
            case 5:
                ListarProductosSolicitadosResidenciales();
                break;
            case 6:
                ListarProductosSolicitadosSantaInes();
                break;
            default:
                break;
        }
        }
         }else {JOptionPane.showMessageDialog(null, "GUARDAR PEDIDO PARA CONTINUAR AGREGANDO");}*/
    }//GEN-LAST:event_ProductosMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        if(bloqueo == 0){
        Ordenes F = new Ordenes();
        F.setVisible(true);
        this.dispose();}else{JOptionPane.showMessageDialog(null, "GUARDAR ANTES DE SALIR");}
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(NoPedido.getText().compareTo("")!=0){
           imprimir();
       }else {JOptionPane.showMessageDialog(null, "SELECCIONA UN PEDIDO PARA IMPRIMIR...");}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void SolicitadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SolicitadoMouseClicked
        int rowIndex = Solicitado.getSelectedColumn();
        if(rowIndex == 3){bloqueo = 1;}
    }//GEN-LAST:event_SolicitadoMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      if(bloqueo == 0){
        id_producto = (Integer.parseInt(String.valueOf(Productos.getModel().getValueAt(Productos.getSelectedRow(), 0))));
         insertarProducto();
         ListarProductos();
         switch (Sucursal) {
            case 1:
                ListarProductosSolicitadosSantaInes();
                break;
            case 2:
                ListarProductosSolicitadosParaiso();
                break;
            case 3:
                ListarProductosSolicitadosSanLuis();
                break;
            case 4:
                ListarProductosSolicitadosPalenca();
                break;
            case 5:
                ListarProductosSolicitadosResidenciales();
                break;
            case 6:
                ListarProductosSolicitadosSantaInes();
                break;
            default:
                break;
        }
         }else {JOptionPane.showMessageDialog(null, "GUARDAR PEDIDO PARA CONTINUAR AGREGANDO");}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void BUSCARKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BUSCARKeyTyped
        ListarProductos();
    }//GEN-LAST:event_BUSCARKeyTyped

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
            java.util.logging.Logger.getLogger(InicioPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BUSCAR;
    private javax.swing.JTextField NoPedido;
    private javax.swing.JTable Productos;
    private javax.swing.JTable Solicitado;
    private javax.swing.JTable TablePedidos;
    private javax.swing.JTextField TxtFecha;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
