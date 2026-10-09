package tema08_arrays;

import java.util.Scanner;

public class ArrayBidimensionalMayorFilas {

    public static void main(String[] args) {

        // Mayor de cada fila, mostrado fila por fila.
        // Se reinicia el mayor provisional al empezar cada fila y el bucle
        // de columnas empieza en 1, porque el elemento 0 ya es el inicial.

        Scanner scanner = new Scanner(System.in);

        // Pedir dimensiones
        System.out.print("Cuantas filas: ");
        int filas = scanner.nextInt();

        System.out.print("Cuantas columnas: ");
        int columnas = scanner.nextInt();

        // Crear matriz
        int[][] matriz = new int[filas][columnas];

        // Llenar matriz
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print("Valor [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Recorrer cada fila
        for (int i = 0; i < matriz.length; i++) {

            // Primer elemento como mayor inicial
            int mayor = matriz[i][0];

            for (int j = 1; j < matriz[i].length; j++) {

                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                }
            }

            System.out.println("Mayor fila " + i + ": " + mayor);
        }

        scanner.close();
    }
}