package tema07_metodos;

public class MetodoSobrecarga {

    public static void saludar() {
        System.out.println("Hola, bienvenido");
    }
    public static void saludar(String nombre) {
        System.out.println("Hola " + nombre);
    }

    public static void main(String[] args) {

        saludar();
        saludar("Kevin");

    }

}
