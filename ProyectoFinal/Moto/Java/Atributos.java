
package Ejercicios;

/**
 *
 * @autor Laura Santacruz
 */
public class Atributos {

    /**
     * Definimos nuestros atributos de clase
     */
    String marca = "Ducatti" , color = "Verde cielo" ,  modelo = "2016" ;
    double precio = 12000000;
    
    public static void main(String[] args) {
        // Voy a exponer la moto que voy a crear instanciando la clase o creando un objeto
        
        Atributos motoA = new Atributos();
        System.out.println("Estas son las caracteristicas de mi moto: Moto A ");
        System.out.println();
        System.out.println("Esta es la marca de mi moto: " + motoA.marca);
        System.out.println("Este es el color de mi moto: "+ motoA.color);
        System.out.println("Este es el modelo de mi moto: "+motoA.modelo);
        
        Atributos motoB = new Atributos();
        motoB.marca = "kimko";
        motoB.color = "Verde";
        motoB.modelo = "2010" ;
        motoB.precio = 22000000;
        System.out.println("Estas son las caracteristicas de mi moto: Moto B ");
        System.out.println();
        System.out.println("Esta es la marca de mi moto: " + motoB.marca);
        System.out.println("Este es el color de mi moto: "+ motoB.color);
        System.out.println("Este es el modelo de mi moto: "+motoB.modelo);
        
        Atributos motoC = new Atributos();
        motoC.marca = "AKT";
        motoC.color = "Azul" ;
        motoC.modelo = "2010" ;
        motoC.precio = 33000000;
        System.out.println("Estas son las caracteristicas de mi moto: Moto C ");
        System.out.println();
        System.out.println("Esta es la marca de mi moto: " + motoC.marca);
        System.out.println("Este es el color de mi moto: "+ motoC.color);
        System.out.println("Este es el modelo de mi moto: "+motoC.modelo);
        
        Atributos motoD= new Atributos();
        motoD.marca = "Yamaha";
        motoD.color = "Negra" ;
        motoD.modelo = "2015" ;
        motoD.precio = 35000000;
        System.out.println("Estas son las caracteristicas de mi moto: Moto D ");
        System.out.println();
        System.out.println("Esta es la marca de mi moto: " + motoD.marca);
        System.out.println("Este es el color de mi moto: "+ motoD.color);
        System.out.println("Este es el modelo de mi moto: "+motoD.modelo);
        
        
    }
    
    
}