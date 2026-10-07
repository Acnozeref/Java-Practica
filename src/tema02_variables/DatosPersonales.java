package tema02_variables;

public class DatosPersonales {

    public static void main(String[] args) {

        // Variable: espacio con nombre donde se guarda un dato.
        // Forma de declararla: tipo nombre = valor;

        // Asignación: darle un valor a la variable por primera vez.
        // int: números enteros.
        int edad = 26;

        // Reasignación: cambiar el valor de una variable que ya existe.
        // No se vuelve a escribir el tipo (int), solo el nombre.
        edad = 27;

        // double: números con decimales (se escriben con punto).
        double altura = 1.78;

        // String: texto entre comillas dobles (empieza con mayúscula).
        String nombre = "Kevin";

        // boolean: solo admite true (verdadero) o false (falso).
        boolean estudiante = true;

        // Para mostrar una variable se escribe su nombre, sin comillas.
        // Muestra el valor actual: 27, no 26.
        System.out.println(edad);
        System.out.println(altura);

        // Se reasigna altura: a partir de aquí vale 1.80.
        altura = 1.80;
        System.out.println(altura);
        System.out.println(nombre);
        System.out.println(estudiante);
    }

}
