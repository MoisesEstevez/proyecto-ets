package es.iespuerto.logica.modelo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ValoracionTest {

    Valoracion valora= new Valoracion(5,"Bien");

    /**
     * Metodo para comprobar la realizacion de la valoracion valoracion del restaurante
     */
    
    @Test
    public void getComentarioTest(){
        Assertions.assertEquals(valora.getComentario(), "Bien");   
    }

    @Test
    public void getValorTest(){
        Assertions.assertEquals(valora.getValor(), 5);   
    }

    @Test
    public void setComentarioTest(){
        valora.setComentario("Regular");
        Assertions.assertEquals(valora.getComentario(), "Regular");   
    }

    @Test
    public void setValorTest(){
        valora.setValor(6);
        Assertions.assertEquals(valora.getValor(), 6);   
    }
    
}
