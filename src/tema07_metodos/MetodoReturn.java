package tema07_metodos;

// Concepto: return y tipo de retorno.
// Un metodo puede devolver un valor a quien lo llamo. El tipo de retorno
// (int, double, boolean, String...) se escribe antes del nombre en lugar de void.
// return envia ese valor de vuelta y termina el metodo.
public class MetodoReturn {

    // int indica que el metodo devuelve un numero entero.
    // El valor de return debe ser del mismo tipo que el tipo de retorno.
    public static int sumar() {
        return 10 + 20;
    }

    public static void main(String[] args) {

        // Llamar un metodo que devuelve valor: guardamos el resultado en una variable.
        // sumar() se reemplaza por el valor 30.
        int resultado = sumar();

        // Salida esperada: 30
        System.out.println(resultado);

    }
}