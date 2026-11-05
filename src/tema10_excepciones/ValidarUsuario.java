package tema10_excepciones;

public class ValidarUsuario {
    // metodo que analiza los argumentos de un objeto.
    public void validarUsuario(Usuario usuario) throws UsuarioInvalidoException {
        // si el nombre se encuentra vacio o con espacios lanza error perzonalizada
        if (usuario.getNombre().isBlank()) {
            throw new UsuarioInvalidoException(
                    "El nombre no debe estar vacío o con solo espacios."
            );
        }
        // si la edad es menor lanza error personzalizado.
        if (usuario.getEdad() < 18) {
            throw new UsuarioInvalidoException(
                    "El usuario debe ser mayor de edad."
            );
        }
        // Si los parametros son correctos, salta este mensaje.
        System.out.println("Usuario válido.");
    }
}

// Encapsulamiento, accedemos a los atributos mediante getters.
// Validamos la condiciones antes de continuar.
// Uso de throw para comunicar errores especificos.