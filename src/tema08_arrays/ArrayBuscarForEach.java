package tema08_arrays;

public class ArrayBuscarForEach {
    public static void main(String[] args) {
        // Búsqueda con for-each: se recorre el array y se marca con un
        // boolean (bandera) si el valor aparece.
        // For-each: for (tipo variable : array) -> en cada vuelta, "numero"
        // toma el valor de un elemento, sin usar índices.
        int[] numeros = {10, 20, 30, 40, 50};
        int buscado = 99;
        // Empieza en false: "todavía no lo encontré".
        boolean encontrado = false;

        for (int numero : numeros) {
            if (numero == buscado) {
                encontrado = true;
                // break sale del bucle: no hace falta seguir buscando
                // si ya se encontró.
                break;
            }
        }
        // Prueba con buscado = 30 -> true
        // Con buscado = 99 -> false
        System.out.println("Encontrado: " + encontrado);
    }
}
