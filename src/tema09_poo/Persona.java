package tema09_poo;

// cracion del 'molde' o 'planos'
public class Persona {
    // caracteristicas del molde, para crear objetos
    String nombre;
    int edad;

    // accion a realizar de cada objeto
    void saludar() {
        System.out.println("Hola, soy una persona");
    }

    public static void main(String[] args) {
        // cracion de instancia de la clase / crear objeto
        Persona miPersona = new Persona();

        // instancia / variable de referencia
        miPersona.nombre = "Alex";
        miPersona.edad = 25;

        // impresion de valores y metodos
        System.out.println(miPersona.nombre);
        System.out.println(miPersona.edad);
        miPersona.saludar();

        // creacion de otra instancia
        Persona otraPersona = new Persona();
        otraPersona.nombre = "Carlos";
        otraPersona.edad = 30;

        // llamamos los objetos de cada instancia
        System.out.println(miPersona.nombre);   // Alex
        System.out.println(otraPersona.nombre); // Carlos

        // re-asignacion de valores
        Persona persona1 = new Persona();
        persona1.nombre = "Alex";

        Persona persona2 = new Persona();
        persona2.nombre = "Carlos";

        // reescribe Alex por Pedro
        persona1.nombre = "Pedro";

        System.out.println(persona1.nombre);    // Pedro
        System.out.println(persona2.nombre);    // Carlos

        // Apuntar a un mismo objeto

        // Persona persona1 = new Persona();
        // persona1.nombre = "Alex";


        /* Ambas variables apuntan a un mismo objeto */
        // Persona persona2 = persona1;
        // persona2.nombre = "Carlos";


        // new Persona() crea un objeto nuevo.

        // Persona persona2 = persona1; copia la referencia, no crea otro objeto.
        System.out.println(persona1.nombre); // Carlos
        System.out.println(persona2.nombre); // Carlos

    }
}