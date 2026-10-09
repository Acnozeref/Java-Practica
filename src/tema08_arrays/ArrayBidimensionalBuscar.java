package tema08_arrays;

import java.util.Scanner;

public class ArrayBidimensionalBuscar {

    public static void main(String[] args) {

        // Buscar un número en la matriz con una bandera boolean.
        // El break interno solo sale del bucle de columnas; por eso,
        // después se comprueba la bandera para salir también del de filas.

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

        // Pedir número a buscar
        System.out.print("Que numero buscas: ");
        int buscar = scanner.nextInt();

        // Variable para saber si encontramos el número
        boolean encontrado = false;

        // Buscar en toda la matriz
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] == buscar) {
                    encontrado = true;
                    break;
                }
            }

            if (encontrado) {
                break;
            }
        }

        // Mostrar resultado
        if (encontrado) {
            System.out.println("Numero encontrado.");
        } else {
            System.out.println("Numero no encontrado.");
        }

        scanner.close();
    }
}