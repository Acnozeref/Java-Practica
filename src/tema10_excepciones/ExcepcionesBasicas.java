package tema10_excepciones;

public class ExcepcionesBasicas {

    public static void main(String[] args) {
        // try: contiene el código que podría producir una excepción.
        try {
            System.out.println("Inicio: ");

            int numero1 = 10;
            int numero2 = 2;
            int resultado = numero1 / numero2;
            System.out.println(resultado);

            System.out.println("Final del try: ");

        // catch: captura la excepción y permite decidir qué hacer con ella.
        } catch (ArithmeticException e) {
            System.out.println("Error controlado.");
        // finally es un bloque que se ejecuta tanto si ocurre una excepción como si no ocurre.
        } finally {
            System.out.println("Bloque finally finalizado.");
        }

        System.out.println("Fin del programa.");

    }
}

// ArithmeticException: / by zero: Java detectó que intentaste dividir entre cero.
// ExcepcionesBasicas.java:7 : El error ocurrió en la línea 7 de tu clase.
// Process finished with exit code 1: El programa terminó indicando que hubo un error.

// Interrumpe la ejecucion normal.
// Busca si existe un metodo para manejarla.
// Si no encuentra ninguno, termina el programa.

    //  ¿Para qué sirve finally en Backend?
    //  Principalmente para tareas de limpieza, por ejemplo:
    //        - Cerrar conexiones a bases de datos.
    //        - Liberar recursos.
    //        - Cerrar archivos.