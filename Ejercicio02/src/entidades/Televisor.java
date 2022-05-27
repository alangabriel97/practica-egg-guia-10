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
public class Televisor extends Electrodomestico {
    
    private int resolucion;
    private boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(int resolucion, boolean sintonizadorTDT, double precio, String color, char consumo, double peso) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }
    
    @Override
    public void precioFinal() {
        super.precioFinal();
        
        this.precio += this.aumentoporResolucion() + aumentoPorSintonizadorTDT();
        
    }
    
    private double aumentoporResolucion() {
        return this.resolucion>40?this.precio*0.3:0;
    }

    private double aumentoPorSintonizadorTDT() {
        return this.isSintonizadorTDT()?500:0;
    }

    @Override
    public String toString() {
        return "Televisor{" + super.toString() + ", resolucion=" + resolucion + ", sintonizadorTDT=" + sintonizadorTDT + '}';
    }
    
    
}
