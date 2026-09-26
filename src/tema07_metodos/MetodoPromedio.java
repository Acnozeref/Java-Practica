package tema07_metodos;

public class MetodoPromedio {

    public static double promedio(double numero1, double numero2) {
        // usar () para evitar calcular de manera literal
        // sin () 20
        // con () 15.00 resultado esperado
        return (numero1 + numero2) / 2;
    }

    public static void main(String[] args) {

        double resultado = promedio(10, 20);

        System.out.println("Promedio: " + resultado);
    }

}
