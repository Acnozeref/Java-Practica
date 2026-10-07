package tema07_metodos;

// Ejercicio: devolver el resultado de una comparacion directamente.
public class MetodoComparacion {

    // metodo que devuelve un boolean si numero1 es mayor a numero2
    // no hace falta usar if si el resultado es correcto devuelve true.
    public static boolean esMayor(int numero1, int numero2) {

        return numero1 > numero2;

    }

    public static void main(String[] args) {

        // guardamos resultado en una variable (15 > 30 es false)
        boolean resultado = esMayor(15, 30);

        // llamamos el resultado en un print
        // Salida esperada: Es mayor?: false
        System.out.println("Es mayor?: " + resultado);

    }

}
