# Escritura y Lectura de Archivos de Texto en Java

## Descripción

Este proyecto permite leer y escribir en un archivo de texto (`archivo.txt`) utilizando Java. Se hace uso de las clases `File`, `FileWriter` y `Scanner` para manejar la entrada y salida de datos.

## Características principales

- Permite escribir texto en un archivo `archivo.txt`.
- Usa `FileWriter` para añadir texto sin sobrescribir el contenido existente.
- Usa `Scanner` para leer la entrada del usuario.
- Maneja excepciones para evitar errores en la manipulación de archivos.

## Estructura del Proyecto

El proyecto sigue la estructura estándar de Maven:

```
Escribir-y-leer-archivos-de-texto
│── pom.xml  # Archivo de configuración de Maven
│── src
│   ├── main
│   │   ├── java
│   │   │   ├── escribir_y_leer_txt
│   │   │   │   ├── Main.java  # Código principal del programa
│   │   │   │   ├── Modulos  # Contiene clases auxiliares (si existen)
│── target  # Directorio de salida tras la compilación
```

## Requisitos

- Java 8 o superior
- Apache Maven

## Instalación y Ejecución

1. Clonar el repositorio o descargar el proyecto.
2. Navegar al directorio del proyecto.
3. Compilar y ejecutar el programa con Maven:
   ```sh
   mvn compile
   mvn exec:java -Dexec.mainClass="escribir_y_leer_txt.Main"
   ```
4. Ingresar el texto que se desea escribir en el archivo.

## Funcionamiento

El programa solicita al usuario que ingrese una línea de texto por consola y la guarda en el archivo `archivo.txt`. Si el archivo no existe, se crea automáticamente. Cada ejecución del programa añadirá una nueva línea de texto al archivo sin borrar el contenido anterior.

## Autor : Stivenco12

Desarrollado como una demostración de manejo de archivos en Java.

