/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_p7;


/**
 * Clase heredada de una subclase, se aniade caracteristicas unicas a esta clase que presente el animal
*/
public class Ballena extends animalAcuatico {
    /**Atributo unico de la clase Ballena*/
    private int largo;

    public Ballena() {
    }
    
    public Ballena(int largo, int numAletas, String nombre, String origen, String color) {
        super(numAletas, nombre, origen, color);
        this.largo = largo;
    }
    
    //Getters y setters
    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    @Override
    public String toString() {
        return "Ballena{" + "largo=" + largo + '}';
    }
    
}
