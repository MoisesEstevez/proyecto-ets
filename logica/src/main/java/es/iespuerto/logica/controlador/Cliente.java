
package es.iespuerto.logica.controlador;

public class Cliente {
    private String ubicacion;
    private String numeroTarjeta;
    private String fechaCaducidad;
    private int codigoTrasero;
    

    
    /**
     * Metodo para aniadir una tarjeta de credito
     * @param numeroTarjeta Numero de la tarjeta de credito
     * @param fechaCaducidad Fecha de caducidad de la tarjeta de credito
     * @param codigoTrasero Codigo trasero de la tarjeta
     * @throws Exception
     */

    public void addTarjetaCredito(String numeroTarjeta, String fechaCaducidad, int codigoTrasero) throws Exception{
        if(numeroTarjeta.length()>=16 && numeroTarjeta.length()<=19){
            tarjetaDeCredito(numeroTarjeta,fechaCaducidad,codigoTrasero);
        } else {
            tarjetaDeCredito(null, null, 0);
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
    public  String getNumeroTarjeta() {
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
    public String getFechaCaducidad() {
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
    public  int getCodigoTrasero() {
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
