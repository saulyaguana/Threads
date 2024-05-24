import java.util.ArrayList;

public class Bodeguero extends Empleado {
    String local;
    ArrayList<Cliente> cl1;

    public Bodeguero() {}

    public Bodeguero(String local, ArrayList<Cliente> cl1) {
        this.local = local;
        this.cl1 = cl1;
    }
}
