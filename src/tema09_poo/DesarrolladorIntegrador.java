package tema09_poo;

public class DesarrolladorIntegrador extends EmpleadoIntegrador {

    private String lenguaje;

    public DesarrolladorIntegrador(String nombre, double salario, String lenguaje) {
        super(nombre, salario);
        this.lenguaje = lenguaje;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Lenguaje: " + lenguaje);
    }
}
