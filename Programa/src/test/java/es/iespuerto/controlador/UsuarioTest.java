package es.iespuerto.controlador;

import java.io.IOException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UsuarioTest {
    Usuario n= new Usuario("Jose", "Hernandez", "Jos@gmail.com", "12345678", "32454412G", true); 
    Usuario s = new Usuario("Pablo","Rodríguez","pab@gmail.com","123456789","43383311K",true);
    /**
     * Test para comprobar el registro en la aplicacion en el caso incorrecto
     * @throws IOException
     */
    @Test
    public void registrarMalTest() throws IOException{
        Assertions.assertTrue(n.registrar(),"No se ha podido registrar el usuario");
    } 
    /**
     * Test para comprobar el registro en la aplicacion
     * @throws IOException
     */
    @Test
    public void registrarTest() throws IOException{
        Assertions.assertFalse(s.registrar(),"No se ha podido registrar el usuario");    
    }
    /**
     * Test para comprobar si existe un usuario 
     * en la aplicacion en el caso incorrecto
     * @throws IOException
     */
   
    @Test
    public void comprobarifExistMalTest() throws IOException{
        Assertions.assertFalse(n.ifExist("D:\\Pablo\\Escritorio\\FicherosPrograma\\UsuariosCreados.txt"),"El usuario no existe");
    }
    /**
     * Test para comprobar si existe un usuario
     * @throws IOException
     */
    @Test
    public void comprobarifExistTest() throws IOException{
        Assertions.assertTrue(s.ifExist("D:\\Pablo\\Escritorio\\FicherosPrograma\\UsuariosCreados.txt"),"El usuario no existe");
    }
    /**
     * Test para comprobar el inicio de sesion en la aplicacion en el caso incorrecto
     * @throws IOException
     */
    @Test
    public void iniciarSesionMalTest() throws IOException{
        Assertions.assertFalse(n.ifExist("D:\\Pablo\\Escritorio\\FicherosPrograma\\UsuariosCreados.txt"),"No se puede iniciar sesion");    
    }
    /**
     * Test para comprobar el inicio de sesion en la aplicacion 
     * @throws IOException
     */
    @Test
    public void iniciarSesionTest() throws IOException{
        Assertions.assertTrue(s.ifExist("D:\\Pablo\\Escritorio\\FicherosPrograma\\UsuariosCreados.txt"),"No se puede iniciar sesion");    
    }
}
