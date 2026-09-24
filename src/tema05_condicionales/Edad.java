package tema05_condicionales;

public class Edad {
    public static void main(String[] args) {

        int edad = 26;

        if (edad >= 0 && edad <= 12) {
            // Está entre 0 y 12
            System.out.println("Eres un niño.");
        } else if (edad >= 13 && edad <= 17) {
            // Está entre 13 y 17
            System.out.println("Eres un adolescente");
            // 18 o más
        } else if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            // Sí no está dentro de una acción registrada
            System.out.println("Acción invalida");
        }

    }
}
