package tema08_arrays;

import java.util.Scanner;

public class ArrayBidimensionalPromedio {

    public static void main(String[] args) {

        // Promedio de todos los elementos: suma / cantidad.
        // La cantidad es filas * columnas y (double) evita que la división
        // entre enteros pierda los decimales.

        Scanner scanner = new Scanner(System.in);

        // Pedir dimensiones
        System.out.print("Cuantas filas: ");
        int filas = scanner.nextInt();

        System.out.print("Cuantas columnas: ");
        int columnas = scanner.nextInt();

        // Crear matriz
        int[][] matriz = new int[filas][columnas];

        // Variable acumuladora
        int suma = 0;

        // Llenar matriz y sumar sus elementos
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print("Valor [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();

                suma += matriz[i][j];
            }
        }

        // Calcular cantidad total de elementos
        int cantidad = filas * columnas;

        // Convertir a double para obtener un promedio decimal
        double promedio = (double) suma / cantidad;

        System.out.println("\nPromedio: " + promedio);

        scanner.close();
    }
}