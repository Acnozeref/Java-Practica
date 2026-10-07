package tema08_arrays;

public class ArrayStringContar {
    public static void main(String[] args) {

        // Objetivo: contar cuántas veces aparece un nombre en el array.
        String[] nombres = {
                "Kevin",
                "Ana",
                "Luis",
                "Kevin",
                "Pedro",
                "Kevin"
        };

        String buscar = "Kevin";

        // Contador: sube 1 cada vez que hay una coincidencia.
        int contador = 0;

        // Aquí NO hay break: se recorre todo el array para contar todas las coincidencias.
        for (String nombre : nombres) {
            if (nombre.equals(buscar)) {
                contador++;
            }
        }
        System.out.println("El nombre aparece " + contador + " veces"); // 3
    }
}
