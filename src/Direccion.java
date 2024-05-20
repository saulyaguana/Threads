import java.util.ArrayList;

public class Direccion {
    String codigo;
    String calle1;
    String calle2;
    String referencia;
    int actual;

    public Direccion() {}

    public Direccion(String codigo, String calle1, String calle2, String referencia, int actual) {
        this.codigo = codigo;
        this.calle1 = calle1;
        this.calle2 = calle2;
        this.referencia = referencia;
        this.actual = actual;
    }

}
