/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package angels;
import ClassAngels.EtiquetasClass;
import ClassAngels.TiketsImpresion;
import br.com.adilson.util.Extenso;
import br.com.adilson.util.PrinterMatrix;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.swing.JOptionPane;

/**
 *
 * @author jluis
 */
public class Tiket {
    
    
    
    public static void main(String[] args) throws IOException { 
    
    String subTotal = "25.00";
    String total= "25.00";
    String dineroR= "1000";
    String devolucion= "10";

    
    PrinterMatrix printer = new PrinterMatrix();
    
    
    //Definir el tamanho del papel para la impresion de dinamico y 32 columnas
     ArrayList<TiketsImpresion> resultFilas = TiketsImpresion.ListaProductosTIket();
    int filas = resultFilas.size();
    int tamaño = filas+40;
    int p=0;
    printer.setOutSize(tamaño, 80);
        System.out.println("ENTRA");
    //Imprimir = 1ra linea de la columa de 1 a 32
    printer.printTextWrap(0, 1, 4, 80, "==========================================================");
    printer.printTextWrap(1, 1, 25, 80, "ANGEL'S"); //Nombre establecimiento
    printer.printTextWrap(3, 1, 25, 80, "LOCAL 13"); //Barrio
    printer.printTextWrap(4, 1, 23, 80, "EL ENCUENTRO"); //Direccion
    printer.printTextWrap(5, 1, 26, 80, "123456"); //Codigo Postal
    printer.printTextWrap(6, 1, 4, 41, "Fecha"); //Aqui va la fecha de recibo
    printer.printTextWrap(6, 1, 4, 80, "Hora"); //Aqui va la hora de recibo
    printer.printTextWrap(7, 1, 23, 80, "AUTORIZACION"); //Numero del recibo - FACTURA O PEDIDO
    printer.printTextWrap(8, 1, 24, 80, "SERIE"); //Nombre Cajero
    printer.printTextWrap(9, 1, 22, 80, "NUMERO DE DTE");//Nombre del Cliente
    printer.printTextWrap(10,1, 4, 80, "——————————–——————————–——————————–—–———");
    printer.printTextWrap(11,1, 4, 80, "CANT           DESCRIPCION              PRECIO     TOTAL");
    printer.printTextWrap(12,1, 0, 80, " ");
    
    ArrayList<TiketsImpresion> result = TiketsImpresion.ListaProductosTIket();
            for (int i = 0; i < result.size(); i++) {
                 p = 13+i;
            printer.printTextWrap(p , 1, 5, 8 , result.get(i).getCantidad());
            printer.printTextWrap(p , 1, 9, 11 ,"|");
            printer.printTextWrap(p , 1, 12, 39 , result.get(i).getDescripcion2());
            printer.printTextWrap(p , 1, 41, 43 ,"|");
            printer.printTextWrap(p , 1, 45, 50 , result.get(i).getPrecio());
            printer.printTextWrap(p , 1, 51, 53 ,"|");
            printer.printTextWrap(p , 1, 55, 60 , result.get(i).getTotal());
          }
            filas = p;
            System.out.println("FILA "+p);
        
   
   // DecimalFormat formateador = new DecimalFormat("#.###");
    printer.printTextWrap(filas+1, 1, 4, 80, "==========================================================");
    String sub= printer.alinharADireita(10, subTotal);
    printer.printTextWrap(filas+2, 1, 5, 80, "Subtotal: ");
    printer.printTextWrap(filas+2, 1, 20, 80, "$"+sub);

    String tot= printer.alinharADireita(10, total);
    printer.printTextWrap(filas+3, 1, 5, 80, "Total a pagar: ");
    printer.printTextWrap(filas+3, 1, 20, 80, "$"+tot);

    String efe= printer.alinharADireita(10,dineroR);
    printer.printTextWrap(filas+4, 1, 5, 80, "Efectivo : ");
    printer.printTextWrap(filas+4, 1, 20, 80, "$"+efe);

    String cam= printer.alinharADireita(10,devolucion);
    printer.printTextWrap(filas+5, 1, 5, 80, "Cambio : ");
    printer.printTextWrap(filas+5, 1, 20, 80, "$"+ cam);

    printer.printTextWrap(filas+6, 1, 5, 80, "——————————–——————————–——————————–—–———");
    printer.printTextWrap(filas+7, 1, 26,80, "!Gracias por su preferencia!");
    printer.printTextWrap(filas+8, 1, 30, 80, "WorkIt App - v1.0.0");
    printer.printTextWrap(filas+9, 1, 31, 80, "Software a Medida");
    printer.printTextWrap(filas+10, 1, 25, 80, "Contacto: workitapp@gmail.com");
    printer.printTextWrap(filas+11, 1, 5,80, "==========================================================");

    
    ///CREAR ARCHIVO EN CARPETA DEL PROYECTO PARA PEDIDOS
    printer.toFile("C:\\tmp\\impresion.txt");
    FileInputStream inputStream = null;

    try {
        inputStream = new FileInputStream("C:\\tmp\\impresion.txt");
    } catch (FileNotFoundException ex) {
        JOptionPane.showMessageDialog(null, "Error al guardar");
    }
    if (inputStream == null) {
        return;
    }
    
    
    DocFlavor docFormat = DocFlavor.INPUT_STREAM.AUTOSENSE;
    Doc document = new SimpleDoc(inputStream, docFormat, null);
    PrintRequestAttributeSet attributeSet = new HashPrintRequestAttributeSet();
    PrintService defaultPrintService = PrintServiceLookup.lookupDefaultPrintService();

    if (defaultPrintService != null) {
        DocPrintJob printJob = defaultPrintService.createPrintJob();
        try {
            printJob.print(document, attributeSet);
        } catch (PrintException ex) {
            System.out.println("angels.Tiket.main()"+ex);
        }
    } else {
        System.err.println("No existen impresoras instaladas");
    }
   // inputStream.close();
    //imprimirFin(subTotal, total, dineroR, devolucion); //ESTE METODO NO SE UTILIZARA
    }
}

      
