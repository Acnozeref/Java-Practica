package tema07_metodos;

public class MetodoMayorDeTres {

    public static int mayor(int numero1, int numero2, int numero3) {

        // comparacion de 3 numeros
        if (numero1 >= numero2 && numero1 >= numero3) {
            return numero1;
        } else if (numero2 >= numero1 && numero2 >= numero3) {
            return numero2;
        } else {
            return numero3;
        }
    }

    public static void main(String[] args) {

        int resultado = mayor(10, 25, 15);

        System.out.println("El numero mayor es: " + resultado);

    }
}
