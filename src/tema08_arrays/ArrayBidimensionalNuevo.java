package tema08_arrays;

public class ArrayBidimensionalNuevo {

    public static void main(String[] args) {

        // Crear una matriz con new a partir de las variables filas y columnas.
        // new int[filas][columnas] deja todos los valores en 0 por defecto;
        // aquí se rellena automáticamente con un contador que sube en cada posición.

//        int fila = 3;
//        int columnas = 4;

        int filas = 4;
        int columnas = 5;

        // creacion de matriz en base a la variables
        int[][] matriz = new int[filas][columnas];

        // impresion de fila y columnas por defecto 0
        System.out.println("Filas: " + matriz.length);
        System.out.println("Columnas: " + matriz[0].length);

        // llenarla manualmente
//        matriz[0][0] = 10;
//        matriz[0][1] = 20;
//        matriz[0][2] = 30;
//        matriz[0][3] = 40;
//
//        matriz[1][0] = 50;
//        matriz[1][1] = 60;
//        matriz[1][2] = 70;
//        matriz[1][3] = 80;
//
//        matriz[2][0] = 90;
//        matriz[2][1] = 100;
//        matriz[2][2] = 110;
//        matriz[2][3] = 120;

        // impresion de matriz manual
//        for (int i = 0; i < matriz.length; i++) {
//
//            for (int j = 0; j < matriz[i].length; j++) {
//                // evita salto de linea y separacion de numeros en cada iteracion
//                System.out.print(matriz[i][j] + " ");
//            }
//            // cada fila lanza un salto
//            System.out.println();
//        }

        // llenarlas automaticamente
        int numero = 1;

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                // recorrido de numeros, fila 0 columnas 0 se le asigna 1
                matriz[i][j] = numero;
                // cada iteracion de columnas y fila se agraga uno al contador hasta finalizar.
                numero++;
            }
        }

        // impresion de matriz
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print(matriz[i][j] + " ");
            }
            // salto de linea
            System.out.println();
        }
    }
}
