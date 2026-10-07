package tema06_bucles;

public class BucleWhile {

    public static void main(String[] args) {

        // while: repite mientras la condición sea true.
        // La condición se comprueba ANTES de cada vuelta:
        // si desde el inicio es false, el bloque no se ejecuta ni una vez.
        // A diferencia de for, el contador se declara y se actualiza por separado.
        int i = 1;

        while (i <= 5) {
            System.out.println("Numero: " + i);

            // Hay que cambiar la variable dentro del bucle.
            // Si no, la condición nunca sería false y el bucle sería infinito.
            i++;
        }

    }
}
