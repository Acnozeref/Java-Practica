package tema12_generics;

public class MetodoGenerico {

    public static <T> void mostrarDato(T datos) {
        System.out.println(datos);
    }

    public static void main(String[] args) {

        mostrarDato("Kevin"); // String
        mostrarDato(25);      // Integer
        mostrarDato(1.78);    // Double
    }
}
