package tema07_metodos;

public class MetodoAcceso {

    public static boolean puedeEntrar(int edad) {


        // simplificacion
        // return >= 18
        if (edad >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public static void main (String[] args) {

        boolean acceso = puedeEntrar(26);

        System.out.println("Puedes entrar?: " + acceso);
    }

}
