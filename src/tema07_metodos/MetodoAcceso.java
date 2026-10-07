package tema07_metodos;

// Ejercicio: metodo que devuelve boolean usando if/else con return en cada rama.
// Funciona, pero se puede simplificar (ver MetodoEsMayor).
public class MetodoAcceso {

    // Devuelve true si la edad permite entrar (18 o mas).
    public static boolean puedeEntrar(int edad) {


        // simplificacion
        // return edad >= 18;  (devuelve directamente el resultado de la comparacion)
        if (edad >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public static void main (String[] args) {

        // 26 >= 18, asi que acceso vale true.
        boolean acceso = puedeEntrar(26);

        // Salida esperada: Puedes entrar?: true
        System.out.println("Puedes entrar?: " + acceso);
    }

}
