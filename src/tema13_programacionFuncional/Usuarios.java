package tema13_programacionFuncional;

public class Usuarios {

    private String nombre;
    private int edad;

    Usuarios(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }
}
