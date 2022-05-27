/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import entidades.Electrodomestico;
import java.util.Scanner;

/**
 *
 * @author yyyyyy
 */
public class ElectrodomesticoService {
    
    
    
    public Electrodomestico crearElectrodomestico() {
        
        Scanner scan = new Scanner(System.in);
        
        Electrodomestico e;
        
        System.out.println("Ingrese el precio");
        double precio = scan.nextDouble();
                
        System.out.println("Ingrese el color");
        String color = scan.nextLine();
        
        System.out.println("Ingrese el consumo energetico");
        char consumo = scan.next().charAt(0);
        
        System.out.println("Ingrese el peso");
        double peso = scan.nextDouble();
        
        e = new Electrodomestico(precio, color, consumo, peso);
        
        return e;
    }
       
    
}
