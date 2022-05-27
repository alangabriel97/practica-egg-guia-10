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
public class Lavadora extends Electrodomestico {
    private double carga;

    public Lavadora() {
    }

    public Lavadora(double carga, double precio, String color, char consumo, double peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }
    
    @Override
    public void precioFinal() {
        
        super.precioFinal();
        
        this.precio += aumentoPorCarga();
    }
    
    private double aumentoPorCarga() {
        
        return this.carga>30?500:0;
    }

    @Override
    public String toString() {
        return "Lavadora{" + super.toString() + ", carga=" + carga + '}';
    }
    
    
}
