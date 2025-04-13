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
El código realiza las siguientes operaciones:
1. Lectura y Procesamiento de Datos: Se lee el archivo .csv y se separan los valores en cada línea.
2. Cálculo de Balance: Se procesan las transacciones (Crédito/Débito), sumando los montos de cada tipo, y se calcula la diferencia entre el total de Créditos y Débitos.
3. Determinación del Mayor Monto: Se identifica la transacción con el mayor monto  independientemente del tipo de transacción.
4. Conteo de Transacciones: Se procesan las transacciones (Crédito/Débito), contando la cantidad de transacciones de cada tipo.

#### Decisiones de diseño:
1.  Estructura condicional (if-else):
    sé un bloque if-else para distinguir entre transacciones de tipo Crédito y Débito.
2. Validación de datos: Incluí validaciones para garantizar que los datos leídos del archivo sean correctos
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
