package tema07_metodos;

// Concepto: alcance (scope) de las variables.
// Una variable solo existe dentro del bloque { } donde se declara.
// Las variables y parametros de un metodo son locales: otro metodo no puede verlos.
public class MetodoAlcance {

    public static void alcance(String nombre) {

        // prueba y nombre son locales: solo existen dentro de este metodo.
        String prueba = "Esto es una variable dentro de un metodo";
        System.out.println("Metodo de prueba: " + nombre);

    }

    public static void main(String[] args) {
        // fallo al llamar una variable de un metodo
        // prueba no existe en main: descomentar esta linea daria error de compilacion.
        // System.out.println(prueba);


        String mensaje = "Hola desde main";

        // Salida esperada: Hola desde main
        // (alcance() no se llama, por eso no imprime nada).
        System.out.println(mensaje);

    }

}
