package tema05_condicionales;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una opción: ");
        String opcion = scanner.nextLine();

        // switch en caso de haber varias opciones.
        switch (opcion) {
            case "crear":
                System.out.println("Creando usuario...");
                break;

            case "consultar":
                System.out.println("Consultando usuario...");
                break;

            case "salir":
                System.out.println("Saliendo...");
                break;

            default:
                System.out.println("Opción no válida");


        }
        // cerrarlo fuera del flujo swicht
        // recordar cerrar scanner
        scanner.close();
    }
}
