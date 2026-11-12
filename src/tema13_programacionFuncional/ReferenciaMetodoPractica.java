package tema13_programacionFuncional;

import java.util.function.Consumer;
import java.util.function.Function;

public class ReferenciaMetodoPractica {

    public static void main(String[] args) {

        Consumer<String> mostrar = System.out::println;

        Function<String, Integer> longitud =
            String::length;

        mostrar.accept("Soy un referencia.");
        System.out.println(longitud.apply("Hamburguesa"));
    }
}
