package tema08_arrays;

import java.util.Scanner;

public class ArrayBidimensionalBuscarPosicion {

    public static void main(String[] args) {

        // Como el ejercicio anterior, pero guardando la posición exacta.
        // -1 indica que todavía no se ha encontrado (no existe índice -1),
        // y sirve para mostrar fila y columna al final.

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

        // Posiciones iniciales
        int filaEncontrada = -1;
        int columnaEncontrada = -1;

        // Buscar número
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] == buscar) {

                    filaEncontrada = i;
                    columnaEncontrada = j;

                    break;
                }
            }

            if (filaEncontrada != -1) {
                break;
            }
        }

        // Mostrar resultado
        if (filaEncontrada != -1) {

            System.out.println("Numero encontrado.");
            System.out.println("Fila: " + filaEncontrada);
            System.out.println("Columna: " + columnaEncontrada);

        } else {

            System.out.println("Numero no encontrado.");
        }

        scanner.close();
    }
}