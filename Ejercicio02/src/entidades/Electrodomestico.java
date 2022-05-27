/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author yyyyyy
 */
public class Electrodomestico {

    protected double precio = 1000;
    protected String color;
    protected char consumo;
    protected double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char consumo, double peso) {
        this.precio += precio;

        if (comprobarColor(color)) {
            this.color = color;
        } else {
            this.color = "blanco";
        }

        if (comprobarConsumo(consumo)) {
            this.consumo = consumo;
        } else {
            this.consumo = 'F';
        }

        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    private boolean comprobarConsumo(char letra) {
        return letra == 'A' || letra == 'B' || letra == 'C'
                || letra == 'D' || letra == 'E';
    }

    private boolean comprobarColor(String color) {
        return color.equals("negro") || color.equals("rojo")
                || color.equals("azul") || color.equals("gris");
    }

    public void precioFinal() {

        this.precio += this.aumentoPorConsumo() + this.aumentoPorPeso();
    }

    private double aumentoPorConsumo() {

        double aumento = 0;
        switch (this.consumo) {
            case 'A':
                aumento = 1000;
                break;
            case 'B':
                aumento = 800;
                break;
            case 'C':
                aumento = 600;
                break;
            case 'D':
                aumento = 500;
                break;
            case 'E':
                aumento = 300;
                break;
            case 'F':
                aumento = 100;
                break;
        }
        
        return aumento;
    }
    
    private double aumentoPorPeso() {
        double aumento = 0;
        
        if(this.peso>=1 && this.peso<=19) {
            aumento = 100;
        } else if(this.peso>=20 && this.peso<=49) {
            aumento = 500;
        } else if(this.peso>=50 && this.peso<=79) {
            aumento = 800;
        } else if(this.peso>=80) {
            aumento = 1000;
        }
        
        return aumento;
    }

    @Override
    public String toString() {
        return "precio=" + precio + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso;
    }
    
    

}
