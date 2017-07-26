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
public class Pedidos2 {
    
    
    private String producto, precio, importe, nmesa, subTotal, productoE;
    
    public Pedidos2() {
       
        precio = "";
        producto = "";
        importe = "1";
        nmesa = "";
        subTotal = "";
        productoE = "";
   
        
    }


    public Pedidos2( String producto, String precio, String importe, String nmesa, String subTotal) {
        this.precio = precio;
        this.producto = producto;
        this.importe = importe;
        this.nmesa = nmesa;
        this.subTotal = subTotal;
        
       
    }
      public Pedidos2(String productoE){
        this.productoE=productoE;
    }
     public String getProductoE() {
        return productoE;
    }
     public String getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(String subTotal) {
        this.subTotal = subTotal;
    }
 
    public String getNmesa() {
        return nmesa;
    }

    public void setNmesa(String nmesa) {
        this.nmesa = nmesa;
    }
    

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getImporte() {
        return importe;
    }

    public void setImporte(String importe) {
        this.importe = importe;
    }

    
  
    
    
}
