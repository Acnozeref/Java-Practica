package tema11_FrameworkCollection;

import java.util.LinkedList;

public class LinkedListPractica {

    public static void main(String[] args) {

        LinkedList<String> nombres = new LinkedList<>();

        // Métodos alternos:
            // nombres.addFirst("Luis");
            // nombres.addLast("Pedro");
            //
            // nombres.removeFirst();
            // nombres.removeLast();
            //
        nombres.add("Kevin");
        nombres.add("Carlos");
        nombres.add("Ana");
        nombres.add("Danna");

        System.out.println(nombres);

        System.out.println(nombres.getFirst());

        System.out.println(nombres.getLast());
    }
}
