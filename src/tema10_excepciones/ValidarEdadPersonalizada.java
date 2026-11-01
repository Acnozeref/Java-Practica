package tema10_excepciones;

public class ValidarEdadPersonalizada {

    public static void validarEdad(int edad) throws EdadInvalidaException {

        if (edad < 18) {
            throw new EdadInvalidaException("La edad debe ser 18 años o mas.");
        }

        System.out.println("Edad valida.");

    }

    public static void main(String[] args) {

        try {
            validarEdad(21);

        } catch (EdadInvalidaException e) {
            System.out.println(e.getMessage());
        }
    }
}
