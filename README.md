# Proyecto OCRJava

## Descripción

El proyecto **OCRJava** tiene como objetivo desarrollar una solución avanzada de Reconocimiento Óptico de Caracteres (OCR) que permite extraer y procesar texto de imágenes y documentos PDF. Utilizando Java y Tesseract, este sistema está diseñado para manejar tanto texto plano digitalizado como manuscritos, empleando técnicas avanzadas de aprendizaje profundo y procesamiento de imágenes.

## Funcionalidades

- **Selección y Carga de Archivos**: Proporciona una interfaz gráfica que permite a los usuarios seleccionar archivos (imágenes o PDF) desde su sistema. Una vez seleccionado el archivo, se carga para su procesamiento.

- **Procesamiento de OCR**: El archivo seleccionado es enviado al servicio OCR, que identifica el tipo de archivo (imagen o PDF) y aplica el reconocimiento de texto usando Tesseract. La solución maneja archivos PDF y formatos de imagen comunes como PNG, JPG, JPEG, GIF y BMP.

- **Interfaz de Usuario**: Los resultados del reconocimiento de texto son mostrados en una interfaz gráfica de usuario, proporcionando una forma intuitiva para que los usuarios vean y gestionen el texto extraído.

- **Análisis de Texto**: El texto extraído se procesa para identificar y extraer información relevante, como identificadores, fechas, detalles, valores y otros datos específicos según el contenido del texto OCR.

## Componentes Principales

- **FileSelector**: Gestión de la interfaz gráfica para la selección y carga de archivos. Permite a los usuarios elegir archivos desde su sistema y envía los archivos seleccionados para procesamiento.

- **TesseractController**: Controlador de Spring Boot que maneja las solicitudes de OCR. Procesa archivos de imagen y PDF usando el servicio de Tesseract para extraer texto.

- **FacturaParser**: Analiza el texto extraído para extraer información específica utilizando expresiones regulares. Este componente se encarga de interpretar el contenido del texto OCR para obtener datos relevantes.

- **TesseractConfig**: Configuración de Tesseract dentro del proyecto. Establece el camino hacia los datos de entrenamiento de Tesseract y define el idioma para el reconocimiento de texto.

## Tecnologías Utilizadas

- **Java**: Lenguaje de programación principal para el desarrollo del proyecto.
- **Tesseract**: Herramienta de reconocimiento óptico de caracteres utilizada para el análisis de texto en imágenes y documentos PDF.
- **Spring Boot**: Framework para el desarrollo de aplicaciones web en Java, utilizado para crear el servicio REST que maneja las solicitudes de OCR.

## Cómo Ejecutar el Proyecto

1. **Configuración del Entorno**: Asegúrate de tener Java y Tesseract correctamente instalados y configurados en tu entorno de desarrollo.
2. **Construcción del Proyecto**: Usa herramientas como Maven o Gradle para construir el proyecto.
3. **Ejecución del Servidor**: Inicia la aplicación Spring Boot para activar el servicio de OCR.
4. **Interfaz Gráfica**: Ejecuta el componente de selección de archivos para probar la carga y procesamiento de documentos.

## Contribuciones

Las contribuciones al proyecto son bienvenidas. Por favor, realiza un fork del repositorio y envía un pull request con tus mejoras o correcciones.

![OCRExp](https://github.com/user-attachments/assets/b8b45f3a-55d1-405b-a9f8-cac9b4f1ad34)
