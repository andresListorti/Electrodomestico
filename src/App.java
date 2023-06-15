import entidades.Electrodomestico;
import entidades.Lavadora;
import entidades.Televisor;

public class App {
    public static void main(String[] args) throws Exception {
        // Lavadora l = new Lavadora();
        // l.crearLavadora();
        // System.out.println(l);
        // l.precioFinal();
        // System.out.println(l);
        Televisor t = new Televisor();
        System.out.println(t);
        t.crearTelevisor();
        System.out.println(t);
        t.precioFinal();
        System.out.println(t);

    }
}
