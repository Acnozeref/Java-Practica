# Tema 10 — Manejo de excepciones

**Proyecto:** `Java-Practica`  
**Paquete:** `tema10_excepciones`  
**Carpeta de código:** [`src/tema10_excepciones`](../src/tema10_excepciones)  
**Nivel:** intermedio  
**Objetivo:** aprender a detectar, controlar y comunicar errores mediante excepciones, diferenciando cuándo Java las lanza automáticamente y cuándo deben lanzarse de forma manual o personalizada.

---

## Índice de temas

- [1. Fundamentos de excepciones](#1-fundamentos-de-excepciones)
- [2. Manejo de excepciones (`try` y `catch`)](#2-manejo-de-excepciones-try-y-catch)
- [3. Bloque `finally`](#3-bloque-finally)
- [4. Lanzamiento de excepciones (`throw`)](#4-lanzamiento-de-excepciones-throw)
- [5. Declaración de excepciones (`throws`)](#5-declaración-de-excepciones-throws)
- [6. Excepciones comunes](#6-excepciones-comunes)
- [7. Excepciones personalizadas](#7-excepciones-personalizadas)
- [8. Proyecto integrador](#8-proyecto-integrador)

---

## 1. Fundamentos de excepciones

**Conceptos estudiados:**
- Qué es una excepción.
- Diferencia entre un error controlado y un programa que termina.
- Comportamiento de Java ante un error.
- Interrupción del flujo normal del programa.
- Búsqueda de un bloque que pueda manejar la excepción.
- `ArithmeticException` como ejemplo de excepción no comprobada (*unchecked*).

**Clases relacionadas:**
- `ExcepcionesBasicas.java` — contiene un `try/catch/finally` con una división. Tal como está el código, divide `10 / 2`, por lo que **no se produce la excepción**; para provocarla hay que cambiar `numero2` a `0`.

**Comportamiento de Java ante un error:**

1. La instrucción que falla interrumpe la ejecución normal.
2. Java crea un objeto de excepción con la información del error.
3. Busca un `catch` que pueda manejarla.
4. Si no lo encuentra, el programa termina y muestra la traza (*stack trace*).

## 2. Manejo de excepciones (`try` y `catch`)

**Conceptos estudiados:**
- Bloque `try`: contiene el código que puede producir una excepción.
- Bloque `catch`: captura la excepción y decide qué hacer.
- Tipo de excepción que se captura entre paréntesis.
- Flujo de ejecución cuando ocurre una excepción.
- Continuación del programa después del `catch`.

**Clases relacionadas:**
- `ExcepcionesBasicas.java` — envuelve la división en un `try` y captura `ArithmeticException`.

**Flujo de ejecución en `ExcepcionesBasicas`:**

- Con `10 / 2`: se imprime el inicio, el resultado `5`, el final del `try`, el mensaje del `finally` y “Fin del programa”.
- Con `10 / 0`: se imprime el inicio, se salta el resto del `try`, se ejecuta el `catch` (“Error controlado.”), después el `finally` y por último “Fin del programa”.

## 3. Bloque `finally`

**Conceptos estudiados:**
- Funcionamiento de `finally`.
- Ejecución con y sin excepciones.
- Uso de `finally` para liberar recursos.
- Tareas de limpieza: cerrar conexiones, archivos o recursos.

**Clases relacionadas:**
- `ExcepcionesBasicas.java` — incluye un `finally` que se ejecuta tanto si la división funciona como si lanza `ArithmeticException`.

**Idea clave:** `finally` se ejecuta siempre que el `try` haya comenzado, haya ocurrido una excepción o no. Por eso se usa para tareas que deben completarse pase lo que pase.

## 4. Lanzamiento de excepciones (`throw`)

**Conceptos estudiados:**
- Lanzamiento manual de una excepción con `throw`.
- Creación de la excepción con `new`.
- `IllegalArgumentException` como argumento inválido.
- Diferencia entre dejar que Java lance la excepción y lanzarla manualmente.
- Interrupción inmediata del método cuando se ejecuta `throw`.

**Clases relacionadas:**
- `UsoThrow.java` — comprueba una edad y lanza `IllegalArgumentException` si es menor de 18; con `edad = 21` muestra “Acceso permitido.”.

**Diferencia importante:** `throw` **lanza** la excepción en un punto concreto del código; no la captura. Si nadie la captura, el programa termina.

## 5. Declaración de excepciones (`throws`)

**Conceptos estudiados:**
- Declaración de excepciones con `throws`.
- Propagación de la excepción hacia quien llama al método.
- Excepciones comprobadas (*checked exceptions*).
- Diferencia entre `throw` y `throws`.

**Clases relacionadas:**
- `UsoThrows.java` — declara `throws Exception` en `validarEdad()` y captura la excepción en `main`.
- `ValidarEdadPersonalizada.java` — declara `throws EdadInvalidaException` y lanza la excepción personalizada.
- `EdadInvalidaException.java` — excepción propia utilizada por `ValidarEdadPersonalizada`.

**Diferencia entre `throw` y `throws`:**

| Palabra clave | Dónde se usa | Qué hace |
|---|---|---|
| `throw` | Dentro de un método | Lanza una excepción concreta con `new`. |
| `throws` | En la firma del método | Declara que el método puede lanzar una excepción y la propaga a quien lo llama. |

**Observación:** `UsoThrows` usa `throws Exception`, que es una excepción genérica. En código real conviene declarar una excepción más específica, como se hace en `ValidarEdadPersonalizada`.

## 6. Excepciones comunes

**Conceptos estudiados:**
- `ArithmeticException`.
- `NullPointerException`.
- `ArrayIndexOutOfBoundsException`.
- `NumberFormatException`.
- `IllegalArgumentException`.
- Diferencia entre excepciones comprobadas y no comprobadas.

**Clases relacionadas:**
- `ExcepcionesComunes.java` — las excepciones están comentadas para poder descomentarlas y probarlas una a una.

**Explicación de cada excepción:**

| Excepción | Se produce cuando… | ¿Comprobada? |
|---|---|---|
| `ArithmeticException` | Se divide un número entero entre cero. | No |
| `NullPointerException` | Se usa una referencia que vale `null`. | No |
| `ArrayIndexOutOfBoundsException` | Se accede a una posición inexistente de un array. | No |
| `NumberFormatException` | Se convierte un texto no numérico a número (`Integer.parseInt("abc")`). | No |
| `IllegalArgumentException` | Un método recibe un argumento inválido. | No |

**Nota:** `ExcepcionesComunes` no incluye un ejemplo ejecutable de `NumberFormatException`; se puede probar añadiendo `Integer.parseInt("abc")` dentro de un `try/catch`.

## 7. Excepciones personalizadas

**Conceptos estudiados:**
- Crear una excepción propia mediante `extends Exception`.
- Constructores personalizados.
- Uso de `super(mensaje)` para enviar el mensaje a la clase padre.
- Integración con `throw` y `throws`.
- Comunicación de errores específicos del dominio.

**Clases relacionadas:**
- `EdadInvalidaException.java` — hereda de `Exception` y recibe un mensaje en su constructor.
- `ValidarEdadPersonalizada.java` — lanza `EdadInvalidaException` cuando la edad es menor de 18 y captura la excepción en `main`.

**Estructura de una excepción personalizada:**

```java
public class EdadInvalidaException extends Exception {

    public EdadInvalidaException(String mensaje) {
        super(mensaje);
    }
}
```

`extends Exception` convierte la clase en una excepción **comprobada**, por lo que los métodos que la lanzan deben declararla con `throws` o manejarla con `try/catch`.

---

# 8. Proyecto integrador

## Sistema de validación de usuarios

**Estado:** implementado y ejecutado correctamente.

### Objetivo

Aplicar excepciones personalizadas para validar la información de un usuario, separando las responsabilidades en clases: datos, validación, error y coordinación.

### Conceptos aplicados

- Clases y objetos.
- Atributos privados y encapsulamiento.
- Constructores.
- Getters.
- Excepciones personalizadas mediante `extends Exception`.
- Uso de `super(mensaje)`.
- Lanzamiento de excepciones con `throw`.
- Declaración de excepciones con `throws`.
- Captura con `try/catch`.
- Obtención del mensaje con `getMessage()`.
- Validación de cadenas con `isBlank()`.

### Clases del proyecto

#### `Usuario.java`

Representa los datos del usuario.

Responsabilidades:
- Guardar `nombre` y `edad` como atributos privados.
- Inicializar los datos mediante un constructor.
- Proporcionar los getters `getNombre()` y `getEdad()`.

#### `UsuarioInvalidoException.java`

Representa un error de validación del usuario.

Responsabilidades:
- Heredar de `Exception`.
- Recibir un mensaje personalizado en el constructor.
- Enviar el mensaje a la clase padre mediante `super(message)`.

#### `ValidarUsuario.java`

Contiene la lógica de validación.

Responsabilidades:
- Recibir un objeto `Usuario`.
- Rechazar nombres vacíos o formados solo por espacios con `isBlank()`.
- Rechazar edades menores de 18 años.
- Lanzar `UsuarioInvalidoException` con un mensaje específico en cada caso.
- Declarar la excepción con `throws UsuarioInvalidoException`.
- Mostrar “Usuario válido.” cuando todas las validaciones pasan.

#### `Main.java`

Coordina la ejecución y maneja las excepciones.

Instrucciones:
1. Crear un objeto `ValidarUsuario`.
2. Crear un objeto `Usuario`.
3. Llamar a `validarUsuario()` dentro de un `try`.
4. Capturar `UsuarioInvalidoException` con `catch`.
5. Mostrar el mensaje del error mediante `e.getMessage()`.

### Pruebas realizadas

La clase `Main` está configurada actualmente con el caso inválido:

- **Usuario menor de edad:** `new Usuario("Kevin", 15)` → se lanza `UsuarioInvalidoException` y se muestra “El usuario debe ser mayor de edad.”.

Para comprobar los otros casos, se modifica el objeto `Usuario` en `Main`:

- **Usuario válido:** `new Usuario("Kevin", 27)` → se muestra “Usuario válido.”.
- **Nombre vacío:** `new Usuario("", 27)` → se muestra “El nombre no debe estar vacío o con solo espacios.”.

### Resultado esperado

El sistema valida los datos antes de continuar, comunica cada error con una excepción propia y permite que `Main` decida cómo mostrarlo, sin mezclar la lógica de validación con la de presentación.

---

## Resumen general

Al finalizar este tema, se han estudiado los siguientes conceptos:

1. Qué es una excepción.
2. Comportamiento de Java ante un error.
3. `ArithmeticException` y las excepciones no comprobadas.
4. Manejo con `try/catch`.
5. Flujo de ejecución con y sin excepción.
6. Bloque `finally` y liberación de recursos.
7. Lanzamiento manual con `throw`.
8. `IllegalArgumentException`.
9. Declaración y propagación con `throws`.
10. Excepciones comprobadas (*checked exceptions*).
11. Diferencias entre `throw` y `throws`.
12. Excepciones comunes de Java.
13. Creación de excepciones personalizadas con `extends Exception`.
14. Uso de `super(mensaje)` y `getMessage()`.
15. Integración de excepciones en un proyecto con clases separadas.

**Nota de estudio:** las prácticas están separadas por clases para poder consultarlas y ejecutarlas de forma independiente. El proyecto integrador combina encapsulamiento, validación y excepciones personalizadas.

**Estado general del Tema 10:** completado.

---

## Siguiente tema

[`tema11_FrameworkCollection`](tema11_FrameworkCollection.md) — Framework de colecciones: `ArrayList`, `LinkedList`, `HashSet`, `HashMap`, `Iterator` y comparación entre estructuras.
