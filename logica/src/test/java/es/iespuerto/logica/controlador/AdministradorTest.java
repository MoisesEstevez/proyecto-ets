package es.iespuerto.logica.controlador;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;
import es.iespuerto.logica.modelo.Administrador;

public class AdministradorTest {
    Usuario n= new Usuario("Jose", "Hernandez", "Jos@gmail.com", "12345678", "32454412G", true); 
    Usuario s = new Usuario("Pablo","Rodríguez","pab@gmail.com","123456789","43383311K",true);
    /**
     * Test para comprobar que el dar de baja a los usuarios del sistema funciona en caso erroneo
     * @throws IOException
     * @throws FileNotFoundException
     */
    @Test
    public void darBajaMalTest() throws FileNotFoundException, IOException{
        Assert.assertFalse(Administrador.darDeBaja(n.getNombre(), n.getApellidos(), n.getEmail(), n.getPassword(), n.getDni(), n.getEsCliente()));
    }
    /**
     * Test para comprobar el dar de baja a los usuarios
     * @throws IOException
     * @throws FileNotFoundException
     */
    @Test
    public void darBajaTest() throws FileNotFoundException, IOException{
        Assert.assertTrue(Administrador.darDeBaja(s.getNombre(), s.getApellidos(), s.getEmail(), s.getPassword(), s.getDni(), s.getEsCliente()));
    }
    /**
     * Test para comprobar que el dar de alta a los usuarios del sistema funciona en caso erroneo
     * @throws IOException
     */
    @Test
    public void darDeAltaMalTest() throws IOException{
        Assert.assertFalse(Administrador.darDeAlta(s.getNombre(), s.getApellidos(), s.getEmail(), s.getPassword(), s.getDni(), s.getEsCliente()));
    }
    /**
     * Test para comprobar el dar de alta a los usuarios
     * @throws IOException
     */
    @Test
    public void darDeAltaTest() throws IOException{
        Assert.assertTrue(Administrador.darDeAlta(n.getNombre(), n.getApellidos(), n.getEmail(), n.getPassword(), n.getDni(), n.getEsCliente()));
    }    
}
