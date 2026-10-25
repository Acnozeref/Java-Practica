package tema09_poo;

public class CuentaBancariaPractica {
    // Parametro a trabajar,
    // Recordar encapsulamiento.
    private double saldo;

    // Constructor
    CuentaBancariaPractica(double saldo) {
        this.saldo = saldo;
    }

    // Metodo de cosulta.
    public double getSaldo() {
        return saldo;
    }

    // Reglas del metodo:
    //  - Si la cantidad es estrictamente positiva.
    //  - Sino, retorna el saldo actual.
    public double depositar(double cantidad) {
        if (cantidad > 0) {
            return saldo += cantidad;
        }
        return getSaldo();
    }

    // Reglas del metodo:
    //  - El retiro es positivo.
    //  - El retiro es menor o igual al saldo actual.
    //  - Sino, retorna saldo actual.
    public double retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            return saldo -= cantidad;
        }
        return getSaldo();
    }

    // Codigo a ejecutar.
    public static void main(String[] args) {
        // Creacion de objeto /cuenta01/
        CuentaBancariaPractica cuenta01 = new CuentaBancariaPractica(100.00);

        // Consulta de saldo con "objeto.getSaldo()"
        System.out.println("Saldo inicial: " + cuenta01.getSaldo());

        // Llamando el metodo 'depositar' /objeto.depositvar()/
        cuenta01.depositar(50.00);
        System.out.println("Saldo despues del depostivo: " + cuenta01.getSaldo());
        // Llamando el metodo 'returar' /objeti.retirar()/
        cuenta01.retirar(30.00);
        System.out.println("Saldo despues del retiro: " + cuenta01.getSaldo());
        // Prueba de logica en el metodo 'retirar'
        cuenta01.retirar(200.00);
        System.out.println("Intento por retirar 200.00: " + cuenta01.getSaldo());
    }
}
