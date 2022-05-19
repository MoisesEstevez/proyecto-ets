package es.iespuerto.modelo;

public class Valoracion {
    private String comentario;
    private int valor;

    /**
     * Constructor de la clase Valoracion
     * @param valor Nota del 1 al 10
     * @param comentario Comentario de la valoracion
     */

    public Valoracion(int valor, String comentario){
        if (valor>=0 || valor<=10){
            this.valor=valor;
        }
        this.comentario=comentario;
    }

    /**
     * Getter de comentario
     * @return Comentario
     */

    public String getComentario() {
        return comentario;
    }

    /**
     * Setter de comentario
     * @param comentario Comentario de la valoracion
     */

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    /**
     * Getter de valor
     * @return valor
     */

    public int getValor() {
        return valor;
    }

    /**
     * Setter de valor
     * @param valor Nota del 1 al 10
     */

    public void setValor(int valor) {
        this.valor = valor;
    }

    public static void realizarValoracion(int valor, String comentario){
        Valoracion valoracion= new Valoracion(valor,comentario);
    }

    
}
