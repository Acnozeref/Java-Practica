package tema07_metodos;

// Concepto: metodo con varios parametros que devuelve un resultado.
// Une lo visto: parametros (reciben datos) + return (devuelve el resultado).
// Los parametros se separan con comas y cada uno lleva su propio tipo.
public class MetodoSuma {

    // a y b son parametros; el metodo devuelve un int.
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        // El orden de los argumentos importa: 10 va a a, 20 va a b.
        int resultado = sumar(10, 20);

        // Salida esperada: 30
        System.out.println(resultado);

    }
}