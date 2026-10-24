package tema09_poo;

public class Producto {

    String nombre;
    double precio;

    // constructor
    // el constructor debe coincidir con los argumentos que envías al crear el objeto.
    Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public static void main(String[] args) {
        // Objetos creados en base al contstructor.
        // Los tres objetos utilizan el mismo constructor,
        // pero cada uno tiene sus propios atributos.
        Producto teclado = new Producto("Teclado", 499.99);
        Producto raton = new Producto("Ratón", 199.99);
        Producto monitor = new Producto("Monitor", 2999.99);

        System.out.println(teclado.nombre);
        System.out.println(teclado.precio);

    }
}
