package tema03_operadores;

public class OperadoresLogicos {
    public static void main(String[] args) {

        // Operadores lógicos: combinan valores boolean.
        //  &&  Y: es true solo si se cumplen las dos condiciones.
        //  ||  O: es true si se cumple al menos una.
        //  !   NO: invierte el valor (true pasa a false y viceversa).

        int edad = 26;
        boolean identificacion = true;

        // Nombres de variables en camelCase: la primera palabra en minúscula
        // y las siguientes empiezan con mayúscula.

        // true && true -> true
        boolean esMayorYIdentificacion = edad >= 18 && identificacion;

        // false || true -> true (basta con que una se cumpla)
        boolean esMenorOtieneIdentificacion = edad < 18 || identificacion;

        // !true -> false
        boolean noTieneIdentificacion = !identificacion;

        System.out.println(esMayorYIdentificacion);         // true
        System.out.println(esMenorOtieneIdentificacion);    // true
        System.out.println(noTieneIdentificacion);          // false

    }
}
