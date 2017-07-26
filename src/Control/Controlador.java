/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Usuarios.*;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JTextField;

/**
 *
 * @author LOMAC
 */
public class Controlador {
    
    JTextField Nombre, Apellido, cel, casa, Direccion, ci, rif, tlf, clave, producto ,iva ,servicio , precio,Producto;
    JSpinner Cantidad, nro;
    Restaurant res = new Restaurant();
    Inventarios InventarioN;
    JButton lista,Guardar;
    JComboBox cargo, dia, mes, ano, entrega, list, tipoV;
    String Nmesa;
    
    public Controlador(JButton lista){
        this.lista = lista;
    
    }
    public Controlador(String Nmesa) {
        this.Nmesa = Nmesa;
       
    }
    
    public String getNmesa() {
        return Nmesa;
    }

    public void setNmesa(String Nmesa) {
        this.Nmesa = Nmesa;
    }
    
         
    public Controlador(JTextField clave){
        this.clave = clave;
    
    }
    
    public Controlador(JTextField Producto, JSpinner Cantidad) {
        this.Producto = Producto;
        this.Cantidad = Cantidad;
        
    }

    public Controlador(JTextField precio, JTextField iva, JTextField servicio, JTextField producto, JComboBox list) {
        this.producto = producto;
        this.iva = iva;
        this.servicio = servicio;
        this.list = list;
        this.precio = precio;
    }
    
    public Controlador(JTextField Nombre, JTextField Apellido, JTextField cel, JTextField casa, JTextField Direccion, JComboBox dia, JComboBox mes, JComboBox ano, JTextField ci, JComboBox cargo) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.cel = cel;
        this.casa = casa;
        this.Direccion = Direccion;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.ci = ci;
        this.cargo = cargo;
    }
    
    
    public Controlador(JTextField Nombre, JTextField Apellido, JTextField ci, JTextField tlf, JTextField Direccion, JTextField rif, JComboBox tipoV) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.ci = ci;
        this.tlf = tlf;
        this.Direccion = Direccion;
        this.rif = rif;
        this.tipoV = tipoV;
        
    }
    
    public void inicializarTxt(JTextField Nombre, JTextField Apellido, JTextField cel, JTextField casa, JTextField Direccion, JComboBox dia, JComboBox mes, JComboBox ano, JTextField ci, JComboBox cargo){
      Nombre.setText(null);
      Apellido.setText(null);
      cel.setText(null);
      casa.setText(null);
      Direccion.setText(null);
      ci.setText(null);
      
      
    }
    
    public void inicializarTxtClientes(JTextField Nombre, JTextField Apellido, JTextField ci, JTextField tlf, JTextField Direccion, JTextField rif, JComboBox tipoV){
      Nombre.setText(null);
      Apellido.setText(null);
      tlf.setText(null);
      rif.setText(null);
      Direccion.setText(null);
      ci.setText(null);
    }
    
    public void inicializarTxtProducto(JTextField precio, JTextField iva, JTextField servicio, JTextField producto, JComboBox list){
      precio.setText(null);
      iva.setText(null);
      servicio.setText(null);
      producto.setText(null);
      
    }
    
    public void inicializarTxt(JTextField Producto, JSpinner Cantidad){
      Producto.setText(null);
      Cantidad.setValue(0);
      
    }
    
    public void datosInventario(Inventarios InventarioN, Restaurant res){
        InventarioN.setProducto(Producto.getText());
        InventarioN.setCantidad((int) Cantidad.getValue());
        res.setInventario(InventarioN);
    }
    
    public void datosMesonero(Mesoneros MesoneroN, Restaurant res){
        MesoneroN.setNombre(Nombre.getText());
        MesoneroN.setApellido(Apellido.getText());
        MesoneroN.setCi(ci.getText());
        MesoneroN.setDireccion(Direccion.getText());
        MesoneroN.setCasa(casa.getText());
        MesoneroN.setCel(cel.getText());
        MesoneroN.setDia(dia.getSelectedItem().toString());
        MesoneroN.setMes(mes.getSelectedItem().toString());
        MesoneroN.setAno(ano.getSelectedItem().toString());
        MesoneroN.setCargo(cargo.getSelectedItem().toString());
        res.setMesoneros(MesoneroN);
    }
    
    public void datosClientes(Clientes ClienteN, Restaurant res){
        ClienteN.setRif(rif.getText());
        ClienteN.setTlf(tlf.getText());
        ClienteN.setTipoV(tipoV.getSelectedItem().toString());
        ClienteN.setNombre(Nombre.getText());
        ClienteN.setApellido(Apellido.getText());
        ClienteN.setDireccion(Direccion.getText());
        ClienteN.setCi(ci.getText());
        res.setClientes(ClienteN);
    }
    
     public void datosPedidos(Pedidos PedidosN, Restaurant res){
        PedidosN.setPrecio(Integer.parseInt(precio.getText()));
        PedidosN.setIva(Float.parseFloat(iva.getText()));
        PedidosN.setServicio(Float.parseFloat(servicio.getText()));
        PedidosN.setProducto(producto.getText());
        PedidosN.setLista(list.getSelectedItem().toString());
        res.setPedidos(PedidosN);
    }
    
    public void activa_Desactiva(boolean verdadOFalso){
      lista.setEnabled(verdadOFalso);
    }
    
    public int contrasena(JTextField clave){
       int numero = 10;
       boolean verdad = false;
         
         if("gerente".equals(clave.getText())){
              numero = 1;
              verdad = true;
         }
         
          
          if("mesonero".equals(clave.getText())){
              numero = 2;
              verdad = true;
          }
          
          
          if("cajero".equals(clave.getText())){
              numero = 3; 
              verdad = true;
          }
          
          if(verdad == false)
              numero =4;
          
          
          
        return numero;
    }


}
