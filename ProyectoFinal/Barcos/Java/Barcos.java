/*
 * Esta clase la creo para explicar como usar los metodos en JAVA
 * Metodos que accionan el barco. 
 */
package Metodos;

/**
 *
 * @author Laura Santacruz
 */
public class Barcos //Acciones Caracteristicas 
{
    
    // Definicion de los atributos

    //String marca = "Elan " , color = "Blanco ";
    //double precio = 1200000;
    
    // Definicion de las acciones
    
    void arrancarBarco()
    {
        System.out.println("Ha arrancado" );
        
    }
    
    void prenderBarco(String Marka, int modelo, String color, int precio )
    {
        System.out.println("El barco " + " De marca: " + Marka + " color " + color + " modelo "+ modelo + " y precio " + precio +" esta prendiendo motores");
    }
    
    void acelerarBarco()
    {
        System.out.println("Esta acelerando");
    }
    
    void frenarBarco()
    {
        System.out.println("Ha frenado");
    }
    void apagarBarco()
    {
        System.out.println("Se ha apagado");
    }
    
}
