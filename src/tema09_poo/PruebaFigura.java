package tema09_poo;

// Utiliza el metodo sin necesitar conocer su fórmula interna.
public class PruebaFigura{

    public static void main(String[] args) {

        Figura figura1 = new Circulo(5);
        Figura figura2 = new Cuadrado(4);

        System.out.println(figura1.calcularArea());
        System.out.println(figura2.calcularArea());
    }
}
