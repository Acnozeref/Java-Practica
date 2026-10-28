# Tema 07 — Métodos

**Proyecto:** `Java-Practica`
**Paquete del código:** `tema07_metodos`
**Carpeta de código:** [`src/tema07_metodos`](../src/tema07_metodos)
**Nivel:** inicial–intermedio
**Objetivo:** agrupar código en bloques con nombre (métodos) que reciben datos,
hacen una tarea y opcionalmente devuelven un resultado. Es el paso previo a la
programación orientada a objetos.

---

## 1. Conceptos que se aprenden

| Concepto | Qué se practica |
|---|---|
| Método | Bloque de código con nombre que se escribe una vez y se llama muchas. |
| Firma | Nombre + lista de parámetros; identifica al método. |
| Tipo de retorno | Tipo del valor que devuelve (`int`, `double`, `boolean`, `String`). |
| `void` | El método no devuelve nada; solo ejecuta acciones (imprimir). |
| Parámetro | Variable declarada entre paréntesis para recibir un dato. |
| Argumento | Valor real que se pasa al llamar al método. |
| `return` | Devuelve un valor y termina el método en ese punto. |
| Alcance (*scope*) | Una variable local solo existe dentro de su bloque `{ }`. |
| `static` | El método pertenece a la clase; se llama sin crear un objeto. |
| Sobrecarga | Varios métodos con el mismo nombre y distintos parámetros. |
| `main` como coordinador | `main` pide datos, llama a los métodos y muestra resultados. |
| Conversión automática | Un `int` se pasa sin problema a un parámetro `double`. |

### Detalle de cada concepto

- **Declarar vs llamar**: declarar el método solo define la tarea (no se ejecuta).
  Se ejecuta al escribir su nombre con paréntesis: `saludar();`.
- **`void` vs tipo de retorno**: si el método devuelve algo, el `return` debe
  coincidir con el tipo declarado. Si es `void`, puede usar `return;` solo para
  salir, pero no devolver un valor.
- **Parámetro ≠ argumento**: el parámetro es la variable del método
  (`String nombre`); el argumento es el valor de la llamada (`"Kevin"`).
- **`return` termina el método**: el código que haya después de un `return`
  alcanzable no se ejecuta; si es inalcanzable, `javac` lo rechaza con
  `unreachable statement`.
- **Alcance**: las variables y parámetros de un método son **locales**; `main`
  no puede ver `prueba` de otro método, y viceversa.
- **`static` en este tema**: todos los métodos son `static` porque `main` lo es y
  todavía no se crean objetos. En el tema 09 se usan métodos de instancia.
- **Sobrecarga**: mismo nombre, distinta lista de parámetros. Cambiar **solo** el
  tipo de retorno no es sobrecarga (error de compilación).
- **Los métodos no se ordenan**: se pueden escribir antes o después de `main`;
  lo que importa es el orden de las llamadas.

---

## 2. Clases del paquete

El paquete tiene 25 clases. Todas contienen un `main` y son independientes entre
sí. Para facilitar el estudio se agrupan en familias.

### 2.1 Fundamentos del método

| Clase | Retorno | Parámetros | Idea principal |
|---|---|---|---|
| `MetodoBasico` | `void` | — | Estructura mínima: definir y llamar `saludar()`. |
| `MetodoParametros` | `void` | `String nombre` | Diferencia entre parámetro y argumento. |
| `MetodoReturn` | `int` | — | `return` devuelve un valor que se guarda en una variable. |
| `MetodoAlcance` | `void` | `String nombre` | Variables locales; `main` no ve lo de otros métodos. |
| `MetodoStatic` | `void` | — | `main` (static) llama directamente a métodos static. |

### 2.2 Parámetros y valor de retorno

| Clase | Retorno | Parámetros | Idea principal |
|---|---|---|---|
| `MetodoSuma` | `int` | `int a, int b` | Dos parámetros y `return`; el orden de argumentos importa. |
| `MetodoMultiplicacion` | `int` | `int a, int b` | Misma estructura aplicada a otra operación. |
| `MetodoPromedio` | `double` | `double, double` | Paréntesis para que la suma se divida completa: `(a + b) / 2`. |
| `MetodoComparacion` | `boolean` | `int, int` | Devolver directamente una comparación, sin `if`. |
| `MetodoEsMayor` | `boolean` | `int edad` | Versión simplificada de `MetodoAcceso`. |
| `MetodoEsPar` | `boolean` | `int numero` | `numero % 2 == 0`. |
| `MetodoEsPositivo` | `boolean` | `int numero` | `> 0` porque el `0` no es positivo. |
| `MetodoSignoNumero` | `String` | `int numero` | Un método también puede devolver texto. |
| `MetodoMayorDeTres` | `int` | `int, int, int` | Varios `return`; solo se ejecuta el primero alcanzado. |

### 2.3 Métodos `void` con lógica

| Clase | Parámetros | Idea principal |
|---|---|---|
| `MetodoPresentacion` | `String nombre` | Método `void` que solo imprime. |
| `MetodoValidarEdad` | `int edad` | Decide y muestra el mensaje; no devuelve nada. |
| `MetodoSobrecarga` | — / `String` | Dos `saludar()` con distinta firma. |
| `MetodoCalculadora` | — | Cuatro operaciones; `dividir` avisa si el divisor es 0. |
| `MetodoContar` | `int numero` | Bucle dentro de un método; devuelve el total contado. |
| `MetodoSumarHasta` | `int numero` | Acumulador `suma += i`; imprime parciales y devuelve el total. |

### 2.4 Métodos combinados con `Scanner`

| Clase | Entrada | Idea principal |
|---|---|---|
| `MetodoSaludoUsuario` | nombre | Leer → guardar en variable → pasar como argumento. |
| `MetodoEdadUsuario` | año de nacimiento | El dato leído se usa como argumento de `calcularEdad`. |
| `CalculadoraUsuario` | dos números | `main` pide datos; los métodos calculan y devuelven. |

### 2.5 Pares didácticos (misma idea, dos enfoques)

| Comparación | Diferencia |
|---|---|
| `MetodoAcceso` vs `MetodoEsMayor` | `if/else` con dos `return` vs devolver la comparación directamente. |
| `CalcularEdad` vs `MetodoEdadUsuario` | Edad fija en el código vs edad leída con `Scanner`. |
| `MetodoCalculadora` vs `CalculadoraUsuario` | Valores fijos vs valores del usuario; el segundo no avisa de la división entre 0 (devuelve `0`). |
| `MetodoSuma` vs `MetodoMultiplicacion` | Mismo patrón con distinto operador. |

---

## 3. Relación entre las clases

Las 25 clases son **independientes**: cada una tiene su `main` y ninguna importa
ni instancia a otra. No hay estado compartido ni herencia.

```
Familia 2.1  Fundamentos      ─┐
Familia 2.2  Parámetros/return ─┤
Familia 2.3  void con lógica   ─┤   (independientes)
Familia 2.4  Scanner           ─┘   cada clase: package + class + main
```

| Aspecto | Situación en este tema |
|---|---|
| ¿Usan objetos? | No: todos los métodos son `static`. |
| ¿Comparten variables? | No: cada `main` tiene las suyas. |
| ¿Hay herencia? | No. |
| ¿Hay llamadas entre clases? | No; solo se llama a métodos de la **misma** clase. |
| Reutilización | Dentro de una clase: `MetodoCalculadora` llama a sus cuatro métodos. |

> Relación con temas anteriores: los bucles y condicionales del tema 06 ahora
> viven **dentro** de métodos (`MetodoContar`, `MetodoValidarEdad`), y `Scanner`
> del tema 04 se usa para alimentar parámetros. La `static` que se usaba sin
> explicar en `main` por fin se estudia aquí; en el tema 09 se sustituye por
> objetos.

---

## 4. Cómo ejecutar

Desde la raíz del proyecto:

```bash
# compilar todo el tema
javac -d out src/tema07_metodos/*.java

# ejecutar una clase concreta
java -cp out tema07_metodos.MetodoBasico
java -cp out tema07_metodos.MetodoSumarHasta

# las tres que piden datos por teclado
java -cp out tema07_metodos.MetodoSaludoUsuario
java -cp out tema07_metodos.MetodoEdadUsuario
java -cp out tema07_metodos.CalculadoraUsuario
```

En IntelliJ IDEA: abrir el archivo y pulsar ▶ junto al `main`.

---

## 5. Resultado esperado

| Clase | Salida |
|---|---|
| `CalcularEdad` | `Edad: 26` |
| `MetodoAcceso` | `Puedes entrar?: true` |
| `MetodoAlcance` | `Hola desde main` |
| `MetodoBasico` | `Hola, soy Kevin` |
| `MetodoComparacion` | `Es mayor?: false` |
| `MetodoEsMayor` | `Eres mayor?: true` |
| `MetodoEsPar` | `Es par?: false` |
| `MetodoEsPositivo` | `Resultado: false` |
| `MetodoMayorDeTres` | `El numero mayor es: 25` |
| `MetodoMultiplicacion` | `Resultado: 40` |
| `MetodoParametros` | `Hola, Kevin` |
| `MetodoPresentacion` | `Hola Kevin` |
| `MetodoPromedio` | `Promedio: 15.0` |
| `MetodoReturn` | `30` |
| `MetodoSignoNumero` | `Numero es cero` |
| `MetodoSobrecarga` | `Hola, bienvenido` / `Hola Kevin` |
| `MetodoStatic` | `Hola` |
| `MetodoSuma` | `30` |
| `MetodoValidarEdad` | `Eres menor de edad` |

**`MetodoContar`**

```
Numero: 1
...
Numero: 10
Cantidad: 10
```

**`MetodoSumarHasta`**

```
Suma: 1
Suma: 3
Suma: 6
Suma: 10
Suma: 15
Total: 15
```

**`MetodoCalculadora`** (el aviso aparece primero porque `dividir` se llama antes
de los `println`)

```
No se puede dividir entre  0
Suma: 15
Resta: 5
Multiplicacion: 50
Division: 0.0
```

**`MetodoSaludoUsuario`** (usuario escribe `Kevin`)

```
Ingresa tu nombre: 
Kevin
Hola,Kevin
```

> Ojo: el método imprime `"Hola," + nombre`, sin espacio después de la coma.

**`MetodoEdadUsuario`** (usuario escribe `2000`)

```
Inserta tu año de nacimiento: 2000
Tu edad es: 26
```

**`CalculadoraUsuario`** (usuario escribe `10` y `4`)

```
Ingresa el primer numero: 10
Ingresa el segundo numero: 4
Suma: 14
Resta: 6
Multiplicacion: 40
Division: 2.5
```

---

## 6. Errores típicos en este tema

- Declarar un método con retorno distinto de `void` y olvidar el `return` en
  alguna rama → error de compilación.
- Devolver un tipo que no coincide: `public static int sumar() { return "30"; }`.
- Escribir código después de un `return` alcanzable.
- Confundir parámetro con argumento al explicar el código.
- Crear dos métodos iguales cambiando **solo** el tipo de retorno (no compila).
- Llamar un método de instancia desde `main` sin crear objeto.
- Usar fuera del método una variable declarada dentro (error de alcance).
- Olvidar los paréntesis al llamar: `saludar;` no ejecuta nada.
- Pasar argumentos en el orden equivocado (especialmente con dos `int`).
- En `MetodoPromedio`, escribir `numero1 + numero2 / 2` sin paréntesis:
  da `20`, no `15`.
- Ignorar el valor devuelto: `sumar(10, 20);` sin guardarlo ni imprimirlo no
  muestra nada.
- En `CalculadoraUsuario`, la división entre 0 devuelve `0` sin avisar (a
  diferencia de `MetodoCalculadora`).

---

## 7. Ejercicios de refuerzo

1. Crear `MetodoArea.java` con `areaRectangulo(double base, double altura)`.
2. Convertir `MetodoAcceso` en una sola línea con `return edad >= 18;`.
3. Añadir a `MetodoSobrecarga` una versión `saludar(String nombre, int edad)`.
4. Crear `MetodoNumeroMayor.java` que reciba dos `int` y devuelva el mayor.
5. Cambiar `MetodoSaludoUsuario` para que imprima `"Hola, " + nombre` (con
   espacio) y comprobar la diferencia.
6. En `MetodoCalculadora`, hacer que `dividir` devuelva `-1` en caso de error y
   que `main` lo detecte antes de imprimir.
7. Escribir un método `esBisiesto(int anio)` que devuelva `boolean`.

---

## 8. Checklist de dominio

- [ ] Escribo la firma completa de un método y explico cada parte.
- [ ] Distingo parámetro de argumento.
- [ ] Sé cuándo usar `void` y cuándo un tipo de retorno.
- [ ] Uso `return` correctamente y sé que termina el método.
- [ ] Entiendo el alcance de las variables locales.
- [ ] Explico por qué todos los métodos del tema son `static`.
- [ ] Sé qué es la sobrecarga y qué no lo es.
- [ ] Organizo el código con `main` como coordinador.
- [ ] Paso datos de `Scanner` a un método como argumento.

---

## Siguiente tema

[`tema08_arrays`](tema08_arrays.md) — arrays: guardar muchos
valores del mismo tipo y recorrerlos.
