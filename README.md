# StudentLoad

## Descripción
Este proyecto es una aplicación de escritorio desarrollada en JavaFX que permite cargar un archivo CSV con notas de estudiantes y mostrarlas en una tabla en pantalla.

## Requisitos
- Java 17 o superior
- Gradle 7.0 o superior
- JavaFX 17.0.2

## Instalación
1. **Clonar el repositorio**:
   ```bash
   git clone https://github.com/tu-usuario/StudentLoad.git
   cd StudentLoad


## Construir proyecto
    
    gradle build

## Ejecutar Aplicacion

    gradle run

## Estructura del Proyecto
StudentLoad
│   .classpath
│   .project
│   .gitignore
│   build.gradle
│   README.md
│
├───.settings
├───bin
└───src
    ├───application
    │       Main.java
    │       Student.java
    │
    └───database
            students.csv
            module-info.java


## Uso
Cargar el archivo CSV: Asegúrate de que el archivo students.csv esté en la carpeta src/database.
Ejecutar la aplicación: La aplicación cargará automáticamente los datos del archivo CSV y los mostrará en una tabla.

## Contacto
Para cualquier consulta o sugerencia, por favor contacta a josephdjz@hotmail.com