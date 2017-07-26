/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

/**
 *
 * @author LOMAC
 */
public class Pedidos {
    
    private int  precio;
    private float iva, servicio;
    private String producto, lista;

    public Pedidos() {
      
        precio = 0;
        iva = 0;
        servicio = 0;
        producto = "";
        lista = "";
    }

    public Pedidos(int precio, float iva, float servicio, String producto, String Lista) {
        
        this.precio = precio;
        this.iva = iva;
        this.servicio = servicio;
        this.producto = producto;
        this.lista = Lista;
    }

    public String getLista() {
        return lista;
    }

    public void setLista(String lista) {
        this.lista = lista;
    }

  

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public float getIva() {
        return iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }

    public float getServicio() {
        return servicio;
    }

    public void setServicio(float servicio) {
        this.servicio = servicio;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }


    
    
    
}
