<div align="center">

# 📁 APE 5 · Manejo de ficheros en Java

**Crear · Escribir · Agregar · Explorar · Eliminar archivos de texto**

![Java](https://img.shields.io/badge/Java-17%2B-ED8B00?logo=openjdk&logoColor=white)
![Estado](https://img.shields.io/badge/Estado-Completado-3fb950)
![Ejercicios](https://img.shields.io/badge/Ejercicios-10-58a6ff)
![Universidad](https://img.shields.io/badge/UTA-Software-8957e5)

</div>

---

## 👤 Datos académicos

| | |
|---|---|
| **Estudiante** | Antony Sebastian Casillas Ochoa |
| **Universidad** | Universidad Técnica de Ambato |
| **Facultad** | Ingeniería en Sistemas, Electrónica e Industrial |
| **Carrera** | Software |
| **Asignatura** | Algoritmos y Lógica de Programación |
| **Docente** | Ing. José Caiza |
| **Periodo** | Julio – Diciembre 2026 |

---

## 🎯 Objetivo

Aprender a trabajar con archivos de texto en Java usando las clases de `java.io`: crear, consultar, escribir (sobrescribiendo o agregando) y eliminar archivos, controlando los errores con `try-catch`, `try-with-resources` y `finally`.

## 🗂️ Estructura del repositorio

```
Guia-Ape-5---Software/
├── Ejercicio 1/    Crear archivo            (.java + diagrama)
├── Ejercicio 2/    Escribir en archivo      (.java + diagrama)
├── Ejercicio 3/    Borrar archivo           (.java + diagrama)
├── Ejercicio 4/    Estudiantes y notas      (.java + diagrama)
├── Ejercicio 5/    Productos con append     (.java + diagrama)
├── Ejercicio 6/    Sistema de ventas        (.java + diagrama)
├── Ejercicio 7/    Explorar archivo         (.java)
├── Ejercicio 8/    Escribir materias        (.java)
├── Ejercicio 9/    Agregar materias         (.java)
├── Ejercicio 10/   Ciclo de vida de archivo (.java)
├── Ejercicios_Ficheros_1_2_3.pdf            (informe)
├── Ejercicios_Ficheros_4_5_6.pdf            (informe)
├── Ejercicios_Ficheros_7_8_9_10.pdf         (informe)
└── README.md
```

---

## 🧩 Resumen de ejercicios

| # | Ejercicio | Archivo que usa | Concepto principal |
|:-:|---|---|---|
| 1 | Crear un fichero | `curso.txt` | `File`, `createNewFile()` |
| 2 | Escribir en un fichero | `estudiantes.txt` | `BufferedWriter`, modo *append* |
| 3 | Eliminar un fichero | `estudiantes.txt` | `exists()`, `delete()` |
| 4 | Registro de estudiantes y calificaciones | `estudiantes.txt` | `FileWriter` (sobrescribe), ciclo `for` |
| 5 | Registro de productos | `productos.txt` | Modo *append*, cálculo de valor total |
| 6 | Sistema de ventas | `ventas.txt` | Ciclo `while`, descuento, total acumulado |
| 7 | Explorar un archivo | `datos/prueba.txt` | `getParentFile()`, `mkdirs()`, `getName()`, `getPath()` |
| 8 | Escribir lista de materias | `materias.txt` | Escritura con `try-catch-finally` |
| 9 | Agregar materias | `materias.txt` | Append sin perder lo anterior |
| 10 | Ciclo de vida de un archivo | `datos/temporal.txt` | Crear, consultar y borrar con confirmación |

---

## 📖 Detalle de cada ejercicio

### 1️⃣ Crear un fichero
Crea **`curso.txt`**.
- `createNewFile()` devuelve `true` si lo creó y `false` si ya existía.
- `getAbsolutePath()` muestra dónde quedó el archivo.
- La `IOException` se captura con `try-catch`.

```
[OK] Se creó el archivo: curso.txt
[AVISO] El archivo curso.txt ya estaba creado.
```
![Diagrama ejercicio 1](Ejercicio%201/diagrama_ejercicio1_crear_archivo.png)

### 2️⃣ Escribir en un fichero
Lee un mensaje por teclado y lo guarda en **`estudiantes.txt`**.
- `Scanner` captura el texto dentro de un `try-with-resources`.
- `FileWriter(ruta, true)` abre en modo **append**: agrega al final sin borrar lo anterior.
- `BufferedWriter` escribe con `write()` y `newLine()`.

![Diagrama ejercicio 2](Ejercicio%202/diagrama_ejercicio2_escribir_archivo.png)

### 3️⃣ Eliminar un fichero
Elimina **`estudiantes.txt`**.
- `exists()` verifica que el archivo esté antes de borrar.
- `delete()` devuelve `true` si lo eliminó; si falla puede ser por permisos o porque está abierto.

![Diagrama ejercicio 3](Ejercicio%203/diagrama_ejercicio3_eliminar_archivo.png)

### 4️⃣ Registro de estudiantes y calificaciones
Pide el nombre y la calificación de **3 estudiantes** y los guarda en `estudiantes.txt`.
- `FileWriter` **sin** `true`: el archivo se reemplaza en cada ejecución.
- Un ciclo `for` repite la lectura tres veces.
- Cada estudiante ocupa dos líneas (nombre y calificación).

![Diagrama ejercicio 4](Ejercicio%204/diagrama_ejercicio4_estudiantes.png)

### 5️⃣ Registro de productos con append
Guarda nombre, precio y cantidad de un producto en `productos.txt`.
- Modo *append*: cada ejecución agrega un producto nuevo.
- Calcula `valorTotal = precio * cantidad` y lo guarda junto con una línea separadora.

![Diagrama ejercicio 5](Ejercicio%205/diagrama_ejercicio5_productos.png)

### 6️⃣ Sistema de ventas
Registra ventas en `ventas.txt` hasta que se escribe `fin`.
- Ciclo `while (true)` con `break`.
- **Descuento del 10 %** si el subtotal es mayor o igual a 100.
- Al terminar guarda el **total acumulado** de todas las ventas.

![Diagrama ejercicio 6](Ejercicio%206/diagrama_ejercicio6_ventas.png)

### 7️⃣ Explorar un archivo
Trabaja con `datos/prueba.txt`.
- Crea la carpeta `datos` si no existe (`mkdirs()`).
- Crea el archivo solo si no existe y muestra su nombre y ruta.

### 8️⃣ Escribir materias
Escribe cinco asignaturas en `materias.txt`, una por línea.
- Usa `try-catch-finally` para cerrar el `BufferedWriter` siempre.
- Sobrescribe el contenido anterior.

### 9️⃣ Agregar materias
Añade **Inglés Técnico** e **Ingeniería de Software** al final de `materias.txt`.
- Modo *append* (`true`): conserva las materias del ejercicio 8.

### 🔟 Ciclo de vida de un archivo
Crea `datos/temporal.txt`, consulta si existe y lo elimina tras una confirmación simulada.
- Une `exists()`, `createNewFile()` y `delete()` en un solo flujo.

---

## ▶️ Cómo ejecutar

Requisito: **JDK 17 o superior** (`java -version` para comprobarlo).

> ⚠️ En Java, el nombre del archivo `.java` debe coincidir con el de la clase `public`. Algunos archivos de este repositorio tienen nombres descriptivos con espacios (por ejemplo `Ejercicio 1 - Crear Archivo.java`). Para compilarlos, usa el nombre de la clase:

```bash
# Ejemplo con el Ejercicio 1
cp "Ejercicio 1/Ejercicio 1 - Crear Archivo.java" Ejercicio1CrearArchivo.java
javac Ejercicio1CrearArchivo.java
java Ejercicio1CrearArchivo
```

Los ejercicios 7 al 10 ya tienen el nombre correcto:

```bash
cd "Ejercicio 8"
javac Ejercicio8EscribirMaterias.java
java Ejercicio8EscribirMaterias
```

> 💡 Orden recomendado: 1 → 2 → 3, luego 4 → 5 → 6, y por último 7 → 8 → 9 → 10 (el 9 depende de que el 8 haya creado `materias.txt`).

---

## 📚 Conceptos clave

| Clase / método | Para qué sirve |
|---|---|
| `File` | Representa un archivo o ruta en el sistema |
| `createNewFile()` | Crea el archivo si no existe |
| `exists()` | Comprueba si el archivo existe |
| `delete()` | Elimina el archivo |
| `mkdirs()` | Crea carpetas (y las intermedias) |
| `getName()` / `getPath()` / `getAbsolutePath()` | Nombre y ruta del archivo |
| `FileWriter(ruta)` | Escribe sobrescribiendo el contenido |
| `FileWriter(ruta, true)` | Escribe en modo *append* |
| `BufferedWriter` | Escritura eficiente por líneas |
| `Scanner` | Lectura de datos por teclado |
| `try-catch` / `try-with-resources` / `finally` | Manejo de errores y cierre de recursos |

## ✅ Conclusiones

- `File` permite crear, comprobar, ubicar y eliminar archivos con pocos métodos.
- La diferencia entre `FileWriter(ruta)` y `FileWriter(ruta, true)` define si se **reemplaza** o se **conserva** el contenido previo.
- Verificar con `exists()` y capturar la `IOException` evita que el programa se detenga de forma inesperada.
- Cerrar siempre los recursos (con `try-with-resources` o `finally`) evita archivos bloqueados y datos sin guardar.

---

<div align="center">

Hecho con ☕ por **Antony Sebastian Casillas Ochoa** · UTA – Carrera de Software · Noviembre 2026

</div>
