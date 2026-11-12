package tema13_programacionFuncional;

import java.util.function.Consumer;
// Recibe un valor
// Ejecuta una operación con ese valor.
// No devuelve ningún resultado.
public class ConsumerPractica {

    public static void main(String[] args) {

        Consumer<String> mostrarNombre =
                nombre -> System.out.println(nombre);

        Consumer<Integer> dobleNumero =
                numero -> System.out.println(numero * 2);

        mostrarNombre.accept("Kevin");
        dobleNumero.accept(8);
    }
}
