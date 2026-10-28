# Tema 04 — Entrada de datos por teclado

**Proyecto:** `Java-Practica`
**Paquete del código:** `tema04_entrada_datos`
**Carpeta de código:** [`src/tema04_entrada_datos`](../src/tema04_entrada_datos)
**Nivel:** inicial
**Objetivo:** leer datos escritos por el usuario para que el programa deje de
tener valores fijos y pase a depender de la entrada.

---

## 1. Conceptos que se aprenden

| Concepto | Qué se practica |
|---|---|
| `Scanner` | Clase de Java para leer datos desde una fuente (aquí, el teclado). |
| `import` | Traer una clase de otro paquete: `import java.util.Scanner;`. |
| `System.in` | Flujo de entrada estándar (el teclado). |
| `nextInt()` | Leer un número entero. |
| `nextDouble()` | Leer un número decimal. |
| `nextBoolean()` | Leer `true` o `false`. |
| `next()` | Leer **una** palabra (hasta el primer espacio). |
| `nextLine()` | Leer **toda** la línea, incluidos los espacios. |
| Enter pendiente | `nextInt()` no consume el salto de línea; hay que limpiarlo antes de `nextLine()`. |
| `print` vs `println` | `print` deja el cursor en la misma línea para que el usuario escriba ahí. |
| Concatenación | Unir texto y variables con `+` al imprimir. |
| `close()` | Liberar el recurso al terminar de usar el `Scanner`. |

### Detalle de cada concepto

- **Crear el Scanner**: `Scanner scanner = new Scanner(System.in);` se hace
  **una sola vez**; la misma variable se reutiliza para todas las lecturas.
- **Cada `nextX()` es una lectura**: el programa se detiene y espera hasta que el
  usuario escribe algo y pulsa Enter.
- **`next()` vs `nextLine()`**: `next()` corta en el primer espacio
  (`"Kevin Perez"` → `"Kevin"`); `nextLine()` devuelve la línea completa.
- **El Enter pendiente**: `nextInt()`, `nextDouble()` y `nextBoolean()` leen el
  dato pero **dejan el Enter en el buffer**. Si justo después se llama a
  `nextLine()`, este lee esa línea vacía. Por eso se añade
  `scanner.nextLine();` para "limpiar" el Enter.
- **`print` en los mensajes**: el mensaje queda en la misma línea y el usuario
  escribe a continuación. Con `println` el cursor baja y el mensaje queda arriba.
- **`+` con texto**: si el primer operando es texto, `+` concatena; no suma.
  `"Tienes " + edad + " años"` produce una sola cadena.
- **`close()`**: se llama una vez al final. Cerrar el `Scanner` cierra también
  `System.in`.

### Formato de los datos que se piden

| Método | Dato esperado | Ejemplo válido | Ejemplo inválido |
|---|---|---|---|
| `nextInt()` | Entero | `26` | `26.5`, `veintiséis` |
| `nextDouble()` | Decimal con punto | `1.78` | `1,78` |
| `nextBoolean()` | `true` / `false` | `true` | `si`, `1` |
| `next()` | Una palabra | `Kevin` | (corta en el espacio) |
| `nextLine()` | Línea completa | `Kevin Pérez` | — |

Si el dato no coincide con el método, Java lanza `InputMismatchException`.

---

## 2. Clases del paquete

### `PedirDatos.java`

Única clase del tema. Pide cuatro datos en un orden concreto y los muestra:

1. **Edad** con `nextInt()`.
2. **Limpieza del Enter** con `nextLine()` sin guardar el resultado.
3. **Nombre completo** con `nextLine()` (por eso se limpia antes).
4. **Altura** con `nextDouble()`.
5. **Estudiante** con `nextBoolean()`.

Al final imprime un resumen usando concatenación y cierra el `Scanner`.

| Paso | Método | Variable | Tipo |
|---|---|---|---|
| 1 | `nextInt()` | `edad` | `int` |
| 2 | `nextLine()` | — (solo limpia) | — |
| 3 | `nextLine()` | `nombre` | `String` |
| 4 | `nextDouble()` | `altura` | `double` |
| 5 | `nextBoolean()` | `estudiante` | `boolean` |

---

## 3. Relación entre las clases

Solo hay una clase, así que no hay relaciones entre clases del proyecto. La
novedad es que ahora se usa una **clase externa de la biblioteca de Java**:

```
PedirDatos ──usa──> java.util.Scanner
   main                 nextInt / nextDouble / nextBoolean / nextLine
```

| Clase | ¿Tiene `main`? | ¿Usa otras clases? |
|---|---|---|
| `PedirDatos` | Sí | `java.util.Scanner` (JDK) |

> Relación con el tema anterior: los operadores del tema 03 se aplican aquí al
> construir el texto de salida con `+`, pero los valores ya no están escritos en
> el código: los escribe el usuario.

---

## 4. Cómo ejecutar

Desde la raíz del proyecto:

```bash
# compilar el tema
javac -d out src/tema04_entrada_datos/*.java

# ejecutar (el programa esperará la entrada del usuario)
java -cp out tema04_entrada_datos.PedirDatos
```

En IntelliJ IDEA: abrir el archivo, pulsar ▶ y escribir las respuestas en la
consola de ejecución.

> Importante: no se puede ejecutar solo con ▶ sin escribir nada; el programa se
> queda esperando cada dato.

---

## 5. Ejemplo de ejecución

Entrada del usuario (lo que se escribe):

```
26
Kevin Pérez
1.78
true
```

Salida completa en consola:

```
Escribe tu edad: 26
Escribe tu nombre completo: Kevin Pérez
Escribe tu altura: 1.78
Eres estudiante? (true/false): true
Hola Kevin Pérez
Tienes 26 años
Altura: 1.78
Estudiante: true
```

Aclaración: las líneas `26`, `Kevin Pérez`, `1.78` y `true` **no** las imprime el
programa; las muestra la terminal al teclear. El programa solo emite los mensajes
`Escribe tu...` y el resumen final. Si se ejecuta con la entrada redirigida desde
un archivo, esos valores no aparecen en la salida.

---

## 6. Errores típicos en este tema

- Olvidar `import java.util.Scanner;` → `cannot find symbol: class Scanner`.
- Crear varios `Scanner` sobre `System.in` en el mismo programa.
- Pedir el nombre con `nextLine()` justo después de un `nextInt()` sin limpiar el
  Enter: el nombre se lee vacío.
- Escribir `1,78` en lugar de `1.78` → `InputMismatchException`.
- Usar `nextLine()` para un número: el texto se guarda pero no se convierte.
- Usar `next()` esperando leer un nombre con apellidos.
- Olvidar `scanner.close()` al final (no rompe el programa, pero es mala práctica).
- Cerrar el `Scanner` y volver a leer después → `IllegalStateException`.
- Concatenar al revés: `edad + " años"` funciona, pero el orden afecta al
  resultado cuando se mezclan números y texto.

---

## 7. Ejercicios de refuerzo

1. Pedir dos números enteros y mostrar su suma, resta, multiplicación y división.
2. Pedir nombre y edad, y saludar en una sola línea concatenada.
3. Pedir una palabra con `next()` y una frase con `nextLine()` para comprobar la
   diferencia.
4. Reproducir el error de no limpiar el Enter y observar qué se imprime.
5. Pedir altura y peso con `nextDouble()` y calcular el IMC.

---

## 8. Checklist de dominio

- [ ] Sé importar y crear un `Scanner` correctamente.
- [ ] Conozco la diferencia entre `next()`, `nextLine()`, `nextInt()`,
      `nextDouble()` y `nextBoolean()`.
- [ ] Entiendo el problema del Enter pendiente y cómo solucionarlo.
- [ ] Sé por qué se usa `print` en los mensajes de entrada.
- [ ] Cierro el `Scanner` al terminar.
- [ ] Reconozco `InputMismatchException` y sé por qué aparece.

---

## Siguiente tema

[`tema05_condicionales`](tema05_condicionales.md) —
`if`, `else if`, `else` y `switch`: tomar decisiones según los datos.
