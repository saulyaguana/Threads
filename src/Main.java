import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // CLIENTE

        Direccion dir1 = new Direccion("192144", "Calle primaria", "Calle delantera", "A dos cuadras del estadio", 1);
        Cliente cl1 = new Cliente("0994925174", dir1);
//
//        cl1.HacerActual(new Direccion("192144", "Calle muerta22", "Calle delantera", "A dos cuadras del estadio", 1));
//        System.out.println(cl1.direccion.calle1);

        // REPARTIDOR

        Estado estado = new Estado(1, true, new Date("2025-01-01"), "Ninguna");
        Empleado empleado = new Empleado("Praga");
        Entrega entrega = new Entrega(cl1, new ArrayList<Empleado>((Collection<? extends Empleado>) empleado), "47", new Date("2025-01-01"), "Ninguna");
        Paquete paquete = new Paquete(estado, entrega, 0, "008", "Paquete de porcelana", 25, 12);

        if (paquete.estado.estado) {
            System.out.println("Paquete entregado correctamente");
        }else {
            System.out.println("Paquete por entregar");
        }



    }
}
