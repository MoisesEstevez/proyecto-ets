/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.iespuerto.logica.modelo;

import java.io.*;
import java.util.*;

import es.iespuerto.logica.controlador.Usuario;


public class Administrador {
    /**
     * Metodo del adminstrador para poder dar de alta a los usuarios
     * @param nombre Nombre del usuario
     * @param apellidos Apellidos del Usuario
     * @param email Email del Usuario
     * @param password Contrasena del Usuario
     * @param dni DNI del Usuario
     * @param esCliente Variable para saber si es cliente o trabajador
     * @return Devuelve true si el usuario se puede registrar y false si no se puede
     * @throws IOException 
     */
    public static boolean darDeAlta(String nombre,String apellidos,String email,String password,String dni,boolean esCliente) throws IOException{
        Usuario m = new Usuario (nombre,apellidos,email,password,dni,esCliente);
        return m.registrar();
    }

    /**
     * Metodo del adminstrador para poder dar de baja a los usuarios
     * @param nombre Nombre del usuario
     * @param apellidos Apellidos del Usuario
     * @param email Email del Usuario
     * @param password Contrasena del Usuario
     * @param dni DNI del Usuario
     * @param esCliente Variable para saber si es cliente o trabajador
     * @return Devuelve true si el usuario se puede dar de baja y false si no se puede
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public static boolean darDeBaja(String nombre,String apellidos,String email,String password,String dni,boolean esCliente) throws FileNotFoundException, IOException{
        File fichero= new File("D:\\Pablo\\Escritorio\\FicherosPrograma\\UsuariosCreados.txt");
        FileWriter lector2 = new FileWriter("D:\\Pablo\\Escritorio\\FicherosPrograma\\UsuariosEliminados.txt", true);
        try (Scanner lector = new Scanner(fichero)) {
            String linea;
            String[] lineaDatos;
            while(lector.hasNextLine()){
                linea=lector.nextLine();
                lineaDatos=linea.split(";");
                if (dni.equals(lineaDatos[0])) {
                    lector2.write(linea);
                    lector2.close();
                    return true;  
                }
            }
            lector.close();
            lector2.close();
        }
        return false;
    }
}
