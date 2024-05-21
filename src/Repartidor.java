public class Repartidor extends Empleado {
    int zona;
    Paquete paquete;

    public Repartidor() {}

    public Repartidor(int zona, Paquete paquete) {
        this.zona = zona;
        this.paquete = paquete;
    }

    // Registrar la Entreda de un paquete.
    // true si ha sido entregaodo, falso de lo contrario.

    public boolean registroPaq() {
        if (this.paquete.estado.estado) {
            return true;
        }
        return false;
    }

}
