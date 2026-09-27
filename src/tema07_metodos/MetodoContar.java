package tema07_metodos;

public class MetodoContar {

    public static int contarHasta(int numero) {

        int contador = 0;

        for (int i = 1; i <= numero; i++) {
            contador++;
            System.out.println("Numero: " + contador);
        }

        return contador;
    }

    public static void main(String[] args) {

        int resultado = contarHasta(10);

        System.out.println("Cantidad: " + resultado);
    }
}