package tema10_excepciones;

// ' Rayito ' determina su herencia de Exception. (Intellij)
// Excepciones persoanlizadas
// Creamos nuestra propia excepcion
// Esta clase representa un error específico: una edad inválida.
public class EdadInvalidaException extends Exception{

    public EdadInvalidaException(String mensaje) {
        super(mensaje);
    }
}

// extends Exception: nuestra clase hereda de Exception.

// super(mensaje): envía el mensaje al constructor de la clase padre.