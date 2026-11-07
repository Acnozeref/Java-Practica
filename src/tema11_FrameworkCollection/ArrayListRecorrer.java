package tema11_FrameworkCollection;

import java.util.ArrayList;

public class ArrayListRecorrer {

    public static void main(String[] args) {

        ArrayList<String> nombres = new ArrayList<>();

            nombres.add("Kevin");
            nombres.add("Carlos");
            nombres.add("Ana");
            nombres.add("Danna");
            nombres.add("Luis");

            // Impresion tradicional
            // Permite controlar el índice y acceder a posiciones específicas.
            // .size() 'mientras la condicion sea la cantidad de elementos de la lista'
            for (int i = 0; i < nombres.size(); i++) {
                System.out.println(nombres.get(i));
            }

            System.out.println();

            // Bucle for-each
            // Permite recorrer directamente cada elemento
            for (String nombre : nombres) {
                System.out.println(nombre);
            }
    }
}
