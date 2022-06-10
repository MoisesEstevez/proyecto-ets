/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.iespuerto.logica.modelo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;


/**
 *
 * @author daw
 */
public class Pedido {
    private int cantidad  ;
    private static int cantidadPedidos=0;
    private String producto,nombreRestaurante, ubicacionRestaurante, nPedido;
    private double precio;
    private Map<String,Double> productos;
    private Map<String,Integer> cantidadProductos;
    private Map<String,String> pedido=Fichero.datosPedido();
    /**
     * Constructor de la clase Pedido
     * @param cantidad Cantidad de productos que se desea
     * @param producto Prodcuto que se ha pedido
     * @param nombreRestaurante Nombre del restaurante que se realiza el pedido
     * @param ubicacionRestaurante Ubicación del restaurante que se realiza el pedido
     * @param precio Precio del producto dependiendo de la cantidad
     * @throws java.io.FileNotFoundException 
     */
    public Pedido(int cantidad,String producto, String nombreRestaurante,String ubicacionRestaurante, double precio) throws FileNotFoundException{
        this.cantidadProductos=Fichero.cantidadProductos();
        this.productos = Fichero.tablaProductos();
        this.cantidad=cantidad;
        this.nPedido=java.util.UUID.randomUUID().toString();
        this.producto=producto;
        this.nombreRestaurante=nombreRestaurante;
        this.ubicacionRestaurante=ubicacionRestaurante;
        this.precio=precio;
        cantidadPedidos++;
    }
    /**
     * Setter de cantidad
     * @param cantidad Cantidad de productos que se desea
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    /**
     * Setter de numero del Pedido
     * @param nPedido 
     */
    public void setnPedido(String nPedido) {
        this.nPedido = nPedido;
    }
    /**
     * Setter de producto
     * @param producto 
     */
    public void setProducto(String producto) {
        this.producto = producto;
    }
    /**
     * Setter de nombre del restaurante
     * @param nombreRestaurante 
     */
    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }
    /**
     * Setter de ubicacionRestaurante
     * @param ubicacionRestaurante 
     */
    public void setUbicacionRestaurante(String ubicacionRestaurante) {
        this.ubicacionRestaurante = ubicacionRestaurante;
    }
    /**
     * Setter de precio
     * @param precio 
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    /**
     * Getter de cantidad
     * @return cantidad Cantidad de productos que se desea
     */
    public int getCantidad() {
        return cantidad;
    }
    /**
     * Getter de numero pedido
     * @return numero del pedido
     */
    public String getnPedido() {
        return nPedido;
    }
    /**
     * Getter de producto
     * @return producto
     */
    public String getProducto() {
        return producto;
    }
    /**
     * Getter de cantidad
     * @return cantidad
     */
    public String getNombreRestaurante() {
        return nombreRestaurante;
    }
    /**
     * Getter de ubicacion
     * @return ubicacion
     */
    public String getUbicacionRestaurante() {
        return ubicacionRestaurante;
    }
    /**
     * Getter de precio
     * @return precio
     */
    public double getPrecio() {
        return precio;
    }
    /**
     * Getter del mapa de pedido
     * @return pedido
     */
    public Map getPedido(){
        return pedido;
    }
    /**
     * Metodo para modificar el pedido
     * @param pedido 
     */
    public boolean modificarPedido(Pedido pedido){
        if(pedido.cantidad!=this.cantidad || !Objects.equals(pedido.producto, this.producto) || pedido.precio!=this.precio){
            this.cantidad=pedido.cantidad;
            this.producto=pedido.producto;
            this.precio=pedido.precio;
            return true;
        } else {
            return false;
        }
                
    }
    /**
     * Metodo para crear un nuevo pedido
     * @throws java.io.IOException
     */
    public void crearPedido() throws IOException{
        Fichero.addPedido(this.cantidad,this.nPedido,this.producto,this.nombreRestaurante,this.ubicacionRestaurante,this.precio,cantidadPedidos);
        pedido.put(nPedido, producto);
    }

}
