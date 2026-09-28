package tema07_metodos;

public class MetodoAlcance {

    public static void alcance(String nombre) {

        String prueba = "Esto es una variable dentro de un metodo";
        System.out.println("Metodo de prueba: " + nombre);

    }

    public static void main(String[] args) {
        // fallo al llamar una variable de un metodo
        // System.out.println(prueba);


        String mensaje = "Hola desde main";

        System.out.println(mensaje);

    }

}
