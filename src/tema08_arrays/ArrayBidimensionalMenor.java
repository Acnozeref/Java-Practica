package tema08_arrays;

import java.util.Scanner;

public class ArrayBidimensionalMenor {

    public static void main(String[] args) {

        // Menor de toda la matriz.
        // Mismo planteamiento que el mayor, pero comparando con <:
        // el primer valor es el menor provisional.

        Scanner scanner = new Scanner(System.in);

        // Pedir dimensiones
        System.out.print("Cuantas filas: ");
        int filas = scanner.nextInt();

        System.out.print("Cuantas columnas: ");
        int columnas = scanner.nextInt();

        // Crear matriz
        int[][] matriz = new int[filas][columnas];

        // Pedir primer valor
        System.out.print("Valor [0][0]: ");
        matriz[0][0] = scanner.nextInt();

        // Usar el primer valor como menor inicial
        int menor = matriz[0][0];

        // Llenar el resto de la matriz
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                // Evitar pedir nuevamente [0][0]
                if (i == 0 && j == 0) {
                    continue;
                }

                System.out.print("Valor [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();

                // Comprobar si encontramos un número menor
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }

        System.out.println("\nMenor: " + menor);

        scanner.close();
    }
}