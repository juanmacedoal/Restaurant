/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;
import Menu.*;
import Control.*;
import Usuarios.Inventarios;

/**
 *
 * @author LOMAC
 */
public class Restaurant {
    
    private Mesoneros mesoneros[];
    private int numeroDemesoneros;
    private Cajeros cajeros[];
    private int numeroDecajeros;
    private Clientes clientes[];
    private int numeroDeclientes;
    private Inventarios inventario[];
    private int numeroDeinventario;
    private Pedidos pedidos[];
    private int numeroDepedidos;
    
    
      public Restaurant() { 
       mesoneros = new Mesoneros[20];
       numeroDemesoneros = 0;
       clientes = new Clientes[20];
       numeroDeclientes = 0;
       inventario = new Inventarios[50];
       numeroDeinventario = 0; 
       pedidos = new Pedidos[100];
       numeroDepedidos = 0;
       
     }
    
    public Restaurant(Pedidos[] pedidos){
        this.pedidos = pedidos;
    }
    
    public Pedidos getPedidos(int i) {
        return pedidos[i];
    }

    public void setPedidos(Pedidos PedidosN) {
        pedidos[numeroDepedidos] = PedidosN;
        numeroDepedidos++; 
    }
    
      public Pedidos[] getpedidos() {
        return pedidos;
    }

    public int getNumeroDepedidos() {
        return numeroDepedidos;
    }
    
      
    public Restaurant(Inventarios[] inventario){
        this.inventario = inventario;
    }
    
    public Inventarios getInventario(int i) {
        return inventario[i];
    }

    public void setInventario(Inventarios InventarioN) {
        inventario[numeroDeinventario] = InventarioN;
        numeroDeinventario++; 
    }
    
      public Inventarios[] getinventario() {
        return inventario;
    }

    public int getNumeroDeinventario() {
        return numeroDeinventario;
    }
  
    
    public Restaurant(Mesoneros[] mesoneros){
        this.mesoneros = mesoneros;
    }
    
    
    public Mesoneros getMesoneros(int i) {
        return mesoneros[i];
    }

    public void setMesoneros(Mesoneros MesoneroN) {
        mesoneros[numeroDemesoneros] = MesoneroN;
        numeroDemesoneros++; 
    }
    
      public Mesoneros[] getmesoneros() {
        return mesoneros;
    }

    public int getNumeroDemesoneros() {
        return numeroDemesoneros;
    }
    
    public Restaurant(Clientes[] clientes){
        this.clientes = clientes;
    }
    
    
    
    public Clientes getClientes(int i) {
        return clientes[i];
    }

    public void setClientes(Clientes ClienteN) {
        clientes[numeroDeclientes] = ClienteN;
        numeroDeclientes++; 
    }

    public Clientes[] getclientes() {
        return clientes;
    }

    public int getNumeroDeclientes() {
        return numeroDeclientes;
    }

    
}
