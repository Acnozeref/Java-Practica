package tema10_excepciones;

// Comprueba si la edad es menor de 18.
// Si lo es, lanza una excepción manualmente.
// Si no lo es, permite continuar.

public class UsoThrow {
    public static void main(String[] args) {
        int edad = 21;

        if (edad < 18) {
            throw new IllegalArgumentException("Debes ser mayor de edad");
        }

        System.out.println("Acceso permitido.");
    }

}

// throw permite lanzar exepciones manualmente.
// throw: lanza una excepción en un punto concreto del código

