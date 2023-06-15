package entidades;

import java.util.Scanner;

public class Electrodomestico {
    Scanner leer = new Scanner(System.in);
    Scanner leerLetras = new Scanner(System.in).useDelimiter("\n");
    protected Double precio;
    protected String color;
    protected Character consumoElectrico;
    protected Double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(Double precio, String color, Character consumoElectrico, Double peso) {
        this.precio = precio;
        comprobarColor(color);
        comprobarConsumoEnergetico(consumoElectrico);
        this.peso = peso;
    }

    public Double getPrecio() {
        return this.precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Character getConsumoElectrico() {
        return this.consumoElectrico;
    }

    public void setConsumoElectrico(Character consumoElectrico) {
        this.consumoElectrico = consumoElectrico;
    }

    public Double getPeso() {
        return this.peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "{" +
                " precio='" + getPrecio() + "'" +
                ", color='" + getColor() + "'" +
                ", consumoElectrico='" + getConsumoElectrico() + "'" +
                ", peso='" + getPeso() + "'" +
                "}";
    }

    private void comprobarConsumoEnergetico(Character letra) {
        if ((letra == 'a') || (letra == 'A') || (letra == 'b') || (letra == 'B') || (letra == 'c') || (letra == 'C')
                || (letra == 'd') || (letra == 'D') || (letra == 'e') || (letra == 'E') || (letra == 'f')
                || (letra == 'F')) {
            this.consumoElectrico = letra;
        } else {
            this.consumoElectrico = 'f';
        }
    }

    private void comprobarColor(String color) {
        if ((color.equalsIgnoreCase("blanco")) || (color.equalsIgnoreCase("negro")) || (color.equalsIgnoreCase("rojo"))
                || (color.equalsIgnoreCase("azul")) || (color.equalsIgnoreCase("gris"))) {
            this.color = color;
        } else {
            this.color = "blanco";
        }
    }

    /**
     * @return
     */
    public void crearElectrodomestico() {
        System.out.println("Cuanto pesa el nuevo electrodomestico en Kg");
        this.peso = leer.nextDouble();
        System.out.println("Cual es el color");

        this.color = leerLetras.nextLine();
        comprobarColor(color);
        System.out.println("Cual es su letra de consumo de la A a la F");
        this.consumoElectrico = leer.next().charAt(0);
        comprobarConsumoEnergetico(consumoElectrico);
        this.precio = 1000d;

    }

    public void precioFinal() {
        switch (consumoElectrico) {
            case 'a', 'A':
                this.precio += 1000d;
                break;
            case 'b', 'B':
                this.precio += 800d;
                break;
            case 'c', 'C':
                this.precio += 600d;
                break;
            case 'd', 'D':
                this.precio += 500d;
                break;
            case 'e', 'E':
                this.precio += 300d;
                break;
            case 'f', 'F':
                this.precio += 100d;
                break;
        }
        if (this.peso >= 80) {
            this.precio += 1000;
        } else if (this.peso >= 50) {
            this.precio += 800;
        } else if (this.peso >= 20) {
            this.precio += 500;
        } else if (this.peso >= 1) {
            this.precio += 100;
        }
    }

}