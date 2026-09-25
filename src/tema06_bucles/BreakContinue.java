package tema06_bucles;

// Ejercicio de continue y break.
public class BreakContinue {

    public static void main(String[] args) {

        // continue: salta el número 5
        for (int i = 1; i <= 10; i++) {

            if (i == 5) {
                continue;
            }

            System.out.println(i);
        }

        // break: detiene el bucle cuando i llega a 7
        for (int i = 1; i <= 10; i++) {

            if (i == 7) {
                break;
            }

            System.out.println(i);
        }

    }
}