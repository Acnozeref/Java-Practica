package tema11_FrameworkCollection;

import java.util.HashMap;

public class HashMapPractica {

    public static void main(String[] args) {

        /*
        HashMap:
        Es una colección que almacena información mediante pares de:
            Key (clave).
            Value (valor).

         Metodos comunues:
            put() - Agrega clave y su valor.
            get() - Obtiene el valor mediante clave.
            remove() - Elimina una clave y su valor.
            containsKey() - Comprueba si existe uan clave.
            size() - Devuelve la cantida de pares.
        */
        HashMap<String, Integer> personas = new HashMap<>();

        /*
        Nota:
            Las claves no se duplican, ejemplo
            personas.put("Kevin", 30);
            Kevin ya existe por lo que su valor cambia a 30/

         */
        personas.put("Kevin", 27);
        personas.put("Ana", 24);
        personas.put("Danna", 16);
        personas.put("Luis", 35);
        personas.put("Adrian", 29);

        // Consulta el valor de la llave "Danna" (16)
        System.out.println(personas.get("Danna"));
        // Consulta si existe la llave "Ana" (bool)
        System.out.println(personas.containsKey("Ana"));

        // Impresion General
        System.out.println(personas);

    }
}
