package tema08_arrays;

public class ArrayBasico {

    public static void main(String[] args) {

        // Voy a crear un array de números int
        int[] edades = {10, 20, 30, 40, 50};

        // impresion por indices
        // System.out.println(edades[2]);

        // edades[2] = 35;
        //System.out.println(edades[2]);


        // int edad = 0 / contador inicial
        // edades.length / devuelve la longitud del array
            // el bucle para hasta que el contador coincida
            // con la longitud del array.
        // edad++ suma 1 por 1 al contador.
        for (int edad = 0; edad < edades.length; edad++) {
            // en Java para imprimir bucles
            // se usa el array y el indice
            System.out.println(edades[edad]);

        }

        String[] nombres = {"Kevin", "Ana", "Luis", "Pedro"};

        // contador; longitud; suma contador
        for (int nombre = 0; nombre < nombres.length; nombre++) {
            System.out.println(nombres[nombre]);
        }
    }
}
