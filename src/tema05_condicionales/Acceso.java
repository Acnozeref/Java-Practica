package tema05_condicionales;

import java.util.Scanner;

public class Acceso {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        System.out.println("Tienes identificador?: ");
        boolean identificador = scanner.nextBoolean();

        // se puede simplificar pero se deja si para entender el contexto
        if (edad >= 18 && identificador == true) {
            System.out.println("Acceso permitido");
        } else {
            System.out.println("Acceso denegado");
        }

        scanner.close();
    }
}
