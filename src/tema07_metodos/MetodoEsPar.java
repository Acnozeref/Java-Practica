package tema07_metodos;

// Ejercicio: metodo boolean que devuelve directamente una condicion.
// Un numero es par si el residuo (%) de dividirlo entre 2 es 0.
public class MetodoEsPar {

    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    public static void main(String[] args) {

        // 5 % 2 es 1, asi que da false. Salida esperada: Es par?: false
        boolean resultado = esPar(5);

        System.out.println("Es par?: " + resultado);
    }
}