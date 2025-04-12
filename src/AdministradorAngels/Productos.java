/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdministradorAngels;

/**
 *
 * @author jluis
 */
public class Productos {
    
    private int id_producto;
    private String descripcion;
    private String precio;
    private int codigo;
    private int cantidad;
    private int NoOrden;
    private String Fecha;
    private Double Total;
    private int NoMesa;
    private int OrdenDia;

    public int getNoMesa() {
        return NoMesa;
    }

    public void setNoMesa(int NoMesa) {
        this.NoMesa = NoMesa;
    }

    public int getOrdenDia() {
        return OrdenDia;
    }

    public void setOrdenDia(int OrdenDia) {
        this.OrdenDia = OrdenDia;
    }

    
    public int getNoOrden() {
        return NoOrden;
    }

    public void setNoOrden(int NoOrden) {
        this.NoOrden = NoOrden;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public Double getTotal() {
        return Total;
    }

    public void setTotal(Double Total) {
        this.Total = Total;
    }
    
    

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
    
    
    
}
