package tema08_arrays;

public class ArrayMayor {

    public static void main(String[] args) {

        // objetivo encontrar el numero mayor en el array
        int[] numeros = {15, 8, 42, 23, 10};

        // el numero mayor hasta el momento es del indice 0
        // o mejor visto como valor inicial para recorrer
        int mayor = numeros[0]; // 15

        // indice inicial / condicion / siguiente indice
        for (int i = 0; i < numeros.length; i++) {
            // si el numero del indice es mayor al indice inicial
            // recodar mayor es la variable donde empezamos desde el indice 0
            if (numeros[i] > mayor) {
                // actualizamos el valor del indice a la variable
                // El nuevo mayor ahora es este número
                // la idea es reempalzar no acumular por no usamos +=
                // Idea clave: suma += numero acumula; mayor = numero reemplaza.
                mayor = numeros[i];
            }
        }
        // impresion de resultado.
        System.out.println("Numero mayor: " + mayor);

    }

}
