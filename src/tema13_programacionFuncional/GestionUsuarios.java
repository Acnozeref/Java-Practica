package tema13_programacionFuncional;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class GestionUsuarios {

    public static void main(String[] args) {

        Supplier<String> asignarNombre =
                () -> "Usuario nuevo";

        Predicate<Usuarios> esMayorEdad =
                usuarios -> usuarios.getEdad() >= 18;

        Function<Usuarios, String> convertirNombre =
                usuario -> usuario.getNombre().toUpperCase();

        Consumer<Usuarios> mostrarUsuario =
                usuario -> System.out.println(
                        "Nombre: " + usuario.getNombre()
                        + " | Edad: " + usuario.getEdad()
                );
        Consumer<String> imprimir = System.out::println;

        Usuarios usuario1 = new Usuarios("Danna", 16);
        Usuarios usuario2 = new Usuarios("Luis", 35);

        mostrarUsuario.accept(usuario1);
        imprimir.accept(convertirNombre.apply(usuario1));

        mostrarUsuario.accept(usuario2);
        imprimir.accept(convertirNombre.apply(usuario2));
    }
}
