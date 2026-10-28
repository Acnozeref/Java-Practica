# Tema 02 — Variables y tipos de datos

**Proyecto:** `Java-Practica`
**Paquete del código:** `tema02_variables`
**Carpeta de código:** [`src/tema02_variables`](../src/tema02_variables)
**Nivel:** inicial
**Objetivo:** aprender a guardar datos en memoria mediante variables y a
distinguir los tipos básicos que se usan en Java.

---

## 1. Conceptos que se aprenden

| Concepto | Qué se practica |
|---|---|
| Variable | Espacio con nombre donde se guarda un valor que puede cambiar. |
| Declaración | Indicar el tipo y el nombre: `tipo nombre;`. |
| Inicialización | Dar el primer valor al declarar: `tipo nombre = valor;`. |
| Asignación | Guardar un valor en una variable ya declarada: `nombre = valor;`. |
| Reasignación | Cambiar el valor de una variable existente sin volver a escribir el tipo. |
| `int` | Números enteros (sin decimales). |
| `double` | Números con decimales; el separador es el punto. |
| `String` | Texto entre comillas dobles. No es un tipo primitivo: es una clase. |
| `boolean` | Solo admite `true` o `false`. |
| `System.out.println` | Mostrar el **valor** de una variable (sin comillas). |
| `camelCase` | Convención para nombrar variables: `miEdad`, `nombreCompleto`. |

### Detalle de cada concepto

- **Declarar ≠ asignar**: declarar reserva el espacio (`int edad;`); asignar le
  pone contenido (`edad = 26;`). En estos ejercicios casi siempre se hacen juntos.
- **Reasignar**: `edad = 27;` funciona porque `edad` ya existe. Lo que se
  imprime después es el **último** valor guardado.
- **`int` y `double`** son tipos **primitivos**: guardan el valor directamente.
  `double` acepta enteros (`1.0`) pero no usa coma decimal (`1,78` es error).
- **`String`** es una **clase** (por eso empieza con mayúscula) y guarda una
  referencia al texto. Se escribe siempre con comillas dobles.
- **`boolean`** no admite `1`, `0`, `"true"` ni mayúsculas (`True` no existe).
- **Imprimir una variable** es escribir su nombre sin comillas:
  `println(edad)` muestra `27`; `println("edad")` mostraría el texto `edad`.

### Tipos que todavía NO se ven en este tema

`char`, `long`, `float`, `short`, `byte` y los tipos envoltorio (`Integer`,
`Double`…). Se introducen más adelante o no son necesarios para estos ejercicios.

---

## 2. Clases del paquete

### `DatosPersonales.java`

Única clase del tema y ejercicio completo de variables.

- Declara un `int`, un `double`, un `String` y un `boolean`.
- Reasigna `edad` (`26` → `27`) y `altura` (`1.78` → `1.80`).
- Imprime los valores actuales para comprobar el efecto de la reasignación.
- No usa `Scanner`: los datos están escritos en el código (llegan en el tema 04).

Resumen de variables del ejercicio:

| Variable | Tipo | Valor inicial | Valor final |
|---|---|---|---|
| `edad` | `int` | `26` | `27` |
| `altura` | `double` | `1.78` | `1.80` |
| `nombre` | `String` | `"Kevin"` | `"Kevin"` |
| `estudiante` | `boolean` | `true` | `true` |

---

## 3. Relación entre las clases

Solo existe una clase, así que **no hay relación entre clases**. Tampoco hay
métodos propios ni objetos: todo el código vive dentro del `main`.

```
DatosPersonales
├── package tema02_variables
├── class DatosPersonales
└── main
    ├── declaración + inicialización de variables
    ├── reasignación
    └── println(valor)
```

| Clase | ¿Tiene `main`? | ¿Usa otras clases del proyecto? |
|---|---|---|
| `DatosPersonales` | Sí | No |

> Relación con el tema anterior: sigue el mismo esquema `package → class → main`,
> pero ahora los `println` muestran **variables** en lugar de texto fijo.

---

## 4. Cómo ejecutar

Desde la raíz del proyecto:

```bash
# compilar el tema
javac -d out src/tema02_variables/*.java

# ejecutar
java -cp out tema02_variables.DatosPersonales
```

En IntelliJ IDEA: abrir el archivo y pulsar ▶ junto al método `main`.

---

## 5. Resultado esperado

```
27
1.78
1.8
Kevin
true
```

Observaciones:

- `edad` imprime `27`, no `26`, porque se reasignó antes de imprimir.
- `altura` imprime `1.8`, no `1.80`: el `0` final de un `double` no se muestra.
- Los textos se imprimen sin comillas porque `println` muestra el **contenido**.

---

## 6. Errores típicos en este tema

- Volver a escribir el tipo al reasignar: `int edad = 27;` declara otra variable
  y provoca error si `edad` ya existía en el mismo bloque.
- Usar una variable antes de inicializarla (`int edad; println(edad);`).
- Escribir decimales con coma: `double altura = 1,78;` → error de compilación.
- Poner texto entre comillas simples: `String nombre = 'Kevin';` → error;
  las comillas simples son para `char`.
- Asignar un texto a un número: `int edad = "26";` → error de tipos.
- Escribir `True` o `False`: en Java solo existen `true` y `false`.
- Confundir `println(nombre)` con `println("nombre")`: la segunda imprime la
  palabra `nombre`, no el valor de la variable.
- Usar nombres poco claros (`a`, `b`, `x1`) en lugar de `camelCase` descriptivo.

---

## 7. Ejercicios de refuerzo

1. Añadir una variable `double peso` con tu peso y mostrarla.
2. Reasignar `nombre` a otro valor y comprobar que `println` muestra el nuevo.
3. Declarar `int anioNacimiento` y calcular la edad con una resta.
4. Provocar el error de asignar `"27"` a un `int` y leer el mensaje de `javac`.
5. Crear `MisDatos.java` con al menos dos variables de cada tipo visto.

---

## 8. Checklist de dominio

- [ ] Distingo declarar, inicializar, asignar y reasignar.
- [ ] Sé cuándo hace falta escribir el tipo y cuándo no.
- [ ] Conozco los cuatro tipos usados: `int`, `double`, `String`, `boolean`.
- [ ] Sé que `String` no es un tipo primitivo.
- [ ] Entiendo por qué `1.80` se imprime como `1.8`.
- [ ] Escribo nombres de variables en `camelCase`.

---

## Siguiente tema

[`tema03_operadores`](tema03_operadores.md) — operadores
aritméticos, de asignación, de comparación y lógicos.
