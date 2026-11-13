# Java-Practica

Repositorio personal de aprendizaje de Java, organizado por temas.
Cada tema tiene un apunte en `Conceptos/` y su código ejecutable en `src/`.

**13 temas · 188 clases · 159 con `main` · JDK 21**

---

## Índice

- [Ruta de aprendizaje](#ruta-de-aprendizaje)
- [Bloques de estudio](#bloques-de-estudio)
- [Estructura del repositorio](#estructura-del-repositorio)
- [Cómo ejecutar](#cómo-ejecutar)
- [Convenciones](#convenciones)
- [Estado del proyecto](#estado-del-proyecto)
- [Próximos pasos](#próximos-pasos)

---

## Ruta de aprendizaje

| # | Tema | Apunte | Código | Clases representativas |
|---:|---|---|---|---|
| 01 | Fundamentos y estructura | [tema01_basicos.md](Conceptos/tema01_basicos.md) | [src/tema01_basicos](src/tema01_basicos) | `HolaMundo`, `Presentacion` |
| 02 | Variables y tipos | [tema02_variables.md](Conceptos/tema02_variables.md) | [src/tema02_variables](src/tema02_variables) | `DatosPersonales` |
| 03 | Operadores | [tema03_operadores.md](Conceptos/tema03_operadores.md) | [src/tema03_operadores](src/tema03_operadores) | `Operaciones`, `Comparaciones`, `OperadoresLogicos` |
| 04 | Entrada de datos | [tema04_entrada_datos.md](Conceptos/tema04_entrada_datos.md) | [src/tema04_entrada_datos](src/tema04_entrada_datos) | `PedirDatos` |
| 05 | Condicionales | [tema05_condicionales.md](Conceptos/tema05_condicionales.md) | [src/tema05_condicionales](src/tema05_condicionales) | `VerificarEdad`, `Edad`, `Acceso`, `Menu` |
| 06 | Bucles | [tema06_bucles.md](Conceptos/tema06_bucles.md) | [src/tema06_bucles](src/tema06_bucles) | `BucleFor`, `BucleWhile`, `BucleDoWhile`, `BreakContinue` |
| 07 | Métodos | [tema07_metodos.md](Conceptos/tema07_metodos.md) | [src/tema07_metodos](src/tema07_metodos) | `MetodoBasico`, `MetodoSuma`, `MetodoSobrecarga`, `CalculadoraUsuario` |
| 08 | Arrays | [tema08_arrays.md](Conceptos/tema08_arrays.md) | [src/tema08_arrays](src/tema08_arrays) | 71 clases: arrays 1D, matrices, `java.util.Arrays`, `Integracion` |
| 09 | POO | [tema09_poo.md](Conceptos/tema09_poo.md) | [src/tema09_poo](src/tema09_poo) | `Persona`, `CuentaBancaria`, `Figura`, `Empleado` + proyecto |
| 10 | Excepciones | [tema10_excepciones.md](Conceptos/tema10_excepciones.md) | [src/tema10_excepciones](src/tema10_excepciones) | `ExcepcionesBasicas`, `UsoThrow`, `UsoThrows`, `ValidarUsuario` |
| 11 | Framework de colecciones | [tema11_FrameworkCollection.md](Conceptos/tema11_FrameworkCollection.md) | [src/tema11_FrameworkCollection](src/tema11_FrameworkCollection) | `ArrayListPractica`, `HashSetPractica`, `HashMapPractica`, `IteratorPractica` |
| 12 | Genéricos | [tema12_generics.md](Conceptos/tema12_generics.md) | [src/tema12_generics](src/tema12_generics) | `Caja<T>`, `MetodoGenerico`, `CajaNumericaPractica`, `WildcardPractica` |
| 13 | Programación funcional | [tema13_programacionFuncional.md](Conceptos/tema13_programacionFuncional.md) | [src/tema13_programacionFuncional](src/tema13_programacionFuncional) | `Operacion`, `Calculadora`, `PredicatePractica`, `GestionUsuarios` |

---

## Bloques de estudio

### 1. Bases del lenguaje (01–06)

Sintaxis, variables, operadores, entrada por teclado, condicionales y bucles.

Clases para empezar: `HolaMundo`, `DatosPersonales`, `PedirDatos`, `VerificarEdad`, `BucleFor`.

### 2. Organización del código (07–08)

Métodos y arrays: reutilización, parámetros, retorno, recorridos, matrices y `java.util.Arrays`.

### 3. POO y errores (09–10)

Clases, objetos, encapsulamiento, herencia, polimorfismo, interfaces, composición y excepciones personalizadas.

### 4. Colecciones y genéricos (11–12)

`ArrayList`, `LinkedList`, `HashSet`, `HashMap`, `Iterator`, clases y métodos genéricos, wildcards.

### 5. Programación funcional (13)

Lambdas, interfaces funcionales, referencias a métodos y procesamiento de usuarios.

---

## Estructura del repositorio

```text
Java-Practica/
├── Conceptos/    # apuntes teóricos por tema
├── src/          # código Java organizado por paquetes
└── README.md     # este índice
```

Cada tema sigue la misma correspondencia:

```text
Conceptos/temaNN_nombre.md  ↔  src/temaNN_nombre/
```

---

## Cómo ejecutar

Desde la raíz del proyecto:

```bash
# Compilar todos los temas
javac -d out $(find src -name "*.java")

# Ejecutar una clase concreta (paquete.nombreDeLaClase)
java -cp out tema01_basicos.HolaMundo
java -cp out tema09_poo.PruebaEmpleadosIntegrador
java -cp out tema13_programacionFuncional.GestionUsuarios
```

En IntelliJ IDEA: abrir el archivo con `main` y pulsar ▶.

---

## Convenciones

- Cada tema tiene su propia carpeta y su propio paquete.
- El nombre del paquete coincide con la carpeta (`tema08_arrays`, `tema13_programacionFuncional`).
- Las clases con `main` son demostraciones ejecutables.
- Las clases sin `main` son de apoyo: interfaces, clases de dominio o utilidades.
- Los apuntes incluyen conceptos, clases relacionadas, ejecución, errores típicos y ejercicios.

---

## Estado del proyecto

- 13 temas documentados.
- Todos los temas están marcados como completados.
- El último tema es **13 — Programación funcional**.
- El proyecto compila con JDK 21.

---

## Próximos pasos

- `Streams` y operaciones funcionales sobre colecciones.
- `Optional` y manejo de valores ausentes.
- Pruebas unitarias con JUnit.
- Maven o Gradle para dependencias.
- Persistencia con JDBC.
- Desarrollo backend con Spring Boot.
