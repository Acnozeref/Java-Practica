package tema12_generics;

public class MainGenerico {
    public static void main(String[] args) {

        Almacen<String> productos = new Almacen<>();

        Almacen<Double> precios = new Almacen<>();

        productos.agregar("Teclado");
        productos.agregar("Mouse");
        productos.agregar("Monitor");

        precios.agregar(250.00);
        precios.agregar(120.00);
        precios.agregar(1999.99);

        System.out.println("Productos");
        ConsultasGenericas.mostrarProductos(productos.getProductos());

        System.out.println();

        System.out.println("Precios");
        ConsultasGenericas.mostrarProductos(precios.getProductos());

        System.out.println("Suma total: ");
        double total = ConsultasGenericas.sumarNumeros(precios.getProductos());
        System.out.println(total);
    }
}
