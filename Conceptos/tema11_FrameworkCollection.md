# Tema 11 — Framework de colecciones

**Proyecto:** `Java-Practica`  
**Paquete:** `tema11_FrameworkCollection`  
**Carpeta de código:** [`src/tema11_FrameworkCollection`](../src/tema11_FrameworkCollection)  
**Nivel:** intermedio  
**Objetivo:** conocer las colecciones más utilizadas de Java (`ArrayList`, `LinkedList`, `HashSet`, `HashMap` e `Iterator`), saber cuándo usar cada una y practicar sus operaciones básicas.

---

## Índice de temas

- [1. Framework de colecciones](#1-framework-de-colecciones)
- [2. ArrayList: creación y modificación](#2-arraylist-creación-y-modificación)
- [3. Consulta y búsqueda en ArrayList](#3-consulta-y-búsqueda-en-arraylist)
- [4. Recorrido de listas](#4-recorrido-de-listas)
- [5. LinkedList](#5-linkedlist)
- [6. HashSet](#6-hashset)
- [7. HashMap](#7-hashmap)
- [8. Iterator](#8-iterator)
- [9. Comparación entre colecciones](#9-comparación-entre-colecciones)

---

## 1. Framework de colecciones

**Conceptos estudiados:**
- Qué es el Framework de Colecciones de Java.
- Diferencia entre arrays y colecciones.
- Interfaces principales: `List`, `Set` y `Map`.
- Implementaciones: `ArrayList`, `LinkedList`, `HashSet` y `HashMap`.
- Uso de genéricos para indicar el tipo de contenido (`ArrayList<String>`).
- Importación de colecciones desde `java.util`.

**Clases relacionadas:**
- `CompararColecciones.java` — crea una lista, un conjunto y un mapa con los mismos datos para comparar su comportamiento.

**Resumen de las estructuras:**

| Interfaz | Implementación | Característica principal |
|---|---|---|
| `List` | `ArrayList`, `LinkedList` | Mantiene el orden de inserción, permite duplicados y acceso por índice. |
| `Set` | `HashSet` | No permite duplicados y no garantiza el orden de los elementos. |
| `Map` | `HashMap` | Guarda pares clave-valor; las claves no se repiten. |

A diferencia de un array, las colecciones pueden crecer o reducirse de forma dinámica.

## 2. ArrayList: creación y modificación

**Conceptos estudiados:**
- Creación de un `ArrayList`.
- Agregar elementos con `add()`.
- Eliminar por índice con `remove(int)`.
- Eliminar por objeto con `remove(Object)`.
- Consultar la cantidad de elementos con `size()`.
- Vaciar una lista con `clear()`.

**Clases relacionadas:**
- `ArrayListPractica.java` — crea una lista con `add()` y muestra sus elementos.
- `ArrayListEliminar.java` — elimina a “Kevin” por índice y a “Carlos” por objeto; la lista final es `[Ana, Danna]` y `size()` devuelve `2`.

**Diferencia importante:** `remove(0)` elimina la posición `0`, mientras que `remove("Carlos")` elimina el objeto indicado. Al eliminar por índice, los elementos siguientes se desplazan una posición.

## 3. Consulta y búsqueda en ArrayList

**Conceptos estudiados:**
- Obtener un elemento con `get(indice)`.
- Reemplazar un elemento con `set(indice, valor)`.
- Comprobar si existe un elemento con `contains()`.
- Buscar la primera posición con `indexOf()`.
- Buscar la última posición con `lastIndexOf()`.
- Los índices empiezan en `0`; si el elemento no existe, `indexOf()` devuelve `-1`.

**Clases relacionadas:**
- `ArrayListConsultar.java` — obtiene “Ana” con `get(1)`, cambia “Luis” por “Alejandro” con `set(2, ...)` y comprueba “Kevin” con `contains()`.
- `ArrayListBuscar.java` — busca “Danna”, “Ana” y “Carlos” (este último repetido) para comparar `indexOf()` y `lastIndexOf()`.

**Resultados de `ArrayListConsultar`:** `Ana`, `true`, `[Kevin, Ana, Alejandro, Carlos]`.

**Resultados de `ArrayListBuscar`:** `true`, `2`, `1`, `5`. “Carlos” aparece en las posiciones `1` y `5`.

## 4. Recorrido de listas

**Conceptos estudiados:**
- Recorrido con `for` clásico usando `size()` y `get(i)`.
- Recorrido con `for-each`.
- Cuándo conviene cada uno.
- El `for-each` no proporciona el índice del elemento.

**Clases relacionadas:**
- `ArrayListRecorrer.java` — recorre la misma lista dos veces: primero con `for` y después con `for-each`.

**Uso recomendado:**

- Usar `for` clásico cuando se necesita el índice, modificar la lista o acceder a posiciones concretas.
- Usar `for-each` cuando solo se quiere leer cada elemento de forma más sencilla.

## 5. LinkedList

**Conceptos estudiados:**
- Creación de una `LinkedList`.
- Diferencias con `ArrayList`.
- Acceso al primer y último elemento con `getFirst()` y `getLast()`.
- Operaciones en los extremos: `addFirst()`, `addLast()`, `removeFirst()` y `removeLast()`.

**Clases relacionadas:**
- `LinkedListPractica.java` — crea una lista, muestra su contenido y consulta el primer y el último elemento. Los métodos de los extremos aparecen comentados como alternativa.

**Resultado esperado:** `[Kevin, Carlos, Ana, Danna]`, `Kevin`, `Danna`.

`LinkedList` está pensada para insertar y eliminar elementos en los extremos; `ArrayList` suele ser más eficiente para el acceso por índice.

## 6. HashSet

**Conceptos estudiados:**
- Creación de un `HashSet`.
- Almacenamiento sin elementos duplicados.
- Uso de `add()` y `size()`.
- Orden no garantizado de los elementos.
- `add()` devuelve `false` si el elemento ya existía.

**Clases relacionadas:**
- `HashSetPractica.java` — añade “Kevin” dos veces y comprueba que el conjunto termina con 5 elementos.

**Resultado esperado:** el conjunto contiene 5 nombres, no 6, porque el segundo “Kevin” se ignora. El orden de impresión puede variar entre ejecuciones.

## 7. HashMap

**Conceptos estudiados:**
- Estructura de pares clave-valor.
- Agregar o actualizar con `put()`.
- Obtener un valor con `get()`.
- Comprobar una clave con `containsKey()`.
- Eliminar con `remove()`.
- Consultar el número de pares con `size()`.
- Claves únicas: un segundo `put()` con la misma clave reemplaza el valor.
- Orden no garantizado de las claves.

**Clases relacionadas:**
- `HashMapPractica.java` — guarda nombres con sus edades, consulta la edad de “Danna”, comprueba si existe “Ana” e imprime el mapa completo.

**Resultado esperado:** `16`, `true` y un mapa con 5 pares. El orden de impresión puede variar entre ejecuciones.

**Nota:** `remove()` y `size()` están documentados en los comentarios de la clase, pero no se ejecutan en el ejemplo.

## 8. Iterator

**Conceptos estudiados:**
- Obtención de un iterador con `iterator()`.
- Recorrido con `hasNext()` y `next()`.
- Eliminación segura con `remove()`.
- Diferencia entre eliminar con el iterador y modificar la colección directamente.
- Un iterador agotado no vuelve a recorrer la colección.

**Clases relacionadas:**
- `IteratorPractica.java` — recorre una lista con un iterador y después utiliza uno nuevo para eliminar a “Luis” durante el recorrido.

**Resultado esperado:** primero se imprimen los 5 nombres de la lista. Después se elimina “Luis” y se imprime la lista con los 4 restantes.

**Error típico:** modificar la colección con `remove()` de la lista mientras se recorre con un iterador puede lanzar `ConcurrentModificationException`. Para eliminar durante el recorrido se usa `iterator.remove()`.

## 9. Comparación entre colecciones

**Conceptos estudiados:**
- Comportamiento de `List`, `Set` y `Map` con los mismos datos.
- Duplicados: permitidos en `List`, no en `Set` ni en las claves de `Map`.
- Acceso por índice en `List`.
- Acceso por clave en `Map`.
- Orden de inserción frente a orden no garantizado.

**Clases relacionadas:**
- `CompararColecciones.java` — crea un `ArrayList`, un `HashSet` y un `HashMap` con “Kevin”, “Ana” y “Danna”, y muestra el resultado de cada estructura.

**Comparación:**

| Aspecto | `ArrayList` | `HashSet` | `HashMap` |
|---|---|---|---|
| Duplicados | Sí | No | No en las claves |
| Orden de inserción | Sí | No garantizado | No garantizado |
| Acceso | Por índice | Solo recorrido | Por clave |
| Uso principal | Listas ordenadas | Elementos únicos | Datos asociados |

Los tres ejemplos guardan la misma información, pero cada estructura la organiza de una forma distinta.

---

## Resumen general

Al finalizar este tema, se han estudiado los siguientes conceptos:

1. Qué es el Framework de Colecciones.
2. Diferencias entre arrays y colecciones.
3. Interfaces `List`, `Set` y `Map`.
4. Creación y modificación de `ArrayList`.
5. Eliminación por índice y por objeto.
6. Consulta con `get()` y `set()`.
7. Búsqueda con `contains()`, `indexOf()` y `lastIndexOf()`.
8. Recorrido con `for` y `for-each`.
9. Uso de `LinkedList` y operaciones en los extremos.
10. Elementos únicos con `HashSet`.
11. Pares clave-valor con `HashMap`.
12. Recorrido y eliminación segura con `Iterator`.
13. Comparación entre `List`, `Set` y `Map`.
14. Importancia del orden no garantizado en `HashSet` y `HashMap`.

**Nota de estudio:** este tema no tiene un proyecto integrador; las diez clases son demostraciones independientes. Cada una contiene su propio `main` y se puede ejecutar por separado.

**Estado general del Tema 11:** completado.

---

## Siguiente tema

Este es el último tema con código en el proyecto. Algunos temas recomendados para continuar son:

- Genéricos y colecciones tipadas con mayor profundidad.
- `Streams` y expresiones lambda.
- Pruebas unitarias con JUnit.
- Maven o Gradle para gestionar dependencias.
- Persistencia con JDBC y bases de datos.
- Desarrollo backend con Spring Boot.
