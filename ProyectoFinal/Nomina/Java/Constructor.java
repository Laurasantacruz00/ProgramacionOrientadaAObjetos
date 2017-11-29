/*
 *
 * Esta clase crea los objetos a invocar por parte de clase nomina. la cual 
 * lleva los atributos del empleado y su salario
 */
package Constructores;

/**
 *
 * @author Laura Santacruz
 */
public class Constructor {
    public static void main(String[] args) {
        //Creando objetos
        
       Nomina empleado1 = new Nomina("juanito", "Alimaña", 307803030, 57907870);
       empleado1.Datos();
       RecursosHumanos empleado = new RecursosHumanos ("Masculino", "Soltero", 2);
       empleado.recursos();
        
       Nomina empleado2 = new Nomina ("Daniel","Andrade",123458,80000000);
       empleado2.Datos();
       RecursosHumanos empleadoA = new RecursosHumanos ("Masculino", "Casado", 3);
       empleadoA.recursos();
        
       Nomina empleado3 = new Nomina ("Martha","Ojeda",45810201,1000000);
       empleado3.Datos();
       RecursosHumanos empleadoB = new RecursosHumanos ("Femenino", "Casada", 3);
       empleadoB.recursos();
         
       System.out.println("");
       
       Nomina empleado4 = new Nomina ("Sergio","Cadena",564213156,2000000);
       empleado4.Datos();
       RecursosHumanos empleadoC = new RecursosHumanos ("Masculino", "Casado", 5);
       empleadoC.recursos();
       
       Nomina empleado5 = new Nomina ("Laura","Santacruz",98091000,4512313);
       empleado5.Datos();
       RecursosHumanos empleadoD = new RecursosHumanos ("Femenino", "Soltera", 0);
       empleadoD.recursos();
    }  
}
