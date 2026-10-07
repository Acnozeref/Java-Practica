package tema07_metodos;

import java.util.Scanner;

// Ejercicio: calculadora con metodos + datos del usuario.
// Los metodos hacen el calculo; main solo pide los numeros, los pasa como argumentos y muestra el resultado.
public class CalculadoraUsuario {

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
        // Evita dividir entre 0: en ese caso devuelve 0.
        if (b == 0) {
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {

        // Los datos vienen del teclado y se envian a los metodos como argumentos.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer numero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingresa el segundo numero: ");
        int numero2 = scanner.nextInt();

        // Cada resultado devuelto se guarda en una variable.
        int suma = sumar(numero1, numero2);

        int resta = restar(numero1,numero2);

        int multiplicacion = multiplicar(numero1, numero2);

        // numero1 y numero2 son int, pero dividir recibe double: Java los convierte solo.
        double division = dividir(numero1, numero2);

        // Ejemplo con 10 y 4: Suma 14, Resta 6, Multiplicacion 40, Division 2.5

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
        System.out.println("Division: " + division);

    }
}
