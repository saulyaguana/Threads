public class Cliente extends Persona {
    Direccion direccion;
    String celular;

    public Cliente(String celular, Direccion direccion) {
        this.celular = celular;
        this.direccion = direccion;
    }

    public int estadoPaquete() {
        return this.direccion.actual;
    }

    public void HacerActual(Direccion nuevaInfo) {
        this.direccion.calle1 = nuevaInfo.calle1;
        this.direccion.calle2 = nuevaInfo.calle2;
        this.direccion.actual = nuevaInfo.actual;
    }


}
