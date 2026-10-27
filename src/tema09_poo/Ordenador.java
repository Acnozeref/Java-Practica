package tema09_poo;

public class Ordenador {

    // Declara un atributo que puede
    // referenciar un objeto de tipo Procesador
    private Procesador procesador;

    // Crea un objeto Procesador dentro del constructor de Ordenador
    // 'tramite para usar objetos foraneos'
    public Ordenador() {
        this.procesador = new Procesador();
    }

    // encender ejecuta el print y utiliza el metodo de otra clase
    public void encender() {
        System.out.println("Encendiendo Ordenador");
        // Permite que el ordenador utilice el metodo de su procesador.
        procesador.ejecutar();
    }
}
