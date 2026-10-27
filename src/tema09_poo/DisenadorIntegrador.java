
package tema09_poo;

public class DisenadorIntegrador extends EmpleadoIntegrador {

    private String especialidad;

    public DisenadorIntegrador(String nombre, double salario, String especialidad) {
        super(nombre, salario);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Especialidad: " + especialidad);
    }
}
