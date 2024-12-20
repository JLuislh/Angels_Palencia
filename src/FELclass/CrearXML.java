/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FELclass;

import java.io.File;
import java.io.StringWriter;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author david
 */
public class CrearXML {
    
     private String nombre;
     private String nit;
     private String orden;
     private String grantotal;
     private String totalletras;
     public CrearXML(String Nombre,String Nit,String Orden,String Grantotal, String TotalLetras){
     
         this.nombre = Nombre;
         this.nit = Nit;
         this.orden = Orden;
         this.grantotal = Grantotal;
         this.totalletras = TotalLetras;
     }
     


    public Document inicializarDocumento() throws ParserConfigurationException{
        Document documento;
        // Creamos los objectos de creacion de Documentos XML
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder constructor = docFactory.newDocumentBuilder();
        
        documento = constructor.newDocument();
        
        return documento;        
    }
    
    public String convertirString(Document documento) throws TransformerConfigurationException, TransformerException {
        // Creamos el objecto transformador
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer transformer = tf.newTransformer();
        
        // Indicamos que queremos que idente el XML con 2 espacios
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
        
        // Creamos el escritor a cadena de texto
        StringWriter writer = new StringWriter();
        // Fuente de datos, en este caso el documento XML
        DOMSource source = new DOMSource(documento);
        // Resultado, el cual se almacenara en el objecto writer
        StreamResult result = new StreamResult(writer);
        // Efectuamos la transformacion a lo que indica el objecto resultado, writer apuntara a el resultado
        transformer.transform(source, result);
        // Convertimos el buffer de writer en cadena de texto
        String output = writer.getBuffer().toString();

        return output;
    }
    
    public void escribirArchivo(Document documento, String fileName) throws TransformerConfigurationException, TransformerException {
        // Creamos el objecto transformador
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        
        // Indicamos que queremos que idente el XML con 2 espacios
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");

        // Archivo donde almacenaremos el XML
        File archivo = new File(fileName);

        // Fuente de datos, en este caso el documento XML
        DOMSource source = new DOMSource(documento);
        // Resultado, el cual almacena en el archivo indicado
        StreamResult result = new StreamResult(archivo);
        // Transformamos de ña fuente DOM a el resultado, lo que almacena todo en el archivo
        transformer.transform(source, result);
    }
    
    public Document crearDocumento() throws ParserConfigurationException {
        Document documento = this.inicializarDocumento();
        
        // Creamos el elemento principal
        Element root = documento.createElement("Root");
        // Hacemos el elemento entrada descender directo del nodo XML principal
        documento.appendChild(root);
        Element Version = documento.createElement("Version");
        Version.setTextContent("1.00");
        root.appendChild(Version);
        Element CountryCode = documento.createElement("CountryCode");
        CountryCode.setTextContent("GT");
        root.appendChild(CountryCode);
  ////////////////////////////HEADER INICIO//////////////////////////////////////////////  
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX");
        Calendar calendario = Calendar.getInstance();
        Date date = new Date(calendario.getTimeInMillis());
  
  
        Element header = documento.createElement("Header");
        
        Element DocType = documento.createElement("DocType");
        DocType.setTextContent("FACT");
        header.appendChild(DocType);
        
        Element IssuedDateTime = documento.createElement("IssuedDateTime");
        IssuedDateTime.setTextContent(formato.format(date));
        header.appendChild(IssuedDateTime);
        
        
        Element Currency = documento.createElement("Currency");
        Currency.setTextContent("GTQ");
        header.appendChild(Currency);

        root.appendChild(header);
////////////////////////////HEADER FIN//////////////////////////////////////////////

 ////////////////////////////Seller INICIO//////////////////////////////////////////////      
        Element Seller = documento.createElement("Seller");
        // Establecemos el contenido del titulo
        Element TaxID = documento.createElement("TaxID");
        TaxID.setTextContent("123456");//NIT DEL NEGOCIO
        Seller.appendChild(TaxID);
        
        Element TaxIDAdditionalInfo = documento.createElement("TaxIDAdditionalInfo");//+Name="AfiliacionIVA"
        Element Info = documento.createElement("Info");
        Info.setAttribute(  "Name", "AfiliacionIVA");
        Info.setAttribute(  "Value", "GEN");
        TaxIDAdditionalInfo.appendChild(Info );
        Seller.appendChild(TaxIDAdditionalInfo);
        
        Element Name = documento.createElement("Name");
        Name.setTextContent("FEL TEST");
        Seller.appendChild(Name);
        
         Element Contact = documento.createElement("Contact");
         Seller.appendChild( Contact);
         Element EmailList = documento.createElement("EmailList");
         Contact.appendChild(EmailList);
         Element Email = documento.createElement("Email");
         EmailList.appendChild(Email);
         Email.setTextContent("jorgeluislh@gmail.com");
        
         
        Element AdditionlInfo = documento.createElement("AdditionlInfo");//+Name="AfiliacionIVA"
        Element Infoadd = documento.createElement("Info");
        Infoadd.setAttribute(  "Name", "TipoFrase");
        Infoadd.setAttribute(  "Value", "1");
        Infoadd.setAttribute(  "Data", "1");
        Element Infoadd2 = documento.createElement("Info");
        Infoadd2.setAttribute(  "Name", "Escenario");
        Infoadd2.setAttribute(  "Value", "1");
        Infoadd2.setAttribute(  "Data", "1");
        AdditionlInfo.appendChild(Infoadd2 );
        AdditionlInfo.appendChild(Infoadd );
        Seller.appendChild(AdditionlInfo);
         
         Element BranchInfo = documento.createElement("BranchInfo");
         Seller.appendChild( BranchInfo);
         Element Code = documento.createElement("Code");
         Code.setTextContent("1");
         BranchInfo.appendChild(Code);
         Element NameE = documento.createElement("Name");
         NameE.setTextContent("EL REY ZONA 4");
         BranchInfo.appendChild(NameE);
         
          Element AddressInfo = documento.createElement("AddressInfo");
         Element Address = documento.createElement("Address");
         Address.setTextContent("ZOna 4");
         AddressInfo.appendChild(Address);
         Element City = documento.createElement("City");
         City.setTextContent("01010");
         AddressInfo.appendChild(City);
         Element District = documento.createElement("District");
         District.setTextContent("Guatemala");
         AddressInfo.appendChild(District);
         Element State = documento.createElement("State");
         State.setTextContent("Guatemala");
         AddressInfo.appendChild(State);
         Element Country = documento.createElement("Country");
         Country.setTextContent("GT");
         AddressInfo.appendChild(Country);
         BranchInfo.appendChild(AddressInfo);
        root.appendChild(Seller);
////////////////////////////Seller FIN//////////////////////////////////////////////
///////////////////////////INICIO BUYER////////////////////////////////////////////
   Element Buyer = documento.createElement("Buyer");
   Element TaxIDclient = documento.createElement("TaxID");
        TaxIDclient.setTextContent(nit);//NIT
        Buyer.appendChild(TaxIDclient);
   Element NameClient = documento.createElement("Name");
        NameClient.setTextContent(nombre);//NIT
        Buyer.appendChild(NameClient);
     
        Element AddressInfoClient = documento.createElement("AddressInfo");
         Element AddressClient = documento.createElement("Address");
         AddressClient.setTextContent("Ciudad");
         AddressInfoClient.appendChild(AddressClient);
         Element CityClient = documento.createElement("City");
         CityClient.setTextContent("01052");
         AddressInfoClient.appendChild(CityClient);
         Element DistrictClient = documento.createElement("District");
         DistrictClient.setTextContent("Guatemala");
         AddressInfoClient.appendChild(DistrictClient);
         Element StateClient = documento.createElement("State");
         StateClient.setTextContent("Guatemala");
         AddressInfoClient.appendChild(StateClient);
         Element CountryClient = documento.createElement("Country");
         CountryClient.setTextContent("GT");
         AddressInfoClient.appendChild(CountryClient);
         Buyer.appendChild(AddressInfoClient);
   root.appendChild(Buyer);

///////////////////////////FIN BUYER////////////////////////////////////////////

///////////////////////////INICIO ITEMS////////////////////////////////////////////
Element Items = documento.createElement("Items");
   

ArrayList<ObtenerProductosFactura> result = ObtenerProductosFactura.ListaProductosFactura(orden);
         DecimalFormat df = new DecimalFormat("#.000000");   
for (int i = 0; i < result.size(); i++) {
   
 Element Item = documento.createElement("Item");
   Element Type = documento.createElement("Type");
        Type.setTextContent("Servicio");
        Item.appendChild(Type);
        
   Element Description = documento.createElement("Description");
        Description.setTextContent(result.get(i).getDescripcion2());
        Item.appendChild(Description);
        
   Element Qty = documento.createElement("Qty");
        Qty.setTextContent(df.format(result.get(i).getCantidad()));
        Item.appendChild(Qty);
        
    Element UnitOfMeasure = documento.createElement("UnitOfMeasure");
        UnitOfMeasure.setTextContent("UNI");
        Item.appendChild(UnitOfMeasure);
        
    Element Price = documento.createElement("Price");
        Price.setTextContent(df.format(result.get(i).getPrecio()));
        Item.appendChild(Price);
    
   Element Taxes = documento.createElement("Taxes");
        Element Tax = documento.createElement("Tax");
        
        Element CodeTax = documento.createElement("Code");
        CodeTax.setTextContent("1");
        Tax.appendChild(CodeTax);
        
          Element DescriptionTax = documento.createElement("Description");
        DescriptionTax.setTextContent("IVA");
        Tax.appendChild(DescriptionTax);
        
        Element TaxableAmount = documento.createElement("TaxableAmount");
        TaxableAmount.setTextContent("0.000000");
        Tax.appendChild(TaxableAmount);
        
        Element Amount = documento.createElement("Amount");
        Amount.setTextContent("0.000000");
        Tax.appendChild(Amount);
        Taxes.appendChild(Tax); 
        Item.appendChild(Taxes); 
        
        Element Totals = documento.createElement("Totals");
        Element TotalItem = documento.createElement("TotalItem");
        TotalItem.setTextContent(df.format(result.get(i).getTotal()));
        Totals.appendChild(TotalItem);
        Item.appendChild(Totals);
   Items.appendChild(Item);  
   
   //Items.appendChild(Item);       
}
root.appendChild(Items);       
///////////////////////////FIN ITEMS////////////////////////////////////////////

///////////////////////////INICIO TOTALS////////////////////////////////////////////
        
        
        
        Element Totals = documento.createElement("Totals");
        Element TotalTaxes = documento.createElement("TotalTaxes");
        Element TotalTax = documento.createElement("TotalTax");
        
        Element Description = documento.createElement("Description");
        Description.setTextContent("IVA");
        TotalTax.appendChild(Description);
        
        Element Amount = documento.createElement("Amount");
        Amount.setTextContent("0.00");
        TotalTax.appendChild(Amount);
        
        TotalTaxes.appendChild(TotalTax);
        Totals.appendChild(TotalTaxes);
        
        Element GrandTotal = documento.createElement("GrandTotal");
        Element InvoiceTotal = documento.createElement("InvoiceTotal");
        InvoiceTotal.setTextContent(grantotal);
        GrandTotal.appendChild(InvoiceTotal);
        Totals.appendChild(GrandTotal);
        
        root.appendChild(Totals);

///////////////////////////FIN TOTALS////////////////////////////////////////////

///////////////////////////AdditionalDocumentInfo TOTALS////////////////////////////////////////////

 Element AdditionalDocumentInfo = documento.createElement("AdditionalDocumentInfo");
  Element AdditionalInfo = documento.createElement("AdditionalInfo"); 
 
  Element Codeadd = documento.createElement("Code");
 Codeadd.setTextContent("FRONT-263C-444B-89BA-6F87EC1330C0");
        AdditionalInfo.appendChild(Codeadd);
   
  Element Type = documento.createElement("Type");
 Type.setTextContent("ADENDA");
        AdditionalInfo.appendChild(Type);      
       
        Element AditionalData = documento.createElement("AditionalData");
         Element Data = documento.createElement("Data");
         Data.setAttribute(  "Name", "INFORMACION_ADICIONAL");
         Element InfoData = documento.createElement("Info");
         InfoData.setAttribute(  "Name", "OBSERVACIONES");
         InfoData.setAttribute(  "Value", "-");
         Data.appendChild(InfoData);
         Element InfoData1 = documento.createElement("Info");
         InfoData1.setAttribute(  "Name", "CANTIDAD_LETRAS");
         InfoData1.setAttribute(  "Value", totalletras);
         Data.appendChild(InfoData1);
         AditionalData.appendChild(Data);
         
        AdditionalInfo.appendChild(AditionalData);
        
        Element AditionalInfo2 = documento.createElement("AditionalInfo"); 
        Element Infofin = documento.createElement("Info");
        Infofin.setAttribute(  "Name", "VALIDAR_REFERENCIA_INTERNA");
        Infofin.setAttribute(  "Value", "NO_VALIDAR");
        AditionalInfo2.appendChild(Infofin);
        AdditionalInfo.appendChild(AditionalInfo2);
   AdditionalDocumentInfo.appendChild(AdditionalInfo);
   
   root.appendChild(AdditionalDocumentInfo);
        
        return documento;
    }
    
}
