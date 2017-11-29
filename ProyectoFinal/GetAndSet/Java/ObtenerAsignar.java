/*
 * Metodos get and set
 */
package getandset;

/**
 *
 * @author Laura Santacruz
 */
public class ObtenerAsignar {

    public static void main(String[] args) {

        //EMPLEADO 1
        nomina empleado1 = new nomina("Juanito", "Alimaña", 308964030, 50);
        empleado1.Datos();

        System.out.println("Traer el nombre del empleado 1:  " + empleado1.getnombres());
        empleado1.setnombres(" Valentina ");
        empleado1.setapellidos("Santamaria");
        empleado1.setcedula(54514561);
        empleado1.setsalario(60000);

        System.out.println("Nuevo nombre de emplado 1 : " + empleado1.getnombres());
        System.out.println("Nuevo apellido de emplado 1 : " + empleado1.getapellidos());
        System.out.println("Nueva cedula de emplado 1 : " + empleado1.getcedula());
        System.out.println("Nuevo  salario de emplado 1 : " + empleado1.getsalario());

        System.out.println("");

        //EMPLEADO 2
        nomina empleado2 = new nomina("Sergio", "Santacruz", 859764, 10000000);

        System.out.println("Traer el nombre del empleado 2:  " + empleado2.getnombres());
        empleado2.setnombres(" Ivan ");
        empleado2.setapellidos("Santamaria");
        empleado2.setcedula(85448);
        empleado2.setsalario(100000);
        System.out.println("Nuevo nombre de emplado 2 : " + empleado2.getnombres());
        System.out.println("Nuevo apellido de emplado 2 : " + empleado2.getapellidos());
        System.out.println("Nueva cedula de emplado 2 : " + empleado2.getcedula());
        System.out.println("Nuevo  salario de emplado 2 : " + empleado2.getsalario());

        System.out.println("");

        //EMPLEADO 3
        nomina empleado3 = new nomina("Martha", "Ojeda", 5256581, 1700000);
        empleado3.Datos();

        System.out.println("Traer el nombre del empleado 3:  " + empleado3.getnombres());
        empleado3.setnombres(" Yaneth");
        empleado3.setapellidos("Camacho");
        empleado3.setcedula(8545651);
        empleado3.setsalario(86000);

        System.out.println("Nuevo nombre de emplado 3 : " + empleado3.getnombres());
        System.out.println("Nuevo apellido de emplado 3 : " + empleado3.getapellidos());
        System.out.println("Nueva cedula de emplado 3 : " + empleado3.getcedula());
        System.out.println("Nuevo  salario de emplado 3 : " + empleado3.getsalario());

        System.out.println("");

        //EMPLEADO 4
        nomina empleado4 = new nomina("Laura", "Santacruz", 564213156, 2000000);
        empleado4.Datos();

        System.out.println("Traer el nombre del empleado 4:  " + empleado4.getnombres());
        empleado4.setnombres(" Nicolle ");
        empleado4.setapellidos(" Ortega");
        empleado4.setcedula(656789);
        empleado4.setsalario(780000);

        System.out.println("Nuevo nombre de emplado 4 : " + empleado4.getnombres());
        System.out.println("Nuevo apellido de emplado 4 : " + empleado4.getapellidos());
        System.out.println("Nueva cedula de emplado 4 : " + empleado4.getcedula());
        System.out.println("Nuevo  salario de emplado 4 : " + empleado4.getsalario());

        System.out.println("");

        //EMPLEADO 5
        nomina empleado5 = new nomina("Yasmin", "Ortega", 98091000, 4512313);
        empleado5.Datos();
        System.out.println("Traer el nombre del empleado 5:  " + empleado5.getnombres());
        empleado5.setnombres(" Cecilia ");
        empleado5.setapellidos("Soto");
        empleado5.setcedula(36457816);
        empleado5.setsalario(2300000);
        System.out.println("Nuevo nombre de emplado 5 : " + empleado5.getnombres());
        System.out.println("Nuevo apellido de emplado 5 : " + empleado5.getapellidos());
        System.out.println("Nueva cedula de emplado 5 : " + empleado5.getcedula());
        System.out.println("Nuevo  salario de emplado 5 : " + empleado5.getsalario());

    }

}
