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
        Métodos principales:
            iterator() - obtiene el iterador.
            hasNext() - comprueba si hay otro elemento.
            next() - obtiene el siguiente elemento.
            remove() - elimina el elemento actual.

        */

        // Recorre la lista utilizando while.
        // iterator() obtiene el iterador de la lista.
        // hasNext() comprueba si quedan elementos.
        while (iterator.hasNext()) {
            // Imprime cada elemento con next().
            System.out.println(iterator.next());
        }

        // Para eliminar durante el recorrido se necesita un iterador nuevo,
        // porque el anterior ya quedó agotado.
        Iterator<String> iteratorEliminar = nombres.iterator();

        while (iteratorEliminar.hasNext()) {

            String nombre = iteratorEliminar.next();

            if (nombre.equals("Luis")) {
                iteratorEliminar.remove();
            }
        }

        // La lista ya no contiene a "Luis".
        System.out.println(nombres);
    }
}
