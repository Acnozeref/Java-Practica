package tema12_generics;
import java.util.List;
import java.util.ArrayList;

public class WildcardSuperPractica {

    // extends lectura
    // super escritura
    // Se espera insertar estos valores a una lista.
    public static void agregarEdades(List<? super Integer> lista) {
        lista.add(25);
        lista.add(26);
        lista.add(27);
    }

    public static void main(String[] args) {
        // Lista vacía
        List<Integer> edades = new ArrayList<>();
        List<Number> numeros = new ArrayList<>();

        // Llamamos al método para inyectar parámetros
        agregarEdades(edades);
        agregarEdades(numeros);
        // Salida a consola
        System.out.println(edades);
        System.out.println(numeros);
    }
}
