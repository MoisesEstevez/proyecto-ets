/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.iespuerto.logica.controlador;

import es.iespuerto.logica.modelo.Pedido;

/**
 *
 * @author daw
 */
public class Camarero extends Usuario {
    private int nMesa;
    
    /**
     * Constructor de la clase Camarero
     * @param nombre Nombre del usuario
     * @param apellidos Apellidos del Usuario
     * @param email Email del Usuario
     * @param password Contrasena del Usuario
     * @param dni DNI del Usuario
     * @param esCliente Variable para saber si es cliente o trabajador
     */
    public Camarero(String nombre, String apellidos, String email, String password, String dni, boolean esCliente) {
        super(nombre, apellidos, email, password, dni, false);
    }
    /**
     * Metodo para registrar la mesa del pedido
     * @param nMesa
     */
    public void registrarMesaPedido(int nMesa){
        this.nMesa=nMesa;
    }
    public int getNMesa(){
        return nMesa;
    }
}
