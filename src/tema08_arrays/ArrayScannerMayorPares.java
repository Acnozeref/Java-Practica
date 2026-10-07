package tema08_arrays;

import java.util.Scanner;

public class ArrayScannerMayorPares {
    // Algoritmo: mayor entre los números que cumplen una condición (los pares).
    // Aquí no se puede empezar con numeros[0] porque podría ser impar,
    // por eso se usa una bandera (encontrado) para marcar el primer par.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Cantidad de numeros para el array: ");
        int cantidad = scanner.nextInt();


        int[] numeros = new int[cantidad];

        // bandera: indica si ya apareció algún número par
        boolean encontrado = false;

        // llenado del array con datos del usuario
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            numeros[i] = numero;
        }

        // este 0 es solo un valor de arranque; su valor real lo decide el primer par
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
                    // avisamos a la variable que se encontró un número par
                    encontrado = true;
                } else if (numero > mayorPar) {
                    // Comparamos los siguientes pares
                    mayorPar = numero;
                }
                
            }
        }

        // Según el estado de encontrado, mostramos el resultado
        // si el aviso sigue en false ejecuta el else
        if (encontrado) {
            System.out.println("Mayor par: " + mayorPar);
        } else {
            System.out.println("No se detecto numeros pares");
        }
        scanner.close();
    }
}
