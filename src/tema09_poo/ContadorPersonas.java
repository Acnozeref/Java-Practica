package tema09_poo;

public class ContadorPersonas {
    // static indica que un miembro pertenece a la
    // clase, en lugar de pertenecer a cada objeto individual.
    static int totalPersonas = 0;

    String nombre;

    public ContadorPersonas(String nombre) {
        this.nombre = nombre;
        totalPersonas++;
    }

    public void mostrarNombre() {
        System.out.println("Nombre: " + nombre);
    }

    public static void mostrarTotal() {
        System.out.println("Total de personas: " + totalPersonas);
    }
}
