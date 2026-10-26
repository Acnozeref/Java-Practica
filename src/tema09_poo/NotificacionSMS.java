package tema09_poo;

public class NotificacionSMS implements Notificable {

    @Override
    public void enviarNotificacion() {
        System.out.println("Enviando notificacion por SMS");
    }
}
