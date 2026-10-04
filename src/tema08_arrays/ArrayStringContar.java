package tema08_arrays;

public class ArrayStringContar {
    public static void main(String[] args) {

        String[] nombres = {
                "Kevin",
                "Ana",
                "Luis",
                "Kevin",
                "Pedro",
                "Kevin"
        };

        String buscar = "Kevin";

        int contador = 0;

        for (String nombre : nombres) {
            if (nombre.equals(buscar)) {
                contador++;
            }
        }
        System.out.println("El nombre aparece " + contador + " veces");
    }
}