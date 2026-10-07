package tema07_metodos;

// Ejercicio: usar un acumulador dentro de un bucle for en un metodo.
// suma += i acumula 1 + 2 + ... + numero y al final se devuelve con return.
public class MetodoSumarHasta {

    public static int sumarNumero(int numero) {

        // acumulador: empieza en 0 y va guardando la suma parcial
        int suma = 0;

        for (int i = 1; i <= numero; i++) {

            suma += i;

            System.out.println("Suma: " + suma);
        }

        return suma;
    }

    public static void main(String[] args) {

        // Imprime las sumas parciales: 1, 3, 6, 10, 15
        int resultado = sumarNumero(5);

        // Salida esperada: Total: 15
        System.out.println("Total: " + resultado);
    }
}