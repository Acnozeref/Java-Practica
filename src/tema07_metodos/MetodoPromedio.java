package tema07_metodos;

// Ejercicio: metodo con parametros double que devuelve un double.
// Se usa double para conservar los decimales del promedio.
public class MetodoPromedio {

    public static double promedio(double numero1, double numero2) {
        // usar () para evitar calcular de manera literal
        // sin () 20
        // con () 15.00 resultado esperado
        return (numero1 + numero2) / 2;
    }

    public static void main(String[] args) {

        // Los int 10 y 20 se convierten solos a double al pasarlos como argumentos.
        double resultado = promedio(10, 20);

        // Salida esperada: Promedio: 15.0
        System.out.println("Promedio: " + resultado);
    }

}
