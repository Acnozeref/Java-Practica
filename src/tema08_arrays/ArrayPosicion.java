package tema08_arrays;

public class ArrayPosicion {
    // Algoritmo: búsqueda de la posición (índice) de un valor.
    // Se recorre con for clásico porque necesitamos el índice, no solo el valor.
    // Se usa un valor "centinela" (-1) para saber si no se encontró.

    public static void main(String[] args) {

        int[] numeros = {10, 20, 30, 40, 30};

        // los índices válidos empiezan desde 0
        // -1 representa posición no encontrada
        int posicion = -1;

        // en qué índice se encuentra este número
        int buscado = 30;

        for (int i = 0; i < numeros.length; i++) {
            // Si el valor que está en el índice i coincide con el número buscado.
            if (numeros[i] == buscado) {
                // reemplazamos por el índice exacto
                posicion = i;
                // Guardamos el índice donde encontramos el número
                // break detiene el bucle: nos quedamos con la primera coincidencia
                break;
            }
        }
        // Resultado a imprimir
        // Resultado: Resultado indice : 2
        System.out.println("Resultado indice : " + posicion);
    }
}
