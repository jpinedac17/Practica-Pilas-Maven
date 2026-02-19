# StackHandler - Análisis de Ofuscación e Ingeniería Inversa

## 📌 Descripción del Proyecto

StackHandler es una aplicación desarrollada en Java que implementa una
estructura de datos tipo **Stack (Pila)** utilizando listas enlazadas.

El proyecto permite evaluar expresiones que contienen paréntesis,
corchetes y llaves, validando si están correctamente balanceadas.

Además, se realizó un proceso de **ofuscación del código** utilizando
ProGuard para analizar el impacto en la ingeniería inversa.

------------------------------------------------------------------------

## 🏗️ Tecnologías Utilizadas

-   Java 11
-   Maven 3.9.12
-   ProGuard

------------------------------------------------------------------------

## 📂 Estructura del Proyecto

-   `Node.java` → Implementación del nodo genérico.
-   `StackLinked.java` → Implementación manual de la pila enlazada.
-   `Main.java` → Punto de entrada del programa.
-   `pom.xml` → Configuración de Maven y perfil de ofuscación.

------------------------------------------------------------------------

## ⚙️ Instalación y Compilación

### 1️⃣ Clonar el repositorio

``` bash
git clone https://github.com/jpinedac17/Practica-Pilas-Maven.git
cd stackHandler
```

### 2️⃣ Compilar el proyecto

``` bash
mvn clean package
```

Esto generará el JAR normal:

    target/stackHandler-0.0.1-SNAPSHOT.jar

------------------------------------------------------------------------

## 🔐 Generar JAR Ofuscado

Para generar el JAR ofuscado:

``` bash
mvn clean package -P obfuscate
```

Esto generará:

    target/stackHandler-0.0.1-SNAPSHOT-jar-with-dependencies-obf.jar

------------------------------------------------------------------------

## ▶️ Ejecución del Programa

### Ejecutar JAR Normal

``` bash
java -jar target/stackHandler-0.0.1-SNAPSHOT-jar-with-dependencies.jar "(a+b)*[c-d]"
```

### Ejecutar JAR Ofuscado

``` bash
java -jar target/stackHandler-0.0.1-SNAPSHOT-jar-with-dependencies-obf.jar "(a+b)*[c-d]"
```

------------------------------------------------------------------------

## 🧪 Pruebas Funcionales

Se ejecutaron pruebas con expresiones válidas e inválidas.

Ejemplo válido:

``` bash
"(a+b)*[c-d]"
```

Ejemplo inválido:

``` bash
"(a+b]*c-d)"
```

En ambos casos, el comportamiento del JAR normal y el JAR ofuscado fue
idéntico.

Esto confirma que la ofuscación **no altera la lógica del programa**,
únicamente modifica la representación del código.

------------------------------------------------------------------------

## 🔎 Análisis de Ofuscación e Ingeniería Inversa

Al decompilar el JAR ofuscado se observó que:

-   Los nombres originales de clases fueron reemplazados por
    identificadores cortos.
-   Los nombres de métodos y variables fueron alterados.
-   Se mantiene la estructura del bytecode, pero la comprensión del
    código es considerablemente más difícil.
-   La lógica puede inferirse, pero requiere análisis adicional.

Esto demuestra que la ofuscación no elimina la posibilidad de ingeniería
inversa, pero incrementa significativamente el esfuerzo necesario para
comprender el sistema.

------------------------------------------------------------------------

## 📌 Conclusiones

-   La estructura Stack funciona correctamente utilizando nodos
    enlazados.
-   La validación de expresiones balanceadas es consistente.
-   La ofuscación protege parcialmente el código.
-   La ingeniería inversa sigue siendo posible, pero más compleja.

