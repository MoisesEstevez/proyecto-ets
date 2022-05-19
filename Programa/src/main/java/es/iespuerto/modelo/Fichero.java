/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.iespuerto.modelo;

import java.io.*;
import java.util.*;


/**
 *
 * @author Usuario
 */
public class Fichero {
    private final String ruta="D:\\Pablo\\Escritorio\\FicherosPrograma\\Productos.txt";
    private static final Map<String,Double> productos= new HashMap<>();
    private static final Map<String,Integer> cantidadProducto= new HashMap<>();
    private static final Map<String,String> pedido= new HashMap<>();
    public boolean ifExist(String ruta, String dni) throws IOException{
        ruta=this.ruta;
        File fichero= new File(this.ruta);
        try (Scanner lectorFichero = new Scanner(fichero)) {
            String linea="";
            while(lectorFichero.hasNextLine() && !linea.equals(dni)){
                linea=lectorFichero.nextLine();
            }
        }
        try (FileWriter lector = new FileWriter(ruta, true)) {
        }
        return true;
    }
    public static Map<String,Double> tablaProductos() throws FileNotFoundException{
        File fichero= new File("D:\\Pablo\\Escritorio\\FicherosPrograma\\Productos.txt");
        try (Scanner lectorFichero = new Scanner(fichero)) {
            String linea;
            String[] datosLinea;
            while(lectorFichero.hasNextLine()){
                linea=lectorFichero.nextLine();
                datosLinea=linea.split(";");
                productos.put(datosLinea[1], Double.parseDouble(datosLinea[4]));
            }
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return productos;
    }
    public static Map<String,Integer> cantidadProductos() throws FileNotFoundException{
        File fichero= new File("D:\\Pablo\\Escritorio\\FicherosPrograma\\Productos.txt");
        try (Scanner lectorFichero = new Scanner(fichero)) {
            String linea;
            String[] datosLinea;
            while(lectorFichero.hasNextLine()){
                linea=lectorFichero.nextLine();
                datosLinea=linea.split(";");
                cantidadProducto.put(datosLinea[1], Integer.parseInt(datosLinea[0]));
            }
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return cantidadProducto;
    }
    public static Map<String,String> datosPedido() throws FileNotFoundException{
        File Fichero = new File("D:\\Pablo\\Escritorio\\FicherosPrograma\\Pedido.txt");
        try (Scanner lectorFichero = new Scanner(Fichero)) {
            String linea;
            String[] datosLinea;
            lectorFichero.nextLine();
            while(lectorFichero.hasNextLine()){
                linea=lectorFichero.nextLine();
                datosLinea=linea.split(" ");
                pedido.put(datosLinea[0], datosLinea[1]);
            }
        }
        return pedido;
    }
    public static void addPedido(int cantidad,String nPedido,String producto, String nombreRestaurante,String ubicacionRestaurante, double precio, int cantidadNueva) throws IOException{
        String linea="D:\\Pablo\\Escritorio\\FicherosPrograma\\Pedido.txt";
        File fichero = new File(linea);
        BufferedWriter lector = new BufferedWriter(new FileWriter(fichero));
        if (cantidadNueva<1) {
        lector.write(""+nPedido+" "+producto+" "+cantidad+" "+nombreRestaurante+" "+ubicacionRestaurante+" "+precio);
        lector.close();    
        } else {
        for (int i = 0; i < cantidadNueva; i++) {
            lector.newLine();
        }
        lector.write(""+nPedido+" "+producto+" "+cantidad+" "+nombreRestaurante+" "+ubicacionRestaurante+" "+precio);
        lector.close(); 
        }
    }   
}
