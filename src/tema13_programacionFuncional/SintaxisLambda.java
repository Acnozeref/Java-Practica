package tema13_programacionFuncional;

public class SintaxisLambda {

    public static void main(String[] args) {

        // 1
        Mensaje mensaje = texto -> System.out.println(texto);
        mensaje.mostrar("Hola me llamo Kevin.");

        // Sin
        Operacion nada = () -> System.out.println("Sin parametros.");
        nada.ejecutar();
    }
}
