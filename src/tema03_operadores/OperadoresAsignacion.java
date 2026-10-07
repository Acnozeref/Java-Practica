package tema03_operadores;

public class OperadoresAsignacion {
    public static void main(String[] args) {

        // Operadores de asignación: modifican una variable usando su propio valor.
        // Son una forma corta de escribir un cálculo y volver a guardarlo.
        //  +=   numero += 5   equivale a   numero = numero + 5
        //  -=   resta
        //  *=   multiplica
        //  /=   divide
        //  %=   guarda el resto de la división

        int numero = 10;

        // Cada operación parte del valor que dejó la anterior.
        numero += 5;
        System.out.println(numero); // 15

        numero -= 3;
        System.out.println(numero); // 12

        numero *= 3;
        System.out.println(numero); // 36

        // Al ser un int, la división descarta los decimales.
        numero /= 2;
        System.out.println(numero); // 18

        // 18 entre 4 da 4 y sobran 2.
        numero %= 4;
        System.out.println(numero); // 2

    }
}
