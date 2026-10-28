# Tema 09 — Programación Orientada a Objetos (POO)

**Proyecto:** `Java-Practica`  
**Paquete:** `tema09_poo`  
**Carpeta de código:** [`src/tema09_poo`](../src/tema09_poo)  
**Nivel:** intermedio  
**Objetivo:** comprender los fundamentos de la programación orientada a objetos en Java y aprender a organizar el código mediante clases, objetos y relaciones entre ellos.

---

## Índice de temas

- [1. Clases y objetos](#1-clases-y-objetos)
- [2. Constructores y `this`](#2-constructores-y-this)
- [3. Encapsulamiento](#3-encapsulamiento)
- [4. Herencia](#4-herencia)
- [5. Polimorfismo y `@Override`](#5-polimorfismo-y-override)
- [6. Abstracción](#6-abstracción)
- [7. Interfaces](#7-interfaces)
- [8. Composición](#8-composición)
- [9. La palabra clave `super`](#9-la-palabra-clave-super)
- [10. `static` y miembros de instancia](#10-static-y-miembros-de-instancia)
- [11. Proyecto integrador](#11-proyecto-integrador)

---

## 1. Clases y objetos

**Conceptos estudiados:**
- Qué es una clase.
- Qué es un objeto y una instancia.
- Atributos y métodos.
- Creación de objetos con `new`.
- Cómo cada objeto mantiene sus propios datos.

**Clases relacionadas:**
- `Persona.java` — representa personas con atributos como nombre y edad.

## 2. Constructores y `this`

**Conceptos estudiados:**
- Qué es un constructor.
- Inicialización de atributos.
- Uso de `this` para distinguir atributos de parámetros.
- Sobrecarga de constructores.
- Constructores con diferentes cantidades de parámetros.

**Clases relacionadas:**
- `Producto.java` — inicializa los atributos de un producto mediante un constructor.
- `Libro.java` — practica constructores sobrecargados y valores predeterminados.

## 3. Encapsulamiento

**Conceptos estudiados:**
- Modificador de acceso `private`.
- Getters y setters.
- Protección de atributos.
- Validación de operaciones.
- Control de acceso a los datos de un objeto.

**Clases relacionadas:**
- `CuentaBancaria.java` — protege el saldo y permite consultarlo mediante un getter.
- `CuentaBancariaPractica.java` — practica depósitos y retiros con validaciones.

## 4. Herencia

**Conceptos estudiados:**
- Relación entre clase padre y clase hija.
- Uso de `extends`.
- Herencia de atributos y métodos accesibles.
- Reutilización de código.
- Relación «es un» (*is-a*).

**Clases relacionadas:**
- `Animal.java` — clase padre con datos y comportamiento común.
- `Perro.java` — clase hija que hereda de `Animal`.

## 5. Polimorfismo y `@Override`

**Conceptos estudiados:**
- Referencias de tipo padre.
- Sobrescritura de métodos.
- Uso de `@Override`.
- Diferentes comportamientos mediante una misma llamada.
- Selección del método según el tipo real del objeto.

**Clases relacionadas:**
- `MetodoPago.java` — tipo común para los métodos de pago.
- `PagoTarjeta.java` — implementa el pago con tarjeta.
- `PagoEfectivo.java` — implementa el pago en efectivo.
- `PruebaPagos.java` — comprueba el polimorfismo entre los métodos de pago.

## 6. Abstracción

**Conceptos estudiados:**
- Clases abstractas mediante `abstract`.
- Métodos abstractos.
- Definición de comportamiento común.
- Implementación concreta en clases hijas.

**Clases relacionadas:**
- `Figura.java` — define una abstracción para figuras geométricas.
- `Circulo.java` — implementa el comportamiento concreto de una figura.
- `PruebaFigura.java` — prueba el uso de la abstracción.

## 7. Interfaces

**Conceptos estudiados:**
- Declaración de interfaces.
- Uso de `implements`.
- Interfaces como contratos.
- Implementación de métodos en clases concretas.
- Polimorfismo mediante referencias de interfaz.

**Clases relacionadas:**
- `Notificable.java` — define el contrato `enviarNotificacion()`.
- `NotificacionEmail.java` — implementa las notificaciones por correo.
- `NotificacionSMS.java` — implementa las notificaciones por SMS.
- `PruebaNotificaciones.java` — utiliza ambas implementaciones mediante referencias `Notificable`.

## 8. Composición

**Conceptos estudiados:**
- Colaboración entre objetos.
- Relación «tiene un» (*has-a*).
- Uso de un objeto como atributo de otro.
- Diferencia entre composición y herencia.

**Clases relacionadas:**
- `Procesador.java` — representa un componente con el método `ejecutar()`.
- `Ordenador.java` — contiene y utiliza un objeto `Procesador`.
- `PruebaOrdenador.java` — comprueba la colaboración entre ambos objetos.

## 9. La palabra clave `super`

**Conceptos estudiados:**
- Llamada al constructor de la clase padre.
- Uso de `super(argumentos)`.
- Llamada a métodos heredados mediante `super`.
- Combinación del comportamiento de la clase padre y la hija.

**Clases relacionadas:**
- `Empleado.java` — clase padre con constructor y método `mostrarDatos()`.
- `Desarrollador.java` — hereda de `Empleado`, utiliza `super(nombre)` y sobrescribe `mostrarDatos()`.
- `PruebaDesarrollador.java` — comprueba los datos heredados y los específicos del desarrollador.

## 10. `static` y miembros de instancia

**Conceptos estudiados:**
- Atributos de clase mediante `static`.
- Atributos de instancia.
- Métodos estáticos.
- Acceso mediante el nombre de la clase.
- Diferencias entre datos compartidos y datos propios de cada objeto.

**Clases relacionadas:**
- `ContadorPersonas.java` — utiliza `static int totalPersonas` y el atributo de instancia `nombre`.
- `PruebaContadorPersonas.java` — crea tres objetos, muestra sus nombres y comprueba el contador compartido.

---

# 11. Proyecto integrador

## Sistema de empleados

**Estado:** implementado y ejecutado correctamente.

### Objetivo

Construir un pequeño sistema de empleados que combine los conceptos estudiados en POO, manteniendo las responsabilidades separadas en distintas clases.

### Conceptos aplicados

- Clases y objetos.
- Atributos y constructores.
- Uso de `this`.
- Encapsulamiento mediante `private`.
- Getters.
- Validación de argumentos.
- Herencia mediante `extends`.
- Llamadas a constructores padre con `super`.
- Sobrescritura mediante `@Override`.
- Polimorfismo.
- Arrays de objetos.
- Recorrido de arrays con `for-each`.

### Clases del proyecto

#### `EmpleadoIntegrador.java`

Clase padre del sistema.

Responsabilidades:
- Guardar el nombre y el salario.
- Mantener los atributos como `private`.
- Inicializar los datos mediante un constructor.
- Proporcionar getters.
- Mostrar los datos mediante `mostrarDatos()`.
- Rechazar nombres nulos o vacíos y salarios negativos con `IllegalArgumentException`.

#### `DesarrolladorIntegrador.java`

Clase hija de `EmpleadoIntegrador`.

Responsabilidades:
- Añadir el atributo `lenguaje`.
- Inicializar los datos heredados mediante `super(nombre, salario)`.
- Sobrescribir `mostrarDatos()`.
- Mostrar el lenguaje de programación.

#### `DisenadorIntegrador.java`

Clase hija de `EmpleadoIntegrador`.

Responsabilidades:
- Añadir el atributo `especialidad`.
- Inicializar los datos heredados mediante `super(nombre, salario)`.
- Sobrescribir `mostrarDatos()`.
- Mostrar la especialidad del diseñador.

#### `PruebaEmpleadosIntegrador.java`

Clase de prueba con `main`.

Instrucciones:
1. Crear un desarrollador y un diseñador.
2. Guardar ambos en variables de tipo `EmpleadoIntegrador`.
3. Invocar `mostrarDatos()` en cada objeto.
4. Comprobar que cada clase hija muestra su información específica.

#### `PruebaSalarioInvalido.java`

Clase de prueba para la validación.

Instrucciones:
1. Intentar crear un empleado con salario negativo.
2. Ejecutar el programa.
3. Comprobar que se lanza `IllegalArgumentException`.
4. Observar que la ejecución se detiene antes de mostrar los datos.

#### `PruebaEmpleadosArray.java`

Clase de prueba para arrays y polimorfismo.

Instrucciones:
1. Crear un array de tipo `EmpleadoIntegrador[]`.
2. Introducir desarrolladores y diseñadores en el mismo array.
3. Recorrerlo con un bucle `for-each`.
4. Invocar `mostrarDatos()` para cada elemento.
5. Comprobar que Java ejecuta la versión correspondiente al objeto real.

### Resultado esperado

El sistema permite representar empleados de diferentes tipos, reutilizar los datos comunes, protegerlos mediante encapsulamiento y mostrar información específica mediante polimorfismo.

---

## Resumen general

Al finalizar este tema, se han estudiado los siguientes conceptos:

1. Clases y objetos.
2. Atributos y métodos.
3. Constructores y `this`.
4. Sobrecarga de constructores.
5. Encapsulamiento.
6. Herencia.
7. Polimorfismo y `@Override`.
8. Abstracción.
9. Interfaces.
10. Composición.
11. `super`.
12. `static` frente a miembros de instancia.
13. Validación de argumentos mediante excepciones.
14. Arrays de objetos y `for-each`.

**Nota de estudio:** las prácticas están separadas por clases para facilitar su consulta y evitar modificar ejercicios anteriores. El proyecto integrador es independiente de las prácticas individuales y sirve para comprobar cómo se combinan varios conceptos.

No es necesario memorizar todo de una vez. Esta nota funciona como índice de consulta para volver a cada concepto cuando lo necesites.
