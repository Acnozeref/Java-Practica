package tema08_arrays;

import java.util.Scanner;

public class ArrayBidimensionalSumarPares {

    public static void main(String[] args) {

        // Sumar solo los elementos pares (número % 2 == 0).
        // Se comprueba al llenar: si el número recién leído es par,
        // se suma al acumulador.

        Scanner scanner = new Scanner(System.in);

        // Pedir dimensiones
        System.out.print("Cuantas filas: ");
        int filas = scanner.nextInt();

        System.out.print("Cuantas columnas: ");
        int columnas = scanner.nextInt();

        // Crear matriz
        int[][] matriz = new int[filas][columnas];

        // Acumulador de números pares
        int sumaPares = 0;

        // Llenar matriz
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print("Valor [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();

                // Comprobar si el número es par
                if (matriz[i][j] % 2 == 0) {
                    sumaPares += matriz[i][j];
                }
            }
        }

        System.out.println("Suma de pares: " + sumaPares);

        scanner.close();
    }
}