package tema10_excepciones;

public class Main {

    public static void main(String[] args) {
        // creamos un objeto para llamar al metodo y validarlo
        ValidarUsuario validador = new ValidarUsuario();
        // creacion de objeto usuario.
        Usuario usuario = new Usuario("Kevin", 15);

        try {

            validador.validarUsuario(usuario);

        } catch (UsuarioInvalidoException e) {

            System.out.println(e.getMessage());
        }
    }
}

// Conceptos Backend

//      Usuario: representa los datos.

//      ValidarUsuario: contiene la lógica de validación.

//      UsuarioInvalidoException: representa los errores.

//      Main: coordina la ejecución y maneja las excepciones
