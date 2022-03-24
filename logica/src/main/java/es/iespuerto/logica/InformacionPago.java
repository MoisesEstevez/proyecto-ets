package es.iespuerto.logica;
public class InformacionPago {
    private Cliente tarjetaDeCredito;
    /**
     * Metodo que dice si el cliente lo esta realizando desde online y no desde el propio restaurante
     * @return boolean
     */
    public boolean esOnline(){
        return true;    
    }
    /**
     * Metodo que dice si el cliente quiere pagar en el restaurante u online
     * @return
     */
    public boolean esEfectivo(){
        return true;    
    }
    /**
     * Metodo que, en caso de que no se en efectivo , pide el metodo de pago que desea el cliente
     */
    public void sistemaPago(){
        
    }

}
