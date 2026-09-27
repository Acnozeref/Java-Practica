package tema07_metodos;

public class MetodoSignoNumero {

    public static String signo(int numero) {

        if (numero > 0) {
            return "positivo";
        } else if (numero < 0) {
            return "negativo";
        } else {
            return "es cero";
        }

    }

    public static void main(String[] args) {

        String resultado = signo(0);

        System.out.println("Numero " + resultado);

    }

}
