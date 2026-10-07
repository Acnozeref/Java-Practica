package tema03_operadores;

public class Comparaciones {
    public static void main(String[] args) {

        // Operadores de comparación: comparan dos valores
        // y siempre dan como resultado un boolean (true o false).
        //  ==  igual
        //  !=  diferente
        //  >   mayor que
        //  <   menor que
        //  >=  mayor o igual
        //  <=  menor o igual

        int edad = 26;

        // El resultado de la comparación se guarda en una variable boolean.
        boolean esMayorDeEdad = edad >= 18;

        // Ojo: == compara, mientras que = asigna un valor.
        boolean tieneEdadExacta = edad == 26;
        boolean esMenorEdad = edad < 18;

        System.out.println(esMayorDeEdad);    // true
        System.out.println(tieneEdadExacta);  // true
        System.out.println(esMenorEdad);      // false
    }
}
