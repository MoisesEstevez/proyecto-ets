package es.iespuerto.logica.controlador;

import java.io.UnsupportedEncodingException;

import org.junit.Assert;
import org.junit.Test;

public class CocineroTest {
    Cocinero c= new Cocinero();
    /**
     * Este test comprueba el getter del estado del pedido
     */
    @Test
    public void getEstadoPedidoTest(){
        Assert.assertFalse(c.getEstadoPedido());    
    }
    /**
     * Este test comprueba el setter del estado del pedido
     */
    @Test
    public void setEstadoPedidoTest(){
        c.setEstadoPedido(true);
        Assert.assertEquals(true, c.getEstadoPedido());
    }
    /**
     * Test para comprobar si el insertar el estado del pedido funciona correctamente
     * @throws UnsupportedEncodingException
     */
    @Test
    public void insertarPedidoTest() throws UnsupportedEncodingException{
        c.pedidoRealizado();
        Assert.assertTrue(c.getEstadoPedido());    
    }

}
