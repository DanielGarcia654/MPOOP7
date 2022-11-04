/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_p7;

/**
 *
 * @author poo01alu09
 */
public class POO_P7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**Creacion de objeto "Gerente"*/
        Gerente ger= new Gerente();
        ger.setNombre("Pedro Escalante"); /**Asignamos nombre, que es un atributo del objeto gerente*/
        ger.setNumEmpleado(12345);  /**Asignamos numero de empleado (atributo tambien)*/
        ger.setSueldo(20_000); /**Asignamos su sueldo */
        System.out.println("Nombre :"+ger.getNombre()); /**Imprimimos el nombre con un getter */
        System.out.println("NumEmpleado:"+ger.getNumEmpleado()); /**Imprimimos el numero de empleado */
        System.out.println("Sueldo: "+ger.getSueldo()); /**Imprimimos el sueldo */
        ger.setSueldo(10); /**Asignamos el sueldo multiplicado N veces */
        System.out.println("sueldo aumentado :"+ger.getSueldo()); /**Mostramos el aumento del sueldo */
        System.out.println(ger); /**Imprimimos todos los atributos de una vez*/
        System.out.println("-----------Actividades Practica 7------------");
        
        Ballena bal = new Ballena(); /**Creamos un objeto tipo Ballena */
        bal.setNombre("Anacleta"); /**Asignamos todos los atributos correspondientes*/
        bal.setOrigen("oceano");
        bal.setColor("Azul");
        bal.setNumAletas(2); /**Asignamos el atributo especial de la clase Ballena*/
        bal.setLargo(20);
        
        System.out.println("Ballena:"); /**Imprimimos los atributos de nuestro objeto Ballena */
        System.out.println("Nombre: "+bal.getNombre()+"\nOrigen: "+bal.getOrigen()+
                "\nColor: "+bal.getColor()+"\nNumAletas: "+bal.getNumAletas()+"\nLargo: "+bal.getLargo());
        
        Perro per = new Perro(); /**Creamos el objeto tipo Perro */
        per.setNombre("Bonifasio"); /**Asignamos los atributos correspondientes */
        per.setOrigen("es de la secreta");
        per.setColor("cafe");
        per.setNumPatas(4); /**Asignamos los atributos especiales de la clase Perro */
        per.setNumManchas(0);
        
        System.out.println("\nPerro:"); /**Imprimimos todos los atributos del objeto Perro */
        System.out.println("Nombre: "+per.getNombre()+"\nOrigen: "+per.getOrigen()+
                "\nColor: "+per.getColor()+"\nNumPatas: "+per.getNumPatas()+"\nNum Manchas: "+per.getNumManchas());
        
        Pajaro par = new Pajaro(); /**Creamos un objeto de tipo Pajaro */
        par.setNombre("Loco"); /**Asignamos todos los atributos correspondientes*/
        par.setOrigen("bosque");
        par.setColor("blanco con rojo");
        par.setNumAlas(2); /**Asignamos los atributos especiales de la clase Pajaro*/
        par.setTipoPico("punteagudo");
        
        System.out.println("\nPajaro:"); /**Imprimimos todos los atributos del objeto de tipo Pajaro creado */
        System.out.println("Nombre: "+par.getNombre()+"\nOrigen: "+par.getOrigen()+
                "\nColor: "+par.getColor()+"\nNumAlas: "+par.getNumAlas()+"\nPico: "+par.getTipoPico());
        
    }
    
}
