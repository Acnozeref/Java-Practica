package tema11_FrameworkCollection;

import java.util.ArrayList;

public class ArrayListBuscar {

    public static void main(String[] args) {

        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Kevin");
        nombres.add("Carlos");
        nombres.add("Ana");
        nombres.add("Danna");
        nombres.add("Luis");
        nombres.add("Carlos");

        // contains(object)
        // comprueba si hay un elemento, devuelve bool.
        System.out.println(nombres.contains("Danna"));

        // indexOf(object)
        // devuelve la posición de un elemento; devuelve un índice.
        System.out.println(nombres.indexOf("Ana"));


        // indexOf(object)
        // devuelve la primera coincidencia; devuelve un índice.
        System.out.println(nombres.indexOf("Carlos"));
        // 1

        // lastIndexOf(object)
        // devuelve la última posición de un elemento; devuelve un índice.
        System.out.println(nombres.lastIndexOf("Carlos"));
        // 5
    }
}
