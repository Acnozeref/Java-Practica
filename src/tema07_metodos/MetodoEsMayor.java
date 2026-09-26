package tema07_metodos;

public class MetodoEsMayor {

    public static boolean esMayorDeEdad (int edad) {

        return edad >= 18;
    }

    public static void main(String[] args) {

        boolean resultado = esMayorDeEdad(26);

        System.out.println("Eres mayor?: " + resultado);
    }

}
