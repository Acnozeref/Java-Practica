# Tema 05 — Condicionales

**Proyecto:** `Java-Practica`
**Paquete del código:** `tema05_condicionales`
**Carpeta de código:** [`src/tema05_condicionales`](../src/tema05_condicionales)
**Nivel:** inicial
**Objetivo:** hacer que el programa tome decisiones: ejecutar un bloque de
código u otro según los datos.

---

## 1. Conceptos que se aprenden

| Concepto | Qué se practica |
|---|---|
| `if` | Ejecutar un bloque solo si la condición es `true`. |
| `else` | Ejecutar otro bloque cuando la condición es `false`. |
| `else if` | Encadenar varias condiciones excluyentes. |
| Condición | Expresión que devuelve `boolean` (del tema 03). |
| Rangos | Combinar dos comparaciones con `&&`: `edad >= 13 && edad <= 17`. |
| Orden de las condiciones | Se ejecuta **solo el primer** bloque que se cumple. |
| `switch` | Elegir entre varios valores de una misma variable. |
| `case` | Cada valor posible dentro del `switch`. |
| `break` | Salir del `switch`; sin él se ejecutan los `case` siguientes. |
| `default` | Bloque que se ejecuta si ningún `case` coincide. |
| Comparar texto | `switch` funciona con `String`; con `if` se usa `.equals()`. |

### Detalle de cada concepto

- **`if` / `else`**: son excluyentes. Si la condición es `true` entra al `if`;
  si es `false` entra al `else`. Nunca se ejecutan los dos.
- **`else if`**: se evalúan de arriba hacia abajo y **se detiene en el primero
  que se cumpla**. Por eso los rangos deben estar bien ordenados.
- **Rangos**: no existe `13 <= edad <= 17` como en matemáticas; se escribe con
  dos comparaciones unidas por `&&`.
- **`else` final sin condición**: actúa como red de seguridad (por ejemplo, para
  edades negativas). Es opcional, pero evita casos sin respuesta.
- **`switch`**: más legible que muchos `else if` cuando **todas** las opciones
  dependen de la misma variable y son valores concretos.
- **`break`**: sin `break`, la ejecución "cae" al siguiente `case`
  (*fall-through*) y se imprimen mensajes que no corresponden.
- **`default`**: equivalente al `else` final.
- **`switch` con `String`**: compara contenido, no referencias (a diferencia de
  `==`). Distingue mayúsculas: `"Crear"` no coincide con `"crear"`.

---

## 2. Clases del paquete

| Clase | Estructura | Idea principal |
|---|---|---|
| `VerificarEdad.java` | `if` / `else` | Decisión binaria: mayor o menor de edad. |
| `Edad.java` | `if` / `else if` / `else` | Clasificar por rangos de edad. |
| `Acceso.java` | `if` con `&&` | Combinar una condición numérica y un `boolean`. |
| `Menu.java` | `switch` | Elegir una acción escribiendo una palabra. |

### `VerificarEdad.java`

- Pide la edad con `Scanner` y compara `edad >= 18`.
- Es el ejemplo mínimo de condicional: dos caminos posibles.
- Cierra el `Scanner` al final.

### `Edad.java`

- Usa una edad fija (`26`) para probar varios rangos.
- Clasifica en niño (0–12), adolescente (13–17), mayor de edad (≥ 18) y deja el
  `else` para valores inválidos como edades negativas.
- Sirve para razonar sobre el **orden** de las condiciones.

### `Acceso.java`

- Pide edad (`nextInt()`) y si tiene identificación (`nextBoolean()`).
- Exige que se cumplan **las dos** condiciones con `&&`.
- Incluye un comentario sobre `identificador == true` (redundante, pero útil
  para entender el contexto).

### `Menu.java`

- Lee una palabra con `nextLine()` y la compara con `switch`.
- Opciones: `crear`, `consultar`, `salir`; cualquier otra cae en `default`.
- Demuestra la importancia del `break` en cada `case`.

---

## 3. Relación entre las clases

Las cuatro clases son **independientes**: cada una tiene su `main`, no se llaman
entre sí y no comparten estado.

```
VerificarEdad ─┐
Edad          ─┤   (independientes)
Acceso        ─┤   cada una: package + class + main
Menu          ─┘
```

| Clase | ¿Tiene `main`? | ¿Usa `Scanner`? | Estructura de decisión |
|---|---|---|---|
| `VerificarEdad` | Sí | Sí | `if` / `else` |
| `Edad` | Sí | No | `if` / `else if` / `else` |
| `Acceso` | Sí | Sí | `if` con `&&` |
| `Menu` | Sí | Sí | `switch` |

> Relación con el tema anterior: las condiciones nacen de los operadores de
> comparación y lógicos, y los datos vienen de `Scanner`. Aquí ambas piezas se
> combinan por primera vez.

---

## 4. Cómo ejecutar

Desde la raíz del proyecto:

```bash
# compilar el tema
javac -d out src/tema05_condicionales/*.java

# ejecutar la clase que no pide datos
java -cp out tema05_condicionales.Edad

# clases que piden datos por teclado
java -cp out tema05_condicionales.VerificarEdad
java -cp out tema05_condicionales.Acceso
java -cp out tema05_condicionales.Menu
```

En IntelliJ IDEA: abrir el archivo, pulsar ▶ y escribir las respuestas en la
consola.

---

## 5. Ejemplos de ejecución

**`Edad`** (edad fija `26`)

```
Eres mayor de edad
```

**`VerificarEdad`** (usuario escribe `20`)

```
Ingresa tu edad: 
20
Eres mayor de edad.
```

**`Acceso`** (usuario escribe `20` y `true`)

```
Ingresa tu edad: 
20
Tienes identificador?: 
true
Acceso permitido
```

**`Menu`** (usuario escribe `consultar`)

```
Ingresa una opción: 
consultar
Consultando usuario...
```

> Las respuestas tecleadas (`20`, `true`, `consultar`) las muestra la terminal,
> no el programa. En este tema los mensajes usan `println`, así que el usuario
> escribe en la **línea siguiente** (en el tema 04 se usaba `print`).

---

## 6. Errores típicos en este tema

- Poner `;` después de la condición: `if (edad >= 18);` — el bloque queda vacío
  y el `if` no controla nada.
- Usar `=` en lugar de `==`: `if (edad = 18)` no compila.
- Escribir rangos al revés: `edad <= 17 && edad >= 13` funciona, pero
  `edad >= 17 && edad <= 13` nunca es `true`.
- Ordenar mal los `else if`: si se comprueba `edad >= 18` antes que
  `edad >= 13`, los adolescentes nunca entran en su bloque.
- Olvidar el `break` en un `case` y provocar *fall-through*.
- Repetir el mismo valor en dos `case`: error de compilación.
- Usar `switch` con `double` o `boolean`: no está permitido.
- Comparar el texto del menú con `==` en lugar de `switch`/`.equals()`.
- Escribir `"Crear"` cuando el `case` dice `"crear"`: el texto distingue
  mayúsculas.
- Olvidar el `else` final y dejar casos sin respuesta.

---

## 7. Ejercicios de refuerzo

1. Cambiar la edad de `Edad.java` a `5`, `15`, `18` y `-1`; comprobar los cuatro
   caminos, incluido el `else`.
2. En `VerificarEdad`, añadir un mensaje distinto para exactamente 18 años.
3. En `Acceso`, permitir la entrada si es mayor de edad **o** viene acompañado.
4. Añadir al `Menu` la opción `actualizar` con su `break`.
5. Quitar un `break` del `Menu` a propósito y observar el *fall-through*.
6. Convertir el `switch` de `Menu` a una cadena de `if`/`else if` con
   `.equals()`.

---

## 8. Checklist de dominio

- [ ] Sé cuándo usar `if`/`else` y cuándo `switch`.
- [ ] Escribo rangos correctamente con `&&`.
- [ ] Entiendo que solo se ejecuta el primer bloque verdadero.
- [ ] Sé para qué sirve `default`.
- [ ] Explico qué ocurre si falta un `break`.
- [ ] Sé que `switch` compara texto por contenido y distingue mayúsculas.
- [ ] No confundo `=` con `==` ni olvido el `;` del `if`.

---

## Siguiente tema

[`tema06_bucles`](tema06_bucles.md) — `for`, `while`,
`do-while`, `break` y `continue`: repetir código.
