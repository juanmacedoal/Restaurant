/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

import java.io.FileNotFoundException;
import java.util.Formatter;

/**
 *
 * @author LOMAC
 */
public class Clientes {
    
    private String  rif, tlf, ci,clienteE;
    private String nombre, apellido, direccion, tipoV;

   
    
    
    public Clientes() {
        rif = "";
        tlf = "";
        ci = "" ;
        tipoV = "";
        nombre = "";
        apellido = "";
        direccion = "";
        clienteE = "";
    }

    
    
    public Clientes(String rif, String tlf ,String ci, String tipoV, String nombre, String apellido, String direccion) {
        this.rif = rif;
        this.tlf = tlf;
        this.ci = ci;
        this.tipoV = tipoV;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }
    
    public Clientes(String clienteE){
        this.clienteE=clienteE;
    }
     public String getclienteE() {
        return clienteE;
     }
    public String getRif() {
        return rif;
    }

    public void setRif(String rif) {
        this.rif = rif;
    }

    public String getTlf() {
        return tlf;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    

    public String getTipoV() {
        return tipoV;
    }

    public void setTipoV(String tipoV) {
        this.tipoV = tipoV;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
       
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
       
    }
    
    
    
}
