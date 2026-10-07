package tema07_metodos;

// Ejercicio: metodo con tres parametros y varios return dentro de if / else if / else.
// Solo se ejecuta un return: el primero que se alcanza termina el metodo.
public class MetodoMayorDeTres {

    public static int mayor(int numero1, int numero2, int numero3) {

        // comparacion de 3 numeros: se usa >= para que los empates tambien funcionen
        if (numero1 >= numero2 && numero1 >= numero3) {
            return numero1;
        } else if (numero2 >= numero1 && numero2 >= numero3) {
            return numero2;
        } else {
            // Si no ganaron los otros dos, el mayor es numero3.
            return numero3;
        }
    }

    public static void main(String[] args) {

        // El mayor entre 10, 25 y 15 es 25.
        int resultado = mayor(10, 25, 15);

        System.out.println("El numero mayor es: " + resultado);

    }
}
