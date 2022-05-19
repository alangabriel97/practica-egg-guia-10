/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01;

/**
 *
 * @author yyyyyy
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Animal perro = new Perro("Stich","carne",15,"Doberman");
       perro.alimentarse();
       
        Perro perro1 = new Perro("Teddy","croquetas",10,"chihuahua");
        perro1.alimentarse();
        
        
        Animal gato = new Gato("Pelusa","galletas",15,"Siames");
        gato.alimentarse();
        
        Animal caballo = new Caballo("Spark","pasto",25,"Fino");
        caballo.alimentarse();
        
        
    }
    
}
