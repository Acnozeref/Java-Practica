# Tema 06 — Bucles

**Proyecto:** `Java-Practica`
**Paquete del código:** `tema06_bucles`
**Carpeta de código:** [`src/tema06_bucles`](../src/tema06_bucles)
**Nivel:** inicial
**Objetivo:** repetir un bloque de código sin copiarlo varias veces, controlando
cuántas veces se ejecuta y cuándo se detiene.

---

## 1. Conceptos que se aprenden

| Concepto | Qué se practica |
|---|---|
| Bucle | Repetir instrucciones mientras se cumpla una condición. |
| `for` | Repetir cuando se sabe **cuántas** veces (contador en la cabecera). |
| `while` | Repetir mientras la condición sea `true`, comprobándola **antes**. |
| `do-while` | Ejecutar **al menos una vez** y comprobar la condición **después**. |
| Inicialización | Valor inicial del contador: `int i = 1`. |
| Condición | Mientras sea `true` se repite: `i <= 5`. |
| Actualización | Cambio al final de cada vuelta: `i++`. |
| `i++` / `i--` | Sumar o restar 1 al contador. |
| `i += 2` | Avanzar de dos en dos. |
| `break` | Terminar el bucle por completo. |
| `continue` | Saltar el resto de la vuelta actual y pasar a la siguiente. |
| Bucle infinito | Bucle cuya condición nunca llega a `false`. |

### Detalle de cada concepto

- **Anatomía del `for`**: `for (inicio; condición; actualización)`. Las tres
  partes se separan con `;`. La condición se evalúa **antes** de cada vuelta.
- **`while`**: el contador se declara antes y se actualiza **dentro** del bloque.
  Si la condición es `false` desde el principio, el bloque no se ejecuta nunca.
- **`do-while`**: primero ejecuta y luego pregunta. Por eso se ejecuta al menos
  una vez aunque la condición sea `false`. **El `;` final es obligatorio**.
- **`break`**: sale del bucle inmediatamente; no ejecuta las vueltas restantes.
- **`continue`**: no sale del bucle, solo omite lo que queda de esa vuelta.
- **Cambiar el contador es obligatorio** en `while`/`do-while`; si no, la
  condición nunca cambia y el bucle no termina.
- **Alcance del contador**: la `i` declarada en el `for` solo existe dentro del
  bucle; la de `while`/`do-while` sigue existiendo después.

### Comparación rápida

| Bucle | ¿Cuándo se comprueba? | ¿Mínimo de vueltas? | Uso típico |
|---|---|---|---|
| `for` | Antes | 0 | Número de repeticiones conocido |
| `while` | Antes | 0 | Repetir hasta que pase algo |
| `do-while` | Después | 1 | Mostrar un menú al menos una vez |

---

## 2. Clases del paquete

| Clase | Bucle usado | Idea principal |
|---|---|---|
| `BucleFor.java` | `for` | Contar del 1 al 5 con el contador en la cabecera. |
| `BucleWhile.java` | `while` | Mismo resultado, pero con el contador fuera. |
| `BucleDoWhile.java` | `do-while` | Ejecutar primero y comprobar después. |
| `BreakContinue.java` | `for` + `break`/`continue` | Alterar el flujo desde dentro del bucle. |

### `BucleFor.java`

- Recorre del `1` al `5` con `int i = 1; i <= 5; i++`.
- Incluye en comentarios otras formas de actualizar (`i--`, `i += 2`).
- Es el patrón que se reutilizará para recorrer arrays en el tema 08.

### `BucleWhile.java`

- Reproduce el mismo recorrido `1…5` con el contador declarado fuera.
- Enfatiza que hay que actualizar `i` dentro del bucle para evitar un bucle
  infinito.

### `BucleDoWhile.java`

- Muestra `Número: 1` … `Número: 5`.
- La condición se comprueba al final; de ahí el `;` tras `while (...)`.
- Útil para menús que deben mostrarse al menos una vez.

### `BreakContinue.java`

- Primer bucle: se salta el `5` con `continue` → `1, 2, 3, 4, 6, 7, 8, 9, 10`.
- Segundo bucle: se detiene en `7` con `break` → `1, 2, 3, 4, 5, 6`.
- Contiene dos bucles `for` independientes dentro del mismo `main`.

---

## 3. Relación entre las clases

Las cuatro clases son **independientes**: cada una tiene su `main` y no se
referencian entre sí.

```
BucleFor      ─┐
BucleWhile    ─┤   (independientes)
BucleDoWhile  ─┤   cada una: package + class + main
BreakContinue ─┘
```

| Clase | ¿Tiene `main`? | ¿Usa `Scanner`? | ¿Cuántos bucles? |
|---|---|---|---|
| `BucleFor` | Sí | No | 1 (`for`) |
| `BucleWhile` | Sí | No | 1 (`while`) |
| `BucleDoWhile` | Sí | No | 1 (`do-while`) |
| `BreakContinue` | Sí | No | 2 (`for`) |

> Relación con el tema anterior: los condicionales del tema 05 se usan **dentro**
> de los bucles (`if (i == 5) continue;`). Además, el `for` es la base para
> recorrer arrays en el tema 08.

---

## 4. Cómo ejecutar

Desde la raíz del proyecto:

```bash
# compilar el tema
javac -d out src/tema06_bucles/*.java

# ejecutar cada clase
java -cp out tema06_bucles.BucleFor
java -cp out tema06_bucles.BucleWhile
java -cp out tema06_bucles.BucleDoWhile
java -cp out tema06_bucles.BreakContinue
```

Ninguna clase pide datos: la salida es siempre la misma.

---

## 5. Resultado esperado

**`BucleFor`**

```
Numero: 1
Numero: 2
Numero: 3
Numero: 4
Numero: 5
```

**`BucleWhile`**

```
Numero: 1
Numero: 2
Numero: 3
Numero: 4
Numero: 5
```

**`BucleDoWhile`**

```
Número: 1
Número: 2
Número: 3
Número: 4
Número: 5
```

**`BreakContinue`**

```
1
2
3
4
6
7
8
9
10
1
2
3
4
5
6
```

---

## 6. Errores típicos en este tema

- **Bucle infinito**: olvidar `i++` en `while`/`do-while` o escribir una
  condición que nunca se vuelve `false`.
- Poner `;` después de la condición: `while (i <= 5);` → bucle vacío infinito.
- Olvidar el `;` final del `do-while`.
- Confundir `break` con `continue`: `break` corta el bucle; `continue` solo
  salta la vuelta.
- Usar `i <= 5` cuando se quiere llegar solo al `4` (error de límites, *off by
  one*).
- Modificar el contador dentro del `for` además de en la actualización, y perder
  el control de las vueltas.
- Declarar el contador dentro del `for` y usarlo fuera: no existe en ese ámbito.
- Anidar bucles y usar `break` pensando que sale de los dos (solo sale del
  bucle más interno).

---

## 7. Ejercicios de refuerzo

1. Mostrar los números del 10 al 1 con un `for` decreciente.
2. Mostrar solo los pares del 1 al 20 usando `i += 2`.
3. Sumar los números del 1 al 100 con un acumulador dentro de un bucle.
4. Repetir `BreakContinue` pero con `while`.
5. Pedir un número con `Scanner` y repetir hasta que el usuario escriba `0`
   (`do-while`), comprobando que el `0` no se procesa.
6. Reescribir el mismo recorrido con los tres tipos de bucle y comparar la
   legibilidad.

---

## 8. Checklist de dominio

- [ ] Escribo un `for` con sus tres partes y explico cada una.
- [ ] Sé cuándo usar `for`, `while` o `do-while`.
- [ ] Evito bucles infinitos actualizando el contador.
- [ ] Distingo `break` de `continue` y sé qué imprime cada uno.
- [ ] Entiendo el `;` final del `do-while`.
- [ ] Reconozco un error *off by one* en los límites.
- [ ] Sé que el contador del `for` no existe fuera del bucle.

---

## Siguiente tema

[`tema07_metodos`](tema07_metodos.md) — métodos: agrupar
código, recibir parámetros y devolver resultados.
