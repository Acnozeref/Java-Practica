package tema03_operadores;

public class Comparaciones {
    public static void main(String[] args) {

        // == igual
        // != diferente
        // > mayor que
        // < menor que
        // >= mayor o igual
        // <= menor o igual

        int edad = 26;
        boolean esMayorDeEdad = edad >= 18;
        boolean tieneEdadExacta = edad == 26;
        boolean esMenorEdad = edad < 18;

        System.out.println(esMayorDeEdad);
        System.out.println(tieneEdadExacta);
        System.out.println(esMenorEdad);
    }
}
