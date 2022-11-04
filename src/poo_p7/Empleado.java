/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_p7;

/**
 * Clase ejemplo de un empleado con atributos y metodos
 */
public class Empleado {
    private String nombre;
    private int numEmpleado,sueldo;

    public Empleado() {
        this.sueldo = 10_000;
    }

    public Empleado(String nombre, int numEmpleado, int sueldo) {
        this.nombre = nombre; 
        this.numEmpleado = numEmpleado;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /***
     * 
     * @return Regresa el numero del empleado
     */

    public int getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int porcentaje) {
        this.sueldo += (int)(sueldo*porcentaje/100);
        //hacemos un cast y cambiamos el codigo pues al generarse el sett no nos hacia el porcentaje
        //el casteo nos convertira a de un flotante a un enter 
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", numEmpleado=" + numEmpleado + ", sueldo=" + sueldo + '}';
    }
  

    
    
    
}