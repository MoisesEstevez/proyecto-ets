package es.iespuerto.logica;
public class Cocinero {
    private boolean estadoPedido;
    /**
     * Este metodo sirve para saber el estado del pedido
     * @param estadoPedido Es el estado del pedido hecho o por hacer
     * @return boolean
     */
    public boolean pedidoRealizado(boolean estadoPedido){
        return this.estadoPedido;    
    }

}
