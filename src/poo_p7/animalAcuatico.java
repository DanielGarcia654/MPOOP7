/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_p7;

/**
 *Es una clase heredada de la clase animal, donde aniadimos otras caracteristicas de este tipo de animales
 */

public class animalAcuatico extends Animal {
        /**Escribimos atributo*/
    private int numAletas;

    /**Constructor (con atributos heredados de la otra clase) */
    
    public animalAcuatico() {
    }

    public animalAcuatico(int numAletas, String nombre, String origen, String color) {
        super(nombre, origen, color);
        this.numAletas = numAletas; /**Atributo unico de la clase de animales acuaticos */
    }

    /**Getters y Setters*/
    public int getNumAletas() {
        return numAletas;
    }

    public void setNumAletas(int numAletas) {
        this.numAletas = numAletas;
    }

    @Override
    public String toString() {
        return "animalAcuatico{" + "numAletas=" + numAletas + '}';
    }
    
    
}
