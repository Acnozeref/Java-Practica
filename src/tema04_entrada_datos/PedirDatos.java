package tema04_entrada_datos;

// import: permite usar una clase que está en otro paquete de Java.
// Scanner está en java.util y sirve para leer datos que escribe el usuario.
import java.util.Scanner;

public class PedirDatos {

    public static void main(String[] args) {

        // Se crea un Scanner que lee desde el teclado (System.in).
        // Con esta variable se pide cada dato al usuario.
        Scanner scanner = new Scanner(System.in);

        // Cada tipo de dato tiene su método:
        //  nextInt()      número entero
        //  nextDouble()   número decimal
        //  nextBoolean()  true o false
        //  next()         una sola palabra
        //  nextLine()     toda la línea (con espacios)

        // print deja el cursor en la misma línea (println salta de línea).
        // Así el usuario escribe justo después del mensaje.
        // El valor leído se guarda en una variable del mismo tipo.
        System.out.print("Escribe tu edad: ");
        int edad = scanner.nextInt();

        // nextInt() no consume el Enter que el usuario pulsó.
        // Si ahora se usara nextLine(), leería esa línea vacía.
        // Por eso se llama a nextLine() una vez para limpiar el Enter pendiente.
        // Solo hace falta cuando se usa nextLine() después de nextInt(), nextDouble() o nextBoolean().
        scanner.nextLine(); // Consume el Enter pendiente

        // nextLine() lee el nombre completo, aunque tenga espacios.
        System.out.print("Escribe tu nombre completo: ");
        String nombre = scanner.nextLine();

        // nextDouble() lee un decimal.
        System.out.print("Escribe tu altura: ");
        double altura = scanner.nextDouble();

        // nextBoolean() solo acepta true o false.
        System.out.print("Eres estudiante? (true/false): ");
        boolean estudiante = scanner.nextBoolean();

        // El operador + une (concatena) texto con variables.
        System.out.println("Hola " + nombre);
        System.out.println("Tienes " + edad + " años");
        System.out.println("Altura: " + altura);
        System.out.println("Estudiante: " + estudiante);

        // Se cierra el Scanner al terminar de usarlo para liberar el recurso.
        scanner.close();
    }

}
