/*
 *Este ejercio tiene como proposito crear acciones de las clases
 * que finalmente pueden hacer todo los objetos de la clase
 */
package Metodos;

/**
 *
 * @author Laura Santacruz
 */
public class Metodos //Atributos 
{ 
   
            
    public static void main(String[]args)
    {
        //PRIMER PUNTO DEL PARCIAL 5 METODOS CON 4 ATRIBUTOS PARA 5 OBJETOS
        //Crear objetos para usar los metodos que estan en la clase barcos
        //Aqui crearemos nuestras instancias/Objetos
        
        //Primer barco 
        Barcos primerBarco = new Barcos();
        //AccionesYAtributos
        primerBarco.prenderBarco("Masserati",2010, "verde", 23000);
        primerBarco.arrancarBarco();
        primerBarco.acelerarBarco();
        primerBarco.frenarBarco();
        primerBarco.apagarBarco();
        
        //SegundoBarco
        Barcos segundoBarco = new Barcos();
        //AccionesYAtributos
        segundoBarco.prenderBarco("Jeanneau",2006,"Gris",500000);
        segundoBarco.arrancarBarco();
        segundoBarco.acelerarBarco();
        segundoBarco.frenarBarco();
        segundoBarco.apagarBarco();
        
        //TercerBarco
        Barcos TercerBarco = new Barcos();
        //AccionesYAtributos
        TercerBarco.prenderBarco("Jeanneau",2006,"Gris",500000);
        TercerBarco.arrancarBarco();
        TercerBarco.acelerarBarco();
        TercerBarco.frenarBarco();
        TercerBarco.apagarBarco();
        
        //CuartoBarco
        Barcos CuartoBarco = new Barcos();
        //AccionesYAtributos
        CuartoBarco.prenderBarco("Beneteau",2016,"Amarillo",6400000);
        CuartoBarco.arrancarBarco();
        CuartoBarco.acelerarBarco();
        CuartoBarco.frenarBarco();
        CuartoBarco.apagarBarco();
        
        //QuintoBarco
        Barcos QuintoBarco = new Barcos();
        //AccionesYAtributos
        QuintoBarco.prenderBarco("Sunsekeer",2015,"Negro",7000000);
        QuintoBarco.arrancarBarco();
        QuintoBarco.acelerarBarco();
        QuintoBarco.frenarBarco();
        QuintoBarco.apagarBarco();
       
    }
    
}
