package tema09_poo;

public class PruebaNotificaciones {

    public static void main(String[] args) {

        Notificable notificacion1 = new NotificacionEmail();
        Notificable notificacion2 = new NotificacionSMS();

        notificacion1.enviarNotificacion();
        notificacion2.enviarNotificacion();
    }
}
