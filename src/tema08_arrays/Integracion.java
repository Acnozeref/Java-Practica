package tema08_arrays;

import java.util.Scanner;
import java.util.Arrays;
// NOTA: a diferencia de Python, no importa si los métodos van abajo
// y el main se encuentra arriba; ambos órdenes funcionan igual.
// Ejercicio integrador: pedir la matriz con Scanner y analizarla con métodos propios.
public class Integracion {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 2. Pedir filas y columnas
        System.out.print("Cuantas filas: ");
        int filas = scanner.nextInt();

        System.out.print("Cuantas columnas: ");
        int columnas = scanner.nextInt();

        // 3. Crear matriz
        int[][] matriz = new int[filas][columnas];

        // 4. Llenar matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Valor [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Pedir número para la función buscar()
        System.out.print("\nIngrese un numero a buscar en la matriz: ");
        int buscado = scanner.nextInt();

        // 9. Mostrar resultados invocando las funciones
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Matriz: " + Arrays.deepToString(matriz));
        System.out.println("Suma total: " + sumar(matriz));
        System.out.println("Valor mayor: " + mayor(matriz));
        System.out.println("Cantidad de numeros pares: " + contarPares(matriz));

        if (buscar(matriz, buscado)) {
            System.out.println("El numero " + buscado + " SI se encuentra en la matriz.");
        } else {
            System.out.println("El numero " + buscado + " NO se encuentra en la matriz.");
        }

        scanner.close();
    }

    // 5. Crear sumar()
    public static int sumar(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }
        return suma;
    }

    // 6. Crear mayor()
    public static int mayor(int[][] matriz) {
        int mayor = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                }
            }
        }
        return mayor;
    }

    // 7. Crear contarPares()
    public static int contarPares(int[][] matriz) {
        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    contador++;
                }
            }
        }
        return contador;
    }

    // 8. Crear buscar()
    // Devuelve boolean: return true corta el método en cuanto aparece el número,
    // y si se recorre toda la matriz sin encontrarlo, devuelve false al final.
    public static boolean buscar(int[][] matriz, int buscado) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == buscado) {
                    return true;
                }
            }
        }
        return false;
    }
}