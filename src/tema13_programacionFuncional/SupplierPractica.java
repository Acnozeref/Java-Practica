package tema13_programacionFuncional;

import java.util.function.Supplier;

public class SupplierPractica {

    public static void main(String[] args) {

        Supplier<String> obtenerNombre =
                () -> "Kevin";

        Supplier<Integer> obtenerEdad =
                () -> 26;

        System.out.println(obtenerNombre.get());
        System.out.println(obtenerEdad.get());
    }
}
