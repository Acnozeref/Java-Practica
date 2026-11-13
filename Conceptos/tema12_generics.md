# Tema 12 — Genéricos (Generics)

**Proyecto:** `Java-Practica`  
**Paquete:** `tema12_generics`  
**Carpeta de código:** [`src/tema12_generics`](../src/tema12_generics)  
**Nivel:** intermedio  
**Objetivo:** parametrizar clases y métodos con tipos para reutilizar código sin perder la seguridad de tipos, aplicar restricciones con `extends` y utilizar comodines (`?`) en colecciones.

---

## Índice de temas

- [1. Fundamentos de genéricos](#1-fundamentos-de-genéricos)
- [2. Clases genéricas](#2-clases-genéricas)
- [3. Métodos genéricos](#3-métodos-genéricos)
- [4. Restricciones de tipo (Bounded Types)](#4-restricciones-de-tipo-bounded-types)
- [5. Wildcards](#5-wildcards)
- [6. Proyecto integrador](#6-proyecto-integrador)

---

## 1. Fundamentos de genéricos

**Conceptos estudiados:**
- Qué son los genéricos.
- Ventajas de utilizar tipos genéricos.
- Seguridad de tipos (*type safety*).
- Inferencia de tipos.
- Diferencia entre usar `Object` y usar un parámetro de tipo.
- Uso de clases envoltorio (`Integer`, `Double`) en lugar de primitivos.

**Clases relacionadas:**
- `Caja.java` — almacena un contenido de tipo `T`; se instancia como `Caja<String>` y `Caja<Integer>`.

**Ventajas principales:**

- **Reutilización:** la misma clase sirve para distintos tipos de datos.
- **Seguridad de tipos:** el compilador rechaza valores incompatibles.
- **Claridad:** no es necesario hacer conversiones (*casts*) manuales.
- **Detección temprana de errores:** el error aparece al compilar, no en ejecución.

**Ejemplo de seguridad de tipos:**

```java
Caja<String> texto = new Caja<>();
texto.setContenido("Manzanas");   // Correcto

Caja<Integer> numero = new Caja<>();
numero.setContenido(20);          // Correcto
// numero.setContenido("Hola");   // Error de compilación
```

**Inferencia de tipos:** el operador diamante `<>` permite que Java deduzca el tipo a partir de la variable: `Caja<String> texto = new Caja<>();`. En los métodos genéricos, el tipo también se deduce del argumento.

## 2. Clases genéricas

**Conceptos estudiados:**
- Declaración de un parámetro de tipo (`<T>`).
- Uso del parámetro en atributos, parámetros y valores de retorno.
- Instanciación con tipos concretos.
- Reutilización de una clase con diferentes tipos.
- Genéricos aplicados a colecciones.

**Clases relacionadas:**
- `Caja.java` — clase genérica mínima con `setContenido()` y `getContenido()`.
- `Almacen.java` — clase genérica que envuelve una `List<T>` y permite agregar y obtener productos.

**Estructura de una clase genérica:**

```java
public class Caja<T> {

    private T contenido;

    public void setContenido(T contenido) {
        this.contenido = contenido;
    }

    public T getContenido() {
        return contenido;
    }
}
```

`T` es el parámetro de tipo y se sustituye por un tipo real al crear el objeto. Por convención se usan nombres como `T` (tipo), `E` (elemento), `K` (clave) y `V` (valor).

**Resultado de `Caja`:** `Manzanas` y `20`.

**Nota:** los genéricos trabajan con tipos de referencia. Para números se usan `Integer`, `Double`, etc., no `int` ni `double`.

## 3. Métodos genéricos

**Conceptos estudiados:**
- Declaración de métodos genéricos.
- Ubicación del parámetro de tipo antes del valor de retorno.
- Métodos genéricos `void`.
- Métodos genéricos con retorno.
- Inferencia del tipo en la llamada.
- Diferencia entre un método genérico y una clase genérica.

**Clases relacionadas:**
- `MetodoGenerico.java` — método `<T> void mostrarDato(T dato)` que imprime el valor recibido.
- `MetodoGenericoReturn.java` — método `<T> T retornar(T dato)` que devuelve el mismo valor.

**Sintaxis:**

```java
public static <T> void mostrarDato(T dato) {
    System.out.println(dato);
}

public static <T> T retornar(T dato) {
    return dato;
}
```

El parámetro `<T>` se declara **antes** del tipo de retorno. No es necesario indicar el tipo al llamar: Java lo infiere del argumento.

**Resultados:**

- `MetodoGenerico`: `Kevin`, `25`, `1.78`.
- `MetodoGenericoReturn`: `Hola Java`, `25`, `1.78`.

## 4. Restricciones de tipo (Bounded Types)

**Conceptos estudiados:**
- Uso de `extends` para restringir el tipo.
- Restricciones mediante una clase padre.
- Declaración `<T extends Number>`.
- Acceso a los métodos del tipo padre.
- Rechazo de tipos no compatibles en compilación.

**Clases relacionadas:**
- `CajaNumericaPractica.java` — clase `<T extends Number>` que solo acepta tipos numéricos.

**Declaración:**

```java
public class CajaNumericaPractica<T extends Number> {

    private T numero;

    public void setNumero(T numero) {
        this.numero = numero;
    }

    public T getNumero() {
        return numero;
    }
}
```

La restricción `T extends Number` permite usar `Integer`, `Double`, `Float`, `Long`, etc., pero no `String`. Además, dentro de la clase se pueden usar los métodos de `Number`, como `doubleValue()`.

**Resultado esperado:** `26` y `1.75`.

**Error típico:** intentar crear `CajaNumericaPractica<String>`; el compilador lo rechaza porque `String` no hereda de `Number`.

## 5. Wildcards

**Conceptos estudiados:**
- Qué son los comodines (`?`).
- Uso de `List<?>`.
- Lectura de elementos como `Object`.
- Restricciones al agregar elementos.
- Wildcards con `extends` y `super`.
- Principio **PECS**: *Producer Extends, Consumer Super*.

**Clases relacionadas:**
- `WildcardPractica.java` — recorre listas de tipos numéricos con `List<? extends Number>`.
- `WildcardSuperPractica.java` — agrega elementos a listas con `List<? super Integer>`.
- `ConsultasGenericas.java` — métodos reutilizables `mostrarProductos(List<?>)` y `sumarNumeros(List<? extends Number>)`.

**Tipos de comodín:**

| Comodín | Significado | Uso principal |
|---|---|---|
| `List<?>` | Lista de tipo desconocido. | Leer elementos como `Object`. |
| `List<? extends Number>` | Lista de `Number` o de sus subclases. | Leer elementos como `Number`; no se pueden agregar. |
| `List<? super Integer>` | Lista de `Integer` o de una superclase. | Agregar elementos `Integer`; se leen como `Object`. |

**Regla práctica:** `extends` sirve para **leer** (el productor) y `super` para **escribir** (el consumidor).

**Ejemplo de `WildcardSuperPractica`:**

```java
public static void agregarEdades(List<? super Integer> lista) {
    lista.add(25);
    lista.add(26);
    lista.add(27);
}
```

El método acepta tanto `List<Integer>` como `List<Number>`, porque ambas pueden recibir un `Integer`.

**Resultados:**

- `WildcardPractica`: `25`, `26`, `1.78`, `1.7`.
- `WildcardSuperPractica`: `[25, 26, 27]` y `[25, 26, 27]`.

**Notas:**

- `WildcardPractica` **sí está implementada** en el paquete.
- `List.of()` crea listas inmutables: no permiten agregar, eliminar ni modificar elementos.
- Con `List<?>` no se puede hacer `add()` de un valor concreto, porque el compilador desconoce el tipo real de la lista.

## 6. Proyecto integrador

## Almacén genérico

**Estado:** implementado y ejecutado correctamente.

### Objetivo

Combinar una clase genérica, una colección y métodos con wildcards para almacenar productos y precios, mostrarlos y calcular un total.

### Conceptos aplicados

- Clases genéricas con `<T>`.
- Atributos de tipo `List<T>`.
- Métodos genéricos y métodos con wildcards.
- `List<?>` para mostrar cualquier tipo de elemento.
- `List<? extends Number>` para operar con valores numéricos.
- Uso de `doubleValue()` para convertir los distintos tipos numéricos.
- Creación de objetos con inferencia de tipos (`new Almacen<>()`).
- Recorrido de colecciones con `for-each`.

### Clases del proyecto

#### `Almacen.java`

Clase genérica que representa un almacén de productos.

Responsabilidades:
- Guardar una `List<T>` internamente.
- Agregar elementos con `agregar(T producto)`.
- Devolver la lista con `getProductos()`.
- Permitir reemplazar la lista con `setProductos()`.

#### `ConsultasGenericas.java`

Clase de utilidades con métodos que aceptan distintos tipos de listas.

Responsabilidades:
- Mostrar cualquier lista con `mostrarProductos(List<?>)`.
- Sumar listas numéricas con `sumarNumeros(List<? extends Number>)`.
- Recorrer los elementos y convertirlos con `doubleValue()`.

#### `MainGenerico.java`

Clase de prueba con `main`.

Instrucciones:
1. Crear un `Almacen<String>` para los productos.
2. Crear un `Almacen<Double>` para los precios.
3. Agregar teclado, mouse y monitor; agregar sus precios.
4. Mostrar ambos almacenes con `mostrarProductos()`.
5. Sumar los precios con `sumarNumeros()` y mostrar el total.

### Resultado esperado

```
Productos
Teclado
Mouse
Monitor

Precios
250.0
120.0
1999.99
Suma total: 
2369.99
```

El proyecto demuestra cómo una misma clase (`Almacen<T>`) sirve para tipos distintos y cómo los métodos con wildcards pueden procesar esas listas sin conocer su tipo exacto.

---

## Resumen general

Al finalizar este tema, se han estudiado los siguientes conceptos:

1. Qué son los genéricos.
2. Ventajas y seguridad de tipos.
3. Inferencia de tipos y operador diamante `<>`.
4. Clases genéricas con `<T>`.
5. Instanciación con tipos concretos.
6. Reutilización de clases con distintos tipos.
7. Métodos genéricos `void` y con retorno.
8. Declaración del parámetro de tipo antes del retorno.
9. Restricciones con `<T extends Number>`.
10. Uso de métodos del tipo padre dentro de una clase restringida.
11. Wildcards con `?`, `? extends` y `? super`.
12. Lectura y escritura según el tipo de comodín.
13. Principio PECS (*Producer Extends, Consumer Super*).
14. Integración de genéricos, colecciones y wildcards en un almacén.

**Nota de estudio:** las clases están separadas para practicar cada concepto. `MainGenerico` integra `Almacen` y `ConsultasGenericas` en un ejemplo completo.

**Estado general del Tema 12:** completado.

---

## Siguiente tema

[`tema13_programacionFuncional`](tema13_programacionFuncional.md) — programación funcional: interfaces funcionales, expresiones lambda, `Predicate`, `Consumer`, `Function`, `Supplier`, referencias a métodos y una práctica integradora.
