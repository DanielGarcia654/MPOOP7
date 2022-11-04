/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_p7;

/**
 * Clase heredada de la clase Animal, se aniaden otras caracteristicas que tienen los animales aereos
 */
public class animalAereo extends  Animal {
    /**Atributo */
    private int numAlas;

    public animalAereo() {
    }

    public animalAereo(int numAlas, String nombre, String origen, String color) {
        super(nombre, origen, color);
        this.numAlas = numAlas;
    }
    
    /**Getters y Setters */
    public int getNumAlas() {
        return numAlas;
    }

    public void setNumAlas(int numAlas) {
        this.numAlas = numAlas;
    }
    
    //toString

    @Override
    public String toString() {
        return "animalAereo{" + "numAlas=" + numAlas + '}';
    }
    
}
