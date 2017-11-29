#include <iostream>
#include <cstdlib>

/**
*
*@author Laura Santacruz
*
**/

using namespace std;

class Nomina{
	
	//Atributos
	string nombres,apellidos;
    int cedula,salario;
    
	public:
		//Constructor
		Nomina(string nom,string ape, int ced, int sal)
		{
			this->nombres=nom;
        	this->apellidos=ape;
        	this->cedula=ced;
        	this->salario=sal;
		}
		void Datos()
		{
			cout<<"El nombre del empleado es:"<<nombres;
			cout<<endl;
        	cout<<"con el apellido: "<<apellidos;
        	cout<<endl;
        	cout<<"la cedula del empleado es: "<<cedula;
        	cout<<endl;
        	cout<<"y recibe un salario de : $ "<<salario;
        	cout<<endl;
		}		
};

class RecursosHumanos{
	
	string sex,estado;
    int hijo;
    
	public:
		RecursosHumanos(string genero,string estci, int hijos)
		{
			this->sex=genero;
        	this->estado=estci;
        	this->hijo= hijos;
		}	
	public:
		void recursos()
    	{
     		cout<<"El genero del empleado es : "<<sex;
     		cout<<endl;
     		cout<<"El estado civil de el empleado es:  "<<estado;
    		cout<<endl;
			cout<<"\nY tiene esta cantidad de hijos: "<<hijo;
    		cout<<endl;
		
		}	
};


int main(){
	
	//Datos de nomina
	Nomina empleado1("juanito", "Alimaña", 307803030, 57907870), empleado2("Daniel","Andrade",123458,80000000);
	Nomina empleado3("Martha","Ojeda",45810201,1000000), empleado4("Sergio","Cadena",564213156,2000000), empleado5("Laura","Santacruz",98091000,4512313);
	
	//Datos de Recursos humanos
	RecursosHumanos empleadoA("Masculino", "Soltero", 2), empleadoB("Masculino", "Casado", 3);
	RecursosHumanos empleadoC("Femenino", "Casada", 3), empleadoD("Masculino", "Casado", 5), empleadoE("Femenino", "Soltera", 0);
	
	empleado1.Datos();
	empleadoA.recursos();

	empleado2.Datos();
	empleadoB.recursos();
	
	empleado3.Datos();
	empleadoC.recursos();
	
	empleado4.Datos();
	empleadoD.recursos();
	
	empleado5.Datos();
	empleadoE.recursos();


}
