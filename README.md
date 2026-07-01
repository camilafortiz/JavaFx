# 🚀 Hola Mundo - JavaFX 
Autor: Camila Ortiz Chavez

Este proyecto es una aplicación de escritorio básica basada estrictamente en la documentación y guías de referencia de la página oficial de **OpenJFX**.

## 📖 Referencia Oficial
El código y la configuración de este repositorio siguen los lineamientos de la documentación oficial:
- **Sitio Web Oficial:** [openjfx.io](https://openjfx.io/)
- **Guía de Inicio Rápido:** [JavaFX Getting Started](https://openjfx.io/openjfx-docs/)

---

## 📂 Estructura del Proyecto (Código Fuente)

A continuación se detalla la estructura de archivos estándar utilizada en este repositorio para el código fuente:

```text
JavaFxGith/
├── .gitignore             # Archivos excluidos del control de versiones
├── README.md              # Documentación del proyecto
└── src/
    └── main/
        └── java/          # Directorio raíz del código fuente Java
            └── HelloFX.java   # Clase principal con el código de OpenJFX
```

## 📋 Descripción del Código
A diferencia de configuraciones complejas, este "Hola Mundo" utiliza código Java puro para inicializar el ciclo de vida de la aplicación mediante la clase `Application`:
- **`start(Stage stage)`**: El punto de entrada principal para la interfaz gráfica.
- **`StackPane`**: El nodo raíz que centra los elementos automáticamente.
- **`System.getProperty`**: Muestra dinámicamente en pantalla las versiones exactas de Java y JavaFX que se están ejecutando en la máquina local.

## 🛠️ Requisitos
Según la documentación oficial, para ejecutar este proyecto necesitas:
1. **Java SE JDK** (Versión 11 o superior).
2. **JavaFX SDK** configurado en las variables de entorno o mediante las herramientas de construcción (Maven/Gradle).

---
*Proyecto educativo diseñado siguiendo las especificaciones de OpenJFX.*
