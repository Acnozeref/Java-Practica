
package tema09_poo;

public class PruebaEmpleadosArray {

    public static void main(String[] args) {

        EmpleadoIntegrador[] empleados = {
                new DesarrolladorIntegrador("Kevin", 25000, "Java"),
                new DisenadorIntegrador("Ana", 22000, "Diseño UI/UX"),
                new DesarrolladorIntegrador("Luis", 28000, "Python")
        };

        for (EmpleadoIntegrador empleado : empleados) {
            empleado.mostrarDatos();
            System.out.println("----------------");
        }
    }
}
