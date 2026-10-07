package tema07_metodos;

// Ejercicio: metodo que recibe un dato y devuelve un calculo.
public class CalcularEdad {

    // Recibe el anio de nacimiento y devuelve la edad (usa 2026 como anio actual fijo).
    public static int calcular(int nacimiento) {
        return 2026 - nacimiento;
    }

    public static void main(String[] args) {

        // Guardamos lo devuelto por calcular(2000). Edad esperada: 26
        int resultado = calcular(2000);

        System.out.println("Edad: " + resultado);
    }

}