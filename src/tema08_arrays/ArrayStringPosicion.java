package tema08_arrays;

public class ArrayStringPosicion {
    public static void main(String[] args) {

        // Objetivo: encontrar en qué posición (índice) está un nombre.
        String[] nombres = {
                "Kevin",
                "Ana",
                "Luis",
                "Pedro",
                "Maria"
        };

        String buscar = "Luis";

        boolean encontrado = false;

        // -1 representa que todavía no se ha encontrado
        // (no existe un índice -1, por eso sirve como valor "vacío").
        int posicion = - 1;

        // Se usa for con índice (y no for-each) porque hace falta saber la posición i.
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equals(buscar)) {
                encontrado = true;
                // Se guarda el índice donde se encontró.
                posicion = i;
                break;
            }
        }
        if (encontrado) {
            System.out.println("Nombre encontrado en la posicion: " + posicion); // 2
        } else {
            System.out.println("Nombre no encontrado");
        }
    }
}
