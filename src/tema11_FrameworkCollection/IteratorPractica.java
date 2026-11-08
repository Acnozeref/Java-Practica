package tema11_FrameworkCollection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorPractica {

    public static void main(String[] args) {

        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Kevin");
        nombres.add("Luis");
        nombres.add("Adrian");
        nombres.add("Danna");
        nombres.add("Lola");

        // Permite recorrer una colección y eliminar
        // elementos durante el recorrido de forma segura.
        Iterator<String> iterator = nombres.iterator();

        /*
        Metodos principales:
            iterator() - obtiene el iterator.
            hasNext() - comprueba si hay otro elemento.
            next() - obtiene el siguiente elemento.
            remove() - Elimina el elemento actual.

        */

        // Recorre la lista utilizando while
        // iterator obtiene el iterator de la lista.
        // has.Next() comprueba si quedan elementos.
        while (iterator.hasNext()) {
            // Imprime cada elemento con next().
            System.out.println(iterator.next());
        }

        // Ejemplo de uso:
        // Permite eliminar elementos durante el recorrido de form
        while (iterator.hasNext()) {

            String nombre = iterator.next();

            if (nombre.equals("Luis")) {
                iterator.remove();
            }
        }
    }
}
