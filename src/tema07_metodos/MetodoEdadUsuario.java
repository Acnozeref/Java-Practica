package tema07_metodos;

import java.util.Scanner;

// Ejercicio: pasar a un metodo un dato leido con Scanner.
public class MetodoEdadUsuario {
    // recibe como argumento un int
    public static int calcularEdad(int nacimiento) {
        // retorna el resultado dado el int insertado
        return 2026 - nacimiento;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserta tu año de nacimiento: ");
        // El valor leido se usa como argumento del metodo.
        int nacimiento = scanner.nextInt();

        // Ejemplo: si escribes 2000, edad vale 26.
        int edad = calcularEdad(nacimiento);

        System.out.println("Tu edad es: " + edad);

        scanner.close();

    }

}

