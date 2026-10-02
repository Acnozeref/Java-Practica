package tema08_arrays;

public class ArrayTamaño {

    public static void main(String[] args) {

        // new int[] / Los corchetes [] indican el tamaño del array
        // les asigna un valor 0 por defecto
        int[] edades = new int[5];

        edades[0] = 10;
        edades[1] = 20;
        edades[2] = 30;
        edades[3] = 40;
        edades[4] = 50;

        for (int i = 0; i < edades.length; i++) {
            System.out.println(edades[i]);
        }

        // 6 espacios con valor 0
        int[] numeros = new int[6];

        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
//        numeros[3] = 4;
//        numeros[4] = 5;
//        numeros[5] = 6;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

    }

}
