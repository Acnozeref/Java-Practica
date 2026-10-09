package tema08_arrays;

import java.util.Scanner;

public class ArrayBidimensionalContar {

    public static void main(String[] args) {

        // Contar cuántas veces aparece un número en la matriz.
        // Contador que sube 1 en cada coincidencia; aquí NO hay break,
        // porque hay que recorrer toda la matriz para contar todas.

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

        // Pedir número que queremos contar
        System.out.print("Que numero quieres contar: ");
        int buscar = scanner.nextInt();

        // Contador de apariciones
        int contador = 0;

        // Recorrer matriz
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] == buscar) {
                    contador++;
                }
            }
        }

        System.out.println("El numero aparece " + contador + " veces.");

        scanner.close();
    }
}