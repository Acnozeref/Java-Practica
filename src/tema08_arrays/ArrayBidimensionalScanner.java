package tema08_arrays;

import java.util.Scanner;

public class ArrayBidimensionalScanner {

    public static void main(String[] args) {

        // Matriz con dimensiones y valores que introduce el usuario (Scanner).
        // Es la base de los ejercicios de matrices interactivos: pedir filas,
        // pedir columnas, crear con new y llenar con dos bucles anidados.

        Scanner scanner = new Scanner(System.in);

        // Pedir dimensiones
        System.out.print("Cuantas filas: ");
        int filas = scanner.nextInt();

        System.out.print("Cuantas columnas: ");
        int columnas = scanner.nextInt();

        // Crear matriz
        int[][] matriz = new int[filas][columnas];

        // llenar matriz
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++ ) {

                // Mostrar posición actual
                System.out.print("Valor [" + i + "][" + j + "]: ");
                // Pedir el número y almacenarlo
                matriz[i][j] = scanner.nextInt();

            }
        }

        // Mostrar matriz
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print(matriz[i][j] + " ");
            }

            System.out.println();
        }
        scanner.close();
    }
}
