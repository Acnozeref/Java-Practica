package tema05_condicionales;

import java.util.Scanner;

public class VerificarEdad {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        // if / else: ejecuta un bloque u otro según la condición.
        // Si la condición es true entra al if; si es false, entra al else.
        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }

        scanner.close();
    }
}
