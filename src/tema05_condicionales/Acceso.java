package tema05_condicionales;

import java.util.Scanner;

public class Acceso {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        System.out.println("Tienes identificador?: ");
        boolean identificador = scanner.nextBoolean();

        // Con && deben cumplirse las dos condiciones para entrar al if.
        // Se puede simplificar a: edad >= 18 && identificador
        // (un boolean ya es true o false, no hace falta compararlo con == true).
        // Se deja completo para entender mejor el contexto.
        if (edad >= 18 && identificador == true) {
            System.out.println("Acceso permitido");
        } else {
            System.out.println("Acceso denegado");
        }

        scanner.close();
    }
}
