package tema08_arrays;

public class ArrayBuscarForEach {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};
        int buscado = 99;
        boolean encontrado = false;

        for (int numero : numeros) {
            if (numero == buscado) {
                encontrado = true;
                // para evitar de buscar si ya se encontro
                break;
            }
        }
        // 30 true
        // 99 false
        System.out.println("Encontrado: " + encontrado);
    }
}
