package es.iespuerto.logica.controlador;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class InformacionPagoTest {
    InformacionPago info = new InformacionPago();

    /**
     * Test para comprobar si el cliente lo esta realizando desde online y no desde el propio restaurante
     */

    @Test
    public void esOnlineTest(){
        Assertions.assertTrue(info.esOnline(true));        
    }

    /**
     * Test para comprobar que el cliente no lo esta realizando desde online 
     */

    @Test
    public void noEsOnlineTest(){
        Assertions.assertFalse(info.esOnline(false));
    }

    /**
     * Test que comprueba si el cliente quiere pagar en el restaurante 
     * @return si es en efectivo
     */

    @Test
    public void esEfectivoTest(){
        Assertions.assertTrue(info.esEfectivo(true));       
    }

    /**
     * Test que comprueba si el cliente no quiere pagar en el restaurante u online
     */

    @Test
    public void noEsEfectivoTest(){
        Assertions.assertFalse(info.esEfectivo(false));
    }

    /**
     * Test que comprueba el metodo de pago que desea el cliente en este caso si quiere en efectivo
     */

    @Test
    public void sistemaPagoTest(){
        info.setEfectivo(true);
        Assertions.assertFalse(info.sistemaPago());       
    }

    /**
     * Test que comprueba el metodo de pago que desea el cliente en este caso si quiere en tarjeta
     */

    @Test
    public void sistemaPagoTarjetaTest(){
        info.setEfectivo(false);
        Assertions.assertTrue(info.sistemaPago());
    }

    @Test
    public void setEfectivoTest(){
        
    }
}
