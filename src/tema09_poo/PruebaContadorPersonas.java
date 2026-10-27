package tema09_poo;

public class PruebaContadorPersonas {
    public static void main(String[] args) {

        ContadorPersonas persona1 = new ContadorPersonas("Ana");
        ContadorPersonas persona2 = new ContadorPersonas("Luis");
        ContadorPersonas persona3 = new ContadorPersonas("Marta");

        ContadorPersonas.totalPersonas = 10;

        persona1.mostrarNombre();
        persona2.mostrarNombre();
        persona3.mostrarNombre();

        ContadorPersonas.mostrarTotal();
    }
}
