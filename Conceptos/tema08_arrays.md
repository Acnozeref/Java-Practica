# Tema 08 — Arrays

**Proyecto:** `Java-Practica`
**Paquete del código:** `tema08_arrays`
**Carpeta de código:** [`src/tema08_arrays`](../src/tema08_arrays)
**Nivel:** inicial–intermedio
**Objetivo:** guardar muchos valores del mismo tipo en una sola variable,
recorrerlos, buscarlos, modificarlos y trabajar con matrices (arrays de arrays).

> Este es el paquete con más clases del proyecto (71). Para que el apunte sea
> útil, las clases se agrupan por **familias** en lugar de listarlas una por una.

---

## 1. Conceptos que se aprenden

| Concepto | Qué se practica |
|---|---|
| Array | Estructura de tamaño fijo que guarda varios valores del mismo tipo. |
| Declaración | `tipo[] nombre;` |
| Inicialización | Con llaves `{10, 20, 30}` o con `new tipo[tamaño]`. |
| Índice | Posición de un elemento; **empieza en 0**. |
| `length` | Cantidad de elementos (no confundir con el último índice). |
| Valor por defecto | `0`, `0.0`, `false`, `null` según el tipo. |
| Recorrido con `for` | Se controla el índice y se puede modificar el array. |
| `for-each` | Recorre valores sin índice; no permite modificar el array. |
| Acumulador / contador | Sumar, promediar o contar elementos. |
| Máximo / mínimo | Recorrer comparando contra el mejor valor encontrado. |
| Búsqueda lineal | Recorrer hasta encontrar; posición `-1` si no existe. |
| Bandera (`boolean`) | Recordar si algo se encontró. |
| `break` | Cortar la búsqueda al encontrar el primer resultado. |
| Tamaño fijo | Insertar/eliminar exige crear un array nuevo. |
| Array bidimensional | Matriz: array de filas, cada fila es otro array. |
| Matriz irregular | Filas con distinta cantidad de columnas. |
| `java.util.Arrays` | Utilidades: `toString`, `deepToString`, `sort`, `binarySearch`, `equals`, `copyOf`, `fill`. |
| Comparar `String` | Con `.equals()`, no con `==`. |
| Conversión a `double` | `(double) suma / cantidad` para conservar decimales. |

### Detalle de cada concepto

- **Tamaño fijo**: al crear el array se reserva su espacio y no puede crecer ni
  encogerse. Para "insertar" o "eliminar" se crea otro array con la nueva
  longitud (`ArrayInsertar`, `ArrayEliminar`).
- **Índices**: en un array de 5 elementos, los índices válidos son `0…4`.
  Usar `5` lanza `ArrayIndexOutOfBoundsException`.
- **Valores por defecto**: con `new int[3]` todos valen `0`; con `String` valen
  `null` (se ve en `ArraysTipos` y `ArrayTamaño`).
- **`for` vs `for-each`**: `for-each` es más corto y seguro, pero no da el
  índice ni permite cambiar el array (`for (int n : numeros) n = 0;` no modifica
  nada). Para posición o modificación se usa `for` clásico.
- **Promedios**: si `suma` y la cantidad son `int`, la división pierde
  decimales. Se corrige con `(double) suma / numeros.length`.
- **Búsqueda**: se usa una bandera `encontrado` y, si solo interesa la primera
  aparición, un `break` (búsqueda lineal). Posición `-1` significa "no está".
- **Matrices**: `matriz.length` son las filas; `matriz[fila].length` las
  columnas de esa fila. Por eso se anidan dos bucles.
- **`Arrays.toString`** muestra el contenido; imprimir el array directamente
  (`System.out.println(numeros)`) muestra algo como `[I@1b6d3586`.
- **`Arrays.deepToString`** es la versión para matrices.
- **`Arrays.binarySearch`** exige el array **ordenado**; si no, el resultado no
  es fiable. Devuelve un índice negativo si no encuentra.
- **`Arrays.fill(array, desde, hasta, valor)`** llena desde `desde` (incluido)
  hasta `hasta` (**excluido**).
- **`==` entre arrays** compara referencias, no contenido. Para contenido:
  `Arrays.equals` (1D) o `Arrays.deepEquals` (2D).

---

## 2. Clases del paquete (71) por familias

### 2.1 Fundamentos de un array

| Clase | Idea principal |
|---|---|
| `ArrayBasico` | Crear arrays de `int` y `String`, recorrerlos con `for`. |
| `ArraysTipos` | `double`, `String` y `boolean`; valores por defecto. |
| `ArrayTamaño` | `length` y cómo se rellenan las posiciones no asignadas. |
| `ArrayForEach` | Recorrer sin índice con `for-each`. |
| `ArrayInverso` | Recorrer del último al primero con `i--`. |

### 2.2 Recorrido, cálculos y búsqueda de valores

| Clase | Idea principal |
|---|---|
| `ArraySuma` | Acumulador con `for`. |
| `ArraySumarForEach` | Mismo resultado con `for-each`. |
| `ArrayPromedio` | Suma / `length`, con conversión a `double`. |
| `ArrayPromedioForEach` | Promedio con `for-each`. |
| `ArrayMayor` | Máximo partiendo del primer elemento. |
| `ArrayMenor` | Mínimo con la misma lógica. |
| `ArrayContar` | Contar cuántas veces aparece un valor. |
| `ArrayContarMayores` | Contar elementos que superan un límite. |
| `ArrayPositivosNegativos` | Contar positivos y negativos. |
| `ArrayPrimerNegativo` | Bandera + `break` para el primer negativo. |
| `ArraySumarPares` | Acumular solo los pares (`% 2 == 0`). |
| `ArrayParesForEach` | Mostrar solo los pares con `for-each`. |

### 2.3 Búsqueda, posición y arrays de `String`

| Clase | Idea principal |
|---|---|
| `ArrayBuscar` | Búsqueda lineal con bandera (sin `break`). |
| `ArrayBuscarForEach` | Igual, pero con `for-each` y `break`. |
| `ArrayPosicion` | Guardar el índice de la primera aparición (`-1` si no está). |
| `ArrayString` | Buscar un nombre con `.equals()`. |
| `ArrayStringPosicion` | Nombre + posición encontrada. |
| `ArrayStringContar` | Contar repeticiones de un `String`. |

### 2.4 Comparar, copiar, insertar y eliminar

| Clase | Idea principal |
|---|---|
| `ArrayComparar` | Comparar posición por posición (asume mismo tamaño). |
| `ArrayCompararSeguro` | Verificar `length` antes de comparar. |
| `ArrayCompararTamaño` | Comparar longitudes con `==`. |
| `ArrayContarIguales` | Contar posiciones que coinciden. |
| `ArrayCopiar` | Crear otro array y llenarlo en orden inverso. |
| `ArrayInsertar` | Crear un array más grande y desplazar elementos. |
| `ArrayEliminar` | Crear un array más pequeño y saltar la posición. |

### 2.5 Utilidades de `java.util.Arrays`

| Clase | Método | Idea principal |
|---|---|---|
| `ArraySort` | `Arrays.sort` | Ordenar de menor a mayor (modifica el array). |
| `ArrayBinarySearch` | `Arrays.binarySearch` | Búsqueda binaria sobre array ordenado. |
| `ArrayEquals` | `Arrays.equals` | Comparar contenido de dos arrays. |
| `ArrayCopyOf` | `Arrays.copyOf` | Copiar/recortar a una nueva longitud. |
| `ArrayFill` | `Arrays.fill` | Rellenar un rango con el mismo valor. |
| `ArrayToString` | `Arrays.toString` | Imprimir el contenido de forma legible. |
| `ArrayDeepToString` | `Arrays.deepToString` | Imprimir matrices. |

### 2.6 Arrays como parámetros de métodos

| Clase | Método | Idea principal |
|---|---|---|
| `ArrayMetodoParametro` | `contarPares(int[])` | Pasar un array a un método y recorrerlo con `for-each`. |
| `ArrayMetodoMatriz` | `sumarMatriz(int[][])` | Recorrer una matriz recibida como parámetro. |
| `ArrayMetodoMatrizPares` | `contarPares(int[][])` | Contar pares dentro de una matriz. |

### 2.7 Matrices con datos fijos

| Clase | Idea principal |
|---|---|
| `ArrayBidimensional` | **Resumen de 7 ejercicios**: crear/acceder, recorrer, sumar, mayor, menor, promedio, buscar y contar. |
| `ArrayBidimensionalNuevo` | Crear una matriz `4×5` con `new` y llenarla del 1 al 20. |
| `ArrayIrregular` | Matriz irregular: filas de 2, 3, 1 y 4 columnas. |

### 2.8 Matrices con `Scanner` (16 clases)

| Clase | Qué hace |
|---|---|
| `ArrayBidimensionalScanner` | Pedir filas/columnas y mostrar la matriz. |
| `ArrayBidimensionalSuma` | Sumar todos los elementos. |
| `ArrayBidimensionalSumaFilas` | Suma de cada fila. |
| `ArrayBidimensionalSumaColumnas` | Suma de cada columna. |
| `ArrayBidimensionalSumarPares` | Sumar solo los pares. |
| `ArrayBidimensionalPromedio` | Promedio de la matriz. |
| `ArrayBidimensionalBuscar` | Buscar un número (sí/no). |
| `ArrayBidimensionalBuscarPosicion` | Buscar y mostrar fila/columna. |
| `ArrayBidimensionalContar` | Contar apariciones de un número. |
| `ArrayBidimensionalMayor` | Mayor de toda la matriz. |
| `ArrayBidimensionalMenor` | Menor de toda la matriz. |
| `ArrayBidimensionalMayorFilas` | Mayor de cada fila. |
| `ArrayBidimensionalMenorFilas` | Menor de cada fila. |
| `ArrayBidimensionalMayorColumnas` | Mayor de cada columna. |
| `ArrayBidimensionalMenorColumnas` | Menor de cada columna. |
| `ArrayBidimensionalPositivosNegativos` | Contar positivos, negativos y ceros. |

### 2.9 Arrays 1D con `Scanner` (11 clases)

| Clase | Qué hace |
|---|---|
| `ArrayScanner` | Leer `n` números y mostrarlos con `Arrays.toString`. |
| `ArrayScannerSuma` | Leer y sumar. |
| `ArrayScannerBuscar` | Leer y buscar un número. |
| `ArrayScannerContar` | Leer y contar apariciones. |
| `ArrayScannerMayor` | Leer y obtener el mayor. |
| `ArrayScannerMenor` | Leer y obtener el menor. |
| `ArrayScannerPromedio` | Leer y promediar. |
| `ArrayScannerSumaPares` | Sumar los pares leídos. |
| `ArrayScannerPromedioPares` | Promedio solo de los pares (avisa si no hay). |
| `ArrayScannerPositivosNegativos` | Contar positivos, negativos y ceros. |
| `ArrayScannerMayorPares` | Mayor de los pares (bandera si no hay). |

### 2.10 Proyecto integrador

| Clase | Idea principal |
|---|---|
| `Integracion` | Pedir una matriz, y con métodos propios calcular suma, mayor, pares y búsqueda; usa `Arrays.deepToString`. |

---

## 3. Relación entre las clases

Las 71 clases son **independientes**: cada una tiene su `main` y ninguna llama a
otra clase del paquete. La relación es **conceptual**: comparten patrones y en
varios casos una clase es la versión simplificada de otra.

```
Fundamentos 1D ──> cálculos ──> búsqueda ──> comparar/copiar
      │                                          │
      └──> Arrays.* (utilidades)                 │
      │                                          │
      └──> arrays como parámetros <──────────────┘
      │
      └──> matrices 2D (fijas / Scanner) ──> Integracion
```

| Aspecto | Situación en este tema |
|---|---|
| ¿Usan objetos? | No: todo son métodos `static` y `main`. |
| ¿Comparten datos? | No: cada `main` declara sus arrays. |
| ¿Herencia o composición? | No (llegan en el tema 09). |
| ¿Llamadas entre clases? | No; solo a métodos de la propia clase y a `java.util.Arrays`. |
| Reutilización | `Integracion` reúne en métodos lo practicado en las matrices. |

**Pares didácticos útiles**

| Comparación | Diferencia |
|---|---|
| `ArraySuma` vs `ArraySumarForEach` | `for` con índice vs `for-each`. |
| `ArrayPromedio` vs `ArrayPromedioForEach` | Mismo cálculo, dos recorridos. |
| `ArrayBuscar` vs `ArrayBuscarForEach` | Sin `break` vs con `break`. |
| `ArrayComparar` vs `ArrayCompararSeguro` | Asumir mismo tamaño vs comprobarlo. |
| `ArrayCopiar` vs `ArrayToString` | Misma lógica de inversión; uno imprime paso a paso y el otro con `Arrays.toString`. |
| `ArrayBidimensional` vs las 16 clases con `Scanner` | Resumen con datos fijos vs ejercicios interactivos. |

> Relación con temas anteriores: `for`/`while` (tema 06) y los métodos con
> parámetros/return (tema 07) son la base de todo el tema; `Scanner` (tema 04)
> alimenta las variantes interactivas y los condicionales (tema 05) permiten
> filtrar y contar.

---

## 4. Cómo ejecutar

Desde la raíz del proyecto:

```bash
# compilar todo el tema
javac -d out src/tema08_arrays/*.java

# clase con datos fijos
java -cp out tema08_arrays.ArrayBasico
java -cp out tema08_arrays.ArrayBidimensional

# clases interactivas (piden datos)
java -cp out tema08_arrays.ArrayScanner
java -cp out tema08_arrays.ArrayBidimensionalScanner
java -cp out tema08_arrays.Integracion
```

> Las clases `ArrayCompararTamaño` y `ArrayTamaño` llevan `ñ` en el nombre: hay
> que escribirla también al ejecutar (`tema08_arrays.ArrayTamaño`).

---

## 5. Resultado esperado

### Clases con datos fijos (resumen)

| Clase | Salida |
|---|---|
| `ArraySuma` | `Suma de todos los numeros: 150` |
| `ArrayPromedio` | `Promedio: 30.0` |
| `ArrayMayor` | `Numero mayor: 42` |
| `ArrayMenor` | `Numero menor: 8` |
| `ArrayContar` | `Cuantas veces se encuentra 20: 3` |
| `ArrayContarMayores` | `Cantidad de números mayores que 20: 3` |
| `ArrayPositivosNegativos` | `Positivos: 3` / `Negativos: 3` |
| `ArrayPrimerNegativo` | `No hay numeros negativos` |
| `ArrayPosicion` | `Resultado indice : 2` |
| `ArrayBuscar` | `Encontrado: true` |
| `ArrayBuscarForEach` | `Encontrado: false` |
| `ArrayString` | `Nombre encontrado: true` |
| `ArrayStringPosicion` | `Nombre encontrado en la posicion: 2` |
| `ArrayStringContar` | `El nombre aparece 3 veces` |
| `ArraySort` | `[40, 10, 50, 20, 30]` y luego `[10, 20, 30, 40, 50]` |
| `ArrayBinarySearch` | `Numero encontrado en la posicion: 3` / `Numero no encontrado` |
| `ArrayToString` | `[50, 40, 30, 20, 10]` |
| `ArrayCopyOf` | `[10, 20, 30]` |
| `ArrayFill` | `[1, 10, 10, 10, 5]` |
| `ArrayEquals` | `false` |
| `ArrayContarIguales` | `Cantidad de posiciones iguales: 3` |
| `ArrayInsertar` | `[10, 20, 25, 30, 40, 50]` |
| `ArrayEliminar` | `[10, 20, 40, 50]` |
| `ArraySumarPares` | `Suma de numeros pares: 48` |
| `ArrayMetodoParametro` | `Cantidad de pares: 3` |
| `ArrayMetodoMatriz` | `La suma es: 450` |
| `ArrayMetodoMatrizPares` | `Cantidad de pares en la matriz: 5` |
| `ArrayDeepToString` | `[[10, 20, 30], [40, 50, 60], [70, 80, 90]]` |

**`ArrayBasico`**

```
10
20
30
40
50
Kevin
Ana
Luis
Pedro
```

**`ArrayTamaño`** (las tres últimas posiciones valen `0` por defecto)

```
10
20
30
40
50
1
2
3
0
0
0
```

**`ArrayInverso`**

```
50
40
30
20
10
```

**`ArrayIrregular`** (cada fila tiene distinto número de columnas)

```
10 20 
30 40 50 
60 
70 80 90 100 
```

**`ArrayBidimensionalNuevo`**

```
Filas: 4
Columnas: 5
1 2 3 4 5 
6 7 8 9 10 
11 12 13 14 15 
16 17 18 19 20 
```

**`ArrayComparar`**

```
Posicion 0: Iguales
Posicion 1: Diferentes
Posicion 2: Iguales
Posicion 3: Diferentes
Posicion 4: Iguales
```

> Las clases con `Scanner` dependen de los datos introducidos; sus mensajes se
> ven en el código y no tienen una salida única.

---

## 6. Errores típicos en este tema

- Usar el índice `length` como si fuera el último: `numeros[numeros.length]`
  lanza `ArrayIndexOutOfBoundsException`.
- Olvidar que los índices empiezan en `0`.
- Intentar cambiar el tamaño de un array (`numeros.length = 10`): no se puede.
- Imprimir el array directamente y obtener `[I@...` en lugar del contenido.
- Comparar arrays con `==`: compara referencias, no valores.
- Comparar `String` con `==` en lugar de `.equals()`.
- Usar `for-each` para modificar valores: el cambio se pierde.
- Usar `for-each` cuando se necesita el índice.
- Calcular un promedio con división entera y perder los decimales (sin
  `(double)`).
- Llamar `Arrays.binarySearch` sin ordenar antes.
- Creer que `Arrays.fill(a, 1, 4, 10)` incluye la posición `4` (el límite final
  es exclusivo).
- Copiar con `int[] b = a;` y creer que son arrays independientes.
- En matrices, usar `matriz.length` para las columnas (son las filas;
  las columnas son `matriz[0].length`).
- Asumir que todas las filas de una matriz tienen el mismo tamaño
  (`ArrayIrregular`).
- En `ArrayComparar`, comparar arrays de distinta longitud (por eso existe
  `ArrayCompararSeguro`).
- Olvidar el `break` del bucle externo al buscar en una matriz: se siguen
  recorriendo las filas restantes aunque ya se encontró el valor.

### Detalles del código que conviene conocer

- `ArrayCopiar` no copia: llena el nuevo array **en orden inverso**.
- `ArrayCompararTamaño` imprime el mismo mensaje en el `if` y en el `else`; el
  texto no distingue el resultado (solo cambia el `boolean`).
- `ArrayScannerSuma` imprime la suma dos veces.
- `ArrayPrimerNegativo` usa datos sin negativos, así que siempre muestra
  `No hay numeros negativos`.
- `ArrayBidimensional` (365 líneas) repite como resumen los ejercicios que
  existen por separado.

---

## 7. Ejercicios de refuerzo

1. `ArrayBasico`: añadir un array de `double` y recorrerlo con `for-each`.
2. Crear un método `sumar(int[])` y reutilizarlo en `ArraySuma`.
3. En `ArrayPosicion`, devolver **todas** las posiciones del valor buscado.
4. En `ArrayComparar`, comprobar primero el tamaño usando la lógica de
   `ArrayCompararSeguro`.
5. Ordenar un array con `Arrays.sort` y buscar con `binarySearch` un valor que
   no exista; interpretar el índice negativo.
6. Crear `ArrayRotar.java` que desplace los elementos una posición a la derecha.
7. Con `Scanner`, pedir una matriz y calcular el mayor de cada fila y de cada
   columna en el mismo programa.
8. Unir en una sola clase las funciones de `Integracion` y añadir el promedio.

---

## 8. Checklist de dominio

- [ ] Declaro e inicializo arrays con llaves y con `new`.
- [ ] Sé que el índice empieza en `0` y que `length` no es un índice válido.
- [ ] Recorro con `for` y con `for-each`, y sé cuándo usar cada uno.
- [ ] Calculo suma, promedio, máximo, mínimo y conteos.
- [ ] Implemento búsqueda lineal y devuelvo `-1` si no existe.
- [ ] Distingo comparar con `==` de `Arrays.equals`.
- [ ] Uso `Arrays.toString`, `deepToString`, `sort`, `binarySearch`, `copyOf` y
      `fill` con sus límites correctos.
- [ ] Creo matrices, las recorro con dos bucles y distingo filas de columnas.
- [ ] Entiendo que el tamaño es fijo y cómo insertar/eliminar creando otro array.
- [ ] Paso arrays a métodos y los recorro dentro.

---

## Siguiente tema

[`tema09_poo`](tema09_poo.md) — programación orientada a objetos: clases,
objetos, encapsulamiento, herencia, polimorfismo, abstracción, interfaces,
composición y `static`.
