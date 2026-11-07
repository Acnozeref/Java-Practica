package tema11_FrameworkCollection;

import java.util.HashSet;

public class HashSetPractica {

    public static void main(String[] args) {
        // Evita almacenar elementos duplicados.
        // No garantiza el orden de los elementos
        HashSet<String> nombres = new HashSet<>();

        nombres.add("Kevin");
        nombres.add("Carlos");
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Adrian");
        nombres.add("Kevin");

        // Impresion general.
        System.out.println(nombres);

        // Impresion de cantidad de elementos.
        System.out.println(nombres.size());
    }
}
