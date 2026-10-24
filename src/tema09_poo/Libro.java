package tema09_poo;

public class Libro {

    String titulo;
    double precio;
    // Java distingue los constructores por su lista de parámetros
    // Sobrecarga de constructores
    // Recibe 2 valores
    Libro(String titulo, double precio) {
        this.titulo = titulo;
        this.precio = precio;
    }

    // Recibe solo String
    // llama al otro constuctor de la misma clase.
    // Debe ser la primera instrucción del constructor.
    Libro(String titulo) {
        this(titulo, 0.0);
    }

    // Sin parametos
    Libro() {
        this("Sin titulo", 0.0);
    }

    public static void main(String[] args) {

        Libro libro1 = new Libro("Java Basico", 250.00);

        Libro libro2 = new Libro("Java Intermedio");

        Libro libro3 = new Libro();

        System.out.println(libro1.titulo + " " + libro1.precio);

        System.out.println(libro2.titulo + " " + libro2.precio);

        System.out.println(libro3.titulo + " " + libro3.precio);


//        Libro basico = new Libro("Java Basico", 250.0);
//        Libro avanzado = new Libro("Java Avanzado", 450.0);

//        System.out.println(basico.titulo);
//        System.out.println(basico.precio);
//        System.out.println(avanzado.titulo);
//        System.out.println(avanzado.precio);
    }
}
