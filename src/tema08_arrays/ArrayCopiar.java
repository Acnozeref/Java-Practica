package tema08_arrays;

public class ArrayCopiar {
    // Concepto: copiar un array es crear otro array del mismo tamaño
    // y pasar los valores uno a uno, de un índice a otro.
    // Aquí además la copia se hace en orden inverso (el último pasa a ser el primero).
    public static void main(String[] args) {
        int[] original = {10, 20, 30, 40, 50};
        // int[] copia = new int[3];
        // new int[n] crea un array vacío de n posiciones (por defecto, ceros).
        // Debe tener el mismo tamaño que el original para que quepan todos los valores.
        int[] copia = new int[5];

        // la condición del recorrido usa el tamaño del original
        for (int i = 0; i < original.length; i++) {
            // aquí copiaremos el elemento
            // cada índice de copia será igual a cada índice de original
            // obtenemos el índice del original en orden inverso:
            // length - 1 es el último índice y al restarle i vamos retrocediendo
            copia[i] = original[original.length - 1 - i];
        }
        // comprobamos que sí se copiaron los valores recorriendo la copia
        for (int i = 0; i < copia.length; i++) {
            // Resultado: 50, 40, 30, 20, 10
            System.out.println("Comprobacion de copia: " + copia[i]);
        }
    }
}
