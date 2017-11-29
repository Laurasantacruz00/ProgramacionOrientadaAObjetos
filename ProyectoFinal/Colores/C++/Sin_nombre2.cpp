#include <iostream>
#include <cstdlib>

/**
*
*@author Laura Santacruz
*
**/

using namespace std;

int main(){
	
        string a[11], b[11], c[11], d[11], e;

        for (int i = 1; i <= 10; i++) {
            cout<<("Primera lista de colores ");
            cout<<("\nIngrese color ",i);
            cin>>a[i];
        }
        for (int i = 1; i <= 10; i++) {
            cout<<("Segunda lista de colores ");
            cout<<("\nIngrese color ",i);
            cin>>b[i];
        }
        for (int i = 1; i <= 10; i++) {
            cout<<("Tercera lista de colores ");
            cout<<("\nIngrese color ",i);
            cin>>c[i];
        }
        for (int i = 1; i <= 10; i++) {
            cout<<("Cuarta lista de colores ");
            cout<<("\nIngrese color ",i);
            cin>>d[i];
        }
        for (int i = 1; i <= 10; i++) {
            
			if (a[i] == b[i]) {
                
				if (b[i] == c[i]) {
                
				    if (c[i] == d[i]) {
                
				        cout<<("Son iguales");
                
				    } else {
                
				        cout<<("Son distintas");
                    }
                
				} else {
                
				    cout<<("Son distintas");
                
				}
            } else {
             
			    cout<<("Son distintas");
            }
        }

}
