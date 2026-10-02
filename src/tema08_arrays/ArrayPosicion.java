package tema08_arrays;

public class ArrayPosicion {

    public static void main(String[] args) {

        int[] numeros = {10, 20, 30, 40, 30};

        // los indices validos empiezan desde 0
        // -1 representa posicion no encontrada
        int posicion = -1;

        // en que indice se encuentra este numero
        int buscado = 30;

        for (int i = 0; i < numeros.length; i++) {
            // Si el valor que está en el índice i coincide con el número buscado.
            if (numeros[i] == buscado) {
                // reemplazamos el indice exacto
                posicion = i;
                // Guardamos el índice donde encontramos el número
                break;
            }
        }
        // Resultado a imprimir
        System.out.println("Resultado indice : " + posicion);
    }
}
