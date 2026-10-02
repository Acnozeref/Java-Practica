package tema08_arrays;

public class ArraySuma {

    public static void main(String[] args) {

        // objetivo; sumar todos los numeros del array
        int[] numeros = {10, 20, 30, 40, 50};

        // se almacena la suma
        int suma = 0;

        // i lo tomamos como indice de cada numero dentro del array
        // el bucle para hasta que el turno del indice y la longitud del array coincidan
        // agregamos 1 al indice es decir; pasamos al siguente numero del indice
        // i = 0 pertenece al 10
        for (int i = 0; i < numeros.length; i++) {
            // suma el numero 10 a la variable suma
            // suma el numero 20 a la variable suma
            // suma el numero 30 a la variable suma
            // suma el numero 40 a la variable suma
            // suma el numero 50 a la variable suma
            suma += numeros[i];
        }
        // fin del ejericio
        System.out.println("Suma de todos los numeros: " + suma);

    }
}
