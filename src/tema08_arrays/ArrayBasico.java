package tema08_arrays;

public class ArrayBasico {

    public static void main(String[] args) {

        // Un array es una colección de varios valores del MISMO tipo
        // guardados juntos bajo un solo nombre.
        // Cada valor ocupa una posición, llamada índice, y los índices empiezan en 0.
        // Sintaxis: tipo[] nombre = {valor1, valor2, ...};
        // Aquí: un array de números int con 5 elementos (índices 0 a 4).
        int[] edades = {10, 20, 30, 40, 50};

        // Para leer un elemento se usa nombre[indice]:
        // System.out.println(edades[2]);   // imprime 30 (el tercer elemento)

        // Para cambiar un elemento se le asigna un valor nuevo a esa posición:
        // edades[2] = 35;
        //System.out.println(edades[2]);


        // Recorrer un array con for:
        // - edades.length devuelve la cantidad de elementos del array (aquí 5).
        // - El contador empieza en 0 (primer índice) y el bucle sigue
        //   mientras el contador sea menor que la longitud, porque
        //   el último índice válido es length - 1.
        // - edad++ suma 1 al contador en cada vuelta.
        for (int edad = 0; edad < edades.length; edad++) {
            // Dentro del bucle se usa el array junto con el contador como índice
            // para obtener cada elemento. Imprime 10, 20, 30, 40 y 50.
            System.out.println(edades[edad]);

        }

        // Los arrays pueden ser de cualquier tipo; este guarda textos (String).
        String[] nombres = {"Kevin", "Ana", "Luis", "Pedro"};

        // Mismo patrón: contador desde 0; condición con length; suma al contador.
        for (int nombre = 0; nombre < nombres.length; nombre++) {
            System.out.println(nombres[nombre]);
        }
    }
}
