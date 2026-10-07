package tema07_metodos;

// Ejercicio: metodo que devuelve un String (no solo numeros o boolean).
// Cada rama del if / else if / else tiene su propio return con un texto distinto.
public class MetodoSignoNumero {

    public static String signo(int numero) {

        if (numero > 0) {
            return "positivo";
        } else if (numero < 0) {
            return "negativo";
        } else {
            return "es cero";
        }

    }

    public static void main(String[] args) {

        // Con 0 se ejecuta el else. Salida esperada: Numero es cero
        String resultado = signo(0);

        System.out.println("Numero " + resultado);

    }

}
