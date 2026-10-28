# Tema 03 — Operadores

**Proyecto:** `Java-Practica`
**Paquete del código:** `tema03_operadores`
**Carpeta de código:** [`src/tema03_operadores`](../src/tema03_operadores)
**Nivel:** inicial
**Objetivo:** aprender a operar con valores: calcular, comparar y combinar
condiciones. Los resultados se guardan en variables o se imprimen directamente.

---

## 1. Conceptos que se aprenden

| Concepto | Qué se practica |
|---|---|
| Operadores aritméticos | `+`, `-`, `*`, `/`, `%` sobre números. |
| División entera | Con dos `int`, el resultado descarta los decimales. |
| Módulo `%` | Resto de una división; base para saber si un número es par. |
| Operadores de asignación | `+=`, `-=`, `*=`, `/=`, `%=` como forma corta de recalcular. |
| Operadores de comparación | `==`, `!=`, `>`, `<`, `>=`, `<=`; devuelven `boolean`. |
| Operadores lógicos | `&&` (Y), `\|\|` (O), `!` (NO); combinan condiciones. |
| Precedencia | `*`, `/`, `%` antes que `+`, `-`; los paréntesis mandan. |
| `==` vs `=` | Comparar no es lo mismo que asignar. |
| Cortocircuito | `&&` y `\|\|` pueden no evaluar la segunda condición. |

### Detalle de cada concepto

- **Aritméticos**: funcionan igual que en matemáticas, salvo la división entre
  enteros. `20 / 6` da `3`, no `3.33`, porque los dos operandos son `int`.
- **Módulo**: `20 % 6` da `2` (20 entre 6 son 3 y sobran 2). Es la operación que
  se usará más adelante para detectar pares (`numero % 2 == 0`).
- **Asignación compuesta**: `numero += 5` equivale a `numero = numero + 5`.
  No crea una variable nueva, actualiza la existente.
- **Comparación**: el resultado **siempre** es `boolean`; no se guarda el número
  comparado, sino `true` o `false`.
- **Lógicos**: `&&` solo es `true` si ambas partes son `true`; `||` basta con
  una; `!` invierte el valor.
- **Cortocircuito**: en `a && b`, si `a` es `false`, Java no evalúa `b`. En
  `a || b`, si `a` es `true`, tampoco evalúa `b`. Útil para evitar errores.
- **Precedencia**: `2 + 3 * 4` es `14`, no `20`. Ante la duda, usar paréntesis.

### Aviso sobre `String`

Los operadores `==` y `!=` comparan **referencias** cuando se usan con textos.
Para comparar el contenido de dos `String` se usa `.equals()`
(se profundiza en temas posteriores y en `tema08_arrays/ArrayEquals.java`).

---

## 2. Clases del paquete

| Clase | Tema concreto | Idea principal |
|---|---|---|
| `Operaciones.java` | Aritméticos | Suma, resta, multiplicación, división entera y módulo. |
| `OperadoresAsignacion.java` | Asignación compuesta | Cada operación parte del valor anterior. |
| `Comparaciones.java` | Comparación | Guardar el resultado `boolean` de comparar. |
| `OperadoresLogicos.java` | Lógica | Combinar condiciones y negar valores. |

### `Operaciones.java`

- Usa `numero1 = 20` y `numero2 = 6` y muestra los cinco resultados.
- Demuestra la pérdida de decimales en la división entre `int`.
- Sirve de referencia para comprobar cálculos a mano.

### `OperadoresAsignacion.java`

- Parte de `numero = 10` y aplica `+= 5`, `-= 3`, `*= 3`, `/= 2`, `%= 4`.
- Cada paso reutiliza el resultado del anterior: `10 → 15 → 12 → 36 → 18 → 2`.
- Refuerza la lectura de `x op= y` como `x = x op y`.

### `Comparaciones.java`

- Define `edad = 26` y guarda tres comparaciones en variables `boolean`.
- Distingue claramente `=` (asignar) de `==` (comparar).
- Prepara el terreno para los `if` del tema 05.

### `OperadoresLogicos.java`

- Combina `edad >= 18` con `identificacion` mediante `&&`, `||` y `!`.
- Incluye comentarios con el resultado de cada subexpresión.
- Muestra la convención `camelCase` en nombres largos de variables.

---

## 3. Relación entre las clases

Las cuatro clases son **independientes**: cada una tiene su `main`, no se
referencian entre sí y no comparten estado ni métodos.

```
Operaciones ─┐
OperadoresAsignacion ─┤   (independientes)
Comparaciones ─┤   cada una: package + class + main
OperadoresLogicos ─┘
```

| Clase | ¿Tiene `main`? | ¿Usa otras clases del proyecto? |
|---|---|---|
| `Operaciones` | Sí | No |
| `OperadoresAsignacion` | Sí | No |
| `Comparaciones` | Sí | No |
| `OperadoresLogicos` | Sí | No |

> Relación con el tema anterior: las variables del tema 02 ahora se **operan**
> y sus resultados se imprimen o se guardan en nuevas variables (incluidos
> `boolean`).

---

## 4. Cómo ejecutar

Desde la raíz del proyecto:

```bash
# compilar el tema
javac -d out src/tema03_operadores/*.java

# ejecutar cada clase
java -cp out tema03_operadores.Operaciones
java -cp out tema03_operadores.OperadoresAsignacion
java -cp out tema03_operadores.Comparaciones
java -cp out tema03_operadores.OperadoresLogicos
```

En IntelliJ IDEA: abrir el archivo y pulsar ▶ junto al método `main`.

---

## 5. Resultado esperado

**`Operaciones`**

```
26
14
120
3
2
```

**`OperadoresAsignacion`**

```
15
12
36
18
2
```

**`Comparaciones`**

```
true
true
false
```

**`OperadoresLogicos`**

```
true
true
false
```

---

## 6. Errores típicos en este tema

- Confundir `=` con `==`: `if (edad = 18)` no compila (asignación no es `boolean`).
- Esperar decimales de una división entre `int`: `20 / 6` es `3`.
- Dividir entre cero con enteros: lanza `ArithmeticException`.
- Usar `&&`/`||` con números en lugar de `boolean`.
- Olvidar que el módulo trabaja con el **resto**, no con el cociente.
- Ignorar la precedencia: `2 + 3 * 4` es `14`.
- Comparar `String` con `==` esperando comparar el texto.
- Escribir `!` delante de toda la expresión cuando solo se quiere negar una parte:
  `!a && b` no es lo mismo que `!(a && b)`.

---

## 7. Ejercicios de refuerzo

1. Calcular el promedio de tres notas `int` y comprobar cuántos decimales se
   pierden; repetirlo usando `double`.
2. Determinar con `%` si un número es par y guardar el resultado en un `boolean`.
3. Partir de `saldo = 100` y aplicar depósito, retiro y comisión con `+=`/`-=`.
4. Escribir una condición que sea `true` solo si la edad está entre 18 y 65.
5. Predecir el resultado de `!true || false && true` y comprobarlo en código.

---

## 8. Checklist de dominio

- [ ] Sé calcular a mano el resultado de los cinco operadores aritméticos.
- [ ] Explico por qué `20 / 6` da `3`.
- [ ] Distingo cociente de resto y sé para qué sirve `%`.
- [ ] Reescribo `x += 5` como `x = x + 5`.
- [ ] Sé que una comparación devuelve `boolean`.
- [ ] Combino condiciones con `&&`, `||` y `!` sin confundirlos.
- [ ] Entiendo la precedencia y sé cuándo usar paréntesis.
- [ ] No confundo `=` con `==`.

---

## Siguiente tema

[`tema04_entrada_datos`](tema04_entrada_datos.md) —
`Scanner`: leer datos del usuario por teclado.
