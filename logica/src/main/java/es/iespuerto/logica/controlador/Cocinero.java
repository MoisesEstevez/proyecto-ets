
package es.iespuerto.logica.controlador;

import java.util.Scanner;

public class Cocinero {
    private boolean estadoPedido=false;
    /**
     * Getter de la variable estado pedido
     * @return Devuelve el estado del pedido
     */
    public boolean getEstadoPedido() {
        return estadoPedido;
    }
    /**
     * Setter de la variable del estado del pedido
     * @param estadoPedido Estado del pedido
     */
    public void setEstadoPedido(boolean estadoPedido) {
        this.estadoPedido = estadoPedido;
    }
    /**
     * Metodo para verificar si el pedido está realizado
     * @return
     */
    public boolean pedidoRealizado(){
        System.out.println("Ponga X cuando el pedido haya finalizado");
        Scanner teclado = new Scanner(System.in);
        String marca;
        this.estadoPedido=true;
        if(estadoPedido==false){
            marca=teclado.next();
            if(marca=="X" || marca=="x"){
                this.estadoPedido=true;
            }
        }
        return this.estadoPedido;    
    }
}
