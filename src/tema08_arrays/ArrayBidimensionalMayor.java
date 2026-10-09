package tema08_arrays;

import java.util.Scanner;

public class ArrayBidimensionalMayor {

    public static void main(String[] args) {

        // Mayor de toda la matriz.
        // Se pide el primer valor como referencia y, mientras se llena el
        // resto, se compara cada número para ver si es mayor.

        Scanner scanner = new Scanner(System.in);

        // Pedir dimensiones
        System.out.print("Cuantas filas: ");
        int filas = scanner.nextInt();

        System.out.print("Cuantas columnas: ");
        int columnas = scanner.nextInt();

        // Crear matriz
        int[][] matriz = new int[filas][columnas];

        // Pedir primer valor para utilizarlo como referencia inicial
        System.out.print("Valor [0][0]: ");
        matriz[0][0] = scanner.nextInt();

        int mayor = matriz[0][0];

        // Llenar el resto de la matriz
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                // Saltar la posición que ya llenamos
                if (i == 0 && j == 0) {
                    continue;
                }

                System.out.print("Valor [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();

                // Comprobar si encontramos un número mayor
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                }
            }
        }

        System.out.println("\nMayor: " + mayor);

        scanner.close();
    }
}