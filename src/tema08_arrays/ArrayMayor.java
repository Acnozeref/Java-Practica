package tema08_arrays;

public class ArrayMayor {
    // Algoritmo: buscar el mayor.
    // Se guarda el primer valor como "mayor hasta ahora" y se compara con el resto;
    // cada vez que aparece uno más grande, lo reemplaza.

    public static void main(String[] args) {

        // objetivo encontrar el numero mayor en el array
        int[] numeros = {15, 8, 42, 23, 10};

        // el número mayor hasta el momento es el del índice 0
        // o mejor visto como valor inicial para recorrer
        int mayor = numeros[0]; // 15

        // índice inicial / condición / siguiente índice
        for (int i = 0; i < numeros.length; i++) {
            // si el número del índice actual es mayor que el mayor guardado
            // recordar: mayor es la variable donde empezamos con el valor del índice 0
            if (numeros[i] > mayor) {
                // actualizamos el valor del índice a la variable
                // El nuevo mayor ahora es este número
                // la idea es reemplazar, no acumular, por eso no usamos +=
                // Idea clave: suma += numero acumula; mayor = numero reemplaza.
                mayor = numeros[i];
            }
        }
        // impresión de resultado.
        // Resultado: Numero mayor: 42
        System.out.println("Numero mayor: " + mayor);

    }

}
