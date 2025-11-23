📘 Taller: Interfaces vs Clases Abstractas en Java — Unidad 2 (POO)

Este repositorio contiene el desarrollo del Taller sobre Interfaces vs Clases Abstractas en Java, correspondiente a la Unidad 2 de la asignatura Programación Orientada a Objetos, orientada por el docente John Carlos Arrieta Arrieta.

El objetivo principal del taller es comprender las diferencias entre interfaces y clases abstractas, cuándo utilizar cada una y cómo se complementan dentro del diseño orientado a objetos.

🎯 Objetivo del Taller

Diferenciar claramente qué es una interfaz y qué es una clase abstracta.

Entender cómo se usan en Java para definir contratos y jerarquías.

Aplicar sus conceptos mediante ejemplos correctos, incorrectos y ejercicios prácticos.

Identificar buenas prácticas y errores comunes en su uso.

📂 Contenido del Repositorio

El repositorio contiene ejemplos explicados, casos de uso y ejercicios resueltos.

✔ 1. Conceptos Fundamentales

Incluye explicación sobre:

Qué son las interfaces y las clases abstractas.

Sus propósitos en la programación orientada a objetos.

Diferencias clave:

Herencia múltiple ✔ (solo interfaces)

Métodos abstractos y concretos ✔ (solo clases abstractas)

Métodos default y estáticos ✔ (solo interfaces desde Java 8)

Nivel de abstracción

Flexibilidad vs estructura

✔ 2. Ejemplos Correctos
Ejemplo 1 — Uso de una Clase Abstracta

Clase abstracta Figura

Clase derivada Circulo sobrescribe calcularArea()

Ejemplo 2 — Uso de Interfaces

Interfaz Vehiculo con método abstracto + default

Clase Coche que implementa la interfaz

Estos ejemplos muestran cuándo conviene usar una u otra.

✔ 3. Ejemplos Incorrectos
❌ Error de compilación por no implementar métodos de una interfaz

Caso con la interfaz Jugador y la clase Futbolista.

❌ Mala práctica sin error de compilación

Clase abstracta Animal y clase derivada que no sobreescribe métodos.

Estos ejemplos ayudan a identificar errores frecuentes.

🧪 4. Ejercicios Propuestos (incluidos en el repositorio)
Ejercicio 1: Clase Figura (abstracta)

Clase abstracta: Figura

Derivadas: Rectangulo y Triangulo

Cada una implementa calcularArea()

Clase de prueba para demostrar funcionamiento

Ejercicio 2: Interfaces Volador y Nadador

Interfaz Volador

Interfaz Nadador

Clase Pato implementa ambas

Se prueba el comportamiento doble

Ejercicio 3: Uso Incorrecto

Incluye:

Clase concreta que implementa una interfaz pero sin implementar todos los métodos (error de compilación).

Intento de usar métodos "default" en una clase abstracta (no permitido).
