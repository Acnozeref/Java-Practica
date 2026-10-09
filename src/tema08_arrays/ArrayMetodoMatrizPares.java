package tema08_arrays;

public class ArrayMetodoMatrizPares {

    // Matriz + filtro + return: contar los pares de una matriz recibida por parámetro.
    // El contador y la comprobación van dentro del método, no en el main.
    public static int contarPares(int[][] matriz) {

        // Contador: sube 1 en cada elemento par (número % 2 == 0).
        int contador = 0;

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] % 2 == 0) {

                    contador++;
                }
            }
        }
        return contador;
    }

    public static void main(String[] args) {

        int[][] matriz = {
                {10, 15, 20},
                {7, 8, 11},
                {30, 41, 50}
        };

        int resultado = contarPares(matriz);

        System.out.print("Cantidad de pares en la matriz: " + resultado); // 5
    }
}
