package tema09_poo;

// Hereda de la clase abstracta.
public class Circulo extends Figura {
    // Radio queda encapsulado
    private double radio;
    // Constructor que inicia el radio
    public Circulo(double radio) {
        this.radio = radio;
    }
    // Implementa el metodo abstracto calcularArea()
    @Override
    public double calcularArea() {
        // calcula el área del círculo usando pi r^2
        return Math.PI * radio * radio;
    }
}
