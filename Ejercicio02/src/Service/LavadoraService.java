/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import entidades.Lavadora;
import java.util.Scanner;

/**
 *
 * @author yyyyyy
 */
public class LavadoraService extends ElectrodomesticoService {
    
    public Lavadora crearLavadora() {
        Lavadora lavadora = new Lavadora();        
        Scanner scan = new Scanner(System.in);
        
        super.crearElectrodomestico();
        
        System.out.println("Ingrese la capacidad de carga:");
        lavadora.setCarga(scan.nextDouble());
        
        return lavadora;
    }
    
}
