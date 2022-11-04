/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_p7;

/**
 * Clase heredada de otra subclase, se aniaden nuevos atributos para este animal
 */
public class Pajaro extends animalAereo {
    private String tipoPico;

    public Pajaro() {
    }

    public Pajaro(String tipoPico, int numAlas, String nombre, String origen, String color) {
        super(numAlas, nombre, origen, color);
        this.tipoPico = tipoPico; /**Atributo unico de la clase Pajaro */
    }

    public String getTipoPico() {
        return tipoPico;
    }

    public void setTipoPico(String tipoPico) {
        this.tipoPico = tipoPico;
    }

    @Override
    public String toString() {
        return "Pajaro{" + "tipoPico=" + tipoPico + '}';
    }
    
    
}
