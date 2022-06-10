package es.iespuerto.logica.controlador;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.iespuerto.logica.modelo.Pedido;

public class PedidoTest {
    /**
     * Test para comprobar si se ha creado el pedido
     * @throws IOException
     */
    @Test
    public void crearPedidoTest() throws IOException{
        Pedido p= new Pedido(1, "Miel", "Sa", "ubicacionRestaurante", 2.30);
        p.crearPedido();
        Assertions.assertNotNull(p.getPedido());
    }
    
    /**
     * Test para comprobar la modificacion de un pedido
     * @throws FileNotFoundException
     */
    @Test
    public void modificarPedidoTest() throws FileNotFoundException{
        Pedido p= new Pedido(1, "Miel", "Sa", "ubicacionRestaurante", 2.30);
        Pedido s= new Pedido(5,"Castanas","null","null",0);
        Assertions.assertTrue(p.modificarPedido(s));

    }
    /**
     * Test para comprobar la modificacion de un pedido de manera erronea
     * @throws FileNotFoundException
     */
    @Test
    public void modificarPedidoMalTest() throws FileNotFoundException{
        Pedido p= new Pedido(1, "Miel", "Sa", "ubicacionRestaurante", 2.30);
        Pedido s= new Pedido(1, "Miel", "Sa", "ubicacionRestaurante", 2.30);
        Assertions.assertFalse(p.modificarPedido(s));

    }
    @Test
    public void getCantidadTest() throws FileNotFoundException{
        Pedido p= new Pedido(1, "Miel", "Sa", "ubicacionRestaurante", 2.30);
        Assertions.assertEquals(1, p.getCantidad());
    }
    @Test
    public void getProductoTest() throws FileNotFoundException{
        Pedido p= new Pedido(1, "Miel", "Sa", "ubicacionRestaurante", 2.30);
        Assertions.assertEquals("Miel", p.getProducto());
    }
    @Test
    public void getnombreRestTest() throws FileNotFoundException{
        Pedido p= new Pedido(1, "Miel", "Sa", "ubicacionRestaurante", 2.30);
        Assertions.assertEquals("Sa", p.getNombreRestaurante());
    }
    @Test
    public void getUbiRestauranteTest() throws FileNotFoundException{
        Pedido p= new Pedido(1, "Miel", "Sa", "ubicacionRestaurante", 2.30);
        Assertions.assertEquals("ubicacionRestaurante", p.getUbicacionRestaurante());
    }
    @Test
    public void getPrecioTest() throws FileNotFoundException{
        Pedido p= new Pedido(1, "Miel", "Sa", "ubicacionRestaurante", 2.30);
        Assertions.assertEquals(p.getPrecio(), 2.30);
    }
    @Test
    public void setCantidadTest() throws FileNotFoundException{
        Pedido p= new Pedido(1, "Miel", "Sa", "ubicacionRestaurante", 2.30);
        p.setCantidad(2);
        Assertions.assertEquals(p.getCantidad(), 2);
    }
    @Test
    public void setProductoTest() throws FileNotFoundException{
        Pedido p= new Pedido(1, "Miel", "Sa", "ubicacionRestaurante", 2.30);
        p.setProducto("Leche");
        Assertions.assertEquals(p.getProducto(), "Leche");
    }
    @Test
    public void setnombreRestTest() throws FileNotFoundException{
        Pedido p= new Pedido(1, "Miel", "Sa", "ubicacionRestaurante", 2.30);
        p.setNombreRestaurante("Na");
        Assertions.assertEquals(p.getNombreRestaurante(), "Na");
    }
    @Test
    public void setUbiRestauranteTest() throws FileNotFoundException{
        Pedido p= new Pedido(1, "Miel", "Sa", "ubicacionRestaurante", 2.30);
        p.setUbicacionRestaurante("n");
        Assertions.assertEquals(p.getUbicacionRestaurante(), "n");
    }
    @Test
    public void setPrecioTest() throws FileNotFoundException{
        Pedido p= new Pedido(1, "Miel", "Sa", "ubicacionRestaurante", 2.30);
        p.setPrecio(3);
        Assertions.assertEquals(p.getPrecio(), 3);
    }
}
