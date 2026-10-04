package tema08_arrays;

public class ArrayStringPosicion {
    public static void main(String[] args) {

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
        int posicion = - 1;

        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equals(buscar)) {
                encontrado = true;
                posicion = i;
                break;
            }
        }
        if (encontrado) {
            System.out.println("Nombre encontrado en la posicion: " + posicion);
        } else {
            System.out.println("Nombre no encontrado");
        }
    }
}