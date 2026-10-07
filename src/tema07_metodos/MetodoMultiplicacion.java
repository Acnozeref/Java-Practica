package tema07_metodos;

// Ejercicio: otro metodo con dos parametros que devuelve un int (practica de parametros + return).
public class MetodoMultiplicacion {

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {

        // Salida esperada: Resultado: 40
        int resultado = multiplicar(8, 5);

        System.out.println("Resultado: " + resultado);
    }
}