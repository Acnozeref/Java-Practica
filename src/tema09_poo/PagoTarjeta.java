package tema09_poo;

// clase heredada de MetodoPago
public class PagoTarjeta extends MetodoPago {

    // indica que estamos redefiniendo un metodo heredado
    @Override
    // ahora tiene un comportamiento específico para los pagos con tarjeta
    public void procesarPago() {
        System.out.println("Procesando pago con tarjeta.");
    }
}
