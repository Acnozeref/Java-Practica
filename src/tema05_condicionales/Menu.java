package tema05_condicionales;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Aquí se lee un texto, por eso se usa nextLine().
        System.out.print("Ingresa una opción: ");
        String opcion = scanner.nextLine();

        // switch: compara una variable con varios valores posibles.
        // Es más cómodo que muchos else if cuando todas las opciones
        // dependen de la misma variable (por ejemplo, un menú).
        switch (opcion) {
            // case: cada valor que se quiere comprobar.
            case "crear":
                System.out.println("Creando usuario...");
                // break: sale del switch.
                // Sin break se ejecutarían también los case siguientes.
                break;

            case "consultar":
                System.out.println("Consultando usuario...");
                break;

            case "salir":
                System.out.println("Saliendo...");
                break;

            // default: se ejecuta si ningún case coincide (como el else final).
            default:
                System.out.println("Opción no válida");

        }

        // El Scanner se cierra fuera del switch, al terminar el programa.
        scanner.close();
    }
}
