package tema08_arrays;

import java.util.Scanner;

public class ArrayBidimensionalMenorColumnas {

    public static void main(String[] args) {

        // Menor de cada columna.
        // Se invierte el orden de los bucles: el de fuera recorre las
        // columnas y el de dentro empieza en la fila 1 (la 0 ya es el inicial).

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

        // Recorrer cada columna
        for (int j = 0; j < matriz[0].length; j++) {

            // Primer elemento de la columna como menor inicial
            int menor = matriz[0][j];

            for (int i = 1; i < matriz.length; i++) {

                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }

            System.out.println("Menor columna " + j + ": " + menor);
        }

        scanner.close();
    }
}