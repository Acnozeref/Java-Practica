package tema04_entrada_datos;

import java.util.Scanner;

public class PedirDatos {

    public static void main(String[] args) {

        // función para pedir datos al usuario
        Scanner scanner = new Scanner(System.in);

        // print misma linea
        // println salto de linea
        // texto consola
        // variable + scanner(String)
        System.out.print("Escribe tu nombre completo: ");
        String nombre = scanner.nextLine();

        // next una palabra
        // nextLine toda la linea
        // texto consola
        // variable + scanner(entero)
        System.out.print("Escribe tu edad: ");
        int edad = scanner.nextInt();

        System.out.print("Escribe tu altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Hola " + nombre);
        System.out.println("Tienes " + edad + " años");
        System.out.println("Altura: " + altura);

        // cerrar scanner al finalizar
        scanner.close();
    }

}
