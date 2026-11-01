package tema10_excepciones;

// 'throws' indica que un metodo puede producir una excepción
// y dejar que quien lo llama se encargue de ella.
// throws no maneja excepciones. Simplemente declara que el metodo puede propagarlas.
public class UsoThrows {

    public static void validarEdad(int edad) throws Exception {

        if (edad < 18) {
            throw new Exception("Debes ser mayor de edad.");
        }
        System.out.println("Acceso permitido.");
    }

    public static void main(String[] args) {

        try {
            validarEdad(1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}

// throws Exception:
    // Declara que el metodo puede lanzar una excepción.

// throw new Exception("Debes ser mayor de edad.");
    // Lanza realmente la excepción.

// try {
// } catch
    // manejan la exepcion, sin ellos el programa cierra.