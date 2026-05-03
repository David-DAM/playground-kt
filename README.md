# Kotlin Playground 🚀

Este proyecto es un entorno de pruebas (playground) personal desarrollado en Kotlin para explorar y practicar diversas
funcionalidades del lenguaje, desde conceptos básicos hasta temas avanzados como concurrencia y serialización.

## 📋 Tabla de Contenidos

- [Características](#-características)
- [Estructura del Proyecto](#-estructura-del-proyecto)
- [Requisitos](#-requisitos)
- [Configuración y Ejecución](#-configuración-y-ejecución)
- [Tecnologías Utilizadas](#-tecnologías-utilizadas)

## ✨ Características

El proyecto abarca una amplia gama de temas divididos en paquetes específicos:

- **Concurrencia (`concurrent`):** Ejemplos de Corrutinas, Canales (Channels), Mutex, Dispatchers y programación
  asíncrona (`async`/`await`).
- **Estructuras de Datos (`data_structures`):** Implementaciones y usos de Maps, Sets, Stacks, Priority Queues, Pairs,
  Sequences y algoritmos de grafos (BFS/DFS).
- **Serialización (`json`):** Uso de `kotlinx.serialization` para convertir objetos a JSON y viceversa.
- **Programación Orientada a Objetos (`oop`):** Ejemplos de interfaces, herencia y clases de datos.
- **Streams (`stream`):** Manipulación de colecciones mediante operadores funcionales como `filter`, `map` y
  agrupaciones.
- **Expresiones Regulares (`regex`):** Validación de contraseñas y procesamiento de texto.
- **E/S de Archivos (`io`):** Lectura y escritura de archivos de texto.
- **Fechas (`dates`):** Manejo de fechas y tiempos en Kotlin.
- **HTTP (`http`):** Ejemplos de peticiones de red.

## 📂 Estructura del Proyecto

```text
src/main/kotlin/
├── concurrent/      # Corrutinas y concurrencia
├── data_structures/ # Algoritmos y estructuras de datos
├── dates/           # Manejo de fechas
├── http/            # Peticiones HTTP
├── io/              # Lectura/Escritura de archivos
├── json/            # Serialización JSON
├── oop/             # Programación Orientada a Objetos
├── regex/           # Expresiones regulares
├── stream/          # Procesamiento de flujos/colecciones
└── Main.kt          # Punto de entrada de ejemplo
```

## 🛠 Requisitos

- **Java JDK 21** (configurado en el proyecto vía Toolchain).
- **Gradle** (se incluye el Gradle Wrapper).

## 🚀 Configuración y Ejecución

Para ejecutar cualquiera de los ejemplos, puedes usar el comando de Gradle o ejecutar la función `main` directamente
desde tu IDE (IntelliJ IDEA recomendado).

Por ejemplo, para ejecutar el archivo principal:

```bash
./gradlew run
```

*Nota: Muchos de los archivos en los subpaquetes tienen su propia función `main` para ser ejecutados de forma
independiente.*

## 💻 Tecnologías Utilizadas

- **Lenguaje:** [Kotlin](https://kotlinlang.org/) (v2.1.20)
- **Gestor de Dependencias:** Gradle (Kotlin DSL)
- **Librerías Clave:**
    - `kotlinx-coroutines-core`: Para el manejo de tareas asíncronas.
    - `kotlinx-serialization-json`: Para el procesamiento de datos JSON.

