package entidades;

import java.util.Scanner;

public class Lavadora extends Electrodomestico {

    Scanner leer = new Scanner(System.in);
    Scanner leerLetras = new Scanner(System.in).useDelimiter("\n");

    private Double carga;

    public Lavadora() {
    }

    public Lavadora(Double carga, Double precio, String color, Character consumoElectrico, Double peso) {
        super(precio, color, consumoElectrico, peso);
        this.carga = carga;
    }

    public Double getCarga() {
        return this.carga;
    }
    //
    /// ESTO NO HACE FALTA PORQUE LO RECIBIMOS DEL PADRE
    ///
    // public void setCarga(String carga) {
    // this.carga = carga;
    // }

    // public Double getPrecio() {
    // return this.precio;
    // }

    // public void setPrecio(Double precio) {
    // this.precio = precio;
    // }

    // public String getColor() {
    // return this.color;
    // }

    // public void setColor(String color) {
    // this.color = color;
    // }

    // public Character getConsumoElectrico() {
    // return this.consumoElectrico;
    // }

    // public void setConsumoElectrico(Character consumoElectrico) {
    // this.consumoElectrico = consumoElectrico;
    // }

    // public Double getPeso() {
    // return this.peso;
    // }

    // public void setPeso(Double peso) {
    // this.peso = peso;
    // }

    @Override
    public String toString() {
        return "{" +
                " carga='" + getCarga() + "'" +
                " precio='" + getPrecio() + "'" +
                ", color='" + getColor() + "'" +
                ", consumoElectrico='" + getConsumoElectrico() + "'" +
                ", peso='" + getPeso() + "'" +
                "}";
    }

    public void crearLavadora() {
        super.crearElectrodomestico();
        System.out.println("Cual seria la carga ");
        this.carga = leer.nextDouble();

    }

    public void precioFinal() {
        super.precioFinal();
        if (this.carga > 30) {
            this.precio += 500;
        }
    }

}
