/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_p7;

/**
 * Clase heredada de la clase Animal, se crean atributos asociados a los animales terrestres
 */

public class animalTerrestre extends Animal{
    /**Escribimos atributos faltantes */
    private int numPatas;
    
    /**Generamos constructor*/
    
    public animalTerrestre() {
    }

    public animalTerrestre(int numPatas, String nombre, String origen, String color) {
        super(nombre, origen, color);
        this.numPatas = numPatas;
    }
    
    /**Insertamos Getters y Setters*/
    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }
    
    /**Insertamos to String */

    @Override
    public String toString() {
        return "animalTerrestre{" + "numPatas=" + numPatas + '}';
    }
    
    
}
