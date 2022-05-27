/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import entidades.Televisor;
import java.util.Scanner;

/**
 *
 * @author yyyyyy
 */
public class TelevisorService extends ElectrodomesticoService {
    
    public Televisor crearTelevisor() {
        Televisor televisor = new Televisor();        
        Scanner scan = new Scanner(System.in);
        
        super.crearElectrodomestico();
        
        System.out.println("Ingrese la resolucion en pulgadas:");
        televisor.setResolucion(scan.nextInt());
        
        System.out.println("Tiene sintonizador TDT? true/false");
        televisor.setSintonizadorTDT(scan.nextBoolean());
        
        return televisor;
    }
}
