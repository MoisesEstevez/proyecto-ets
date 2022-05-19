package es.iespuerto.controlador;

import java.io.UnsupportedEncodingException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CocineroTest {
    Cocinero c= new Cocinero();
    /**
     * Este test comprueba el getter del estado del pedido
     */
    @Test
    public void getEstadoPedidoTest(){
        Assertions.assertFalse(c.getEstadoPedido(),"No se ha podido obtener el estado del pedido");    
    }
    /**
     * Este test comprueba el setter del estado del pedido
     */
    @Test
    public void setEstadoPedidoTest(){
        c.setEstadoPedido(true);
        Assertions.assertEquals(true, c.getEstadoPedido(),"No se ha podido insertar el estado del pedido");
    }
    /**
     * Test para comprobar si el insertar el estado del pedido funciona correctamente
     * @throws UnsupportedEncodingException
     */
    @Test
    public void insertarPedidoTest() throws UnsupportedEncodingException{
        c.pedidoRealizado();
        Assertions.assertTrue(c.getEstadoPedido());    
    }

}
