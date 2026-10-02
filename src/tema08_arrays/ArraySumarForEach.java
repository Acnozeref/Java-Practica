package tema08_arrays;

public class ArraySumarForEach {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};
        int suma = 0;

        for (int numero: numeros) {
            suma += numero;
        }
        System.out.println("Suma: " + suma);
    }
}
