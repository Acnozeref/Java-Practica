package tema08_arrays;

public class ArrayPrimerNegativo {
    // Algoritmo: encontrar el primer elemento que cumple una condición.
    // Se usa una bandera (boolean encontrado) para saber si hubo suerte,
    // porque el valor guardado (0) no sirve para distinguir "no encontrado".

    public static void main(String[] args) {
        // int[] numeros = {10, 25, 30, -8, -15, 40};
        int[] numeros = {10, 25, 30, 40, 50};
        // bandera: sigue en false mientras no aparezca ningún negativo
        boolean encontrado = false;
        int primerNegativo = 0;

        for (int numero : numeros) {
            if (numero < 0) {
                primerNegativo = numero;
                encontrado = true;
                // con el primero basta, detenemos el bucle
                break;
            }
        }
        // Con este array: No hay numeros negativos
        // (con el array comentado de arriba mostraría: Primer numero negativo: -8)
        if (encontrado) {
            System.out.println("Primer numero negativo: " + primerNegativo);
        } else {
            System.out.println("No hay numeros negativos");
        }
    }
}
