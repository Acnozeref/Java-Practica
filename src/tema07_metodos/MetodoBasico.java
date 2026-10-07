package tema07_metodos;

// Concepto: un metodo es un bloque de codigo con nombre que guarda una tarea.
// Se escribe una vez y se puede ejecutar (llamar) tantas veces como se necesite.
// Un metodo tiene: modificadores (public static), tipo de retorno (void),
// nombre (saludar), parentesis para los parametros () y un cuerpo entre llaves {}.
public class MetodoBasico {

    // Definicion del metodo: solo declara la tarea, aun no se ejecuta.
    // void significa que el metodo no devuelve ningun valor, solo hace algo (imprimir).
    // Los parentesis vacios () indican que no recibe datos.
    public static void saludar() {
        System.out.println("Hola, soy Kevin");
    }

    public static void main(String[] args) {

        // Llamada al metodo: escribimos su nombre y (); aqui se ejecuta su cuerpo.
        // Salida esperada: Hola, soy Kevin
        saludar();

    }
}