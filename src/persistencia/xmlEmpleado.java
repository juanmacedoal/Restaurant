/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

/**
 *
 * @author LOMAC
 */
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


public class xmlEmpleado {
    
    Mesoneros MesoneroN;
    private Element root;
   
    private String fileLocation = "src//archivos//Mesoneros.xml";
   
    public xmlEmpleado() {
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
  
    private Element MesonerostoXmlElement(Mesoneros Mesonerosn) {
        Element Mesonerosntrans = new Element("Empleado");
        Element dia = new Element("dia");              dia.setText(Mesonerosn.getDia());
        Element mes = new Element("mes");              mes.setText(Mesonerosn.getMes());
        Element ano = new Element("ano");              ano.setText(Mesonerosn.getAno());
        Element cedula = new Element("cedula");        cedula.setText(Mesonerosn.getCi());
        Element cel = new Element("telfcel");          cel.setText(Mesonerosn.getCel());
        Element casa = new Element("telfcasa");        casa.setText(Mesonerosn.getCasa());  
        Element nombre = new Element("nombre");        nombre.setText(Mesonerosn.getNombre());
        Element apellido = new Element("apellido");    apellido.setText(Mesonerosn.getApellido());
        Element direccion = new Element("direccion");  direccion.setText(Mesonerosn.getDireccion());
        Element cargo = new Element("cargo");          cargo.setText(Mesonerosn.getCargo());
        Mesonerosntrans.addContent(dia);    Mesonerosntrans.addContent(mes);
        Mesonerosntrans.addContent(ano);    Mesonerosntrans.addContent(cedula);              
        Mesonerosntrans.addContent(casa);   Mesonerosntrans.addContent(cel);    
        Mesonerosntrans.addContent(nombre); Mesonerosntrans.addContent(direccion);
        Mesonerosntrans.addContent(apellido); Mesonerosntrans.addContent(cargo);
        return Mesonerosntrans;
    }


    private Mesoneros MesonerosToObject(Element element) throws ParseException {
        Mesoneros Mesoneross = new Mesoneros(element.getChildText("dia"),element.getChildText("mes"),element.getChildText("ano"),
        element.getChildText("cedula"),element.getChildText("telfcel"),element.getChildText("telfcasa"),element.getChildText("nombre"),
        element.getChildText("apellido"),element.getChildText("direccion"), element.getChildText("cargo") );
        return Mesoneross;
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

  
    public boolean agregarPersona(Mesoneros Mesonerosn) {
        boolean resultado = false;
        root.addContent(MesonerostoXmlElement((Mesoneros) Mesonerosn));
        resultado = updateDocument();
        return resultado;
    }

  
    public Mesoneros buscarPersona(Integer cedula) {
        Element aux = new Element("Empleado");
        List Mesoneros = this.root.getChildren("Empleado");
        while (aux != null) {
            aux = xmlEmpleado.buscar(Mesoneros, Integer.toString(cedula));
            if (aux != null) {
                try {
                    return MesonerosToObject(aux);
                } catch (ParseException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
        return null;
    }

 
    public boolean actualizarPersona(Mesoneros MesoneroE, Mesoneros Mesonerosn) {
        boolean resultado = false;
        Element aux = new Element("Empleado");
        List Mesoneros = this.root.getChildren("Empleado");
        while (aux != null) {
            aux = xmlEmpleado.buscar(Mesoneros, MesoneroE.getEmpleadoE());
            if (aux != null) {
                Mesoneros.remove(aux);
                resultado = updateDocument();
            }
        }
        agregarPersona(Mesonerosn);
        return resultado;
    }


    public boolean borrarPersona(Mesoneros cedulaE) {
        boolean resultado = false;
        Element aux = new Element("Empleado");
        List Mesoneros = this.root.getChildren("Empleado");
        while (aux != null) {
            aux = xmlEmpleado.buscar(Mesoneros,cedulaE.getEmpleadoE());
            if (aux != null) {
                Mesoneros.remove(aux);
                resultado = updateDocument();
            }
        }
        return resultado;
    }


      
    public ArrayList<Mesoneros> todosLosMesoneros() {
        ArrayList<Mesoneros> resultado = new ArrayList<Mesoneros>();
        for (Object it : root.getChildren()) {
            Element xmlElem = (Element) it;
            try {
                resultado.add(MesonerosToObject(xmlElem));
            } catch (ParseException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return resultado;
    }


}
