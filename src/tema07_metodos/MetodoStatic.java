package tema07_metodos;

public class MetodoStatic {

// Concepto: static en un metodo.
// Un metodo static pertenece a la clase y se puede llamar directamente
// por su nombre desde otro metodo static, sin crear un objeto.
// main es static, por eso solo puede llamar directamente a metodos static.
// Si saludar() no tuviera static, la llamada desde main daria error de compilacion.
    public static void saludar() {
        System.out.println("Hola");
    }

    public static void main(String[] args) {
        // Salida esperada: Hola
        saludar();

    }

}
