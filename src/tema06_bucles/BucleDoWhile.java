package tema06_bucles;

public class BucleDoWhile {

    public static void main(String[] args) {

        int i = 1;

        // do while: primero ejecuta el bloque y después comprueba la condición.
        // Por eso el código se ejecuta siempre al menos una vez,
        // incluso si la condición fuera false desde el inicio.
        // Se diferencia de while, que comprueba la condición antes.
        do {
            System.out.println("Número: " + i);
            i++;
        } while (i <= 5); // Este ; final es obligatorio.

    }
}
