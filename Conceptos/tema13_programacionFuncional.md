# Tema 13 — Programación funcional

**Proyecto:** `Java-Practica`  
**Paquete:** `tema13_programacionFuncional`  
**Carpeta de código:** [`src/tema13_programacionFuncional`](../src/tema13_programacionFuncional)  
**Nivel:** intermedio  
**Objetivo:** introducir la programación funcional en Java mediante interfaces funcionales y expresiones lambda, conocer las interfaces `Predicate`, `Consumer`, `Function` y `Supplier`, y aplicar referencias a métodos en una práctica integradora.

---

## Índice de temas

- [1. Introducción a la programación funcional](#1-introducción-a-la-programación-funcional)
- [2. Interfaces funcionales](#2-interfaces-funcionales)
- [3. Expresiones Lambda](#3-expresiones-lambda)
- [4. Sintaxis y parámetros Lambda](#4-sintaxis-y-parámetros-lambda)
- [5. Predicate](#5-predicate)
- [6. Consumer](#6-consumer)
- [7. Function](#7-function)
- [8. Supplier](#8-supplier)
- [9. Referencias a métodos](#9-referencias-a-métodos)
- [10. Práctica integradora](#10-práctica-integradora)

---

## 1. Introducción a la programación funcional

**Conceptos estudiados:**
- Qué es la programación funcional.
- Implementación de comportamientos mediante interfaces.
- Diferencia entre una implementación tradicional y una expresión lambda.
- Paso de comportamiento como argumento o valor.
- Código más declarativo y reutilizable.

**Clases relacionadas:**
- `Operacion.java` — interfaz funcional con el método `ejecutar()`.
- `IntroduccionFuncional.java` — implementación tradicional de `Operacion` mediante `implements` y `@Override`.

**Implementación tradicional:**

```java
public class IntroduccionFuncional implements Operacion {

    @Override
    public void ejecutar() {
        System.out.println("Aprendiendo programacion funcional.");
    }
}
```

**Alternativa con lambda:**

```java
Operacion operacion = () -> System.out.println("Aprendiendo programacion funcional.");
operacion.ejecutar();
```

| Aspecto | Implementación tradicional | Expresión lambda |
|---|---|---|
| Código necesario | Clase completa con `implements` y `@Override`. | Una sola expresión. |
| Reutilización | La clase se puede instanciar varias veces. | La lambda se guarda en una variable. |
| Legibilidad | Más verbosa. | Más compacta para comportamientos simples. |

**Nota:** `IntroduccionFuncional` no tiene `main`, por lo que no se ejecuta por sí sola. Para probarla habría que crear un objeto y llamar a `ejecutar()` desde otra clase.

## 2. Interfaces funcionales

**Conceptos estudiados:**
- Qué es una interfaz funcional.
- La anotación `@FunctionalInterface`.
- Una única operación abstracta (*SAM*: *Single Abstract Method*).
- Uso de una interfaz funcional como tipo de una lambda.
- Diferencia entre una interfaz y una clase.

**Clases relacionadas:**
- `Calculadora.java` — interfaz funcional con `int calcular(int num1, int num2)`.

**Declaración:**

```java
@FunctionalInterface
public interface Calculadora {
    int calcular(int num1, int num2);
}
```

`Calculadora` **es una interfaz, no una clase**. `@FunctionalInterface` es opcional, pero ayuda al compilador a comprobar que existe exactamente un método abstracto; si se añade otro, el código no compila.

Una interfaz funcional puede implementarse de dos formas:

- Con una clase que use `implements` y `@Override`.
- Con una expresión lambda asignada a una variable del tipo de la interfaz.

## 3. Expresiones Lambda

**Conceptos estudiados:**
- Qué es una expresión lambda.
- Sintaxis básica con el operador `->`.
- Implementación de una interfaz funcional sin crear una clase.
- Inferencia de los tipos de los parámetros.
- Cuerpo de una sola expresión frente a un bloque con `return`.

**Clases relacionadas:**
- `CalculadoraLambda.java` — implementa `Calculadora` con dos lambdas: suma y resta.

**Ejemplo:**

```java
Calculadora suma = (num1, num2) -> num1 + num2;
Calculadora resta = (num1, num2) -> num1 - num2;

System.out.println(suma.calcular(20, 8));   // 28
System.out.println(resta.calcular(20, 8));  // 12
```

La lambda `(num1, num2) -> num1 + num2` es la implementación del único método abstracto de `Calculadora`. El tipo de los parámetros se deduce de la interfaz; no hace falta escribir `int` ni crear una clase adicional.

**Resultado esperado:** `28` y `12`.

## 4. Sintaxis y parámetros Lambda

**Conceptos estudiados:**
- Lambdas sin parámetros.
- Lambdas con un parámetro.
- Lambdas con varios parámetros.
- Omisión de paréntesis cuando hay un solo parámetro.
- Paréntesis obligatorios con cero o varios parámetros.
- Cuerpo con una expresión o con un bloque `{ }`.

**Clases relacionadas:**
- `Mensaje.java` — interfaz funcional con `void mostrar(String texto)`.
- `SintaxisLambda.java` — usa una lambda con un parámetro (`Mensaje`) y otra sin parámetros (`Operacion`).
- `CalculadoraLambda.java` — usa una lambda con dos parámetros.

**Formas de escribir una lambda:**

```java
// Sin parámetros (paréntesis obligatorios)
Operacion nada = () -> System.out.println("Sin parametros.");

// Un parámetro (paréntesis opcionales)
Mensaje mensaje = texto -> System.out.println(texto);

// Varios parámetros (paréntesis obligatorios)
Calculadora suma = (num1, num2) -> num1 + num2;
```

**Resultado de `SintaxisLambda`:** `Hola me llamo Kevin.` y `Sin parametros.`.

**Nota:** `SintaxisLambda` solo muestra cero y un parámetro; la lambda con varios parámetros está en `CalculadoraLambda`.

## 5. Predicate

**Conceptos estudiados:**
- Interfaz `Predicate<T>`.
- Evaluación de condiciones.
- Método `test(T)`.
- Retorno de un valor `boolean`.
- Uso típico en filtros y validaciones.

**Clases relacionadas:**
- `PredicatePractica.java` — comprueba si un número es par con `numero % 2 == 0`.

**Ejemplo:**

```java
Predicate<Integer> esPar = numero -> numero % 2 == 0;

System.out.println(esPar.test(8));   // true
System.out.println(esPar.test(13));  // false
```

`Predicate` recibe un valor y devuelve `true` o `false`. Además de `test()`, la interfaz ofrece operaciones como `and()`, `or()` y `negate()`, que no se utilizan en esta práctica.

**Resultado esperado:** `true` y `false`.

## 6. Consumer

**Conceptos estudiados:**
- Interfaz `Consumer<T>`.
- Recepción de datos y ejecución de acciones.
- Método `accept(T)`.
- Ausencia de valor de retorno.
- Uso típico para imprimir o modificar estado.

**Clases relacionadas:**
- `ConsumerPractica.java` — imprime un nombre y el doble de un número mediante dos `Consumer`.

**Ejemplo:**

```java
Consumer<String> mostrarNombre = nombre -> System.out.println(nombre);
Consumer<Integer> dobleNumero = numero -> System.out.println(numero * 2);

mostrarNombre.accept("Kevin");
dobleNumero.accept(8);
```

`Consumer` consume un valor y ejecuta una acción; no devuelve nada. La interfaz también permite encadenar consumidores con `andThen()`, aunque no se usa en el ejemplo.

**Resultado esperado:** `Kevin` y `16`.

## 7. Function

**Conceptos estudiados:**
- Interfaz `Function<T, R>`.
- Transformación de un dato de entrada en otro de salida.
- Tipos de entrada y de salida.
- Método `apply(T)`.

**Clases relacionadas:**
- `FunctionPractica.java` — obtiene la longitud de un texto y convierte un número entero en texto.

**Ejemplo:**

```java
Function<String, Integer> longitud = texto -> texto.length();
Function<Integer, String> convertir =
        numero -> String.valueOf("Conversion de Int a String: " + numero);

System.out.println(longitud.apply("Kevin")); // 5
System.out.println(convertir.apply(2999));   // Conversion de Int a String: 2999
```

`Function<T, R>` recibe un valor de tipo `T` y devuelve un valor de tipo `R`. En el segundo ejemplo, la concatenación ya produce un `String`, por lo que `String.valueOf()` es redundante.

**Resultado esperado:** `5` y `Conversion de Int a String: 2999`.

## 8. Supplier

**Conceptos estudiados:**
- Interfaz `Supplier<T>`.
- Generación o suministro de valores.
- Ausencia de parámetros de entrada.
- Método `get()`.

**Clases relacionadas:**
- `SupplierPractica.java` — suministra un nombre y una edad.

**Ejemplo:**

```java
Supplier<String> obtenerNombre = () -> "Kevin";
Supplier<Integer> obtenerEdad = () -> 26;

System.out.println(obtenerNombre.get()); // Kevin
System.out.println(obtenerEdad.get());   // 26
```

`Supplier` no recibe argumentos y devuelve un valor cuando se llama a `get()`. Es útil para generar o proporcionar datos de forma diferida.

**Resultado esperado:** `Kevin` y `26`.

## 9. Referencias a métodos

**Conceptos estudiados:**
- Operador `::`.
- Referencias a métodos de instancia.
- Referencias a métodos estáticos.
- Referencias a constructores.
- Simplificación de expresiones lambda.

**Clases relacionadas:**
- `ReferenciaMetodoPractica.java` — usa `System.out::println` y `String::length`.

**Ejemplo:**

```java
Consumer<String> mostrar = System.out::println;
Function<String, Integer> longitud = String::length;

mostrar.accept("Soy una referencia.");
System.out.println(longitud.apply("Hamburguesa")); // 11
```

Una referencia a método es una forma abreviada de una lambda que solo llama a un método existente. En el ejemplo se usan dos variantes de instancia; también existen referencias a métodos estáticos y a constructores:

```java
Function<String, Integer> convertir = Integer::parseInt; // método estático
Supplier<ArrayList<String>> crearLista = ArrayList::new; // constructor
```

**Resultado esperado:** `Soy una referencia.` y `11`.

# 10. Práctica integradora

## Gestión de usuarios

**Estado:** implementado y ejecutado correctamente.

### Objetivo

Combinar interfaces funcionales para procesar la información de varios usuarios y reutilizar comportamientos mediante lambdas y referencias a métodos.

### Conceptos aplicados

- Clase de dominio con atributos privados y getters.
- `Supplier` para suministrar valores.
- `Predicate` para evaluar condiciones.
- `Function` para transformar datos.
- `Consumer` para ejecutar acciones.
- Referencias a métodos con `::`.
- Expresiones lambda.
- Recorrido y presentación de objetos.

### Clases de la práctica

#### `Usuarios.java`

Representa los datos de un usuario.

Responsabilidades:
- Guardar `nombre` y `edad` como atributos privados.
- Inicializar los datos mediante un constructor.
- Proporcionar los getters `getNombre()` y `getEdad()`.

#### `GestionUsuarios.java`

Clase de prueba con `main`.

Instrucciones:
1. Declarar un `Supplier<String>` para asignar un nombre.
2. Declarar un `Predicate<Usuarios>` para comprobar la mayoría de edad.
3. Declarar una `Function<Usuarios, String>` para convertir el nombre a mayúsculas.
4. Declarar un `Consumer<Usuarios>` para mostrar los datos.
5. Crear dos usuarios: Danna (16) y Luis (35).
6. Mostrar cada usuario y su nombre en mayúsculas.

### Resultado esperado

```
Nombre: Danna | Edad: 16
DANNA
Nombre: Luis | Edad: 35
LUIS
```

### Observación

`GestionUsuarios` declara las cuatro interfaces funcionales, pero en la ejecución actual solo utiliza `Function` y `Consumer`. El `Supplier` (`asignarNombre`) y el `Predicate` (`esMayorEdad`) no se llegan a usar. Para completar la práctica se podría comprobar `esMayorEdad.test(usuario)` o mostrar el valor de `asignarNombre.get()`.

---

## Resumen general

Al finalizar este tema, se han estudiado los siguientes conceptos:

1. Qué es la programación funcional.
2. Implementación tradicional de una interfaz.
3. Implementación con expresiones lambda.
4. Interfaces funcionales y `@FunctionalInterface`.
5. Método abstracto único (*SAM*).
6. Sintaxis de una lambda con `->`.
7. Lambdas sin parámetros, con uno y con varios parámetros.
8. Omisión de paréntesis con un solo parámetro.
9. `Predicate<T>` y `test()`.
10. `Consumer<T>` y `accept()`.
11. `Function<T, R>` y `apply()`.
12. `Supplier<T>` y `get()`.
13. Referencias a métodos con `::`.
14. Referencias a métodos de instancia, estáticos y constructores.
15. Uso combinado de interfaces funcionales en una práctica.

**Nota de estudio:** el tema tiene 13 clases: 8 contienen `main` y son ejecutables; las demás son interfaces o clases de apoyo (`Calculadora`, `Mensaje`, `Operacion`, `Usuarios` e `IntroduccionFuncional`).

**Estado general del Tema 13:** completado.

---

## Siguiente tema

Este es el último tema con código en el proyecto. Algunos temas recomendados para continuar son:

- `Streams` y operaciones funcionales sobre colecciones.
- `Optional` y manejo funcional de valores ausentes.
- Pruebas unitarias con JUnit.
- Maven o Gradle para gestionar dependencias.
- Persistencia con JDBC y bases de datos.
- Desarrollo backend con Spring Boot.
