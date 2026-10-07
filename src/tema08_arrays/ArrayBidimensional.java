package tema08_arrays;

public class ArrayBidimensional {

    public static void main(String[] args) {

        // Array bidimensional (matriz): un array cuyos elementos son otros arrays.
        // Se puede ver como una tabla con filas y columnas.
        // Sintaxis: tipo[][] nombre = { {fila0}, {fila1}, ... };
        // Aquí: 3 filas y 3 columnas de números int.
        //
        //             columna 0  columna 1  columna 2
        //   fila 0       10         20         30
        //   fila 1       40         50         60
        //   fila 2       70         80         90
        int[][] matriz = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        // =========================================================
        // 0. CREAR Y ACCEDER A UNA MATRIZ
        // =========================================================

        System.out.println("0. Crear y acceder a una matriz");

        // Para acceder a un elemento se usan dos índices: matriz[fila][columna].
        // Ambos empiezan en 0.
        System.out.println("Elemento [1][1]: " + matriz[1][1]); // 50
        System.out.println("Elemento [2][1]: " + matriz[2][1]); // 80


        // =========================================================
        // 1. RECORRER MATRIZ
        // =========================================================

        System.out.println("\n1. Recorrer matriz");

        // Para recorrer una matriz se anidan dos bucles for (un bucle dentro de otro):
        // - El de fuera recorre las filas.
        // - El de dentro recorre las columnas de la fila actual.
        // Longitudes:
        //  matriz.length         cantidad de filas
        //  matriz[fila].length   cantidad de columnas de esa fila
        for (int fila = 0; fila < matriz.length; fila++) {

            for (int columna = 0; columna < matriz[fila].length; columna++) {

                // print (sin salto) deja todos los números de la fila en la misma línea.
                System.out.print(matriz[fila][columna] + " ");
            }

            // Al terminar cada fila se salta de línea.
            System.out.println();
        }


        // =========================================================
        // 2. SUMAR TODOS LOS ELEMENTOS
        // =========================================================

        System.out.println("\n2. Sumar todos los elementos");

        // Acumulador: empieza en 0 y suma cada elemento de la matriz.
        int suma = 0;

        for (int fila = 0; fila < matriz.length; fila++) {

            for (int columna = 0; columna < matriz[fila].length; columna++) {

                suma += matriz[fila][columna];
            }
        }

        System.out.println("Suma: " + suma); // 450


        // =========================================================
        // 3. ENCONTRAR MAYOR
        // =========================================================

        System.out.println("\n3. Encontrar mayor");

        // Se parte del primer elemento como "mayor provisional"
        // y se reemplaza cuando aparece uno más grande.
        int mayor = matriz[0][0];

        for (int fila = 0; fila < matriz.length; fila++) {

            for (int columna = 0; columna < matriz[fila].length; columna++) {

                if (matriz[fila][columna] > mayor) {

                    mayor = matriz[fila][columna];
                }
            }
        }

        System.out.println("Mayor: " + mayor); // 90


        // =========================================================
        // 4. ENCONTRAR MENOR
        // =========================================================

        System.out.println("\n4. Encontrar menor");

        // Igual que el mayor, pero comparando con <.
        int menor = matriz[0][0];

        for (int fila = 0; fila < matriz.length; fila++) {

            for (int columna = 0; columna < matriz[fila].length; columna++) {

                if (matriz[fila][columna] < menor) {

                    menor = matriz[fila][columna];
                }
            }
        }

        System.out.println("Menor: " + menor); // 10


        // =========================================================
        // 5. PROMEDIO
        // =========================================================

        System.out.println("\n5. Promedio");

        // Promedio = suma de todos / cantidad de elementos.
        // Por eso se necesitan dos variables: el acumulador y el contador.
        int sumaPromedio = 0;
        int cantidadElementos = 0;

        for (int fila = 0; fila < matriz.length; fila++) {

            for (int columna = 0; columna < matriz[fila].length; columna++) {

                sumaPromedio += matriz[fila][columna];
                cantidadElementos++;
            }
        }

        // (double) convierte la suma a decimal antes de dividir.
        // Sin esto, int / int daría un entero y se perderían los decimales.
        double promedio = (double) sumaPromedio / cantidadElementos;

        System.out.println("Promedio: " + promedio); // 50.0


        // =========================================================
        // 6. BUSCAR UN ELEMENTO
        // =========================================================

        System.out.println("\n6. Buscar un elemento");

        int buscado = 50;

        // Bandera: pasa a true cuando se encuentra el elemento.
        boolean encontrado = false;

        for (int fila = 0; fila < matriz.length; fila++) {

            for (int columna = 0; columna < matriz[fila].length; columna++) {

                if (matriz[fila][columna] == buscado) {

                    encontrado = true;

                    System.out.println(
                            "Elemento " + buscado +
                                    " encontrado en fila " + fila +
                                    ", columna " + columna
                    ); // fila 1, columna 1

                    // Este break solo sale del bucle de columnas (el de dentro).
                    break;
                }
            }

            // Para salir también del bucle de filas hace falta otro break.
            // Se usa la bandera para saber si ya se encontró.
            if (encontrado) {
                break;
            }
        }

        // Si después de recorrer todo la bandera sigue en false, no existe.
        if (!encontrado) {

            System.out.println("Elemento " + buscado + " no encontrado");
        }


        // =========================================================
        // 7. CONTAR ELEMENTOS QUE CUMPLEN UNA CONDICIÓN
        // =========================================================

        System.out.println("\n7. Contar elementos que cumplen una condición");

        int limite = 50;

        // Contador: sube 1 por cada elemento que cumple la condición.
        int contador = 0;

        for (int fila = 0; fila < matriz.length; fila++) {

            for (int columna = 0; columna < matriz[fila].length; columna++) {

                if (matriz[fila][columna] >= limite) {

                    contador++;
                }
            }
        }

        System.out.println(
                "Elementos mayores o iguales a " +
                        limite + ": " + contador
        ); // 5


        // ---------------------------------------------------------
        // Suma por fila
        // ---------------------------------------------------------
        // Ahora los resultados son por fila, no uno global:
        // el acumulador se reinicia a 0 al empezar cada fila.
        int sumaFila;

        for (int fila = 0; fila < matriz.length; fila++) {

            sumaFila = 0;

            for (int columna = 0; columna < matriz[fila].length; columna++) {

                sumaFila += matriz[fila][columna];
            }

            // Se imprime fuera del bucle de columnas: un mensaje por fila.
            System.out.println("Suma fila " + fila + ": " + sumaFila); // 60, 150, 240
        }


        // ---------------------------------------------------------
        // Suma por columna
        // ---------------------------------------------------------
        // Para recorrer por columnas se invierte el orden de los bucles:
        // el de fuera recorre las columnas y el de dentro las filas.
        // matriz[0].length es la cantidad de columnas (longitud de la primera fila).
        int sumaColumna;

        for (int columna = 0; columna < matriz[0].length; columna++) {

            sumaColumna = 0;

            for (int fila = 0; fila < matriz.length; fila++) {

                sumaColumna += matriz[fila][columna];
            }

            System.out.println("Suma columna " + columna + ": " + sumaColumna); // 120, 150, 180
        }


        // ---------------------------------------------------------
        // Mayor de cada fila
        // ---------------------------------------------------------
        int mayorFila;

        for (int fila = 0; fila < matriz.length; fila++) {
            // asumimos que el primer elemento de la fila es el mayor provisional;
            // se reinicia en cada vuelta de fila
            mayorFila = matriz[fila][0];

            for (int columna = 0; columna < matriz[fila].length; columna++ ) {
                // se recorren las columnas de la fila y se guarda el mayor encontrado
                if (matriz[fila][columna] > mayorFila) {
                    mayorFila = matriz[fila][columna];

                }
              // fuera del bucle de columnas, evita múltiples mensajes:
              // solo se muestra el valor final de mayorFila
            } System.out.println("Mayor de cada fila " + fila + ": " + mayorFila); // 30, 60, 90
        }


        // ---------------------------------------------------------
        // Menor de cada fila
        // ---------------------------------------------------------
        int menorFila;

        for (int fila = 0; fila < matriz.length; fila++) {
            // asumimos que el primer elemento de la fila es el menor provisional
            menorFila = matriz[fila][0];

            for (int columna = 0; columna < matriz[fila].length; columna++ ) {
                // se recorren las columnas de la fila y se guarda el menor encontrado
                if (matriz[fila][columna] < menorFila) {
                    menorFila = matriz[fila][columna];

                }
                // fuera del bucle de columnas, evita múltiples mensajes:
                // solo se muestra el valor final de menorFila
            } System.out.println("Menor de cada fila " + fila + ": " + menorFila); // 10, 40, 70
        }


        // ---------------------------------------------------------
        // Mayor de cada columna
        // ---------------------------------------------------------
        int mayorColumna;


        // matriz[0].length: matriz[0] es la fila 0 (un array con sus 3 columnas)
        // y .length da su longitud, es decir, la cantidad de columnas.
        // Se usa la fila 0 porque en esta matriz todas las filas miden lo mismo.
        //
        //  matriz[0]  ->  {10, 20, 30}  ->  .length = 3
        for (int columna = 0; columna < matriz[0].length; columna++) {

            // Tomamos el primer elemento de la columna como mayor inicial
            mayorColumna = matriz[0][columna];

            for (int fila = 0; fila < matriz.length; fila++) {

                // Se compara cada elemento de la columna con el mayor actual
                if (matriz[fila][columna] > mayorColumna) {

                    // Se actualiza mayorColumna
                    mayorColumna = matriz[fila][columna];
                }
            }

            System.out.println("Mayor de la columna " + columna + ": " + mayorColumna); // 70, 80, 90
        }


        // ---------------------------------------------------------
        // Menor de cada columna
        // ---------------------------------------------------------
        int menorColumna;

        // matriz[0].length: cantidad de columnas (explicado arriba).
        for (int columna = 0; columna < matriz[0].length; columna++) {

            // Tomamos el primer elemento de la columna como menor inicial
            menorColumna = matriz[0][columna];

            for (int fila = 0; fila < matriz.length; fila++) {

                // Se compara cada elemento de la columna con el menor actual
                if (matriz[fila][columna] < menorColumna) {

                    // Se actualiza menorColumna
                    menorColumna = matriz[fila][columna];
                }
            }

            System.out.println("Menor de la columna " + columna + ": " + menorColumna); // 10, 20, 30
        }
    }

}
