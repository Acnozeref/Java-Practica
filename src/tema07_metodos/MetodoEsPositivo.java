package tema07_metodos;

public class MetodoEsPositivo {

    public static boolean esPositivo(int numero) {
        return numero > 0;
    }

    public static void main(String[] args) {
        boolean resultado = esPositivo(-5);

        System.out.println("Resultado: " + resultado);
    }
}
