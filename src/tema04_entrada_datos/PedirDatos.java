package tema04_entrada_datos;

import java.util.Scanner;

public class PedirDatos {

    public static void main(String[] args) {

        // función para pedir datos al usuario
        Scanner scanner = new Scanner(System.in);

        // next una palabra
        // nextLine toda la linea
        // texto consola
        // variable + scanner(entero)
        System.out.print("Escribe tu edad: ");
        int edad = scanner.nextInt();

        // No siempre se usa
        // Si cuando se necesita usar un nextLine(); despues de nextInt();
        scanner .nextLine(); // Consume el Enter pendiente

        // print misma linea
        // println salto de linea
        // texto consola
        // variable + scanner(String)
        System.out.print("Escribe tu nombre completo: ");
        String nombre = scanner.nextLine();

        System.out.print("Escribe tu altura: ");
        double altura = scanner.nextDouble();

        // boolean
        System.out.print("Eres estudiante? (true/false): ");
        boolean estudiante = scanner.nextBoolean();

        System.out.println("Hola " + nombre);
        System.out.println("Tienes " + edad + " años");
        System.out.println("Altura: " + altura);
        System.out.println("Estudiante: " + estudiante);

        // cerrar scanner al finalizar
        scanner.close();
    }

}
