package tema09_poo;

/*  Una interfaz establece un contrato que define qué métodos debe implementar una clase,
    pero no cómo debe ejecutarlos. Las clases que implementan ese contrato proporcionan
    su propio comportamiento. Esto permite utilizar distintas implementaciones mediante una
    misma referencia y aprovechar el polimorfismo. */
public interface Notificable {

    void enviarNotificacion();
}
