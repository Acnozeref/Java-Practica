package tema09_poo;

public class Perro extends Animal {
    // metodo propio de perro
    public void ladrar() {
        System.out.println("¡Guau!");
    }

    public static void main(String[] args) {
        // creacion de un perro
        Perro miPerro = new Perro();

        miPerro.nombre = "Firulais";
        miPerro.edad = 3;

        // llamando metodo propio
        miPerro.ladrar();
        // llamando metodo padre Animal
        miPerro.mostrarDatos();
    }
}