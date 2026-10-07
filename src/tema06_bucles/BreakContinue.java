package tema06_bucles;

// Ejercicio de continue y break:
// sirven para controlar el flujo de un bucle desde dentro.
public class BreakContinue {

    public static void main(String[] args) {

        // continue: salta el resto de la vuelta actual y pasa a la siguiente.
        // Aquí se salta el número 5 (se imprime 1, 2, 3, 4, 6, 7, 8, 9, 10).
        for (int i = 1; i <= 10; i++) {

            if (i == 5) {
                continue;
            }

            System.out.println(i);
        }

        // break: termina el bucle por completo.
        // Aquí se detiene cuando i llega a 7 (se imprime 1, 2, 3, 4, 5, 6).
        for (int i = 1; i <= 10; i++) {

            if (i == 7) {
                break;
            }

            System.out.println(i);
        }

    }
}
