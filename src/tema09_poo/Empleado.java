package tema09_poo;

public class Empleado {

    // Permite que las clases del mismo paquete
    // y las clases hijas puedan acceder a ese atributo.
    protected String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
    }

}
