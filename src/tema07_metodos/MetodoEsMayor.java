package tema07_metodos;

// Ejercicio: metodo boolean simplificado.
// La comparacion ya es un boolean, por eso se devuelve directo, sin if/else.
public class MetodoEsMayor {

    public static boolean esMayorDeEdad (int edad) {

        return edad >= 18;
    }

    public static void main(String[] args) {

        // 26 >= 18 es true. Salida esperada: Eres mayor?: true
        boolean resultado = esMayorDeEdad(26);

        System.out.println("Eres mayor?: " + resultado);
    }

}
