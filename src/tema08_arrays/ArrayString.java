package tema08_arrays;

public class ArrayString {
    public static void main(String[] args) {
        // Para String .equals()
        // Para numeros primitivos ==
        String[] nombres = {"Kevin", "Ana", "Luis", "Pedro", "Maria"};

        String buscar = "Luis";

        boolean encontrado = false;

        for (String nombre : nombres) {
            if (nombre.equals(buscar)) {
                encontrado = true;
                break;
            }
        }
        System.out.println("Nombre encontrado: " + encontrado);
    }
}