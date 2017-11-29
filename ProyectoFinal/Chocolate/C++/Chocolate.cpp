#include <iostream>
#include <cstdlib>

/**
*
*@author Laura Santacruz
*
**/



/*Un marciano viene a visitar a un humano, el humano lo hace pasar y habla con el,
// el marciano le dice que le han hablado del chocolate, al humano se le ocurre la gran idea de hacerle uno*/

using namespace std;

class Chocolate{
	
	
	//Metodos
	//Buscar Ingredientes.
    
    public:
    	void BuscarLeche()
    	{
        	cout<<("\nLa persona se dirige a la nevera y saca la leche." );
        }
    
    
	public:
		void BuscarCanela()
    	{
        	cout<<("\n Se dirige a la cocina, deja la leche en el meson y en la esquina superior izquierda se encuentra la canela" );
        
    	}
    public:
    	void BuscarAzucar()
    	{
        	cout<<("\n Despues, saca el azucar" );
    	}
    
    public:
    	void BuscarOlleta()
    	{
        	cout<<("\n En la parte inferior derecha se encuentran las ollas, de este lugar saca la olleta" );
        
    	}
    	
    public:
    	void BuscarTaza()
    	{
        	cout<<("\n En la parte inferior izquierda se encuentran las tazas y los vasos, de este lugar saca dos tazas" );
        
    	}
    
  //Procedimiento.  
    
    public:
    	void EncenderFogon()
    	{
        	cout<<("\nAl tener todos los ingredientes, la persona prende el fogon" );
        
    	}
    
    public:
    	void HervirLeche()
    	{
        	cout<<("\n Vierte la leche en la olleta y añade la canela");
        
    	}
    
    public:
    	void Choco()
    	{
        	cout<<("\n Al hervir la leche, el humano añade una tablilla en trozos de chocolate");
        
    	}
    
    public:
    	void Azucar()
    	{
        	cout<<("\n Para finalizar añade dos cucharadas de azucar");
        
    	}
    
    public:
    	void servir()
    	{
        	cout<<("\n Por ultimo vierte el chocolate en dos tazas y se sienta junto al Marciano, os dos disfrutan del rico chocolate");
        
    	}
};

main(){
	
	Chocolate ingredientes, Procedimiento;
	
	ingredientes.BuscarLeche();
    ingredientes.BuscarCanela();
    ingredientes.BuscarAzucar();
    ingredientes.BuscarOlleta();
    ingredientes.BuscarTaza();

    Procedimiento.EncenderFogon();
    Procedimiento.HervirLeche();
    Procedimiento.Choco();
	Procedimiento.Azucar();
    Procedimiento.servir();

	system("pause");
}
