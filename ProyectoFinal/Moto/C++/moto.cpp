#include <iostream>
#include <cstdlib> 
#include <string.h> 

 
using namespace std;

class moto{
	
	//Metodos
	//Accciones de la moto.
    
    public:
    	void arrancarMoto()
    	{
        	cout<<("\n Ha arrancado" );
        }
    
    
	public:
		void prenderMoto(string Marka, int modelo, string color, int precio )//Atributos
    	{
        	cout<<"\nLa moto de marca: "<<Marka;
			cout<<" color "<<color;
			cout<<" modelo "<<modelo;
			cout<<" y precio "<<precio;
			cout<<" esta prendiendo motores";        
    	}
    public:
    	void acelerarMoto()
    	{
        	cout<<("\nEsta acelerando");
    	}
    
    public:
    	void frenarMoto()
    	{
        	cout<<("\nHa frenado");
        
    	}
    	
    public:
    	void apagarMoto()
    	{
        	cout<<("\nSe ha apagado");
        
    	}
};
 
 int main() {
 	
	moto MotoA, MotoB, MotoC, MotoD;
	
	
	//Primera Moto
		MotoA.prenderMoto("Ducatti",2010,"verde",23000);
		MotoA.arrancarMoto();
    	MotoA.acelerarMoto();
    	MotoA.frenarMoto();
		MotoA.apagarMoto();
	
	//Segunda Moto
        MotoB.prenderMoto("Yamaja",2006,"Gris",500000);
        MotoB.arrancarMoto();
        MotoB.acelerarMoto();
        MotoB.frenarMoto();
        MotoB.apagarMoto();
        
    //Tercera Moto
        MotoC.prenderMoto("Suzuki",2006,"Gris",500000);
        MotoC.arrancarMoto();
        MotoC.acelerarMoto();
        MotoC.frenarMoto();
        MotoC.apagarMoto();
        
    //Cuarta Moto
    
		MotoD.prenderMoto("Kimko",2016,"Amarillo",6400000);
        MotoD.arrancarMoto();
        MotoD.acelerarMoto();
        MotoD.frenarMoto();
        MotoD.apagarMoto();
	

	system("pause");


}
