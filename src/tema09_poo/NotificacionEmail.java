package tema09_poo;

// La clase se compromete a implementar el metodo definido en la interfaz.
public class NotificacionEmail implements Notificable {

    @Override
    public void enviarNotificacion() {
        System.out.println("Enviando notificacion por correo electronico.");
    }
}
