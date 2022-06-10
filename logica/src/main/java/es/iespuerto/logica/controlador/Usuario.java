
package es.iespuerto.logica.controlador;

import java.io.*;
import java.util.*;
public class Usuario {
    private String nombre;
    private String apellidos;
    private String email;
    private String password;
    private String dni;
    private boolean esCliente;
    /**
     * 
     * @param nombre Nombre del usuario
     * @param apellidos Apellidos del Usuario
     * @param email Email del Usuario
     * @param password Contrasena del Usuario
     * @param dni DNI del Usuario
     * @param esCliente Variable para saber si es cliente o trabajador
     */
    public Usuario(String nombre,String apellidos,String email,String password,String dni,boolean esCliente){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.email=email;
        this.password=password;
        this.dni=dni;
        this.esCliente=esCliente;
        
    }
    /**
     * Setter de la variable nombre
     * @param nombre Nombre del usuario
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Setter de la variable apellidos
     * @param apellidos Apellidos del Usuario
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    /**
     * Setter de la variable email
     * @param email Email del Usuario
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * Setter de la variable password
     * @param password Contrasena del Usuario
     */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
     * Setter de la variable dni
     * @param dni DNI del Usuario
     */
    public void setDni(String dni) {
        this.dni = dni;
    }
    /**
     * Setter de la variable esCliente
     * @param esCliente Variable para saber si es cliente o trabajador
     */
    public void setEsCliente(boolean esCliente) {
        this.esCliente = esCliente;
    }
    /**
     * Getter de la variable nombre
     * @return Devuelve la variable nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Getter de la variable apellidos
     * @return Devuelve la variable epellidos
     */
    public String getApellidos() {
        return apellidos;
    }
    /**
     * Getter de la variable email
     * @return Devuelve la variable email
     */
    public String getEmail() {
        return email;
    }
    /**
     * Getter de la variable password
     * @return Devuelve la variable password
     */
    public String getPassword() {
        return password;
    }
    /**
     * Getter de la variable dni
     * @return Devuelve la variable dni
     */
    public String getDni() {
        return dni;
    }
    /**
     * Getter de la variable esCliente
     * @return Devuelve la variable esCliente
     */
    public boolean getEsCliente() {
        return esCliente;
    }
    /**
     * Metodo para poder registrarse en la aplicacion
     * @return Si devuelve false el usuario ya esta registrado y si es true no lo esta
     * @throws java.io.IOException
     */
    public boolean registrar(String ruta) throws IOException{
        if (ifExist(ruta)) {
            return false;
        } else {
            FileWriter lector = new FileWriter(ruta, true);
            lector.write(dni+";"+nombre+";"+apellidos+";"+email+";"+password+";"+esCliente+";\n");
            lector.close();
            return true;
        }
    } 
    /**
     * Método para saber si el usuario ya se ha registrado o no
     * @param ruta Esta variable es la ruta del fichero en donde se guardan los usuarios registrados
     * @return True: En el caso de que el usuario esté registrado y False: En el caso de que no esté registrado
     * @throws IOException 
     */
    public boolean ifExist(String ruta) throws IOException{
        File entrada=new File(ruta);
        try (Scanner lectorFichero = new Scanner(entrada)) {
            String linea;
            String[] lineaDatos;
            while(lectorFichero.hasNextLine() ){
                linea=lectorFichero.nextLine();
                lineaDatos=linea.split(";");
                if (lineaDatos[0].equals(this.dni) && lineaDatos[3].equals(this.email)){
                    return true;
                }  
            }
        }
        return false;
    }
    /**
     * Metodo para iniciar sesion en la aplicacion
     * @return Devuelve true si se puede iniciar sesion y false si no puede
     * @throws java.io.IOException
     */
    public  boolean iniciarSesion() throws IOException{
        return ifExist("/home/daw/Documentos/proyecto-daw/proyecto-ets/logica/UsuariosCreados.txt");
    }  
}
