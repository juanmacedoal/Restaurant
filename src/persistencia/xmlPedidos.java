/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import Usuarios.Clientes;
import Usuarios.Pedidos;
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

/**
 *
 * @author LOMAC
 */
public class xmlPedidos {
    
    private Element root;

    private String fileLocation = "src//archivos//Pedidos.xml";
    
    public xmlPedidos() {
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
  
    private Element PedidostoXmlElement(Pedidos Pedidosn) {
        Element Pedidosntrans = new Element("Pedidos");
        Element precio = new Element("precio");           precio.setText(Integer.toString(Pedidosn.getPrecio()));
        Element iva = new Element("iva");                 iva.setText(Float.toString(Pedidosn.getIva()));
        Element servicio = new Element("servicio");       servicio.setText(Float.toString(Pedidosn.getServicio()));
        Element producto = new Element("producto");       producto.setText(Pedidosn.getProducto());  
        Element lista = new Element("lista");             lista.setText(Pedidosn.getLista());
        Pedidosntrans.addContent(precio);     
        Pedidosntrans.addContent(iva);       Pedidosntrans.addContent(servicio);    
        Pedidosntrans.addContent(producto);   
        Pedidosntrans.addContent(lista);
              
        return Pedidosntrans;
    }


    private Pedidos PedidosToObject(Element element) throws ParseException {
        Pedidos Pedidoss = new Pedidos(Integer.parseInt(element.getChildText("precio")), Float.parseFloat(element.getChildText("iva")),Float.parseFloat(element.getChildText("servicio")),
        element.getChildText("producto"), element.getChildText("lista"));
        return Pedidoss;
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

  
    public boolean agregarPedido(Pedidos Pedidosn) {
        boolean resultado = false;
        root.addContent(PedidostoXmlElement((Pedidos) Pedidosn));
        resultado = updateDocument();
        return resultado;
    }

   
    public Pedidos buscarPedido(JTextField producto) {
        Element aux = new Element("Pedidos");
        List Pedidos = this.root.getChildren("Pedidos");
        while (aux != null) {
            aux = xmlPedidos.buscar(Pedidos, producto.getText());
            if (aux != null) {
                try {
                    return PedidosToObject(aux);
                } catch (ParseException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
        return null;
    }

   
    public boolean actualizarPedido(Pedidos Pedidosn) {
        boolean resultado = false;
        Element aux = new Element("Pedidos");
        List Pedidos = this.root.getChildren("Pedidos");
        while (aux != null) {
            aux = xmlPedidos.buscar(Pedidos, Pedidosn.getProducto());
            if (aux != null) {
                Pedidos.remove(aux);
                resultado = updateDocument();
            }
        }
        agregarPedido(Pedidosn);
        return resultado;
    }

 
    public boolean borrarPedido(Integer cedula) {
        boolean resultado = false;
        Element aux = new Element("Pedidos");
        List Pedidos = this.root.getChildren("Pedidos");
        while (aux != null) {
            aux = xmlPedidos.buscar(Pedidos, Integer.toString(cedula));
            if (aux != null) {
                Pedidos.remove(aux);
                resultado = updateDocument();
            }
        }
        return resultado;
    }


      
    public ArrayList<Pedidos> todosLosPedidos() {
        ArrayList<Pedidos> resultado = new ArrayList<Pedidos>();
        for (Object it : root.getChildren()) {
            Element xmlElem = (Element) it;
            try {
                resultado.add(PedidosToObject(xmlElem));
            } catch (ParseException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return resultado;
    }

   
    
    
}
