package tema13_programacionFuncional;

public class CalculadoraLambda {

    public static void main(String[] args) {
        // Creacion de variable que almacena la implementacion.
        Calculadora suma = (num1, num2) -> num1 + num2;
        Calculadora resta = (num1, num2) -> num1 - num2;

        System.out.println(suma.calcular(20,8));
        System.out.println(resta.calcular(20,8));
    }
}
