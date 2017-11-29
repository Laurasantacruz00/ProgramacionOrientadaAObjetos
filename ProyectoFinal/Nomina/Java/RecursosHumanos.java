/*
 * Esta es la que maneja los datos del empleado
 */
package Constructores;

/**
 *
 * @author Laura Santacruz
 */
public class RecursosHumanos {
    
    String sex,estado;
    int hijo;
    RecursosHumanos(String genero,String estci, int hijos ){
        this.sex=genero;
        this.estado=estci;
        this.hijo= hijos;
        
    }
   
    void recursos()
    {
     System.out.println("El genero del empleado es : "+ sex);
     System.out.println("El estado civil de el empleado es:  " + estado);
     System.out.println("Y tiene :  "+ hijo+ " hijos");
    }
}
