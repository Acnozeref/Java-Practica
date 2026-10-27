package tema09_poo;

public class PruebaSalarioInvalido {

    public static void main(String[] args) {

        EmpleadoIntegrador empleado =
                new EmpleadoIntegrador("Kevin", -5000);

        empleado.mostrarDatos();
    }
}
