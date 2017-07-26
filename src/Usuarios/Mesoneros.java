/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import java.io.FileNotFoundException;
import java.util.*;
/**
 *
 * @author LOMAC
 */
public class Mesoneros {
    
    private int mesa;
    private String tipo_ganancia, Nombre, Apellido, Direccion, cargo, empleadoE;
    private String cel, casa, ci, dia ,mes, ano, turno;
    
    
    public Mesoneros() {
        dia = "";
        mes = "";
        ano = "";
        ci = "";
        cel = "";
        casa = "";
        Nombre = "";
        Apellido = "";
        Direccion = "";
        cargo = "";
        empleadoE="";
    }

     public Mesoneros(String dia, String mes, String ano, String ci, String cel, String casa, String Nombre, String Apellido, String Direccion, String cargo) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.ci = ci;
        this.cel = cel;
        this.casa = casa;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Direccion = Direccion;
        this.cargo = cargo;
       }
     
    public Mesoneros(String empleadoE){
        this.empleadoE=empleadoE;
    }
     public String getEmpleadoE() {
        return empleadoE;
     }
    
    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
    
    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

   
    

    public String getNombre() {
        return Nombre;
        
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
     
    }

    public String getApellido() {
        return Apellido;
        
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;

    }
    
      
    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
        
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
       
    }

    public String getTipo_ganancia() {
        return tipo_ganancia;
    }

    public void setTipo_ganancia(String tipo_ganancia) {
        this.tipo_ganancia = tipo_ganancia;
        
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }  
}
