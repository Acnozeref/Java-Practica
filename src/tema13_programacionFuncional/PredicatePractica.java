package tema13_programacionFuncional;

import java.util.function.Predicate;

public class PredicatePractica {

    public static void main(String[] args) {
        // Predicate<T> recibe un valor y devuelve un boolean
        Predicate<Integer> esPar = numero -> numero % 2 == 0;

        System.out.println(esPar.test(8));
        System.out.println(esPar.test(13));
    }
}
