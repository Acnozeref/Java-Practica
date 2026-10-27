package tema09_poo;

public class Desarrollador extends Empleado {

    private String lenguaje;

    public Desarrollador(String nombre, String lenguaje) {
        super(nombre);
        this.lenguaje = lenguaje;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Lenguaje: " + lenguaje);
    }
}
