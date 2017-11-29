/*
 *  Esta clase es la que lleva el constructor, con sus atributos y la invocación de los mismos
 */
package Constructores;

/**
 *
 * @author Laura Santacruz
 */
public class Nomina {
    String nombres,apellidos;
    int cedula,salario;
    //creando un metodo Constructor
    
    Nomina(String nom,String ape, int ced, int sal)
    {
        this.nombres=nom;
        this.apellidos=ape;
        this.cedula=ced;
        this.salario=sal;
    }

    
    void Datos()
    {
        System.out.println("el nombre del empleado es:"+ nombres);
        System.out.println("con el apellido: " + apellidos);
        System.out.println("la cedula del empleado es: "+ cedula);
        System.out.println("y recibe un salario de : $ "+ salario);
    }
}
