/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BDclass;

import ClassAngels.InsertarProducto;
import ClassAngels.OrdenesClass;
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
public class BDOrdenes {
    
    
     public static OrdenesClass InsertarPedido(OrdenesClass t) throws SQLException{
        BDConexion conecta = new BDConexion();
        Connection con = conecta.getConexion();
        PreparedStatement smtp = null;
        smtp =con.prepareStatement("insert into Ordenes (FECHA,ESTADO) values(CURRENT_TIMESTAMP,1)",Statement.RETURN_GENERATED_KEYS);
        try {
         smtp.executeUpdate();
     } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);}
        ResultSet rs = smtp.getGeneratedKeys();
        if(rs.next()){int id = rs.getInt(1);
          t.setIdregresoPedido(id);
        }
       con.close();
       smtp.close(); 
        return t;
       
    }
     
    
     public static InsertarProducto InsertarProducto_Pedido(InsertarProducto t) throws SQLException{
        BDConexion conecta = new BDConexion();
        Connection con = conecta.getConexion();
        PreparedStatement smtp = null;
        smtp =con.prepareStatement("insert into ventas (noorden,codigo,cantidad,total,estado,tipo) values(?,?,1,(select precio from productos where codigo =  "+t.getId_producto()+" ),1,?) ");
        try {
         smtp.setInt(1,t.getNoOrden());
         smtp.setInt(2,t.getId_producto());
         smtp.setInt(3, t.getTipo());
         smtp.executeUpdate();
     } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "QUE MIERDA PASA ADENTRO =  "+e);}
       con.close();
       smtp.close(); 
        return t;
    }
     
     
     public static ArrayList<InsertarProducto> ListarProductosPedidos (int a ) {
        return SQL3(" SELECT cantidad,concat(p.DESCRIPCION1 ,' ', p.DESCRIPCION2) as Descripcion,precio,precio*CANTIDAD as total FROM ventas v inner join productos p on v.CODIGO = p.CODIGO where NOORDEN = "+a);    
        
 }  

private static ArrayList<InsertarProducto> SQL3(String sql){
    ArrayList<InsertarProducto> list = new ArrayList<InsertarProducto>();
    BDConexion conecta = new BDConexion();
    Connection cn = conecta.getConexion();
    System.out.println("llega3");
        try {
            InsertarProducto t;
            Statement stmt = cn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()){
                 t = new InsertarProducto();
                 t.setCantidad(rs.getInt("cantidad"));
                 t.setDescripcion(rs.getString("Descripcion").toUpperCase());
                 t.setPrecio(rs.getDouble("precio"));
                 t.setTotal(rs.getDouble("total"));
                 list.add(t);
            }
            cn.close();
        } catch (Exception e) {
            System.out.println("error consulta DE LA TABLA "+e);
            return null;
        } 
        return list;
}  
   
public static ArrayList<InsertarProducto> ProductosVentas(String Fecha) {
        return venta("SELECT v.codigo,concat(p.DESCRIPCION1 ,' ', p.DESCRIPCION2) as Descripcion,p.PRECIO,sum(v.CANTIDAD) as CANTIDAD,sum(v.TOTAL) as TOTAL\n" +
"FROM ventas v inner join productos p on v.CODIGO = p.CODIGO join ordenes o on v.NOORDEN = o.NOORDEN where  date_format(fecha,\"%d/%m/%Y\" )  = '"+Fecha+"'  group by  v.codigo,p.DESCRIPCION1,p.DESCRIPCION2,p.PRECIO  order by codigo;");    
 }  

    private static ArrayList<InsertarProducto> venta(String sql){
    ArrayList<InsertarProducto> list = new ArrayList<InsertarProducto>();
    BDConexion conecta = new BDConexion();
    Connection cn = conecta.getConexion();
    
        try {
            InsertarProducto t;
            Statement stmt = cn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()){
                 t = new InsertarProducto();
                 t.setCodigo(rs.getInt("CODIGO"));
                 t.setDescripcion(rs.getString("DESCRIPCION").toUpperCase());
                 t.setCantidad(rs.getInt("CANTIDAD"));
                 t.setPrecio(rs.getDouble("PRECIO"));
                 t.setTotal(rs.getDouble("TOTAL"));
                 list.add(t);
                            }
            cn.close();
        } catch (Exception e) {
            System.out.println("error consulta DE LA ATABLA "+e);
            return null;
        } 
        return list;
} 
    

    
    
public static ArrayList<InsertarProducto> ProductosVentasParaiso(String Fechain, String FechaFin) {
        return ventaParaiso("SELECT v.codigo,concat(p.DESCRIPCION1 ,' ', p.DESCRIPCION2) as Descripcion,p.PRECIO,sum(v.CANTIDAD) as CANTIDAD,sum(v.TOTAL) as TOTAL\n" +
"FROM ventas v inner join productos p on v.CODIGO = p.CODIGO join ordenes o on v.NOORDEN = o.NOORDEN where  fecha between '"+Fechain+" 02:00:00'  and  '"+FechaFin+" 02:00:00'  group by  v.codigo,p.DESCRIPCION1,p.DESCRIPCION2,p.PRECIO  order by codigo;");    
 }  

    private static ArrayList<InsertarProducto> ventaParaiso(String sql){
    ArrayList<InsertarProducto> list = new ArrayList<InsertarProducto>();
    BDConexion conecta = new BDConexion();
    Connection cn = conecta.getConexion();
    
        try {
            InsertarProducto t;
            Statement stmt = cn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()){
                 t = new InsertarProducto();
                 t.setCodigo(rs.getInt("CODIGO"));
                 t.setDescripcion(rs.getString("DESCRIPCION").toUpperCase());
                 t.setCantidad(rs.getInt("CANTIDAD"));
                 t.setPrecio(rs.getDouble("PRECIO"));
                 t.setTotal(rs.getDouble("TOTAL"));
                 list.add(t);
                            }
            cn.close();
        } catch (Exception e) {
            System.out.println("error consulta DE LA ATABLA "+e);
            return null;
        } 
        return list;
}     
    
    

    
    
public static ArrayList<InsertarProducto> ProductosVentasDetallado(String Fecha) {
        return ventaDeta("SELECT v.codigo,concat(p.DESCRIPCION1 ,' ', p.DESCRIPCION2) as DESCRIPCION ,p.PRECIO,v.CANTIDAD,v.TOTAL,o.FECHA \n" +
"FROM ventas v inner join productos p on v.CODIGO = p.CODIGO join ordenes o on v.NOORDEN = o.NOORDEN where  date_format(fecha,\"%d/%m/%Y\" )  = '"+Fecha+"' order by codigo;");    
 }  

    private static ArrayList<InsertarProducto> ventaDeta(String sql){
    ArrayList<InsertarProducto> list = new ArrayList<InsertarProducto>();
    BDConexion conecta = new BDConexion();
    Connection cn = conecta.getConexion();
    
        try {
            InsertarProducto t;
            Statement stmt = cn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()){
                 t = new InsertarProducto();
                 t.setCodigo(rs.getInt("CODIGO"));
                 t.setDescripcion(rs.getString("DESCRIPCION").toUpperCase());
                 t.setCantidad(rs.getInt("CANTIDAD"));
                 t.setPrecio(rs.getDouble("PRECIO"));
                 t.setTotal(rs.getDouble("TOTAL"));
                 t.setFecha(rs.getString("FECHA"));
                 list.add(t);
                            }
            cn.close();
        } catch (Exception e) {
            System.out.println("error consulta DE LA ATABLA "+e);
            return null;
        } 
        return list;
}      
    
    
    
public static ArrayList<InsertarProducto> ProductosVentasDetalladoParaiso(String Fechain, String FechaFin) {
        return ventaDetaParaiso("SELECT v.codigo,concat(p.DESCRIPCION1 ,' ', p.DESCRIPCION2) as DESCRIPCION ,p.PRECIO,v.CANTIDAD,v.TOTAL,o.FECHA \n" +
"FROM ventas v inner join productos p on v.CODIGO = p.CODIGO join ordenes o on v.NOORDEN = o.NOORDEN where  fecha between '"+Fechain+" 02:00:00'  and  '"+FechaFin+" 02:00:00' order by codigo;");    
 }  

    private static ArrayList<InsertarProducto> ventaDetaParaiso(String sql){
    ArrayList<InsertarProducto> list = new ArrayList<InsertarProducto>();
    BDConexion conecta = new BDConexion();
    Connection cn = conecta.getConexion();
    
        try {
            InsertarProducto t;
            Statement stmt = cn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()){
                 t = new InsertarProducto();
                 t.setCodigo(rs.getInt("CODIGO"));
                 t.setDescripcion(rs.getString("DESCRIPCION").toUpperCase());
                 t.setCantidad(rs.getInt("CANTIDAD"));
                 t.setPrecio(rs.getDouble("PRECIO"));
                 t.setTotal(rs.getDouble("TOTAL"));
                 t.setFecha(rs.getString("FECHA"));
                 list.add(t);
                            }
            cn.close();
        } catch (Exception e) {
            System.out.println("error consulta DE LA ATABLA "+e);
            return null;
        } 
        return list;
}          
    
    
 public static ArrayList<InsertarProducto> OrdenesParaiso(String Fecha1, String Fecha2) {
     System.out.println(Fecha1 +"----"+ Fecha2);
        return Order("select noorden,Total,Fecha from ordenes where estado = 2 and fecha between '"+Fecha1+" 02:00:00'  and  '"+Fecha2+" 02:00:00'");    
 } 
    
    public static ArrayList<InsertarProducto> Ordenes(String Fecha) {
        return Order("select ordendia,Total,Fecha from ordenes where estado = 2 and date_format(fecha,'%d/%m/%Y')  ='"+Fecha+"'");    
 }  
 
    private static ArrayList<InsertarProducto> Order(String sql){
    ArrayList<InsertarProducto> list = new ArrayList<InsertarProducto>();
    BDConexion conecta = new BDConexion();
    Connection cn = conecta.getConexion();
    
        try {
            InsertarProducto t;
            Statement stmt = cn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()){
                 t = new InsertarProducto();
                 t.setNoOrden(rs.getInt("ordendia"));
                 t.setTotal(rs.getDouble("TOTAL"));
                 t.setFecha(rs.getString("FECHA"));
                 list.add(t);
                            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("error consulta DE LA A TABLA "+e);
            return null;
        } 
        return list;
}
    
    
    
public static InsertarProducto BuscarTotalParaiso(String a,String b) throws SQLException{
        return buscarTotalParaiso(a,b ,null);
    }

public static InsertarProducto buscarTotalParaiso(String a,String b, InsertarProducto c) throws SQLException {
             
            BDConexion conecta = new BDConexion();
            Connection cn = conecta.getConexion();
            PreparedStatement ps = null;
            ps = cn.prepareStatement("select SUM(TOTAL) AS TOTAL,SUM(efectivo) AS efectivo,SUM(Tarjeta) AS Tarjeta,SUM(transferencia) AS transferencia, count(*) as ORDENES from ordenes where estado = 2 and fecha between '"+a+" 02:00:00'  and  '"+b+" 02:00:00'");
            ResultSet rs = ps.executeQuery();
            if (rs.next())
            {
               if (c==null)
               {c = new InsertarProducto(){};}
               c.setNoOrden(rs.getInt("ORDENES"));
               c.setTotal(rs.getDouble("TOTAL"));
               c.setEfectivo(rs.getDouble("efectivo"));
               c.setTransferencia(rs.getDouble("transferencia"));
               c.setTarjeta(rs.getDouble("Tarjeta"));
               
            }
            cn.close();
            ps.close();
            return c;
}





public static InsertarProducto BuscarTotal(String a) throws SQLException{
        return buscarTotal(a ,null);
    }
    
    public static InsertarProducto buscarTotal(String a, InsertarProducto c) throws SQLException {
             
            BDConexion conecta = new BDConexion();
            Connection cn = conecta.getConexion();
            PreparedStatement ps = null;
            ps = cn.prepareStatement("select SUM(TOTAL) AS TOTAL,SUM(efectivo) AS efectivo,SUM(Tarjeta) AS Tarjeta,SUM(transferencia) AS transferencia, count(*) as ORDENES from ordenes where estado = 2 and date_format(fecha,'%d/%m/%Y' )  = '"+a+"';");
            ResultSet rs = ps.executeQuery();
            if (rs.next())
            {
               if (c==null)
               {c = new InsertarProducto(){};}
               c.setNoOrden(rs.getInt("ORDENES"));
               c.setTotal(rs.getDouble("TOTAL"));
               c.setEfectivo(rs.getDouble("efectivo"));
               c.setTransferencia(rs.getDouble("transferencia"));
               c.setTarjeta(rs.getDouble("Tarjeta"));
               
            }
            cn.close();
            ps.close();
            return c;
}

public static ArrayList<InsertarProducto> ListarCodigosPedido (int a ) {
        return cod(" select codigo,cantidad from ventas where NOORDEN = "+a+";");    
 }  

private static ArrayList<InsertarProducto> cod(String sql){
    ArrayList<InsertarProducto> list = new ArrayList<InsertarProducto>();
    BDConexion conecta = new BDConexion();
    Connection cn = conecta.getConexion();
    
        try {
            InsertarProducto t;
            Statement stmt = cn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()){
                 t = new InsertarProducto();
                 t.setCodigo(rs.getInt("codigo"));
                 t.setCantidad(rs.getInt("cantidad"));
                 list.add(t);
            }
            cn.close();
        } catch (Exception e) {
            System.out.println("error consulta DE LA TABLA "+e);
            return null;
        } 
        return list;
}  

}
