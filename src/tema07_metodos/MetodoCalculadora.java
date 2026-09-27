package tema07_metodos;


// multiples metodos dentro de una clase
public class MetodoCalculadora {

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int restar(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static double dividir(double a, double b) {

        if (b == 0) {
            // aquí debemos decidir qué devolver
            // Por el momento no pondremos excepciones
            // servira para entender el concepto de division entre 0
            // este print se muestra al inicio
            System.out.println("No se puede dividir entre  0");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {

        int suma = sumar(10, 5);
        int resta = restar(10,5);
        int multiplicacion = multiplicar(10, 5);
        double division = dividir(10, 0);

        System.out.println("Suma: " +  suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
        System.out.println("Division: " + division);

    }

}
