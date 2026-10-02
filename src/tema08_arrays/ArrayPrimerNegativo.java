package tema08_arrays;

public class ArrayPrimerNegativo {

    public static void main(String[] args) {
        // int[] numeros = {10, 25, 30, -8, -15, 40};
        int[] numeros = {10, 25, 30, 40, 50};
        boolean encontrado = false;
        int primerNegativo = 0;

        for (int numero : numeros) {
            if (numero < 0) {
                primerNegativo = numero;
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("Primer numero negativo: " + primerNegativo);
        } else {
            System.out.println("No hay numeros negativos");
        }
    }
}
