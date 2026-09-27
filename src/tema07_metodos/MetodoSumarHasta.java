package tema07_metodos;

public class MetodoSumarHasta {

    public static int sumarNumero(int numero) {

        int suma = 0;

        for (int i = 1; i <= numero; i++) {

            suma += i;

            System.out.println("Suma: " + suma);
        }

        return suma;
    }

    public static void main(String[] args) {

        int resultado = sumarNumero(5);

        System.out.println("Total: " + resultado);
    }
}