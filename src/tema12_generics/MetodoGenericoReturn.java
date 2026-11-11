package tema12_generics;

public class MetodoGenericoReturn {
    // Metodo generico que retornar el mismo dato.
    public static <T> T retornar(T dato) {
        return dato;
    }

    public static void main(String[] args) {

        String texto = retornar("Hola Java");
        Integer numero = retornar(25);
        Double decimal = retornar(1.78);

        System.out.println(texto);
        System.out.println(numero);
        System.out.println(decimal);
    }
}
