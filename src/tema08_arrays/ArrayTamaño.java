package tema08_arrays;

public class ArrayTamaño {

    public static void main(String[] args) {

        // Otra forma de crear un array: indicar solo el tamaño con new.
        // new int[5] reserva 5 espacios (índices 0 a 4).
        // Los corchetes [] del new indican el tamaño del array.
        // Cada espacio empieza con un valor por defecto: 0 en los int.
        int[] edades = new int[5];

        // Después se llena posición por posición.
        edades[0] = 10;
        edades[1] = 20;
        edades[2] = 30;
        edades[3] = 40;
        edades[4] = 50;

        for (int i = 0; i < edades.length; i++) {
            System.out.println(edades[i]); // 10, 20, 30, 40, 50
        }

        // 6 espacios con valor 0
        int[] numeros = new int[6];

        // Solo se llenan las 3 primeras posiciones: las demás conservan el 0.
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
//        numeros[3] = 4;
//        numeros[4] = 5;
//        numeros[5] = 6;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]); // 1, 2, 3, 0, 0, 0
        }

    }

}
