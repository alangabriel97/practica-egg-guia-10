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
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(3,4);
        Circulo circulo = new Circulo(5);
        
        System.out.println("area del rectangulo: " + rectangulo.area() +
                           "\nperimetro del rectangulo: " + rectangulo.perimetro());
        
        System.out.println("area del circulo: " + circulo.area() +
                           "\nperimetro del circulo: " + circulo.perimetro());
    }
    
}
