package tema08_arrays;

import java.util.Scanner;

public class ArrayBidimensionalSuma {

    public static void main(String[] args) {

        // Sumar todos los elementos de una matriz que pide el usuario.
        // El acumulador se incrementa mientras se llena la matriz.
        // Al final se imprime la matriz y la suma total.

        Scanner scanner = new Scanner(System.in);

        // Pedir dimensiones
        System.out.print("Cuantas filas: ");
        int filas = scanner.nextInt();

        System.out.print("Cuantas columnas: ");
        int columnas = scanner.nextInt();

        // Crear matriz según las dimensiones indicadas
        int[][] matriz = new int[filas][columnas];

        // Variable acumuladora para la suma
        int suma = 0;

        // Llenar matriz
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print("Valor [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();

                // Sumar cada elemento
                suma += matriz[i][j];
            }
        }

        // Mostrar matriz
        System.out.println("\nMatriz:");

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print(matriz[i][j] + " ");
            }

            System.out.println();
        }

        // Mostrar suma total
        System.out.println("Suma: " + suma);

        scanner.close();
    }
}