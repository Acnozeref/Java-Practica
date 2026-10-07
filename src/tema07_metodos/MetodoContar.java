package tema07_metodos;

// Ejercicio: usar un bucle for dentro de un metodo y devolver un resultado.
public class MetodoContar {

    // Cuenta de 1 a numero, imprime cada paso y devuelve cuantas veces conto.
    public static int contarHasta(int numero) {

        int contador = 0;

        for (int i = 1; i <= numero; i++) {
            contador++;
            System.out.println("Numero: " + contador);
        }

        // return va despues del bucle: devuelve el total una vez terminado.
        return contador;
    }

    public static void main(String[] args) {

        // Imprime Numero: 1 ... Numero: 10 y luego devuelve 10.
        int resultado = contarHasta(10);

        // Salida esperada: Cantidad: 10
        System.out.println("Cantidad: " + resultado);
    }
}