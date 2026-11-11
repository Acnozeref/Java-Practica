package tema12_generics;

import java.util.List;

public class ConsultasGenericas {

    public static void mostrarProductos(List<?> productos) {
        for (Object producto : productos) {
            System.out.println(producto);
        }
    }

    public static double sumarNumeros(List<? extends Number> numeros) {

        double suma = 0;
        // Utilizamos doubleValue() porque Number puede
        // representar distintos tipos numéricos,
        for (Number numero : numeros) {
            suma += numero.doubleValue();
        }
        return suma;
    }
}
