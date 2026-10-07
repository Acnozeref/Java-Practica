package tema03_operadores;

public class Operaciones {
    public static void main(String[] args) {

        // Operadores aritméticos: sirven para hacer cálculos.
        //  +  suma
        //  -  resta
        //  *  multiplicación
        //  /  división
        //  %  módulo (resto de la división)

        int numero1 = 20;
        int numero2 = 6;

        System.out.println(numero1 + numero2); // 26
        System.out.println(numero1 - numero2); // 14
        System.out.println(numero1 * numero2); // 120

        // Con dos int, la división da un entero: 20 / 6 = 3 (se descartan los decimales).
        System.out.println(numero1 / numero2); // 3

        // 20 entre 6 da 3 y sobran 2, ese sobrante es el resto.
        System.out.println(numero1 % numero2); // 2

    }
}
