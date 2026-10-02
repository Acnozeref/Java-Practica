package tema08_arrays;

public class ArrayPositivosNegativos {
    public static void main(String[] args) {
        int[] numeros = {-10, 20, -5, 30, -8, 15};
        int positivos = 0;
        int negativos = 0;

        for (int numero : numeros) {
            if (numero > 0) {
                positivos++;
            } else {
                negativos++;
            }
        }

        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
    }
}
