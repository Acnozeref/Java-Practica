package tema08_arrays;

public class ArrayString {
    public static void main(String[] args) {
        // Un array también puede guardar textos: String[] es un array de String.
        // Para comparar String se usa .equals() (compara el contenido del texto).
        // Para números primitivos (int, double...) se usa ==
        String[] nombres = {"Kevin", "Ana", "Luis", "Pedro", "Maria"};

        String buscar = "Luis";

        // Bandera: empieza en false y cambia a true si se encuentra el nombre.
        boolean encontrado = false;

        // for-each: en cada vuelta, nombre toma un elemento del array.
        for (String nombre : nombres) {
            if (nombre.equals(buscar)) {
                encontrado = true;
                // Ya se encontró: no hace falta seguir buscando.
                break;
            }
        }
        System.out.println("Nombre encontrado: " + encontrado); // true
    }
}
