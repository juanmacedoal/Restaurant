/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import Usuarios.Pedidos;
import Usuarios.Pedidos2;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JTextField;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;
import persistencia.xmlPedidos;

/**
 *
 * @author LOMAC
 */
public class xmlPedidos2 {
    
    private Element root;
  
    private String fileLocation = "src//archivos//Pedidos2.xml";
   
    public xmlPedidos2() {
        try {
            SAXBuilder builder = new SAXBuilder(false);
            Document doc = null;
            doc = builder.build(fileLocation);
            root = doc.getRootElement();
        } catch (JDOMException ex) {
            System.out.println("No se pudo iniciar la operacion por: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("No se pudo iniciar la operacion por: " + ex.getMessage());
        }
    }
 
    private Element PedidostoXmlElement(Pedidos2 Pedidosn2) {
        Element Pedidosntrans = new Element("Pedidos");
        Element producto = new Element("producto");         producto.setText(Pedidosn2.getProducto());  
        Element importe = new Element("importe");           importe.setText(Pedidosn2.getImporte());
        Element precio = new Element("precio");             precio.setText(Pedidosn2.getPrecio());
        Element nmesa = new Element("nmesa");               nmesa.setText(Pedidosn2.getNmesa());
        Element subTotal = new Element("Sub_total");        subTotal.setText(Pedidosn2.getSubTotal());    
        Element productoE = new Element("productoE");         productoE.setText(Pedidosn2.getProductoE());
        Pedidosntrans.addContent(producto);     
        Pedidosntrans.addContent(importe);       Pedidosntrans.addContent(precio);
        Pedidosntrans.addContent(nmesa);         
        Pedidosntrans.addContent(subTotal); 
        Pedidosntrans.addContent(productoE);
     
        return Pedidosntrans;
    }
    
    


    private Pedidos2 PedidosToObject2(Element element) throws ParseException {
        Pedidos2 Pedidoss2 = new Pedidos2(element.getChildText("producto"), element.getChildText("precio"),
         element.getChildText("importe"),element.getChildText("nmesa"),element.getChildText("subTotal") );
        return Pedidoss2;
    }

  
    private boolean updateDocument() {
        try {
            XMLOutputter out = new XMLOutputter(org.jdom.output.Format.getPrettyFormat());
            FileOutputStream file = new FileOutputStream(fileLocation);
            out.output(root, file);
            file.flush();
            file.close();
            return true;
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
            return false;
        }
    }

 
    public static Element buscar(List raiz, String dato) {
        Iterator i = raiz.iterator();
        while (i.hasNext()) {
            Element e = (Element) i.next();
            if (dato.equals(e.getChild("producto").getText())) {
                return e;
            }
        }
        return null;
    }

  
    public boolean agregarPedido(Pedidos2 Pedidosn2) {
        boolean resultado = false;
        root.addContent(PedidostoXmlElement((Pedidos2) Pedidosn2));
        resultado = updateDocument();
        return resultado;
    }

    
    public Pedidos2 buscarPedido(JTextField producto) {
        Element aux = new Element("Pedidos");
        List Pedidos2 = this.root.getChildren("Pedidos");
        while (aux != null) {
            aux = xmlPedidos2.buscar(Pedidos2, producto.getText());
            if (aux != null) {
                try {
                    return PedidosToObject2(aux);
                } catch (ParseException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
        return null;
    }

    
    public boolean actualizarPedido(Pedidos2 PedidosE,Pedidos2 Pedidosn2) {
        boolean resultado = false;
        Element aux = new Element("Pedidos");
        List Pedidos2 = this.root.getChildren("Pedidos");
        while (aux != null) {
            aux = xmlPedidos2.buscar(Pedidos2, PedidosE.getProductoE());
            if (aux != null) {
                Pedidos2.remove(aux);
                resultado = updateDocument();
            }
        }
        agregarPedido(Pedidosn2);
        return resultado;
    }

  
    public boolean borrarPedido(Pedidos2 PedidoE) {
        boolean resultado = false;
        Element aux = new Element("Pedidos");
        List Pedidos2 = this.root.getChildren("Pedidos");
        while (aux != null) {
            aux = xmlPedidos2.buscar(Pedidos2, PedidoE.getProductoE());
            if (aux != null) {
                Pedidos2.remove(aux);
                resultado = updateDocument();
            }
        }
        return resultado;
    }


      
    public ArrayList<Pedidos2> todosLosPedidos() {
        ArrayList<Pedidos2> resultado = new ArrayList<Pedidos2>();
        for (Object it : root.getChildren()) {
            Element xmlElem = (Element) it;
            try {
                resultado.add(PedidosToObject2(xmlElem));
            } catch (ParseException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return resultado;
    }
    public boolean borrarPedido(String pedido) {
        boolean resultado = false;
        Element aux = new Element("Pedidos");
        List Pedidos2 = this.root.getChildren("Pedidos");
        while (aux != null) {
            aux = xmlPedidos2.buscar(Pedidos2, pedido);
            if (aux != null) {
                Pedidos2.remove(aux);
                resultado = updateDocument();
            }
        }
        return resultado;
    }
    
}
