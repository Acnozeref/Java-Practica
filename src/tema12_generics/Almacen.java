package tema12_generics;
import java.util.ArrayList;
import java.util.List;

public class Almacen <T> {
    // Instanciar objetos en base a un arrayList.
    private List<T> productos = new ArrayList<>();

    public void setProductos(List<T> productos) {
        this.productos = productos;
    }

    public void agregar(T producto) {
        productos.add(producto);
    }

    public List<T> getProductos() {
        return productos;
    }
}
