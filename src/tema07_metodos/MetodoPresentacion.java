package tema07_metodos;

// Ejercicio: metodo void con un parametro String (practica de parametros).
// No devuelve nada: solo imprime.
public class MetodoPresentacion {

    public static void presentar(String nombre) {

        System.out.println("Hola " + nombre);

    }

    public static void main(String[] args) {

        // Salida esperada: Hola Kevin
        presentar("Kevin");

    }
}