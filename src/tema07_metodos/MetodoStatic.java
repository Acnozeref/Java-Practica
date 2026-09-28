package tema07_metodos;

public class MetodoStatic {

//     Si un método es static, puedes llamarlo
//     desde otro método static directamente,
//     sin crear un objeto
    public static void saludar() {
        System.out.println("Hola");
    }

    public static void main(String[] args) {
        saludar();

    }

}
