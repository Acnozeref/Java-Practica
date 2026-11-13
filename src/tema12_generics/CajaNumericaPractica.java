package tema12_generics;

public class CajaNumericaPractica <T extends Number> {

    private T numero;

    public void setNumero(T numero) {
        this.numero = numero;
    }

    public T getNumero() {
        return numero;
    }
    // No requiere declarar de nuevo <T> en los metodos de las clases.
    public void mostrarNumero() {
        System.out.println(getNumero());
    }

    public static void main(String[] args) {

        CajaNumericaPractica<Integer> entero = new CajaNumericaPractica<>();
        CajaNumericaPractica<Double> decimal = new CajaNumericaPractica<>();
        // No permitido (IntelliJ marca el error)
        // CajaNumericaPractica<String> texto = new CajaNumericaPractica<>();

        entero.setNumero(26);
        decimal.setNumero(1.75);

        entero.mostrarNumero();
        decimal.mostrarNumero();
    }
}
