package tema11_FrameworkCollection;

import java.util.ArrayList;

public class ArrayListConsultar {

    public static void main(String[] args) {

        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Kevin");
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Carlos");

        // Consultar elemento por indice.
        System.out.println(nombres.get(1));

        // Cambiar elemento con (indice, valor)
        nombres.set(2, "Alejandro");

        // Comprobar si existe un elemento (devuelve bool)
        System.out.println(nombres.contains("Kevin"));

        // Impresion final
        System.out.println(nombres);

        /*
        Resultados esperados:

            Ana
            true
            [Kevin, Ana, Alejandro, Carlos]

         */
    }
}
