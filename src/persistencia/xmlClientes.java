/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import Usuarios.*;
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
public class xmlClientes {
    
    Clientes ClienteN;
    private Element root;
    
    private String fileLocation = "src//archivos//Clientes.xml";
   
    public xmlClientes() {
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

    private Element ClientestoXmlElement(Clientes Clientesn) {
        Element Clientesntrans = new Element("Clientes");
        Element rif = new Element("rif");              rif.setText(Clientesn.getRif());
        Element tlf = new Element("tlf");              tlf.setText(Clientesn.getTlf());
        Element ci = new Element("cedula");            ci.setText(Clientesn.getCi());
        Element tipoV = new Element("tipoV");          tipoV.setText(Clientesn.getTipoV());
        Element nombre = new Element("nombre");        nombre.setText(Clientesn.getNombre());  
        Element apellido = new Element("apellido");    apellido.setText(Clientesn.getApellido());
        Element direccion = new Element("direccion");  direccion.setText(Clientesn.getDireccion());
        Clientesntrans.addContent(rif);      Clientesntrans.addContent(tlf);
        Clientesntrans.addContent(ci);       Clientesntrans.addContent(tipoV);    
        Clientesntrans.addContent(nombre);   Clientesntrans.addContent(apellido); 
        Clientesntrans.addContent(direccion);
              
        return Clientesntrans;
    }

   
    private Clientes ClientesToObject(Element element) throws ParseException {
        Clientes Clientess = new Clientes(element.getChildText("rif"),element.getChildText("tlf"),element.getChildText("cedula"), element.getChildText("tipoV"),
        element.getChildText("nombre"), element.getChildText("apellido"),element.getChildText("direccion"));
        return Clientess;
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
            if (dato.equals(e.getChild("cedula").getText())) {
                return e;
            }
        }
        return null;
    }

   
    public boolean agregarPersona(Clientes Clientesn) {
        boolean resultado = false;
        root.addContent(ClientestoXmlElement((Clientes) Clientesn));
        resultado = updateDocument();
        return resultado;
    }

   
    public Clientes buscarPersona(Integer cedula) {
        Element aux = new Element("Clientes");
        List Clientes = this.root.getChildren("Clientes");
        while (aux != null) {
            aux = xmlEmpleado.buscar(Clientes, Integer.toString(cedula));
            if (aux != null) {
                try {
                    return ClientesToObject(aux);
                } catch (ParseException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
        return null;
    }

    public boolean actualizarPersona(Clientes ClienteE, Clientes Clientesn) {
        boolean resultado = false;
        Element aux = new Element("Clientes");
        List Clientes = this.root.getChildren("Clientes");
        while (aux != null) {
            aux = xmlClientes.buscar(Clientes, ClienteE.getclienteE());
            if (aux != null) {
                Clientes.remove(aux);
                resultado = updateDocument();
            }
        }
        agregarPersona(Clientesn);
        return resultado;
    }

  
    public boolean borrarPersona(Clientes clienteE) {
        boolean resultado = false;
        Element aux = new Element("Clientes");
        List Clientes = this.root.getChildren("Clientes");
        while (aux != null) {
            aux = xmlClientes.buscar(Clientes, clienteE.getclienteE());
            if (aux != null) {
                Clientes.remove(aux);
                resultado = updateDocument();
            }
        }
        return resultado;
    }


 
      
    public ArrayList<Clientes> todosLosClientes() {
        ArrayList<Clientes> resultado = new ArrayList<Clientes>();
        for (Object it : root.getChildren()) {
            Element xmlElem = (Element) it;
            try {
                resultado.add(ClientesToObject(xmlElem));
            } catch (ParseException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return resultado;
    }

    
}
