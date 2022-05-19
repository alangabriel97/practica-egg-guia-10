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
public class Gato extends Animal {

    public Gato(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    @Override
    public String getAlimento() {
        return super.getAlimento();
    }

    @Override
    public void setAlimento(String alimento) {
        super.setAlimento(alimento);
    }

    @Override
    public int getEdad() {
        return super.getEdad();
    }

    @Override
    public void setEdad(int edad) {
        super.setEdad(edad);
    }

    public String getRaza() {
        return super.getRaza();
    }

    @Override
    public void setRaza(String raza) {
        super.setRaza(raza);
    }
    

    @Override
    public void alimentarse() {
        String className = this.getClass().getSimpleName();
        
        System.out.println("El " + className + " " + this.getNombre() + 
                " se alimentó de " + this.getAlimento());
    }
    
}
