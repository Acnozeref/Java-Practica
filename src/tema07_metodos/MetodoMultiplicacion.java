package tema07_metodos;

public class MetodoMultiplicacion {

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {

        int resultado = multiplicar(8, 5);

        System.out.println("Resultado: " + resultado);
    }
}