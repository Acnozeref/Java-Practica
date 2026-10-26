package tema09_poo;
// clase de prueba de polimorfismo
public class PruebaPagos {

    public static void main(String[] args) {

        // idea preeliminar; creacion de objetos en base a clases heredadas
        // izquierda ambos objetos tienen el mismo tipo 'MetodoPago' clase Padre
        // derecha referencia de una clase Hija
        MetodoPago pago1 = new PagoTarjeta();
        MetodoPago pago2 = new PagoEfectivo();

        // metodos disintos esperados
        // tienen el mismo metodo pero referenciado de otra clase hija
        pago1.procesarPago(); // Procesando pago con tarjeta.
        pago2.procesarPago(); // Procesando pago en efectivo.
    }
}
