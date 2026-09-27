package tema07_metodos;

import java.util.Scanner;

public class MetodoEdadUsuario {
    // recibe como argumento un int
    public static int calcularEdad(int nacimiento) {
        // retorna el resultado dado el int insertado
        return 2026 - nacimiento;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserta tu año de nacimiento: ");
        int nacimiento = scanner.nextInt();

        int edad = calcularEdad(nacimiento);

        System.out.println("Tu edad es: " + edad);

        scanner.close();

    }

}

