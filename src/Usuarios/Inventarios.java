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
public class Inventarios {
    
    private String producto, productoE;
    private int cantidad;
    
     public Inventarios(){
        this.cantidad = 0;
        this.producto = "";
        this.productoE = "";
    }
    
    public Inventarios(String producto, int cantidad){
        this.cantidad = cantidad;
        this.producto = producto;
    }
     public Inventarios(String productoE){
        this.productoE=productoE;
    }
     public String getProductoE() {
        return productoE;
    }
    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
}
