package tema03_operadores;

public class OperadoresLogicos {
    public static void main(String[] args) {

        int edad = 26;
        boolean identificacion = true;

        // camelCase
        boolean esMayorYIdentificacion = edad >= 18 && identificacion;

        boolean esMenorOtieneIdentificacion = edad < 18 || identificacion;

        boolean noTieneIdentificacion = !identificacion;

        System.out.println(esMayorYIdentificacion);
        System.out.println(esMenorOtieneIdentificacion);
        System.out.println(noTieneIdentificacion);

    }
}
