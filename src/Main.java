public class Main {
    public static void main(String[] args) {
        Direccion dir1 = new Direccion("192144", "Calle primaria", "Calle delantera", "A dos cuadras del estadio", 1);
        Cliente cl1 = new Cliente("0994925174", dir1);

//        cl1.HacerActual(new Direccion("192144", "Calle muerta22", "Calle delantera", "A dos cuadras del estadio", 1));
        System.out.println(cl1.direccion.calle1);

    }
}
