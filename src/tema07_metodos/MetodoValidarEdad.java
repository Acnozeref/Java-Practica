package tema07_metodos;

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

        validarEdad(15);

    }

}
