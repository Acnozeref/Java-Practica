package tema05_condicionales;

public class Edad {
    public static void main(String[] args) {

        int edad = 26;

        // else if: encadena varias condiciones.
        // Se evalúan de arriba hacia abajo y solo se ejecuta el primer bloque que se cumpla.
        // Con && se comprueba un rango: la edad debe cumplir las dos condiciones a la vez.
        if (edad >= 0 && edad <= 12) {
            // Entre 0 y 12
            System.out.println("Eres un niño.");
        } else if (edad >= 13 && edad <= 17) {
            // Entre 13 y 17
            System.out.println("Eres un adolescente");
        } else if (edad >= 18) {
            // 18 o más
            System.out.println("Eres mayor de edad");
        } else {
            // else final: se ejecuta si no se cumplió ninguna condición anterior
            // (por ejemplo, una edad negativa).
            System.out.println("Acción invalida");
        }

    }
}
