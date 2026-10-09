package tema08_arrays;

import java.util.Scanner;

public class ArrayBidimensionalSumaFilas {

    public static void main(String[] args) {

        // Suma de cada fila por separado.
        // Clave: el acumulador se reinicia a 0 al empezar cada fila,
        // por eso se declara dentro del bucle de filas.

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

            // Reiniciar suma para cada fila
            int suma = 0;

            for (int j = 0; j < matriz[i].length; j++) {

                suma += matriz[i][j];
            }

            System.out.println("Suma fila " + i + ": " + suma);
        }

        scanner.close();
    }
}