package es.iespuerto.logica.controlador;
import org.junit.Assert;
import org.junit.Test;

public class CamareroTest {
    Camarero n = new Camarero("Jose", "Manue", "jose@gmail.com", "123456789", "32565412T", true);
    /**
     * Metodo para comprobar el registro de la mesa de la que el camarero realiza el pedido
     */
    @Test
    public void registrarMesaPedidoTest(){
        n.registrarMesaPedido(5);
        Assert.assertNotNull(n);    
    }
    @Test
    public void getNMesaTest(){
        n.registrarMesaPedido(5);
        Assert.assertEquals(5, n.getNMesa());    
    }
}
