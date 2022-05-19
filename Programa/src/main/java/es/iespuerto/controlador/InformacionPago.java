package es.iespuerto.controlador;

public class InformacionPago {
    private Cliente tarjetaCredito;
    private boolean efectivo;
    private boolean online;
    /**
     * Metodo para saber si el Cliente esta desde Online;
     * @param online Parametro para saber si esta online o no
     * @return Devuelve si esta online o no
     */
    public boolean esOnline(boolean online){
        return online;
    }

    /**
     * Metodo para saber si se quiere pagar en efectivo
     * @param efectivo Parametro si se quiere pagar en efectivo
     * @return Devuelve si se quiere pagar en efectivo
     */

    public boolean esEfectivo(boolean efectivo){
        return efectivo;
    }

    /**
     * Metodo del sistema de pago que seleccione el Cliente
     * @return True: En el caso de que pague con tarjeta y False: Si paga en efectivo
     */

    public boolean sistemaPago(){
        if(!esEfectivo(this.efectivo)){
            Cliente.getNumeroTarjeta(); 
            Cliente.getFechaCaducidad();
            Cliente.getCodigoTrasero();
            return true;
        } else{
            return false;
        }
    }

    /**
     * Getter de efectivo
     * @return Devuelve parametro efectivo
     */
    public boolean getEfectivo() {
        return efectivo;
    }

    /**
     * Setter de efectivo
     * @param efectivo Parametro si se quiere pagar en efectivo
     */
    public void setEfectivo(boolean efectivo) {
        this.efectivo = efectivo;
    }

    /**
     * Getter de online
     * @return Devuelve parametro online
     */
    public boolean getOnline() {
        return online;
    }
    /**
     * Setter de online
     * @param online Parametro para saber si esta online o no
     */
    public void setOnline(boolean online) {
        this.online = online;
    }

    
    
}
