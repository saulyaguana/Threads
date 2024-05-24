import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // CLIENTE

        Direccion dir1 = new Direccion("192144", "Calle primaria", "Calle delantera", "A dos cuadras del estadio", 1);
        Cliente cl1 = new Cliente("0994925174", dir1);
//
//        cl1.HacerActual(new Direccion("192144", "Calle muerta22", "Calle delantera", "A dos cuadras del estadio", 1));
//        System.out.println(cl1.direccion.calle1);

        // REPARTIDOR

//        Estado estado = new Estado(1, true, new Date("2025-01-01"), "Ninguna");
//        Empleado empleado = new Empleado("Praga");
//        ArrayList<Empleado> empleados = new ArrayList<>();
//        Entrega entrega = new Entrega(cl1, empleados, "47", new Date(), "Ninguna");
//        Paquete paquete = new Paquete(estado, entrega, 0, "008", "Paquete de porcelana", 25, 12);
//
//        Repartidor repartidor = new Repartidor(43, paquete);
//
//        if (repartidor.paquete.estado.estado) {
//            System.out.println("Paquete entregado exitosamente");
//        }else {
//            System.out.println("Paquete faltante");
//        }


        // BODEGUERO (part I, II && III)

        ArrayList<Cliente> clienteArr = new ArrayList<>();

        Bodeguero bodeguero = new Bodeguero("Local secundario", clienteArr);

        Scanner sc = new Scanner(System.in);

        System.out.println("Agregar cliente? --> 1 SI --> 0 NO");

        String entrada = sc.nextLine();

        if (entrada.equals("SI")) {
            System.out.println("Escriba el código del cliente");
            String codigo_add = sc.nextLine();

            System.out.println("Escriba la calle principal");
            String calle1_add = sc.nextLine();

            System.out.println("Escriba la calle secundaria");
            String calle2_add = sc.nextLine();

            System.out.println("Escriba alguna referencia de su ubicación");
            String ubicacion_add = sc.nextLine();

            System.out.println("Escriba si permanecerá en el lugar el día de la entrega");
            int estado_add = sc.nextInt();


            Direccion dir_add = new Direccion(codigo_add, calle1_add, calle2_add, ubicacion_add, estado_add);

            System.out.println("Escriba el número celular del cliente");

            String numero_add = sc.nextLine();

            Cliente cliente_add = new Cliente(numero_add, dir_add);

            bodeguero.cl1.add(cliente_add);

        } else {
            System.out.println("No encontrado");
        }

        for (var cliente : bodeguero.cl1) {
            System.out.println("Nuevo cliente agregado");
            System.out.println();
            System.out.println(cliente.direccion.codigo);
            System.out.println(cliente.direccion.calle1);
            System.out.println(cliente.direccion.calle2);
            System.out.println(cliente.direccion.referencia);
            System.out.println(cliente.direccion.actual);
        }

    }
}
