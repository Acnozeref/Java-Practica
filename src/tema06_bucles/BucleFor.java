package tema06_bucles;

public class BucleFor {

    public static void main(String[] args) {

        // Bucle: repite un bloque de código varias veces.
        // for se usa cuando se sabe cuántas veces repetir.
        // Tiene tres partes separadas por ;
        //  1. inicio:     int i = 1   (variable contadora)
        //  2. condición:  i <= 5      (repite mientras sea true)
        //  3. iteración:  i++         (qué hacer al final de cada vuelta)
        //
        // Otras formas de iterar:
        //  i++      suma 1
        //  i--      resta 1
        //  i += 2   suma 2
        for (int i = 1; i <= 5; i++) {
            System.out.println("Numero: " + i); // Imprime del 1 al 5
        }

    }
}
