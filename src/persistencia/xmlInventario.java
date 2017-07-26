/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import Usuarios.Inventarios;
import Usuarios.Mesoneros;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;

/**
 *
 * @author LOMAC
 */
public class xmlInventario {
    
    Mesoneros MesoneroN;
    Inventarios Inventarion;
    private Element root;
    
    private String fileLocation = "src//archivos//Inventario.xml";
  
    public xmlInventario() {
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
  
    private Element InventariotoXmlElement(Inventarios Inventarion) {
        Element Inventariontrans = new Element("Inventario");
        Element producto = new Element("producto");        producto.setText(Inventarion.getProducto());
        Element cantidad = new Element("cantidad");         cantidad.setText(Integer.toString(Inventarion.getCantidad())); 
        Inventariontrans.addContent(producto);    Inventariontrans.addContent(cantidad);         
        return Inventariontrans;
    }

  
    private Inventarios InventariosToObject(Element element) throws ParseException {
        Inventarios Inventarios = new Inventarios(element.getChildText("producto"), Integer.parseInt(element.getChildText("cantidad"))  );
        return Inventarios;
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

   
    public boolean agregarInventario(Inventarios Inventarion) {
        boolean resultado = false;
        root.addContent(InventariotoXmlElement((Inventarios) Inventarion));
        resultado = updateDocument();
        return resultado;
    }

   
    public Inventarios buscarInventario(String producto) {
        Element aux = new Element("Inventario");
        List Inventario = this.root.getChildren("Inventario");
        while (aux != null) {
            aux = xmlInventario.buscar(Inventario, producto);
            if (aux != null) {
                try {
                    return InventariosToObject(aux);
                } catch (ParseException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
        return null;
    }

  
    public boolean actualizarInventario(Inventarios productoE, Inventarios Inventarion) {
        boolean resultado = false;
        Element aux = new Element("Inventario");
        List Inventario = this.root.getChildren("Inventario");
        while (aux != null) {
            aux = xmlInventario.buscar(Inventario, productoE.getProductoE());
            if (aux != null) {
                Inventario.remove(aux);
                resultado = updateDocument();
            }
        }
        agregarInventario(Inventarion);
        return resultado;
    }

    public boolean borrarInventario(Inventarios productoE) {
        boolean resultado = false;
        Element aux = new Element("Inventario");
        List Inventario = this.root.getChildren("Inventario");
        while (aux != null) {
            aux = xmlInventario.buscar(Inventario, productoE.getProductoE());
            if (aux != null) {
                Inventario.remove(aux);
                resultado = updateDocument();
            }
        }
        return resultado;
    }


  
      
    public ArrayList<Inventarios> todosLosInventarios() {
        ArrayList<Inventarios> resultado = new ArrayList<Inventarios>();
        for (Object it : root.getChildren()) {
            Element xmlElem = (Element) it;
            try {
                resultado.add(InventariosToObject(xmlElem));
            } catch (ParseException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return resultado;
    }

    
}
