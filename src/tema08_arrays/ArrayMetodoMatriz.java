package tema08_arrays;

public class ArrayMetodoMatriz {

    // Pasar una matriz a un método como parámetro (int[][] matriz).
    // Dentro del método se recorre con los mismos dos bucles anidados
    // que en el main y se devuelve la suma con return.
    public static int sumarMatriz(int[][] matriz) {

        // Acumulador: empieza en 0 y suma cada elemento de la matriz.
        int suma = 0;

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                suma += matriz[i][j];
            }
        }

        // Devuelve el resultado al que llamó al método.
        return suma;
    }

    public static void main(String[] args) {

        int[][] matriz = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        // El argumento es la matriz; el método devuelve la suma.
        int resultado = sumarMatriz(matriz);

        System.out.println("La suma es: " + resultado); // 450
    }
}
