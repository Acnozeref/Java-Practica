package tema09_poo;

// Clase abstracta.
// Consiste en mostrar lo necesario y ocultar los
// detalles internos de cómo se realiza una operación.
// Una clase abstracta no puede instanciarse directamente con new Figura().
// Se utiliza como base para clases más específicas.
public abstract class Figura {

    // Metodo abstracto.
    // Declara un metodo sin implementación
    // las clases concretas que hereden de ella deberán implementarlo.
    public abstract double calcularArea();
}
