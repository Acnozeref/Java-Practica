package tema13_programacionFuncional;

import java.util.function.Function;

public class FunctionPractica {

    public static void main(String[] args) {

        Function<String, Integer> longitud =
                texto -> texto.length();

        Function<Integer, String> convertir =
                numero -> String.valueOf("Conversion de Int a String: " + numero);


        System.out.println(longitud.apply("Kevin"));

        String resultado = convertir.apply(2999);

        System.out.println(resultado);
    }
}
