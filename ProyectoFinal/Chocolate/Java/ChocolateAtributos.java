/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chocolate;

/**
 *
 * @author Laura Santacruz
 */
public class ChocolateAtributos {
    
    public static void main(String[]args)
    {
        System.out.println("Un marciano viene a visitar a un humano, el humano lo hace pasar y habla con el,");
        System.out.println("El marciano le dice que le han hablado del chocolate, al humano se le ocurre la gran idea de hacerle uno" );
        
        ChocolateMetodos ingredientes = new ChocolateMetodos();
        
        ingredientes.BuscarLeche();
        ingredientes.BuscarCanela();
        ingredientes.BuscarAzucar();
        ingredientes.BuscarOlleta();
        ingredientes.BuscarTaza();
        
        
        ChocolateMetodos Procedimiento = new ChocolateMetodos();
        
        Procedimiento.EncenderFogon();
        Procedimiento.HervirLeche();
        Procedimiento.Chocolate();
        Procedimiento.Azucar();
        Procedimiento.servir();
        
    }

    
    
    
}
