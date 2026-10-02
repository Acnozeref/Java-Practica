package tema08_arrays;

public class ArrayPromedio {

    public static void main(String[] args) {

        // array a sacar promedio
        int[] numeros = {10, 20, 30, 40, 50};

        // suma de todos los numeros
        int suma = 0;

        // inidie / condicion / siguiente indice
        for (int i = 0; i < numeros.length; i++) {
            // cada indice se suma a la variable suma
            suma += numeros[i];
        }

        // extraemos el promedio entre la longitud del array
        // como los numeros del array son enteros,
        // se hace casting (double) para retornar un decimal.
        double promedio = (double) suma /  numeros.length;

        System.out.println("Promedio: " + promedio);
    }

}
