#include <iostream>
#include <cstdlib>

/**
*
*@author Laura Santacruz
*
**/



/*Barcos*/

using namespace std;

class Barcos{
    
  
	
	//Metodos
	//Accciones del barco.
    
    public:
    	void arrancarBarco()
    	{
        	cout<<("\n Ha arrancado" );
        }
    
    
	public:
		void prenderBarco(string Marka, int modelo, string color, int precio )//Atributos
    	{
        	cout<<"\nEl barco de marca: "<<Marka;
			cout<<" color "<<color;
			cout<<" modelo "<<modelo;
			cout<<" y precio "<<precio;
			cout<<" esta prendiendo motores";        
    	}
    public:
    	void acelerarBarco()
    	{
        	cout<<("\nEsta acelerando");
    	}
    
    public:
    	void frenarBarco()
    	{
        	cout<<("\nHa frenado");
        
    	}
    	
    public:
    	void apagarBarco()
    	{
        	cout<<("\nSe ha apagado");
        
    	}
  
};

int main(){
	
	Barcos PrimerBarco, SegundoBarco, TercerBarco, CuartoBarco, QuintoBarco;
	
	
	//Primer Barco
		PrimerBarco.prenderBarco("Masserati",2010,"verde",23000);
		PrimerBarco.arrancarBarco();
    	PrimerBarco.acelerarBarco();
    	PrimerBarco.frenarBarco();
		PrimerBarco.apagarBarco();
	
	//SegundoBarco
        SegundoBarco.prenderBarco("Jeanneau",2006,"Gris",500000);
        SegundoBarco.arrancarBarco();
        SegundoBarco.acelerarBarco();
        SegundoBarco.frenarBarco();
        SegundoBarco.apagarBarco();
        
    //TercerBarco
        TercerBarco.prenderBarco("Jeanneau",2006,"Gris",500000);
        TercerBarco.arrancarBarco();
        TercerBarco.acelerarBarco();
        TercerBarco.frenarBarco();
        TercerBarco.apagarBarco();
        
    //CuartoBarco
    
		CuartoBarco.prenderBarco("Beneteau",2016,"Amarillo",6400000);
        CuartoBarco.arrancarBarco();
        CuartoBarco.acelerarBarco();
        CuartoBarco.frenarBarco();
        CuartoBarco.apagarBarco();
	
	//QuintoBarco

        QuintoBarco.prenderBarco("Sunsekeer",2015,"Negro",7000000);
        QuintoBarco.arrancarBarco();
        QuintoBarco.acelerarBarco();
        QuintoBarco.frenarBarco();
        QuintoBarco.apagarBarco();

	system("pause");
}
