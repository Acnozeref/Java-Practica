package tema08_arrays;

public class ArraysTipos {
    // Concepto: un array puede ser de cualquier tipo (int, double, String, boolean...),
    // pero todos sus elementos deben ser del mismo tipo.
    // Al crearlo con new tipo[n], cada posición recibe un valor por defecto según el tipo:
    //   int → 0 | double → 0.0 | boolean → false | String → null (sin valor)
    // Sintaxis: tipo[] nombre = new tipo[tamaño];

    public static void main(String[] args) {
        // array de decimales
        double[] alturas = new double[3];
        // valor por defecto '0.0'
        // asignamos un valor a cada posición por su índice
        alturas[0] = 1.40;
        alturas[1] = 1.62;
        alturas[2] = 1.78;
        for (int i = 0; i < alturas.length; i++) {
            System.out.println(alturas[i]);
        }

        // array de textos
        String[] nombres = new String[3];
        // Valor por defecto 'null'
        // 'null' por el momento no hay ningun String
        nombres[0] = "Kevin";
        nombres[1] = "Dulce";
        nombres[2] = "Alfredo";
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }

        // array de verdadero/falso
        boolean[] estudiantes = new boolean[3];
        // valor por defecto 'false'
        estudiantes[0] = true;
        estudiantes[1] = true;
        estudiantes[2] = true;
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println(estudiantes[i]);
        }
    }

}
