

package es.iespuerto.logica.vista;



/**
 *
 * @author Usuario
 */
public class Menu {
    private String nombre;
    private String apellidos;
    private String email;
    private String password;
    private String dni;
    private boolean esCliente;
    public static void verMenu(){
        System.out.println("<!doctype html>\n" +
        "<html lang=\"es\">\n" +
        "  <head>\n" +
        "    <meta charset=\"utf-8\">\n" +
        "\n" +
        "    \n" +
        "    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\n" +
        "\n" +
        "    <title>Alchemy</title>\n" +
        "    <style type=\"text/css\">\n" +
        "        body { font-family: \"Brush Script MT;\" }\n" +
        "        \n" +
        "    </style>\n" +
        "  </head>\n" +
        "  <body style=\"background-color:#1c1c24;\">\n" +
        "  <p><img style=\"display: block; margin-left: auto; margin-right: auto;\" src=\"C:/Users/Usuario/Pictures/PortadaRestauranteNuevo.png\" width=\"500\" height=\"300\" /></p>\n" +
        "  <form>\n" +
        "  <div class=\"form-group\" style=\"text-align: center;\"><label style=\"color:#FFFFFF\" for=\"exampleInputEmail1\" >Email o DNI</label></div>\n" +
        "  <div class=\"form-group\" style=\"text-align: center;\"><input size=\"30\"   id=\"email\" type=\"email\" aria-describedby=\"emailHelp\" value=\"\" required ></div>\n" +
        "  <br />\n" +
        "  <div class=\"form-group\" style=\"text-align: center;\"><label style=\"color:#FFFFFF\" for=\"exampleInputPassword1\">Contrase&ntilde;a</label></div>\n" +
        "  <div class=\"form-group\" style=\"text-align: center;\"><input size=\"30\" id=\"exampleInputPassword1\"  type=\"password\" required ></div>\n" +
        "  <br />\n" +
        "  <div style=\"text-align: center;\"><button type=\"button\" class=\"btn btn-secondary btn-sm\">Iniciar Sesión</button>  <button type=\"button\" class=\"btn btn-secondary btn-sm\">Registrarse</button></div>\n" +
        "  </form> \n" +
        "  </body>\n" +
        "</html>");
        
    } 
    public static void main(String args[]){
        verMenu();
    }
}
