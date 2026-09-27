package tema07_metodos;

public class MetodoEsPar {

    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    public static void main(String[] args) {

        boolean resultado = esPar(5);

        System.out.println("Es par?: " + resultado);
    }
}