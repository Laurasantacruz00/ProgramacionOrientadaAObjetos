#include <iostream>
#include <cstdlib>

/**
*
*@author Laura Santacruz
*
*Metodos set y get.
*
**/

using namespace std;

class Nomina{

	string nombres,apellidos;
    int cedula,salario;
    
	public:
		Nomina(string nom,string ape, int ced, int sal)
		{
			this->nombres=nom;
        	this->apellidos=ape;
        	this->cedula=ced;
        	this->salario=sal;
		}
		void Datos()
		{
			cout<<"El nombre del empleado es: "<<nombres;
			cout<<endl;
        	cout<<"con el apellido: "<<apellidos;
        	cout<<endl;
        	cout<<"la cedula del empleado es: "<<cedula;
        	cout<<endl;
        	cout<<"y recibe un salario de : $ "<<salario;
        	cout<<endl;
		}		
		
		//Los get son los que muestran y los set son los que asignan 
    
    	//Metodos Get
    	string getnombres() {
        	return this->nombres;
    	}

    	string getapellidos() {
        	return this->apellidos;
    	}

    	int getcedula() {
        	return this->cedula;
    	}

    	int getsalario() {
        	return this->salario;
    	}
		
    
    	//Metodos Set
    
    	void setnombres(string NOM) {
        	this->nombres = NOM;
		}

    	void setapellidos(string APELLIDO) {
        	this->apellidos = APELLIDO;
		}

    	void setcedula(int CEDU) {
        	this->cedula = CEDU;
		}

   	 	void setsalario(int SALARI) {
        	this->salario = SALARI;
		}
};




int main(){
	
	//Aqui se hara el cambio de identidades.
	
	//Empleados
	Nomina empleado1("juanito", "Alimaña", 307803030, 57907870), empleado2("Daniel","Andrade",123458,80000000);
	Nomina empleado3("Martha","Ojeda",45810201,1000000), empleado4("Sergio","Cadena",564213156,2000000);
	Nomina empleado5("Laura","Santacruz",98091000,4512313);

	//Empleado 1
        empleado1.Datos();
        cout<<("\nTraer el nombre del empleado 1:  " + empleado1.getnombres());
        empleado1.setnombres(" Valentina ");
        empleado1.setapellidos("Santamaria");
        empleado1.setcedula(54514561);
        empleado1.setsalario(60000);

        cout<<"\nNuevo nombre de emplado 1 : "<<empleado1.getnombres();
        cout<<"\nNuevo apellido de emplado 1 : "<<empleado1.getapellidos();
        cout<<"\nNueva cedula de emplado 1 : "<<empleado1.getcedula();
        cout<<"\nNuevo  salario de emplado 1 : "<<empleado1.getsalario();

        cout<<("");

    //Empleado 2
    
    	empleado2.Datos();
    
        cout<<"\nTraer el nombre del empleado 2:  "<<empleado2.getnombres();
        empleado2.setnombres(" Ivan ");
        empleado2.setapellidos("Santamaria");
        empleado2.setcedula(85448);
        empleado2.setsalario(100000);
        cout<<"\nNuevo nombre de emplado 2 : "<<empleado2.getnombres();
        cout<<"\nNuevo apellido de emplado 2 : "<<empleado2.getapellidos();
        cout<<"\nNueva cedula de emplado 2 : "<<empleado2.getcedula();
        cout<<"\nNuevo  salario de emplado 2 : "<< empleado2.getsalario();

        cout<<("");

    //Empleado 3
        
        empleado3.Datos();

        cout<<"Traer el nombre del empleado 3:  "<<empleado3.getnombres();
        empleado3.setnombres(" Yaneth");
        empleado3.setapellidos("Camacho");
        empleado3.setcedula(8545651);
        empleado3.setsalario(86000);

        cout<<"\nNuevo nombre de emplado 3 : "<<empleado3.getnombres();
        cout<<endl;
		cout<<"\nNuevo apellido de emplado 3 : "<<empleado3.getapellidos();
        cout<<endl;
		cout<<"\nNueva cedula de emplado 3 : "<<empleado3.getcedula();
    	cout<<endl;
		cout<<"\nNuevo  salario de emplado 3 : "<<empleado3.getsalario();

        cout<<("");

    //Empleado 4
        
        empleado4.Datos();

        cout<<"Traer el nombre del empleado 4:  "<<empleado4.getnombres();
        empleado4.setnombres(" Nicolle ");
        empleado4.setapellidos(" Ortega");
        empleado4.setcedula(656789);
        empleado4.setsalario(780000);

        cout<<"\nNuevo nombre de emplado 4 : "<<empleado4.getnombres();
        cout<<endl;
		cout<<"\nNuevo apellido de emplado 4 : " <<empleado4.getapellidos();
        cout<<endl;
		cout<<"\nNueva cedula de emplado 4 : "<< empleado4.getcedula();
        cout<<endl;
		cout<<"\nNuevo  salario de emplado 4 : "<<empleado4.getsalario();

        cout<<("");

	//Empleado 5
        
        empleado5.Datos();
        cout<<"\nTraer el nombre del empleado 5:  "<<empleado5.getnombres();
        empleado5.setnombres(" Cecilia ");
        empleado5.setapellidos("Soto");
        empleado5.setcedula(36457816);
        empleado5.setsalario(2300000);
        cout<<"\nNuevo nombre de emplado 5 : " <<empleado5.getnombres();
        cout<<endl;
        cout<<"\nNuevo apellido de emplado 5 : "<<empleado5.getapellidos();
        cout<<endl;
		cout<<"\nNueva cedula de emplado 5 : "<<empleado5.getcedula();
        cout<<endl;
		cout<<"\nNuevo  salario de emplado 5 : "<<empleado5.getsalario();

}
