package es.iespuerto.controlador;

import java.io.FileNotFoundException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.iespuerto.logica.modelo.Pedido;

public class PedidoTest {
    Pedido p;
    @BeforeEach
        public void antes() throws FileNotFoundException{
        p = new Pedido(1, "Miel", "Sa", "ubicacionRestaurante", 2.30);
    }
    
    /**
     * Metodo para comprobar la modificacion de un pedido
     */
    @Test
    public void modificarPedidoTest(){
        p.modificarPedido(p,5,null,null,null,0);
        Assertions.assertEquals(5, p.getCantidad());
    }
    @Test
    public void modificarPedidoMalTest(){
        p.modificarPedido(p,5,null,null,null,0);
        Assertions.assertNotEquals(7, p.getCantidad());    
    }

    /**
     * Metodo para comprobar la creacion de un pedido
     */
    @Test 
    public void crearPedidoTest(){
                    
    }
}
