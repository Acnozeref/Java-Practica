package tema11_FrameworkCollection;

import java.util.ArrayList;

public class ArrayListPractica {

    public static void main(String[] args) {

        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Kevin");
        nombres.add("Carlos");
        nombres.add("Ana");
        nombres.add("Danna");
        nombres.add("Luis");

        System.out.println(nombres);
        // [Kevin, Carlos, Ana, Danna, Luis]

        // Metodos
            // add() - Agregar elemento
            // remove() - Eliminar un elemento
            // clear() - Vaciar lista.
            // size() - Obtener la cantidad de elementos.
    }
}
