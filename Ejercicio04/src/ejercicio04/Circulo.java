/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio04;

/**
 *
 * @author yyyyyy
 */
public class Circulo implements calculosFormas {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }

    @Override
    public double area() {
        return PI * this.radio * this.radio;
    }

    @Override
    public double perimetro() {
        return  2 * PI * this.radio;
    }
    
    
}
