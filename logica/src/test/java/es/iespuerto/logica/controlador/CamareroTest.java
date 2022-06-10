package es.iespuerto.logica.controlador;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CamareroTest {
    Camarero n = new Camarero("Jose", "Manue", "jose@gmail.com", "123456789", "32565412T", true);
    /**
     * Metodo para comprobar el registro de la mesa de la que el camarero realiza el pedido
     */
    @Test
    public void registrarMesaPedidoTest(){
        n.registrarMesaPedido(5);
        Assertions.assertNotNull(n);    
    }
    /**
     * Metodo para comprobar el registro de la mesa de la que el camarero realiza el pedido erroneamente
     */
    @Test
    public void registrarMesaPedidoTestMal(){
        n.registrarMesaPedido(5);
        Assertions.assertNotEquals(4,n.getNMesa());    
    }
    /**
     * Test para registrar mesa
     */
    @Test
    public void getNMesaTest(){
        n.registrarMesaPedido(5);
        Assertions.assertEquals(5, n.getNMesa());    
    }
    /**
     * Test para registrar mesa de manera erronea
     */
    @Test
    public void getNMesaTestMal(){
        n.registrarMesaPedido(5);
        Assertions.assertNotEquals(6, n.getNMesa()); 
    }
}
