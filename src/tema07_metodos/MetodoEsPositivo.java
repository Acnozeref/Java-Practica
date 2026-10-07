package tema07_metodos;

// Ejercicio: metodo boolean que devuelve directamente una comparacion.
// El 0 no es positivo, por eso se usa > y no >=.
public class MetodoEsPositivo {

    public static boolean esPositivo(int numero) {
        return numero > 0;
    }

    public static void main(String[] args) {
        // -5 > 0 es false. Salida esperada: Resultado: false
        boolean resultado = esPositivo(-5);

        System.out.println("Resultado: " + resultado);
    }
}
