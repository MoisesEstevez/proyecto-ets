package es.iespuerto.logica.controlador;

import java.lang.reflect.Executable;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;




public class ClienteTest {

    Cliente m = new Cliente();
    /**
     * Metodo para comprobar la agregacion de la tarjeta de credito del cliente
     * @throws Exception
     */
    @Test
    public void addTarjetaCreditoTest() throws Exception{
    m.addTarjetaCredito("324564321345643254","07/24",354);
    Assertions.assertNotNull(m, "No se ha conseguido aniadir la tarjeta");    
    }
    /**
     * Metodo para comprobar el mal funcionamiento en la agregacion de la tarjeta de credito del cliente 
     * @throws Exception
     */
    @Test
    public void addTarjetaCreditoTestMal() throws Exception{
        m.addTarjetaCredito("324564321345643254213232323","07/24",354);
        Assertions.assertNull(m.getNumeroTarjeta(), "No se ha conseguido aniadir la tarjeta");    
        }
    /**
     * Metodo para comprobar el getter de ubicacion
     */
    @Test
    public void getUbicacionTest(){
        m.setUbicacion("ubicacion");    
        Assertions.assertEquals("ubicacion", m.getUbicacion());
    }
        /**
     * Metodo para comprobar el getter de ubicacion erronea
     */
    @Test
    public void getUbicacionTestMal(){
        m.setUbicacion("ubi");    
        Assertions.assertNotEquals("ubicacion", m.getUbicacion());
    }
    /**
     * Metodo para comprobar el getter de codigo trasero 
     */
    @Test
    public void getCodigoTraseroTest(){
        m.setCodigoTrasero(324);  
        Assertions.assertEquals(324, m.getCodigoTrasero());
    }
    /**
     * Metodo para comprobar el getter de codigo trasero mal
     */
    @Test
    public void getCodigoTraseroTestMal(){
        m.setCodigoTrasero(324);  
        Assertions.assertNotEquals(325, m.getCodigoTrasero());
    }
    /**
     * Metodo para comprobar el getter de fecha caducidad
     */
    @Test
    public void getFechaCaducidadTest(){
        m.setFechaCaducidad("07/35");  
        Assertions.assertEquals("07/35", m.getFechaCaducidad());
    }
    /**
     * Metodo para comprobar el getter de fecha caducidad mal
     */
    @Test
    public void getFechaCaducidadTestMal(){
        m.setFechaCaducidad("07/35");  
        Assertions.assertNotEquals("07/36", m.getFechaCaducidad());
    }
    /**
     * Metodo para comprobar el getter de numero de la tarjeta
     */
    @Test
    public void getNumeroTarjetaTest(){
        m.setNumeroTarjeta("324564321345643254");  
        Assertions.assertEquals("324564321345643254", m.getNumeroTarjeta());
    }
    /**
     * Metodo para comprobar el getter de numero de la tarjeta mal
     */
    @Test
    public void getNumeroTarjetaTestMal(){
        m.setNumeroTarjeta("324564321345643254");  
        Assertions.assertNotEquals("324564321345643255", m.getNumeroTarjeta());
    }

}
