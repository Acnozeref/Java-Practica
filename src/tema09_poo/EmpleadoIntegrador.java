package tema09_poo;

public class EmpleadoIntegrador {

    private String nombre;
    private double salario;


    public EmpleadoIntegrador(String nombre, double salario) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }

        if (salario < 0) {
            throw new IllegalArgumentException("El salario no puede ser negativo");
        }

        this.nombre = nombre;
        this.salario = salario;
    }


    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario);
    }
}
