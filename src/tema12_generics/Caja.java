package tema12_generics;

// <T> indica clase de tipo Generico.
public class Caja<T> {

    // Almacena cualquier tipo compatible.
    private T contenido;

    // Asigna el contenido.
    public void setContenido(T contenido) {
        this.contenido = contenido;
    }
    // Recupera el contenido.
    public T getContenido() {
        return contenido;
    }

    public static void main(String[] args) {

        // Crea una caja para String.
        // Asignacion de tipos a contenido.
        Caja<String> texto = new Caja<>();
        texto.setContenido("Manzanas");

        // Crea una caja para Integer.
        Caja<Integer> numero = new Caja<>();
        numero.setContenido(20); // Correcto
        // numero.setContenido("Hola");   // Error de compilación
        // Seguridad de tipos.

        System.out.println(texto.getContenido());
        System.out.println(numero.getContenido());
    }
}
