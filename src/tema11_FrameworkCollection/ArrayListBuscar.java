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
        // devuelve la posicion de un elemento, devuelve indice.
        System.out.println(nombres.indexOf("Ana"));


        // indexOf(object)
        // devuelve la primera coincidencia, devuelve indice.
        System.out.println(nombres.indexOf("Carlos"));
        // 1

        // lastIndexOf(object)
        // devuelve la ultima posicion de un elemento, devuelve indice.
        System.out.println(nombres.lastIndexOf("Carlos"));
        // 5
    }
}
