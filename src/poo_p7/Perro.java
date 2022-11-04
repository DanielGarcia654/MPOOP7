/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_p7;

/**
 *Clase que hereda de otra subclase pero aniadiendo nuevamente nuevos atributos asociados a este tipo de animal
*/
public class Perro extends animalTerrestre {
    private int numManchas;

    public Perro() {
    }

    public Perro(int numManchas, int numPatas, String nombre, String origen, String color) {
        super(numPatas, nombre, origen, color);
        this.numManchas = numManchas; /**Atributo unico de la clase Perro */
    }

    public int getNumManchas() {
        return numManchas;
    }

    public void setNumManchas(int numManchas) {
        this.numManchas = numManchas;
    }

    @Override
    public String toString() {
        return "Perro{" + "numManchas=" + numManchas + '}';
    }
    
    
}
