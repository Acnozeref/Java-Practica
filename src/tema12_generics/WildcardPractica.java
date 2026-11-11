package tema12_generics;

import java.util.List;

// wildcard: tipo desconocido
// Sirven para trabajar con tipos genéricos desconocidos o variables.
public class WildcardPractica {
    // List<?> acepta listas de distintos tipos.
    // sub tema extends, para permitir ciertos tipos.
    public static void mostrarLista(List<? extends Number> lista) {
        // permite recorrer sus elementos sin conocer su tipo concreto.
        // for (Object elemento : lista) { para cualquier tipo
        for (Number elemento : lista) { // tipos numericos.
            System.out.println(elemento);
        }
    }

    public static void main(String[] args) {
        // List.of() crea listas que no permiten agregar, eliminar o modificar elementos.
        List<String> nombres = List.of("Ana","Kevin");
        List<Integer> edades = List.of(25,26);
        List<Double> alturas = List.of(1.78, 1.70);

        // mostrarLista(nombres); // extends Number cierra String
        mostrarLista(edades);
        mostrarLista(alturas);
    }
}
