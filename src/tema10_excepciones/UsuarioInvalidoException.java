package tema10_excepciones;
// Checked Exception
public class UsuarioInvalidoException extends Exception {
    // constructor que recibe String mensaje y lo envie al constructor
    // podemos lanzar este tipo de error en cualquier metodo que lo necesite.
    public UsuarioInvalidoException(String message) {
        // permite guardar el mensaje en la excepción padre
        super(message);
    }
}
