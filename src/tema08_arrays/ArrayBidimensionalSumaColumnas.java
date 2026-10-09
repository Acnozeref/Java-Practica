package tema08_arrays;

import java.util.Scanner;

public class ArrayBidimensionalSumaColumnas {

    public static void main(String[] args) {

        // Suma de cada columna por separado.
        // Clave: se invierte el orden de los bucles (el de fuera recorre las
        // columnas) y el acumulador se reinicia a 0 en cada columna.

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

        // Recorrer columnas
        for (int j = 0; j < matriz[0].length; j++) {

            // Reiniciar suma para cada columna
            int suma = 0;

            for (int i = 0; i < matriz.length; i++) {

                suma += matriz[i][j];
            }

            System.out.println("Suma columna " + j + ": " + suma);
        }

        scanner.close();
    }
}