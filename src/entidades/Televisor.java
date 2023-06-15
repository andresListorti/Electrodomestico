package entidades;

import java.util.Scanner;

public class Televisor extends Electrodomestico {
    Scanner leer = new Scanner(System.in);
    Scanner leerLetras = new Scanner(System.in).useDelimiter("\n");
    private int pulgadas;
    private boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(int pulgadas, boolean sintonizadorTDT, Double precio, String color, Character consumoElectrico,
            Double peso) {
        super(precio, color, consumoElectrico, peso);
        this.pulgadas = pulgadas;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getPulgadas() {
        return this.pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isSintonizadorTDT() {
        return this.sintonizadorTDT;
    }

    public boolean getSintonizadorTDT() {
        return this.sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    @Override
    public String toString() {
        return "{" +
                " pulgadas='" + getPulgadas() + "'" +
                ", sintonizadorTDT='" + isSintonizadorTDT() + "'" +
                " precio='" + getPrecio() + "'" +
                ", color='" + getColor() + "'" +
                ", consumoElectrico='" + getConsumoElectrico() + "'" +
                ", peso='" + getPeso() + "'" +
                "}";
    }

    public void crearTelevisor() {
        super.crearElectrodomestico();
        System.out.println("Cual seria la Resolucion en Pulgadas ");
        this.pulgadas = leer.nextInt();
        System.out.println("Tiene sintonizador TDT - true o false? ");
        this.sintonizadorTDT = leer.nextBoolean();

    }

    public void precioFinal() {
        super.precioFinal();
        if (this.pulgadas > 40) {
            this.precio += (this.precio * 0.3);
        }
        if (sintonizadorTDT) {
            this.precio += 500;
        }
    }

}
