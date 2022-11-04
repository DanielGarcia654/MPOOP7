/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_p7;

/**
 * Se crea una clase que sera la clase padre para heredar clases para otro tipo de animales
 */
public class Animal {
     /**Colocamos nuestrso atributos. Atributos que se asocian a todos los animales existentes*/
    private String nombre, origen, color;
    
    /**Realizamos constructores*/
    public Animal() {
    }

    public Animal(String nombre, String origen, String color) {
        this.nombre = nombre;
        this.origen = origen;
        this.color = color;
    }
    
    /**Insertamos getters y setters
     * @return  */
    public String getNombre() {
        return nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public String getColor() {
        return color;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override /**Para imprimir los atributos que guardemos en nuestros objetos*/
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", origen=" + origen + ", color=" + color + '}';
    }
    
}
