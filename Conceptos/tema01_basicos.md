# Tema 01 — Fundamentos y estructura de un programa Java

**Proyecto:** `Java-Practica`
**Paquete del código:** `tema01_basicos`
**Carpeta de código:** [`src/tema01_basicos`](../src/tema01_basicos)
**Nivel:** inicial
**Objetivo:** comprender cómo se estructura un programa Java mínimo, cómo se
organiza en paquetes y cómo se ejecuta.

---

## 1. Conceptos que se aprenden

| Concepto | Qué se practica |
|---|---|
| `package` | Agrupar las clases de un mismo tema y ubicarlas en la carpeta correspondiente. |
| `class` | Declarar una clase; si es `public`, el archivo debe llamarse igual que la clase. |
| `main` | Punto de entrada del programa: `public static void main(String[] args)`. |
| `System.out.println` | Escribir texto en la consola y saltar de línea. |
| `System.out.print` | Escribir texto sin saltar de línea (se usa a partir del tema 04). |
| Comentarios | `//` para explicar el código sin que se ejecute. |
| Orden de ejecución | Las instrucciones se ejecutan de arriba hacia abajo, una tras otra. |
| `;` | Toda sentencia termina en punto y coma. |
| `String` | Texto entre comillas dobles. |
| Convenciones | Clases en `PascalCase`; archivos y paquetes en minúsculas. |

### Detalle de cada concepto

- **`package`**: debe ser la **primera** instrucción del archivo. Indica a qué
  carpeta pertenece la clase y evita conflictos de nombres entre temas.
- **`class`**: es el "molde" donde vive el código. En este tema cada clase es un
  ejercicio independiente.
- **`main`**: sin este método la clase se compila, pero no se puede ejecutar.
  `public` permite que la JVM lo llame; `static` permite llamarlo sin crear un
  objeto; `void` indica que no devuelve nada; `String[] args` recibe argumentos
  desde la terminal.
- **`println` vs `print`**: `println` añade un salto de línea al final; `print`
  deja el cursor en la misma línea.
- **Comentarios**: no afectan a la ejecución. En estos apuntes se usan para
  explicar el *por qué* de cada línea.

---

## 2. Clases del paquete

### `HolaMundo.java`

Primer programa del curso. Muestra la estructura mínima completa:
`package` → `class` → `main` → sentencias.

- Imprime cuatro líneas: saludo, nombre, lenguaje en aprendizaje y objetivo.
- Refuerza que cada sentencia termina en `;`.
- No recibe datos ni devuelve resultados: todo es salida por consola.

### `Presentacion.java`

Repite el mismo esquema que `HolaMundo` sin depender de él.

- Imprime tres líneas con formato `Etiqueta: valor`.
- Sirve para practicar la concatenación manual de texto fijo.
- No usa variables todavía (eso llega en el tema 02).

---

## 3. Relación entre las clases

Las dos clases son **independientes**: cada una tiene su propio `main` y ninguna
referencia a la otra. No hay herencia, composición, objetos ni métodos propios.

```
HolaMundo                      Presentacion
├── package tema01_basicos     ├── package tema01_basicos
├── class HolaMundo            ├── class Presentacion
└── main → 4 println           └── main → 3 println
```

Esto es intencional: en este tema cada archivo es un ejercicio ejecutable por
separado. La relación entre clases empieza a aparecer en el tema 09 (POO).

| Clase | ¿Tiene `main`? | ¿Se comunica con otra clase? |
|---|---|---|
| `HolaMundo` | Sí | No |
| `Presentacion` | Sí | No |

---

## 4. Cómo ejecutar

Desde la raíz del proyecto:

```bash
# compilar todo el tema
javac -d out src/tema01_basicos/*.java

# ejecutar una clase (el nombre incluye el paquete)
java -cp out tema01_basicos.HolaMundo
java -cp out tema01_basicos.Presentacion
```

En IntelliJ IDEA: abrir el archivo y pulsar ▶ junto al método `main`.

> El nombre que se pasa a `java` es el **nombre completo de la clase**
> (`paquete.Clase`), no la ruta del archivo.

---

## 5. Resultado esperado

**`HolaMundo`**

```
Hola, mundo
Hola, soy Kevin
Estoy aprendiendo Java
Mi objetivo es ser Backend Developer
```

**`Presentacion`**

```
Nombre: Kevin
Lenguaje: Java
Objetivo: Backend Developer
```

---

## 6. Errores típicos en este tema

- Nombrar el archivo distinto a la clase `public`
  (`HolaMundo.java` debe contener `public class HolaMundo`).
- Olvidar el `;` al final de una sentencia.
- Escribir `system.out.println`, `System.out.Println` o `System.out.printLn`:
  Java distingue mayúsculas y minúsculas.
- Colocar el `package` después de otra instrucción; debe ser la primera línea.
- Dejar un método `main` fuera de la clase o con una firma distinta
  (por ejemplo, sin `static`).
- Ejecutar con `java src/tema01_basicos/HolaMundo.java` desde la raíz cuando se
  compiló con `-d out`: hay que usar `java -cp out tema01_basicos.HolaMundo`.

---

## 7. Ejercicios de refuerzo

1. Añadir una línea más a `HolaMundo` con tu ciudad.
2. Crear `MiObjetivo.java` en este mismo paquete con tres `println` propios.
3. Provocar a propósito el error de cambiar el nombre de la clase y observar el
   mensaje de `javac`.
4. Comprobar la diferencia entre `print` y `println` en una clase temporal.

---

## 8. Checklist de dominio

- [ ] Sé qué es un paquete y para qué sirve.
- [ ] Sé identificar el `main` y explicar cada palabra de su firma.
- [ ] Sé compilar y ejecutar una clase desde IntelliJ y desde terminal.
- [ ] Distingo `print` de `println`.
- [ ] Entiendo por qué el archivo se llama igual que la clase `public`.

---

## Siguiente tema

[`tema02_variables`](tema02_variables.md) — variables,
tipos primitivos, `String`, reasignación e impresión de valores.
