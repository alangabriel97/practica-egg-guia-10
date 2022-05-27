/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02;

import entidades.Lavadora;
import entidades.Televisor;

/**
 *
 * @author yyyyyy
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Lavadora lava = new Lavadora(30, 2000, "negro", 'B', 13);
        lava.precioFinal();
        
        System.out.println(lava.toString());
        //SALIDA ESPERADA --> precio=3900.0, color=negro, consumo=B, peso=13, carga=30
        
        /**************************************/
        /**************************************/
        
        Televisor tele = new Televisor(55, true, 1500, "naranja", 'G', 3);
        tele.precioFinal();
        
        System.out.println(tele.toString());
        //SALIDA ESPERADA --> precio=4010, color=blanco, consumo=F, peso=3, resolucion=55, sintonizadorTDT=true
    }
    
}
