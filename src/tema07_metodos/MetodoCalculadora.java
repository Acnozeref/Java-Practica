package tema07_metodos;


// Concepto: multiples metodos dentro de una clase.
// Una clase puede tener tantos metodos como se necesiten; cada uno hace una sola tarea.
// main los coordina llamandolos. El orden en que se escriben no afecta, solo el orden de las llamadas.
public class MetodoCalculadora {

    // Cada operacion tiene su propio metodo, reutilizable con otros valores.
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int restar(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    // Devuelve double porque la division puede tener decimales.
    public static double dividir(double a, double b) {

        if (b == 0) {
            // aquí debemos decidir qué devolver
            // Por el momento no pondremos excepciones
            // servira para entender el concepto de division entre 0
            // este print se muestra al inicio
            System.out.println("No se puede dividir entre  0");
            return 0;
        }
        // Si b no es 0, se devuelve la division normal.
        return a / b;
    }

    public static void main(String[] args) {

        // Se llama cada metodo y se guarda su resultado.
        int suma = sumar(10, 5);
        int resta = restar(10,5);
        int multiplicacion = multiplicar(10, 5);
        double division = dividir(10, 0);

        // Salida esperada (despues del aviso de division): Suma: 15, Resta: 5,
        // Multiplicacion: 50, Division: 0.0
        System.out.println("Suma: " +  suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
        System.out.println("Division: " + division);

    }

}
