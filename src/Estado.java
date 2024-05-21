import java.util.Date;

public class Estado {
    int tipo;
    boolean estado;
    Date fecha;
    String observacion;

    public Estado() {}

    public Estado(int tipo, boolean estado, Date fecha, String observacion) {
        this.tipo = tipo;
        this.estado = estado;
        this.fecha = fecha;
        this.observacion = observacion;
    }

}
