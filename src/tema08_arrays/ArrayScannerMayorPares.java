package tema08_arrays;

import java.util.Scanner;

public class ArrayScannerMayorPares {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Cantidad de numeros para el array: ");
        int cantidad = scanner.nextInt();


        int[] numeros = new int[cantidad];

        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            numeros[i] = numero;
        }

        int mayorPar = 0;

        for (int numero : numeros) {
            // si hay par, procede para dar aviso o no
            if (numero % 2 == 0) {
                // pregunta si todavía no tenemos ningún par candidato.
                if (!encontrado) {
                    // no se requiere comparar con 0
                    // se convierte en el primer candidato
                    // basta que sea par aunque sea negativo
                    mayorPar = numero;
                    // avisamos a la variable que se encontro un numero par
                    encontrado = true;
                } else if (numero > mayorPar) {
                    // Comparamos los siguientes pares
                    mayorPar = numero;
                }
                
            }
        }

        // Según el estado de encontrado, mostramos el resultado
        // si el aviso sigue ne false ejecuta el else
        if (encontrado) {
            System.out.println("Mayor par: " + mayorPar);
        } else {
            System.out.println("No se detecto numeros pares");
        }
        scanner.close();
    }
}