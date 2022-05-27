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
public class Rectangulo implements calculosFormas {
    
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }

    @Override
    public double area() {
        return this.base * this.altura;
    }

    @Override
    public double perimetro() {
        return 2 * (this.base + this.altura);
    }

    
    
    
}
