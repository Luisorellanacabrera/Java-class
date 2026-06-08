# Java Class - HolaMundo

Este repositorio contiene diversos ejercicios y ejemplos de código en Java desarrollados durante el 2° Trimestre para la asignatura de **Programación Orientada a Objetos**.

## 📁 Estructura del Proyecto

Dentro de la carpeta `src` se encuentran los siguientes archivos con sus respectivas funcionalidades:

* **`AdministradorDeFrutas.java`**: Gestión y manipulación de listas o arreglos de frutas.
* **`Arrays.java`**: Ejercicios y ejemplos de uso de arreglos (arrays) en Java.
* **`Calculadora.java`**: Implementación de operaciones matemáticas básicas.
* **`EjercicioJSJava.java`**: Comparativa o traducción de lógica básica entre JavaScript y Java.
* **`EjerciciosColecciones.java`**: Ejemplos de uso y manipulación de colecciones (`ArrayList`, `List`, etc.).
* **`EjerciciosJava1.java`**: Ejercicios básicos de sintaxis y lógica en Java.
* **`EstructuraControl1.java`**: Prácticas con condicionales (`if`, `else`) y bucles (`for`, `while`).
* **`Funciones.java`**: Declaración de métodos y funciones reutilizables.
* **`GestionTrabajadores.java`**: Ejercicio de administración de personal aplicando conceptos de POO.
* **`Main1.java`**: Clase principal con el método `main` para ejecutar la lógica del proyecto.
* **`Operadores2.java`**: Prácticas con operadores aritméticos, lógicos y de asignación.
* **`VideoGame.java`**: Clase principal y clase padre base para el sistema de videojuegos. Contiene atributos encapsulados, validación de precios y el método `main` demostrativo de todo el ejercicio.
* **`PCGame.java`**: Clase hija para juegos de PC, que extiende de `VideoGame`, incluye requisitos mínimos y aplica un descuento del 10%.
* **`ConsoleGame.java`**: Clase hija para juegos de consola, que extiende de `VideoGame`, incluye consola compatible y aplica un descuento del 15%.

## 🚀 Requisitos e Instalación

1. **Java JDK 17** o superior.
2. Un IDE de tu preferencia (ej. **IntelliJ IDEA**, **Eclipse** o **VS Code**).

## 🛠️ Ejecución

Puedes compilar y ejecutar las clases desde la terminal dentro de la carpeta raíz del proyecto:

```bash
# Compilar y ejecutar el sistema de videojuegos
javac src/VideoGame.java src/PCGame.java src/ConsoleGame.java
java -cp src VideoGame
```

