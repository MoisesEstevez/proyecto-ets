
package es.iespuerto.logica.controlador;

public class Cliente extends Usuario{
    private static String ubicacion;
    private static String numeroTarjeta;
    private static String fechaCaducidad;
    private static int codigoTrasero;
    

    /**
     * Constructor de la clase Cliente
     * @param nombre Nombre del usuario
     * @param apellidos Apellidos del Usuario
     * @param email Email del Usuario
     * @param password Contrasena del Usuario
     * @param dni DNI del Usuario
     * @param esCliente Variable para saber si es cliente o trabajador
     */

    public Cliente(String nombre, String apellidos, String email, String password, String dni, boolean esCliente) {
        super(nombre, apellidos, email, password, dni, true);
    }



    /**
     * Metodo para aniadir una tarjeta de credito
     * @param numeroTarjeta Numero de la tarjeta de credito
     * @param fechaCaducidad Fecha de caducidad de la tarjeta de credito
     * @param codigoTrasero Codigo trasero de la tarjeta
     * @throws Exception
     */

    public void addTarjetaCredito(String numeroTarjeta, String fechaCaducidad, int codigoTrasero) throws Exception{
        if(numeroTarjeta.length()>=16 || numeroTarjeta.length()>=19){
            tarjetaDeCredito(numeroTarjeta,fechaCaducidad,codigoTrasero);
        } else {
            throw new Exception("La cuenta que ha introducido no es correcta");
        }
        
    }

    /**
     * Metodo que hace de tarjeta de credito
     * @param numeroTarjeta Numero de la tarjeta de credito
     * @param fechaCaducidad Fecha de caducidad de la tarjeta de credito
     * @param codigoTrasero Codigo trasero de la tarjeta
     */
    public void tarjetaDeCredito (String numeroTarjeta, String fechaCaducidad, int codigoTrasero){
        this.numeroTarjeta=numeroTarjeta;
        this.fechaCaducidad=fechaCaducidad;
        this.codigoTrasero=codigoTrasero;
    }

    /**
     * Getter de ubicacion
     * @return Devuelve la ubicacion del Cliente
     */
    public String getUbicacion() {
        return ubicacion;
    }


    /**
     * Setter de ubicacion
     * @param ubicacion Ubicacion del cliente
    */
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }


    /**
     * Getter de numero de tarjeta
     * @return Devuelve el numero de la tarjeta
     */
    public static String getNumeroTarjeta() {
        return numeroTarjeta;
    }


    /**
     * Setter de numero de tarjeta
     * @param numeroTarjeta Numero de la tarjeta
     */
    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }


    /**
     * Getter de fecha de caducidad
     * @return Devuelve la fecha de caducidad de la tarjeta de credito
     */
    public static String getFechaCaducidad() {
        return fechaCaducidad;
    }


    /**
     * Setter de fecha de caducidad
     * @param fechaCaducidad Fecha de caducidad de la tarjeta de credito
     */
    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }


    /**
     * Getter del codigo trasero
     * @return Getter codigo trasero de la tarjeta
     */
    public static int getCodigoTrasero() {
        return codigoTrasero;
    }


    /**
     * Setter del codigo trasero
     * @param codigoTrasero Codigo trasero de la tarjeta
     */
    public void setCodigoTrasero(int codigoTrasero) {
        this.codigoTrasero = codigoTrasero;
    }
    
    
    
}
