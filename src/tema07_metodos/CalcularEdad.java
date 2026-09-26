package tema07_metodos;

public class CalcularEdad {

    public static int calcular(int nacimiento) {
        return 2026 - nacimiento;
    }

    public static void main(String[] args) {

        int resultado = calcular(2000);

        System.out.println("Edad: " + resultado);
    }

}