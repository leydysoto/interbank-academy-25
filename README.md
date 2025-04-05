# Reto Técnico: Procesamiento de Transacciones Bancarias (CLI)

## Introducción:

Este proyecto fue desarrollado como parte del proceso de selección para **Cobol Academy - Interbank**.  
El objetivo del reto es evaluar mis habilidades técnicas resolviendo un 
caso práctico con buenas prácticas de programación, documentación y organización del código.

##  Instrucciones de Ejecución

### Requisitos previos
- Java 17 o superior instalado
- IDE recomendada: [IntelliJ IDEA](https://www.jetbrains.com/idea/)

## Instalación y ejecución

1. Clona este repositorio:
   ```bash
   git clone https://github.com/leydysoto/interbank-academy-25.git
2. Abre IntelliJ IDEA y selecciona "Open" para abrir la carpeta del proyecto.

3. Si el proyecto no carga automáticamente como Maven, haz clic derecho en pom.xml y selecciona "Add as Maven Project".

4. Ejecuta la clase Main.java desde src/main/java.
## Enfoque y Solución
1. El código realiza las siguientes operaciones:

2. Lectura y Procesamiento de Datos: Se lee el archivo .csv y se separan los valores en cada línea. Se procesan los tipos de transacción (Crédito/Débito) y se calcula el monto total de cada tipo.

3. Cálculo de Balance: El balance final es el resultado de la resta entre el total de créditos y débitos.

4. Determinación del Mayor Monto: Se identifica la transacción con el mayor monto y se almacena su ID.


##  Estructura del proyecto

```plaintext
interbank-academy-25                   # Raíz del proyecto
│
├── reto-interbank          # Paquete del proyecto Java (Raíz de código fuente)
│   └── src
│       ├── main
│       │   └── java
│       │       └── Main.java     # Código fuente principal
├── data.csv                       # Archivo de datos CSV
├── README.md                      # Documentación del proyecto
└── pom.xml                        # Archivo de configuración de Maven

```
