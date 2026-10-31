package tema09_poo;
// Encapsulamiento en Java
public class CuentaBancaria {
    // Atributo protegido: nadie fuera de esta clase puede cambiarlo directamente.
    private double saldo;

    // Constructor
    CuentaBancaria(double saldo) {
        this.saldo = saldo;
    }

    // Getter: Permite a otras clases consultar el saldo de forma segura
    public double getSaldo() {
        return saldo;
    }

    // Setter: Permite modificar el saldo, pero aplicando reglas de validación.
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
