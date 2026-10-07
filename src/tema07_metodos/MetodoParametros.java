package tema07_metodos;

// Concepto: parametros y argumentos.
// Un parametro es una variable que el metodo declara entre parentesis para recibir datos.
// Un argumento es el valor real que se escribe al llamar el metodo.
// Asi el mismo metodo puede trabajar con datos distintos cada vez.
public class MetodoParametros {

    // nombre es el parametro: String indica el tipo de dato que debe recibir.
    public static void saludar(String nombre) {
        System.out.println("Hola, " + nombre);
    }

    public static void main(String[] args) {

        // "Kevin" es el argumento: se copia en el parametro nombre.
        // Salida esperada: Hola, Kevin
        saludar("Kevin");

    }
}