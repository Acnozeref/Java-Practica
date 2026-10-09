package tema08_arrays;

public class ArrayIrregular {

    public static void main(String[] args) {

        // new int[4][] deja las 4 filas sin columnas y cada fila se crea
        // después con su propio tamaño (new int[2], new int[3], ...).

        // tendrá 4 filas pero no sabemos cuantas columnas por fila
        int[][] matriz = new int[4][];

        // cada fila se crea con su propio tamaño de columnas
        matriz[0] = new int[2];
        matriz[1] = new int[3];
        matriz[2] = new int[1];
        matriz[3] = new int[4];

        int contador = 10;

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                matriz[i][j] = contador;
                contador += 10;
            }
        }

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print(matriz[i][j] + " ");
            }

            System.out.println();
        }
    }
}
