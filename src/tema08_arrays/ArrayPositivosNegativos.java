package tema08_arrays;

public class ArrayPositivosNegativos {
    // Práctica: dos contadores en un mismo recorrido.
    public static void main(String[] args) {
        int[] numeros = {-10, 20, -5, 30, -8, 15};
        int positivos = 0;
        int negativos = 0;

        for (int numero : numeros) {
            // si es mayor que 0 es positivo; en caso contrario se cuenta como negativo
            // (ojo: un 0 caería en el else y se contaría como negativo)
            if (numero > 0) {
                positivos++;
            } else {
                negativos++;
            }
        }

        // Resultado: Positivos: 3 / Negativos: 3
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
    }
}
