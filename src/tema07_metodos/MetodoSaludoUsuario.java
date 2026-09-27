package tema07_metodos;

import java.util.Scanner;

public class MetodoSaludoUsuario {

    // recibe como argumento un string
    public static void saludar(String nombre) {
        // imprimir saludo
        // se espera una varible como string
        System.out.println("Hola," + nombre);
    }

    // zona de llamado de codigo
    public static void main(String[] args) {

        // inicia scanner
        Scanner scanner = new Scanner(System.in);

        // pedir nombre
        // capturamos una variable string que se ocupara como argumento
        System.out.println("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        // llamar al método
        // insertamos la variable string como argumetno llamando a la variable
        saludar(nombre);

        // cierra scanner
        scanner.close();
    }
}
