package tema08_arrays;

import java.util.Scanner;

public class ArrayBidimensionalPositivosNegativos {

    public static void main(String[] args) {

        // Clasificar los números de la matriz en positivos, negativos y ceros.
        // La comprobación se hace al llenar, con if / else if / else,
        // sin necesidad de recorrer la matriz otra vez.

        Scanner scanner = new Scanner(System.in);

        // Pedir dimensiones
        System.out.print("Cuantas filas: ");
        int filas = scanner.nextInt();

        System.out.print("Cuantas columnas: ");
        int columnas = scanner.nextInt();

        // Crear matriz
        int[][] matriz = new int[filas][columnas];

        // Contadores
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

        // Llenar matriz y clasificar números
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print("Valor [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();

                if (matriz[i][j] > 0) {
                    positivos++;
                } else if (matriz[i][j] < 0) {
                    negativos++;
                } else {
                    ceros++;
                }
            }
        }

        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);

        scanner.close();
    }
}