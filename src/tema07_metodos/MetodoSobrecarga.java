package tema07_metodos;

// Concepto: sobrecarga de metodos (overloading).
// Se pueden tener varios metodos con el mismo nombre si su lista de parametros
// es distinta (cantidad o tipos). Java elige cual ejecutar segun los argumentos de la llamada.
// Cambiar solo el tipo de retorno no basta para sobrecargar.
public class MetodoSobrecarga {

    // Version sin parametros.

    public static void saludar() {
        System.out.println("Hola, bienvenido");
    }

    // Version con un parametro String: mismo nombre, distinta firma.
    public static void saludar(String nombre) {
        System.out.println("Hola " + nombre);
    }

    public static void main(String[] args) {

        // Sin argumentos: usa la primera version. Imprime: Hola, bienvenido
        saludar();
        // Con un String: usa la segunda version. Imprime: Hola Kevin
        saludar("Kevin");

    }

}
