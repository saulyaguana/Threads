public class Paquete {
    Estado estado;
    Entrega entrega;
    int idpaq;
    String codigo;
    String descripcion;
    int peso;
    int alto;

    public Paquete() {}

    public Paquete(Estado estado, Entrega entrega, int idpaq, String codigo, String descripcion, int peso, int alto) {
        this.entrega = entrega;
        this.estado = estado;
        this.idpaq = idpaq;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.peso = peso;
        this.alto = alto;
    }

}
