package tema11_FrameworkCollection;

import java.util.ArrayList;

public class ArrayListEliminar {

    public static void main(String[] args) {

        ArrayList<String> nombres = new ArrayList<>();

            nombres.add("Kevin");
            nombres.add("Carlos");
            nombres.add("Ana");
            nombres.add("Danna");

            // Eliminar por posicion (index: ).
            nombres.remove(0);

            // Eliminar por nombre (object: ).
            nombres.remove("Carlos");

            // Imprimir lista.
            System.out.println(nombres);
            // Imprimir cantidad de elementos.
            System.out.println(nombres.size());
    }
}
