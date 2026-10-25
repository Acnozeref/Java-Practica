package tema09_poo;
// Encapsulamiento en Java
public class CuentaBancaria {
    // tipo de valores
    // private => protege los atributos al-
    // intentar modificarlos desde otra clase-
    // del mismo paquete.
    private double saldo;

    // constructor
    CuentaBancaria(double saldo) {
        this.saldo = saldo;
    }

    // getter => consultar
    // se puede llamar
    public double getSaldo() {
        return saldo;
    }

    // setgetter => modificar
    // se puede llamar
    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        }
    }

    public static void main(String[] args) {
        // objeto creado // valor incial 500.0
        CuentaBancaria cuenta01 = new CuentaBancaria(500.0);
        // primer resultado // llamando con getSaldo
        System.out.println("Saldo inicial:" + " " + cuenta01.getSaldo());

        // intento por cambiar el valor // llamando con setSaldo
        cuenta01.setSaldo(-100.00);
        // segundo resultado
        System.out.println("Saldo despues del intento:" + " " + cuenta01.getSaldo());
    }
}
