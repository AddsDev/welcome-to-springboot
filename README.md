# Welcome to SpringBoot
___
# 🧐 ¿Qué son los frameworks?
Los *frameworks* son “*marcos de trabajo*” o conocidos por ser entornos de trabajo que buscan apoyar el 
desarrollo de aplicaciones profesionales que sean estables y dinámicas. 
Estos *Frameworks* vienen con un conjunto de paquetes (librerías), herramientas y diversas utilidades 
que buscan apoyar el desarrollo de un proyecto.

Un *framework* busca ser parte del paradigma del desarrollo de software ágil, con el fin de desarrollar 
proyectos de manera productiva y en menos tiempo. En este caso, desarrollar aplicativos web que tengan alta 
complejidad de consumo a nivel de información y contenido será de gran ayuda al momento de 
implementar *frameworks* en el proyecto.

# 🙋🏻 ¿Qué es una API?

Una interfaz de programación de aplicaciones (API) es una especificación diseñada para ser 
utilizada como interfaz por componentes de software para comunicarse entre sí. 
> 📱 Cuando una app móvil muestra el clima, usa una API para obtener datos de un servidor meteorológico.

Una API puede incluir especificaciones para rutinas, estructuras de datos, clases de objetos y variables. \
La especificación de una API puede adoptar diversas formas, como un Estándar Internacional, documentación del 
proveedor o las bibliotecas de un lenguaje de programación, como la API de Java.

# 🙈 ¿Qué tipos de APIs existen?
Existen varios tipos de APIs, clasificados por su arquitectura o protocolos, las principales y más usadas son:
- __SOAP__: (SOAP - Simple Object Access Protocol) Protocolo de comunicación basado en XML.
```xml
<aut:AuthHeader>
    <aut:Password> abc@123</aut:Password>
</aut:AuthHeader>
```
- __GraphQL__: lenguaje de consulta para APIs que permite a los clientes solicitar datos de manera personalizada. Utilizando JSON como formato de datos.
```graphql
query {
  libro(id: 1) {
    titulo
    autor
  }
}
```
- __REST__: (Representational State Transfer) Protocolo de comunicación basado en HTTP realizando operaciones con HTTP verbs (GET, POST, PUT, DELETE).
```http
GET /api/libros/1 HTTP/1.1
Host: ejemplo.com
```
# 😖 Componentes de una API

### 1️⃣ Endpoints

URLs que representan el recurso `GET /api/weather`, `PUT /api/weather/99`.

### 2️⃣ Métodos HTTP
HTTP verbs: <br/> <ul><li>`GET`: Obtener datos.</li><li>`POST`: Crear un recurso.</li><li>`PUT`: Actualizar un recurso.</li><li>`PATCH`: Actualización parcial de un recurso.</li><li>`DELETE`: Eliminar.</li></ul>

### 3️⃣ Status code
- `200`: Exitoso.<br/><img src="https://http.cat/200" width="200" alt="200">
- `201`: Creado.<br/><img src="https://http.cat/201" width="200" alt="201">
- `400`: Error cliente.<br/><img src="https://http.cat/400" width="200" alt="400">
- `404`: No encontrado.<br/><img src="https://http.cat/404" width="200" alt="404">
- `500`: Error en el servidor.<br/><img src="https://http.cat/500" width="200" alt="500">

> Estados de HTTP versión Gatos: [HTTP Cats](https://http.cat)

# 👀 ¿Qué es SpringBoot?

Spring Boot es un **framework** avanzado que ha revolucionado el panorama de desarrollo de aplicaciones 
Java empresariales. Diseñado para simplificar el proceso de creación, configuración y despliegue de 
aplicaciones, Spring Boot se destaca por su enfoque en la convención sobre la configuración, lo que significa 
que los desarrolladores pueden concentrarse en la lógica de negocio sin la carga de configuraciones extensas.

Una característica distintiva de Spring Boot es su capacidad para empaquetar aplicaciones como archivos 
ejecutables independientes, ya sea en formato JAR o WAR, lo que simplifica significativamente el despliegue 
y la gestión de dependencias. Además, Spring Boot ofrece una amplia integración con tecnologías modernas, 
como Spring Data JPA para el acceso a bases de datos, Spring Security para la implementación de medidas 
de seguridad, y Thymeleaf para el desarrollo de vistas en aplicaciones web.

Al igual que esto hay otras características representativas las cuales son las siguientes:

- ☝ **Configuración Automática:** Spring Boot realiza la configuración automática, lo que significa que intenta 
configurar la aplicación basándose en las dependencias presentes en el proyecto. Esto reduce la cantidad de 
configuración manual que un desarrollador necesita realizar.
- ☝ **Incrustación de Servidor:** Spring Boot incluye servidores integrados como Tomcat, Jetty o Undertow, lo 
que significa que no es necesario configurar un servidor por separado para ejecutar la aplicación. 
Puedes empaquetar la aplicación como un archivo JAR ejecutable o un archivo WAR para implementarla en un servidor.
- ☝ **Inicio Rápido:** Spring Boot facilita la creación de aplicaciones con un inicio rápido. 
Con unas pocas anotaciones y configuraciones mínimas, puedes desarrollar aplicaciones funcionales de manera rápida.
- ☝ **Microservices:** Spring Boot es ampliamente utilizado en el desarrollo de arquitecturas de micro-servicios. 
Facilita la creación de servicios independientes que se pueden implementar y escalar de manera independiente.
- ☝ **Gestión de Dependencias:** Spring Boot utiliza Spring Boot Starter, que son dependencias pre-configuradas para varias tecnologías y frameworks. 
Esto facilita la inclusión de las dependencias necesarias en tu proyecto.
- ☝ **Monitorización y Actuadores:** Spring Boot incluye un conjunto de actuadores que proporcionan características 
de monitorización y administración, como la información sobre la aplicación, la salud del sistema y la gestión de los beans de Spring.
- ☝ **Soporte para Spring Ecosystem:** Spring Boot se integra bien con otros proyectos del ecosistema Spring, 
como Spring Data, Spring Security y Spring Cloud, para facilitar el desarrollo de aplicaciones más completas.

# 🤓 ¿Qué es un Java Bean?

Un "Bean" en el contexto del framework Spring se define como **un objeto administrado, creado y controlado 
por el contenedor de Spring**. Estos objetos son utilizados para encapsular y proveer servicios, utilidades 
y funcionalidades a otros componentes dentro de una aplicación. En Spring Boot se usa la anotación `@Bean` 
declarar un método como un bean. Este método debe retornar un objeto que se desea registrar como un bean 
en el contenedor de Spring y este último se encargará entonces de gestionar el ciclo de vida y de inyectarlo 
en otros componentes según sea necesario.

Los Java Bean tienen una serie de características y funcionalidades, las cuales son las siguientes:

1. ☝ **Reutilizable**: Los Beans están diseñados para ser empleados en distintas aplicaciones, lo que simplifica el proceso de desarrollo y mantenimiento del software.
2. ☝ **Manipulable visualmente**: Los Beans pueden ser manejados de manera visual en herramientas de desarrollo como los Entornos de Desarrollo Integrados (IDEs), facilitando así su utilización por parte de los desarrolladores.
3. ☝ **Serializable**: Los Beans pueden ser convertidos en una secuencia de bytes, lo que posibilita su almacenamiento y transmisión entre diferentes sistemas a través de la red o en dispositivos de almacenamiento.
4. ☝ **Propiedades**: Los Beans poseen propiedades que encapsulan tanto datos como comportamiento. Estas propiedades pueden ser de solo lectura o de lectura y escritura, dependiendo de la configuración deseada.
5. ☝ **Métodos**: Los Beans contienen métodos que permiten acceder y modificar sus propiedades. Los más comunes son los métodos getter, que permiten obtener el valor de una propiedad, y los setter, que permiten establecer o modificar el valor de una propiedad.
6. ☝ **Eventos**: Los Beans tienen la capacidad de generar eventos para informar a otros componentes sobre cambios en su estado, lo que facilita la comunicación entre distintos elementos de un sistema.
7. ☝ **Introspección**: Los Beans pueden ser examinados por herramientas de desarrollo para obtener información sobre sus propiedades y métodos, lo que facilita su manipulación y utilización en el proceso de desarrollo de software.

## 🫣 Ciclo de vida de Bean

El ciclo de vida de un bean en Spring Boot es el conjunto de fases que atraviesa un bean desde su creación hasta su destrucción. El contenedor de Spring Boot administra el ciclo de vida de los beans, proporcionando una serie de métodos de devolución de llamada que pueden ser usados para realizar tareas específicas en cada fase.

Las fases del ciclo de vida de un bean en Spring Boot son las siguientes:

- ☝ **Instantiation:** En esta fase, el contenedor de Spring Boot crea una instancia del bean.
- ☝ **Configuration:** En esta fase, el contenedor de Spring Boot llama a los métodos de configuración del bean.
- ☝ **Initialization:** En esta fase, el contenedor de Spring Boot llama a los métodos de inicialización del bean.
- ☝ **Ready:** En esta fase, el bean está listo para ser utilizado.
- ☝ **Destruction:** En esta fase, el contenedor de Spring Boot destruye el bean.

------

# 🚀 Vamos a empezar

Podemos crear un proyecto con Springboot de varias formas:

## 1️⃣ Clonar el repositorio base
```bash 
git clone https://github.com/AddsDev/welcome-to-springboot.git
cd welcome-to-springboot
```
## 2️⃣ Crear el proyecto con [Spring Initializr](https://start.spring.io/)

## 3️⃣ Crear el proyecto con tu IDE

### Para VsCode recuerda instalar las siguientes extensiones:
- **Extension Pack for Java** de Microsoft para Visual Studio Code es un paquete de extensiones diseñadas para facilitar el desarrollo en Java dentro del editor.
![](https://i.ibb.co/Tx0wFXbg/image.png)
- **Spring Boot Dashboard** es una herramienta diseñada para facilitar el desarrollo y la gestión de aplicaciones **Spring Boot** dentro del editor.
  ![](https://i.ibb.co/5WpRKxnr/image.png)
- **Spring Boot Tools** mejora la experiencia de desarrollo con **Spring Boot**, proporcionando herramientas esenciales para la configuración y validación de archivos de propiedades.
  ![](https://i.ibb.co/JRLzx1nq/image.png)
### Para IntelliJ IDEA recuerda instalar el plugin:
- [**Spring Boot**](https://plugins.jetbrains.com/plugin/20211-spring-boot) de JetBrains s.r.o. \
![](https://i.ibb.co/gMf9SPXv/Screenshot-2025-02-06-at-9-06-40-AM.png)

## 📖 Estructura de archivos del proyecto
![](https://i.ibb.co/0ywch5Z7/estructura-de-springboot.png)
### 📁 **.mvn/**

- Carpeta interna de **Maven Wrapper**, contiene archivos de configuración para ejecutar Maven sin necesidad de instalarlo manualmente.

### 📁 **.vscode** o **.idea**

- Carpeta específica de **Visual Studio Code** que almacena configuraciones del editor para este proyecto.

### 📁 **src/**

- Contiene el

  código fuente del proyecto

  . Se divide en dos subdirectorios principales:

    - **`src/main/java/`** → Contiene las clases Java del proyecto.
    - **`src/main/resources/`** → Contiene recursos como archivos de configuración (`application.properties` o `application.yml`), plantillas HTML (si usas **Thymeleaf**) y otros archivos estáticos.
    - **`src/test/java/`** → Contiene las pruebas unitarias y de integración.

### 📁 **target/**

- Carpeta donde se **compilan y empaquetan los archivos del proyecto**. Se genera al ejecutar `mvn package` o `mvn install`.

### 📄 **.gitattributes**

- Archivo de **Git** que define configuraciones específicas para manejar archivos en el repositorio.

### 📄 **.gitignore**

- Archivo de **Git** que define qué archivos o carpetas deben **excluirse** del control de versiones, como `target/` y archivos temporales.

### 📄 **HELP.md**

- Archivo de ayuda generado por **Spring Initializr**, contiene información sobre la estructura del proyecto y cómo ejecutarlo.

### 📄 **mvnw** y **mvnw.cmd**

- Maven Wrapper

  : Permite ejecutar Maven sin necesidad de instalarlo globalmente en el sistema.

    - **`mvnw`** → Se usa en **Linux/macOS**.
    - **`mvnw.cmd`** → Se usa en **Windows**.

### 📄 **pom.xml**

- Archivo de configuración principal de Maven

    - Define **dependencias** del proyecto (Spring Boot, JPA, Lombok, etc.).

    - Configura **versiones**, **plugins** y otros parámetros del proyecto.

    - Se ejecuta con comandos como:

      ```bash
      shCopiarEditarmvn clean install  # Compila y empaqueta el proyecto
      mvn spring-boot:run  # Ejecuta la aplicación
      ```
### ✅ **Resumen**

- 📂 **`src/`** → Código fuente del proyecto.
- 📂 **`target/`** → Carpeta de salida con el JAR/WAR compilado.
- 📄 **`pom.xml`** → Configuración principal del proyecto (dependencias, plugins, etc.).
- 📄 **`mvnw` y `mvnw.cmd`** → Scripts para ejecutar Maven sin instalación.
- 📄 **`.gitignore` y `.gitattributes`** → Configuraciones para Git.

------

#### 🔑 **Controlador REST con `@RestController`**


La anotación `@RestController` en Spring Boot sirve para marcar una clase como un controlador especializado en la creación de servicios web RESTful. Esta anotación combina las funcionalidades de `@Controller` y `@ResponseBody`, lo que significa que los métodos de la clase anotada con `@RestController` devuelven directamente objetos serializados en formato JSON o XML como respuesta a las solicitudes HTTP, en lugar de depender de las vistas tradicionales.

##### ⚠ **características importantes de `@RestController`:**

1️⃣ **Gestión de solicitudes HTTP**: Al igual que con `@Controller`, los métodos dentro de una 
clase anotada con `@RestController` pueden manejar las solicitudes HTTP mediante anotaciones 
como `@RequestMapping`, `@GetMapping`, `@PostMapping`, `@PutMapping`, `@DeleteMapping`, etc.

2️⃣ **Respuestas REST**: La anotación `@RestController` agrega automáticamente la anotación 
`@ResponseBody` a cada método en la clase, lo que indica que los resultados de los métodos 
son enviados directamente al cuerpo de la respuesta HTTP en lugar de ser tratados como 
nombres de vistas. Esto facilita la creación de servicios REST que devuelven datos
estructurados como JSON.

3️⃣ **Serialización automática**: Spring Boot, junto con bibliotecas como Jackson, se encarga de
serializar automáticamente los objetos devueltos por los métodos de un controlador 
`@RestController` en el formato adecuado (JSON) antes de enviarlos como respuesta al cliente.

4️⃣ **Facilidad de uso**: Al utilizar `@RestController`, se simplifica la configuración y el 
desarrollo de servicios web REST, ya que elimina la necesidad de anotar métodos individualmente
con `@ResponseBody`.

```java
package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("/welcome")
    public String saludo(@RequestParam(name = "name", defaultValue = "User") String nombre) {
        return "¡Welcome, " + nombre + ".";
    }
}
```
- `@RestController`: Indica que el controlador devuelve respuestas en **JSON**.
- `@GetMapping("/welcome")`: Maneja peticiones `GET` en la URL `/saludo`.
- `@RequestParam(name = "name", defaultValue = "User")`: Recibe un parámetro opcional llamado `name`.

#### @RequestMapping

`@RequestMapping` es una anotación fundamental en Spring Boot que se utiliza para mapear 
solicitudes HTTP a métodos específicos dentro de un controlador. Esta anotación es bastante
versátil y puede ser utilizada para mapear una variedad de tipos de solicitudes 
HTTP (GET, POST, PUT, DELETE, etc.) a métodos en un controlador.

Formas en que se puede usar `@RequestMapping`:

1. **Mapeo de URL**: `@RequestMapping` permite mapear una URL específica a un método en un
controlador. Por ejemplo, `@RequestMapping("/hello")` mapea la URL "/hello" a un método en el controlador.
2. **Mapeo de métodos HTTP**: `@RequestMapping` permite especificar el método HTTP al que 
responde un método en el controlador. Por ejemplo, `@RequestMapping(value="/hello", method=RequestMethod.GET)` indica que 
el método en el controlador responde únicamente a solicitudes GET.
3. **Múltiples URL y métodos**: `@RequestMapping` permite mapear múltiples URL y métodos 
HTTP al mismo método en el controlador. Por ejemplo, `@RequestMapping(value={"/welcome", "/greetings"}, method={RequestMethod.GET, RequestMethod.POST})`
mapea los métodos GET y POST a las URL "/welcome" y "/greetings".
4. **Parámetros de solicitud**: `@RequestMapping` también puede tener parámetros adicionales
para especificar condiciones de solicitud más complejas, como parámetros de consulta, 
encabezados de solicitud, tipo de contenido, etc.

```java
package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/users")
public class userController {
    
    @GetMapping("/welcome")
    public Map<String, Object> getWelcomeMessage() {
        Map<String, Object> response = new HashMap<>();
        response.put("mensaje", "¡Bienvenido al mundo de Spring Boot!");
        return response;
    }
}
```

### 🕺🏻 Model

El Modelo sirve como contenedor para los datos que necesitan ser pasados entre el Controlador
y la Vista. Actúa como un puente, permitiendo al Controlador compartir información con la 
Vista para su presentación.

En este contexto, el **modelo (Model)** representa los datos de la aplicación y cómo estos
se gestionan.

```java
public class Clima {
    private Long id;
    private String name;
    private double temperatura;
    private int humedad;
    private Instant fecha;
    private String condicion;
    
    // Getters, Setters and Constructors
    
}
```

### 🙃 `@Autowired`

La anotación `@Autowired` es una de las anotaciones más utilizadas en Spring Framework. 
Su propósito principal es permitir la inyección automática de dependencias, es decir, 
permitir que Spring resuelva y suministre automáticamente los beans.

### ¿Qué hace `@Autowired`?

1. **Inyección de Dependencias**: `@Autowired` permite a Spring inyectar automáticamente el bean apropiado en un campo, un método setter, o un constructor de una clase. Esto elimina la necesidad de inicializar manualmente las dependencias y facilita la gestión de beans.
2. **Resolución Automática**: Spring utiliza su mecanismo de resolución de beans para encontrar un bean compatible que coincida con el tipo del campo, parámetro del método o constructor donde se coloca `@Autowired`.
```java
public class ClimaController {
    @Autowired
    ClimaRepository climaRepository;
    //...
}
```

### 😩 ¿Qué son los repositorios?

En el contexto de desarrollo de aplicaciones con Spring Boot y JPA, un repositorio es una 
interfaz que proporciona mecanismos para realizar operaciones de persistencia y recuperación
de datos desde una base de datos. En términos más simples, un repositorio se utiliza para 
interactuar con la base de datos.

### 🧑🏼‍🚀 ¿Para qué sirve un repositorio?

1. **CRUD Operations**: Permite realizar operaciones básicas de creación, lectura, 
actualización y eliminación (Create, Read, Update, Delete) sobre las entidades de la base 
de datos.
2. **Abstracción del Acceso a Datos**: Proporciona una capa de abstracción que separa la 
lógica de negocio de la lógica de acceso a datos, facilitando el mantenimiento y la evolución del código.
3. **Consultas Personalizadas**: Además de las operaciones CRUD, los repositorios pueden 
definir consultas personalizadas utilizando el lenguaje de métodos de consulta de Spring Data JPA.
4. **Soporte para Paginación y Ordenación**: Ofrecen métodos integrados para paginar y 
ordenar los resultados de las consultas.

```java
public interface ClimaRepository extends JpaRepository<Clima, Long> {
    List<Clima> findByCiudad(String ciudad);
    List<Clima> findByFecha(LocalDate fecha);
    List<Clima> findByCiudadAndFecha(String ciudad, LocalDate fecha);
}
```

## 🚚 ¿Qué  es un service?

En el contexto del desarrollo de aplicaciones con Spring, un "service" (servicio) es una clase que contiene la lógica de negocio de la aplicación. Los servicios se utilizan para encapsular esta lógica, separándola de la capa de controladores y la capa de acceso a datos, lo que resulta en un diseño más limpio y fácil de mantener.

### 📋 Funciones de un Service

1. **Encapsulamiento de la Lógica de Negocio**: La principal función de un servicio es encapsular la lógica de negocio. Esto significa que cualquier operación que no sea directamente relacionada con la presentación de datos o con el acceso a la base de datos debería estar en la capa de servicios.
2. **Reutilización**: Al centralizar la lógica de negocio en servicios, esta lógica puede ser reutilizada por diferentes partes de la aplicación.
3. **Facilitar las Pruebas**: Al separar la lógica de negocio en servicios, es más fácil crear pruebas unitarias para esta lógica sin necesidad de involucrar la capa de presentación o la de acceso a datos.
4. **Desacoplamiento**: Los servicios ayudan a desacoplar diferentes partes de la aplicación, facilitando el mantenimiento y la evolución del código.

### **`@Service`**

En Spring es una especialización de la anotación `@Component`. Se utiliza para marcar una clase como un servicio, que es un componente que contiene la lógica de negocio de la aplicación. La anotación `@Service` indica que una clase ofrece alguna funcionalidad y se utiliza en la capa de servicio de la aplicación.

#### Funciones de un Service

1. **Encapsulamiento de Lógica de Negocio**: Un servicio encapsula la lógica de negocio de la aplicación, separándola de la capa de presentación (controladores) y de la capa de acceso a datos (repositorios).
2. **Reutilización**: La lógica encapsulada en un servicio puede ser reutilizada por diferentes partes de la aplicación, promoviendo la DRY principle (Don't Repeat Yourself).
3. **Facilidad de Pruebas**: Al separar la lógica de negocio en servicios, es más fácil crear pruebas unitarias para esta lógica sin necesidad de involucrar la capa de presentación o la de acceso a datos.
4. **Desacoplamiento**: Los servicios ayudan a desacoplar diferentes partes de la aplicación, facilitando el mantenimiento y la evolución del código.


```java

public interface ClimaService {
    List<Clima> getAllClimas();
    List<Clima> getClimaByCiudad(String ciudad);
    List<Clima> getClimaByFecha(LocalDate fecha);
    List<Clima> getClimaByCiudadAndFecha(String ciudad, LocalDate fecha);
    Clima createClima(Clima clima);
    Boolean deleteClima(Long id);
    Clima updateClima(Long id, Clima clima);

}
```

## [Hibernate](https://hibernate.org/)

Es una herramienta de mapeo de objeto relacional (ORM) que permite trabajar los datos de una base de datos (RDBMS) en forma de clases y objetos (lenguaje POO).

<img src="https://i.ibb.co/TDt84sVP/Hibernate.png" alt="75" style="zoom: 50%;" />

### Tipos de consulta

### HQL

HQL, o Hibernate Query Language, es un lenguaje de consulta orientado a objetos similar a SQL, pero diseñado específicamente para trabajar con Hibernate, un framework de mapeo objeto-relacional (ORM) en Java. HQL permite realizar consultas y manipulaciones en la base de datos utilizando las clases y atributos del modelo de datos en lugar de las tablas y columnas de la base de datos.

#### Características de HQL

1. **Orientado a objetos**: HQL utiliza las entidades del modelo de datos de Hibernate en lugar de tablas de la base de datos.
2. **Consulta independiente de la base de datos**: HQL es independiente del sistema de gestión de bases de datos subyacente, lo que facilita la portabilidad del código.
3. **Similar a SQL**: Aunque HQL es un lenguaje propio de Hibernate, su sintaxis es muy similar a la de SQL, lo que facilita su aprendizaje para quienes ya conocen SQL.
4. **Soporte para funciones de agregación y subconsultas**: HQL admite funciones de agregación (como SUM, COUNT, AVG) y subconsultas, al igual que SQL.
5. **Operaciones de asociación y herencia**: HQL permite realizar consultas sobre asociaciones y herencias definidas en el modelo de datos, facilitando la navegación entre entidades relacionadas.

#### Ventajas de usar HQL

- **Abstracción del modelo de datos**: Permite trabajar a un nivel más alto de abstracción, utilizando objetos y sus relaciones.
- **Portabilidad**: Las consultas HQL no están vinculadas a un SGBD específico, lo que facilita cambiar de una base de datos a otra sin modificar el código de las consultas.
- **Integración con Hibernate**: HQL se integra perfectamente con las capacidades de Hibernate, como la caché de segundo nivel y las transacciones.

```java
@Entity
public class Clima {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "La ciudad es obligatoria")
    private String ciudad;
    private double temperatura;
    private int humedad;
    private LocalDate fecha;
    @Size(max = 20, message = "Condición no válida")
    private String condicion;
    //...
}
```

## ❌ Manejo de errores

### @RestControllerAdvice

La anotación `@RestControllerAdvice` en Spring se utiliza para manejar excepciones globalmente y aplicar lógica transversal a todos los controladores REST dentro de una aplicación Spring Boot. Esta anotación combina las funcionalidades de `@ControllerAdvice` y `@ResponseBody`, permitiendo el manejo centralizado de excepciones y respuestas JSON.

### 😵 ¿Qué es `@RestControllerAdvice`?

`@RestControllerAdvice` es una especialización de `@ControllerAdvice` que automáticamente incluye la anotación `@ResponseBody`, lo que significa que todos los métodos en una clase anotada con `@RestControllerAdvice` retornarán sus resultados directamente como respuestas JSON. Es una forma conveniente de manejar excepciones y otros aspectos transversales (como configuración global de validaciones) en aplicaciones que exponen APIs RESTful.

### @ExceptionHandler

La anotación `@ExceptionHandler` en Spring se utiliza para manejar excepciones específicas que pueden ocurrir durante la ejecución de un controlador en una aplicación web. Esta anotación se coloca sobre un método en una clase de controlador y le indica a Spring que, cuando se lanza una excepción de un tipo especificado, el método anotado debe ser invocado para manejar dicha excepción.

```java

@ControllerAdvice
public class GlobalExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleValidationExceptions(MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> errors.put(error.getObjectName(), error.getDefaultMessage()));
        return errors;
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(DataIntegrityViolationException.class)
    public Map<String, String> handleDataNotFound(DataIntegrityViolationException ex) {
        Map<String, String> errors = new HashMap<>();
        errors.put("message", ex.getMessage());
        return errors;
    }
}
```

### Excepciones comunes
#### Capa web o Controllers
- `NoHandlerFoundException` ocurre cuando no existe un controlador para manejar una solicitud HTTP.
- `HttpRequestMethodNotSupportedException` se usa un método HTTP no soportado (ej: enviar POST a un endpoint que solo admite GET).
- `MissingServletRequestParameterException` faltan parámetros obligatorios en la solicitud (query params, form data).
- `MethodArgumentNotValidException` fallo en la validación de un objeto usando `@Valid`.

#### Capa de acceso a Datos o JPA
- `DataIntegrityViolationException` violación de restricciones de la base de datos (ej: unicidad, clave foránea).
- `EntityNotFoundException` intentar acceder a una entidad que no existe en la base de datos.


___ 
### ResponseEntity

`ResponseEntity` es una clase en Spring que representa la respuesta HTTP completa. Se utiliza principalmente en controladores RESTful para personalizar la respuesta HTTP en términos de estado, cabeceras y cuerpo de la respuesta. Aquí hay un desglose de para qué se usa `ResponseEntity`:

1. **Personalización del Estado HTTP**: Permite especificar el estado HTTP (como 200 OK, 404 Not Found, etc.) que se devolverá al cliente.
2. **Incluir Cabeceras HTTP**: Se pueden agregar cabeceras HTTP personalizadas a la respuesta.
3. **Definir el Cuerpo de la Respuesta**: Permite especificar el cuerpo de la respuesta, que puede ser cualquier objeto que luego se convierte a JSON o XML según la configuración de Spring.

### `@ResponseStatus`

La anotación `@ResponseStatus` en Spring se utiliza para marcar una clase de excepción con un código de estado HTTP específico. Esto permite que cuando se lance esa excepción, el servidor devuelva automáticamente el código de estado HTTP configurado sin necesidad de manejarlo explícitamente en cada controlador.

___

## Como podemos acceder a los datos de H2
Se debe configurar el servidor de H2, primero se debe remover la propiedad `runtime` en el archivo `pom.xml`.

```xml
<dependency>
    <groupId>com.h2database</groupId>
    <artifactId>h2</artifactId>
</dependency>
```
Se debe especificar la creación del Servidor para H2 en `WelcomeToSpringbootApplication`.

```java
@SpringBootApplication
public class WelcomeToSpringbootApplication {

  public static void main(String[] args) {
    SpringApplication.run(WelcomeToSpringbootApplication.class, args);
  }

  @Bean(initMethod = "start", destroyMethod = "stop")
  public Server h2Server() throws SQLException {
    return Server.createTcpServer("-tcp","-tcpAllowOthers", "-tcpPort", "9092");
  }
}
```

# File properties

El archivo de propiedades en Spring Boot (normalmente `application.properties` o `application.yml` 
si se usa YAML) se usa para ofrecer un enfoque coherente y más liviano para definir y 
actualizar los valores de configuración en una aplicación. Los archivos de propiedades 
permiten que la configuración de una aplicación se defina fuera del artefacto, lo cual es 
una buena práctica para actualizar la configuración de una aplicación sin cambiar el código fuente.


```properties
spring.datasource.url=jdbc:h2:mem:welcome_springboot
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=create
```
Una vez concluido este paso al ejecutar la aplicación mostrar el siguiente Log:
```text
H2 console available at '/h2-console'. Database available at 'jdbc:h2:mem:welcome_springboot'
```

Una vez concluido este paso podemos acceder a nuestra base de datos desde `http://localhost:8080/h2-console/`.
![](https://i.ibb.co/gFSm7vjX/Screenshot-2025-02-06-at-11-43-51-AM.png)

___

## Actividad

Implementar los siguientes Endpoints:

- `GET /api/clima` obtener todos los registros del clima.
- `GET /api/clima/ciudad/{ciudad}` obtener todos los registros del clima filtrado por ciudad.
- `GET /api/clima/fecha/{fecha}` obtener todos los registros del clima filtrado por fecha.
- `GET /api/clima/{ciudad}/{fecha}` obtener el registro del clima filtrado por ciudad y fecha.
- `POST /api/clima` crear un registro del clima.
- `PUT /api/clima/{id}` actualiza todos los campos de un registro climático existente usando su ID.
- `DELETE api/clima/{id}` para la eliminación de un registro climático por su ID.
### Retos
> Nota: Puedes implementar un patrón de arquitectura (DTO) 👀.
- `PATCH /api/clima/{id}` actualiza solo los campos proporcionados en el cuerpo de la petición.
- `GET /api/clima?minTemp=20&maxTemp=30` para filtrar por rango de temperatura.
