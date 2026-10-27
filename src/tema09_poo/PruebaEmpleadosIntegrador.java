
package tema09_poo;

public class PruebaEmpleadosIntegrador {

    public static void main(String[] args) {

        EmpleadoIntegrador empleado1 =
                new DesarrolladorIntegrador("Kevin", 25000, "Java");

        EmpleadoIntegrador empleado2 =
                new DisenadorIntegrador("Ana", 22000, "Diseño UI/UX");

        empleado1.mostrarDatos();

        System.out.println("----------------");

        empleado2.mostrarDatos();
    }
}
