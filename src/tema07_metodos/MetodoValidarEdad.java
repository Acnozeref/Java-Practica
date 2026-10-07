package tema07_metodos;

// Ejercicio: metodo void que decide y muestra un mensaje con if/else en vez de devolver un valor.
public class MetodoValidarEdad {

    // este metodo no pide retornar un tipo especifico
    // por lo tanto usamos void
    public static void validarEdad(int edad) {

        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }

    }

    public static void main (String[] args) {

        // 15 < 18. Salida esperada: Eres menor de edad
        validarEdad(15);

    }

}
