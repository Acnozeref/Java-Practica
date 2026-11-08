package tema11_FrameworkCollection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

public class CompararCollecciones {

    public static void main(String[] args) {
        // Lista
            // Lista dinámica, permite duplicados y acceso por índices.
        ArrayList<String> listNombres = new ArrayList<>();

        // Set
            // No permite duplicados y no garantiza el orden de inserción.
        HashSet<String> setNombres = new HashSet<>();

        // Map
            // Clave > Valor, no puede existir otra Clave igual, accede por Clave
        HashMap<String, Integer> mapNombres = new HashMap<>();

        listNombres.add("Kevin");
        listNombres.add("Ana");
        listNombres.add("Danna");

        setNombres.add("Kevin");
        setNombres.add("Ana");
        setNombres.add("Danna");

        mapNombres.put("Kevin", 27);
        mapNombres.put("Ana", 26);
        mapNombres.put("Danna", 16);

        System.out.println(listNombres);
        System.out.println();
        System.out.println(setNombres);
        System.out.println();
        System.out.println(mapNombres);
    }
}
