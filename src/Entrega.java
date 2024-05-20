import java.util.ArrayList;
import java.util.Date;

public class Entrega {
    Cliente cliente;
    ArrayList<Empleado> empleado;
    String codigo;
    Date fecha;
    String observacion;

    public Entrega() {}

    public Entrega(Cliente cliente, ArrayList<Empleado> empleado, String codigo, Date fecha, String observacion) {
        this.cliente = cliente;
        this.empleado = empleado;
        this.codigo = codigo;
        this.fecha = fecha;
        this.observacion = observacion;
    }

}
