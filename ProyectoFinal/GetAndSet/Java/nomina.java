/*
 * Aqui va a estar el constructor con sus atributos
 */
package getandset;

/**
 *
 * @author Laura Santacruz
 */
public class nomina {

    String nombres, apellidos;
    int cedula, salario;
    
    //Metodo Constructor

    nomina(String nom, String ape, int ced, int sal) {

        this.nombres = nom;
        this.apellidos = ape;
        this.cedula = ced;
        this.salario = sal;
    }

    void Datos() {
        System.out.println("El nombre del empleado es:" + nombres);
        System.out.println("Su apellido es: " + apellidos);
        System.out.println("La cedula del empleado es: " + cedula);
        System.out.println("y recibe un salario de : $ " + salario);
    }

    //Los get son los que muestran y los set son los que asignan 
    
    //Metodos Get
    String getnombres() {
        return this.nombres;
    }

    String getapellidos() {
        return this.apellidos;
    }

    int getcedula() {
        return this.cedula;
    }

    int getsalario() {
        return this.salario;
    }
    
    //Metodos Set
    
    void setnombres(String NOM) {
        this.nombres = NOM;

    }

    void setapellidos(String APELLIDO) {
        this.apellidos = APELLIDO;

    }

    void setcedula(int CEDU) {
        this.cedula = CEDU;

    }

    void setsalario(int SALARI) {
        this.salario = SALARI;

    }


}